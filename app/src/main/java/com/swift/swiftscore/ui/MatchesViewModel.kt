package com.swift.swiftscore.ui

import android.app.Application
import android.content.Context
import android.net.ConnectivityManager
import android.net.ConnectivityManager.*
import android.net.NetworkCapabilities.*
import android.os.Build
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.swift.swiftscore.BuildConfig.API_KEY
import com.swift.swiftscore.MatchesApplication
import com.swift.swiftscore.models.standingsmodel.StandingsResponse
import com.swift.swiftscore.models.topscorersmodel.TopScorersResponse
import com.swift.swiftscore.models.upcomingmatchesmodel.UpcomingMatchesResponse
import com.swift.swiftscore.repository.MatchesRepository
import com.swift.swiftscore.util.Constants.Companion.CURRENT_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_38_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.SEASON_ID
import com.swift.swiftscore.util.Resource
import kotlinx.coroutines.launch
import retrofit2.Response
import java.io.IOException

class MatchesViewModel(
    app: Application,
    val matchesRepository: MatchesRepository
) : AndroidViewModel(app) {

    val upcomingMatches: MutableLiveData<Resource<UpcomingMatchesResponse>> = MutableLiveData()
    val topScorers: MutableLiveData<Resource<TopScorersResponse>> = MutableLiveData()
    val leagueTable: MutableLiveData<Resource<StandingsResponse>> = MutableLiveData()

    init {
        getUpcomingMatches(API_KEY, SEASON_ID, CURRENT_DATE, MATCHDAY_38_FROM_DATE)
        getTopScorers(API_KEY, SEASON_ID)
        getLeagueTable()
    }

    fun getUpcomingMatches(apiKey: String, seasonId: String, dateFrom: String, dateTo: String) =
        viewModelScope.launch {
            getUpcomingMatchesCall(apiKey, seasonId, dateFrom,dateTo)
        }

    private fun handleUpcomingMatchesResponse(response: Response<UpcomingMatchesResponse>): Resource<UpcomingMatchesResponse> {
        if (response.isSuccessful) {
            response.body()?.let { resultResponse ->
                return Resource.Success(resultResponse)
            }
        }
        return Resource.Error(response.message())
    }

    fun getTopScorers(apiKey: String, seasonId: String) =
        viewModelScope.launch {
            getTopScorersCall(apiKey, seasonId)
        }

    private fun handleTopScorersResponse(response: Response<TopScorersResponse>): Resource<TopScorersResponse> {
        if (response.isSuccessful) {
            response.body()?.let { resultResponse ->
                return Resource.Success(resultResponse)
            }
        }
        return Resource.Error(response.message())
    }

    fun getLeagueTable() {
        viewModelScope.launch {
            getLeagueTableCall()
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

    private suspend fun getUpcomingMatchesCall(
        apiKey: String,
        seasonId: String,
        dateFrom: String,
        dateTo: String
    ) {
        upcomingMatches.postValue(Resource.Loading())
        try {
            if (checkInternetConnection()) {
                val response =
                    matchesRepository.getUpcomingMatches(apiKey, seasonId, dateFrom, dateTo)
                upcomingMatches.postValue(handleUpcomingMatchesResponse(response))
            } else {
                upcomingMatches.postValue(Resource.Error("No internet connection"))
            }
        } catch (t: Throwable) {
            when (t) {
                is IOException -> upcomingMatches.postValue(Resource.Error("Network Failure"))
                else -> upcomingMatches.postValue(Resource.Error("Conversion Error"))
            }


        }
    }

    private suspend fun getLeagueTableCall() {
        leagueTable.postValue(Resource.Loading())
        try {
            if (checkInternetConnection()) {
                val response = matchesRepository.getLeagueTable()
                leagueTable.postValue(handleLeagueTableResponse(response))
            } else {
                leagueTable.postValue(Resource.Error("No internet connection"))
            }
        } catch (t: Throwable) {
            when (t) {
                is IOException -> leagueTable.postValue(Resource.Error("Network Failure"))
                else -> leagueTable.postValue(Resource.Error("Conversion Error"))
            }


        }
    }

    private suspend fun getTopScorersCall(apiKey: String, seasonId: String) {
        upcomingMatches.postValue(Resource.Loading())
        try {
            if (checkInternetConnection()) {
                val response = matchesRepository.getTopScorers(apiKey, seasonId)
                topScorers.postValue(handleTopScorersResponse(response))
            } else {
                topScorers.postValue(Resource.Error("No internet connection"))
            }
        } catch (t: Throwable) {
            when (t) {
                is IOException -> topScorers.postValue(Resource.Error("Network Failure"))
                else -> topScorers.postValue(Resource.Error("Conversion Error"))
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
                capabilities.hasTransport(TRANSPORT_WIFI) -> true
                capabilities.hasTransport(TRANSPORT_CELLULAR) -> true
                capabilities.hasTransport(TRANSPORT_ETHERNET) -> true
                else -> false
            }
        } else {
            connectivityManager.activeNetworkInfo?.run {
                return when (type) {
                    TYPE_WIFI -> true
                    TYPE_MOBILE -> true
                    TYPE_ETHERNET -> true
                    else -> false
                }
            }
        }
        return false
    }

}