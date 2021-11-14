package com.swift.swiftscore.data.repository

import com.swift.swiftscore.data.remote.SportsDataApi
import com.swift.swiftscore.data.remote.dto.matchesdto.MatchesDto
import com.swift.swiftscore.domain.repository.MatchRepository
import javax.inject.Inject

class MatchRepositoryImpl @Inject constructor(
    private val api: SportsDataApi
): MatchRepository {
    override suspend fun getMatches():MatchesDto {
        return api.getUpcomingMatches()
    }
}