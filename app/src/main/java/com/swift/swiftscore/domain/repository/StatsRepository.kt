package com.swift.swiftscore.domain.repository

import com.swift.swiftscore.data.remote.dto.statsdto.StatsDto

interface StatsRepository {

    suspend fun getStats(): StatsDto
}