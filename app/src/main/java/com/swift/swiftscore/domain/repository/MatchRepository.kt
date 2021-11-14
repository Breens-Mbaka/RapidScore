package com.swift.swiftscore.domain.repository

import com.swift.swiftscore.data.remote.dto.matchesdto.MatchesDto

interface MatchRepository {

    suspend fun getMatches(): MatchesDto
}