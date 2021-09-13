package com.swift.swiftscore.repository

import com.swift.swiftscore.api.RetrofitInstance
import com.swift.swiftscore.models.topscorersmodel.TopScorersResponse
import retrofit2.Response

class TopScorersRepository {
    suspend fun getTopScorers(apiKey: String, seasonId: String): Response<TopScorersResponse> {
        return RetrofitInstance.api.getTopScorers(apiKey, seasonId)
    }
}