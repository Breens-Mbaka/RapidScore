package com.swift.swiftscore.ui.viewmodels

import android.app.Application
import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.swift.swiftscore.models.topscorersmodel.TopScorersResponse
import com.swift.swiftscore.repository.TopScorersRepository
import com.swift.swiftscore.util.Constants.Companion.API_KEY
import com.swift.swiftscore.util.Constants.Companion.PL_ID_MATCHES
import com.swift.swiftscore.util.MatchesApplication
import com.swift.swiftscore.util.Resource
import kotlinx.coroutines.launch
import retrofit2.Response
import java.io.IOException

class TopScorersViewModel(
    app: Application,
    val topScorersRepository: TopScorersRepository
) : AndroidViewModel(app) {
    val topScorers: MutableLiveData<Resource<TopScorersResponse>> = MutableLiveData()

    init {
        getTopScorers(API_KEY, PL_ID_MATCHES)
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

    private suspend fun getTopScorersCall(apiKey: String, seasonId: String) {
        topScorers.postValue(Resource.Loading())
        try {
            if (checkInternetConnection()) {
                val response = topScorersRepository.getTopScorers(apiKey, seasonId)
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