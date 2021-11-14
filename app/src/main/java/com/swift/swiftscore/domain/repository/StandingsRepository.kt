package com.swift.swiftscore.domain.repository

import com.swift.swiftscore.data.remote.dto.standingsdto.StandingsDto

interface StandingsRepository {

    suspend fun getStandings(): StandingsDto
}