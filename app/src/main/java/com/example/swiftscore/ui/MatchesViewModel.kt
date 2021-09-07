package com.example.swiftscore.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.swiftscore.models.upcomingmatchesmodel.UpcomingMatchesResponse
import com.example.swiftscore.repository.MatchesRepository
import com.example.swiftscore.util.Constants.Companion.API_KEY
import com.example.swiftscore.util.Resource
import kotlinx.coroutines.launch
import retrofit2.Response

class MatchesViewModel(
    val matchesRepository: MatchesRepository
) : ViewModel() {

    val upcomingMatches: MutableLiveData<Resource<UpcomingMatchesResponse>> = MutableLiveData()

    init {
        getUpcomingMatches(API_KEY,"1980","2021-09-11","2021-09-13")
    }

    fun getUpcomingMatches(apiKey: String, seasonId: String, dateFrom: String, dateTo: String) =
        viewModelScope.launch {
            upcomingMatches.postValue(Resource.Loading())
            val response = matchesRepository.getUpcomingMatches(apiKey,seasonId, dateFrom, dateTo)
            upcomingMatches.postValue(handleUpcomingMatchesResponse(response))
        }

    private fun handleUpcomingMatchesResponse(response: Response<UpcomingMatchesResponse>): Resource<UpcomingMatchesResponse> {
        if (response.isSuccessful) {
            response.body()?.let { resultResponse ->
                return Resource.Success(resultResponse)
            }
        }
        return Resource.Error(response.message())
    }
}