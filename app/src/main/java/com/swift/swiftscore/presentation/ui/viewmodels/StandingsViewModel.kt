package com.swift.swiftscore.presentation.ui.viewmodels

import android.app.Application
import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.swift.swiftscore.util.MatchesApplication
import com.swift.swiftscore.models.standingsmodel.StandingsResponse
import com.swift.swiftscore.repository.StandingsRepository
import com.swift.swiftscore.util.Constants.Companion.PL_ID_TABLE
import com.swift.swiftscore.util.Constants.Companion.PL_SEASON
import com.swift.swiftscore.util.Resource
import kotlinx.coroutines.launch
import retrofit2.Response
import java.io.IOException

class StandingsViewModel(
    app: Application,
    val standingsRepository: StandingsRepository
) : AndroidViewModel(app) {
    val standingsTable: MutableLiveData<Resource<StandingsResponse>> = MutableLiveData()

    init {
        getLeagueTable(PL_ID_TABLE, PL_SEASON)
    }

    fun getLeagueTable(leagueId: String, season: String) {
        viewModelScope.launch {
            getLeagueTableCall(leagueId, season)
        }
    }

    private fun handleLeagueTableResponse(response: Response<StandingsResponse>): Resource<StandingsResponse> {
        if (response.isSuccessful) {
            response.body()?.let { resultResponse ->
                return Resource.Success(resultResponse)
            }
        }
        return Resource.Error(response.message())
    }

    private suspend fun getLeagueTableCall(leagueId: String, season: String) {
        standingsTable.postValue(Resource.Loading())
        try {
            if (checkInternetConnection()) {
                val response = standingsRepository.getLeagueTable(leagueId,season)
                standingsTable.postValue(handleLeagueTableResponse(response))
            } else {
                standingsTable.postValue(Resource.Error("No internet connection"))
            }
        } catch (t: Throwable) {
            when (t) {
                is IOException -> standingsTable.postValue(Resource.Error("Network Failure"))
                else -> standingsTable.postValue(Resource.Error("Conversion Error"))
            }


        }
    }

    private fun checkInternetConnection(): Boolean {
        val connectivityManager = getApplication<MatchesApplication>().getSystemService(
            Context.CONNECTIVITY_SERVICE
        ) as ConnectivityManager
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            val activeNetwork = connectivityManager.activeNetwork ?: return false
            val capabilities =
                connectivityManager.getNetworkCapabilities(activeNetwork) ?: return false
            return when {
                capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true
                capabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true
                capabilities.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) -> true
                else -> false
            }
        } else {
            connectivityManager.activeNetworkInfo?.run {
                return when (type) {
                    ConnectivityManager.TYPE_WIFI -> true
                    ConnectivityManager.TYPE_MOBILE -> true
                    ConnectivityManager.TYPE_ETHERNET -> true
                    else -> false
                }
            }
        }
        return false
    }
}