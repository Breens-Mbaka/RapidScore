package com.example.swiftscore.repository

import com.example.swiftscore.api.RetrofitInstance
import com.example.swiftscore.models.standingsmodel.StandingsResponse
import com.example.swiftscore.models.topscorersmodel.TopScorersResponse
import com.example.swiftscore.models.upcomingmatchesmodel.UpcomingMatchesResponse
import retrofit2.Response

class MatchesRepository {
    suspend fun getUpcomingMatches(apiKey: String, seasonId: String, dateFrom: String,dateTo: String): Response<UpcomingMatchesResponse> {
        return RetrofitInstance.api.getUpcomingMatches(apiKey,seasonId, dateFrom, dateTo)
    }

    suspend fun getTopScorers(apiKey: String, seasonId: String): Response<TopScorersResponse> {
        return RetrofitInstance.api.getTopScorers(apiKey, seasonId)
    }

    suspend fun getLeagueTable(): Response<StandingsResponse> {
        return RetrofitInstance.api2.getLeagueTable()
    }
}