package com.example.swiftscore.repository

import com.example.swiftscore.api.RetrofitInstance
import com.example.swiftscore.models.upcomingmatchesmodel.UpcomingMatchesResponse
import retrofit2.Response

class MatchesRepository {
    suspend fun getUpcomingMatches(apiKey: String, seasonId: String, dateFrom: String,dateTo: String): Response<UpcomingMatchesResponse> {
        return RetrofitInstance.api.getUpcomingMatches(apiKey,seasonId, dateFrom, dateTo)
    }
}