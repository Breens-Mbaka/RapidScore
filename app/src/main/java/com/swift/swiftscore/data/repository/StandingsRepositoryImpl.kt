package com.swift.swiftscore.data.repository

import com.swift.swiftscore.data.remote.SportsDataApi
import com.swift.swiftscore.data.remote.dto.standingsdto.StandingsDto
import com.swift.swiftscore.domain.repository.StandingsRepository
import javax.inject.Inject

class StandingsRepositoryImpl @Inject constructor(
    private val api: SportsDataApi
): StandingsRepository {
    override suspend fun getStandings(): StandingsDto {
        return api.getLeagueTable()
    }
}