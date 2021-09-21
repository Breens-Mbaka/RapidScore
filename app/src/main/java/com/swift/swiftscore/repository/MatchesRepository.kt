package com.swift.swiftscore.repository

import com.swift.swiftscore.api.RetrofitInstance
import com.swift.swiftscore.models.upcomingmatchesmodel.UpcomingMatchesResponse
import retrofit2.Response

class MatchesRepository{
    suspend fun getUpcomingMatches(
        apiKey: String,
        leagueId: String,
        dateFrom: String,
        dateTo: String
    ): Response<UpcomingMatchesResponse> {
        return RetrofitInstance.api.getUpcomingMatches(apiKey, leagueId, dateFrom, dateTo)
    }
}