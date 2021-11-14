package com.swift.swiftscore.data.repository

import com.swift.swiftscore.data.remote.SportsDataApi
import com.swift.swiftscore.data.remote.dto.statsdto.StatsDto
import com.swift.swiftscore.domain.repository.StatsRepository
import retrofit2.Response
import javax.inject.Inject

class StatsRepositoryImpl @Inject constructor(
    private val api: SportsDataApi
): StatsRepository {
    override suspend fun getStats():StatsDto {
        return api.getTopScorers()
    }

}