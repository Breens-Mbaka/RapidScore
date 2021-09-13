package com.swift.swiftscore.repository

import com.swift.swiftscore.api.RetrofitInstance
import com.swift.swiftscore.models.standingsmodel.StandingsResponse
import retrofit2.Response

class StandingsRepository {
    suspend fun getLeagueTable() : Response<StandingsResponse> {
        return RetrofitInstance.api2.getLeagueTable()
    }
}