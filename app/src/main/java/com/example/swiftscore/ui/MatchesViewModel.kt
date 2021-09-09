package com.example.swiftscore.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.swiftscore.BuildConfig.API_KEY
import com.example.swiftscore.models.standingsmodel.StandingsResponse
import com.example.swiftscore.models.topscorersmodel.TopScorersResponse
import com.example.swiftscore.models.upcomingmatchesmodel.UpcomingMatchesResponse
import com.example.swiftscore.repository.MatchesRepository
import com.example.swiftscore.util.Constants.Companion.MATCHDAY_1_START_DATE
import com.example.swiftscore.util.Constants.Companion.MATCHDAY_38_FROM_DATE
import com.example.swiftscore.util.Constants.Companion.SEASON_ID
import com.example.swiftscore.util.Resource
import kotlinx.coroutines.launch
import retrofit2.Response

class MatchesViewModel(
    val matchesRepository: MatchesRepository
) : ViewModel() {

    val upcomingMatches: MutableLiveData<Resource<UpcomingMatchesResponse>> = MutableLiveData()
    val topScorers: MutableLiveData<Resource<TopScorersResponse>> = MutableLiveData()
    val leagueTable: MutableLiveData<Resource<StandingsResponse>> = MutableLiveData()

    init {
        getUpcomingMatches(API_KEY, SEASON_ID, MATCHDAY_1_START_DATE, MATCHDAY_38_FROM_DATE)
        getTopScorers(API_KEY, SEASON_ID)
        getLeagueTable()
    }

    fun getUpcomingMatches(apiKey: String, seasonId: String, dateFrom: String, dateTo: String) =
        viewModelScope.launch {
            upcomingMatches.postValue(Resource.Loading())
            val response = matchesRepository.getUpcomingMatches(apiKey, seasonId, dateFrom, dateTo)
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

    fun getTopScorers(apiKey: String, seasonId: String) =
        viewModelScope.launch {
            topScorers.postValue(Resource.Loading())
            val response = matchesRepository.getTopScorers(apiKey, seasonId)
            topScorers.postValue(handleTopScorersResponse(response))
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
            leagueTable.postValue(Resource.Loading())
            val response = matchesRepository.getLeagueTable()
            leagueTable.postValue(handleLeagueTableResponse(response))
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
}