package com.swift.swiftscore.repository

import com.swift.swiftscore.api.RetrofitInstance
import com.swift.swiftscore.models.standingsmodel.StandingsResponse
import com.swift.swiftscore.models.topscorersmodel.TopScorersResponse
import com.swift.swiftscore.models.upcomingmatchesmodel.UpcomingMatchesResponse
import retrofit2.Response

class MatchesRepository {
    suspend fun getUpcomingMatches(
        apiKey: String,
        seasonId: String,
        dateFrom: String,
        dateTo: String
    ): Response<UpcomingMatchesResponse> {
        return RetrofitInstance.api.getUpcomingMatches(apiKey, seasonId, dateFrom, dateTo)
    }

    suspend fun getTopScorers(apiKey: String, seasonId: String): Response<TopScorersResponse> {
        return RetrofitInstance.api.getTopScorers(apiKey, seasonId)
    }

    suspend fun getLeagueTable(): Response<StandingsResponse> {
        return RetrofitInstance.api2.getLeagueTable()
    }
}