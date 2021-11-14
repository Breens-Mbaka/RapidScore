package com.swift.swiftscore.data.remote.dto.standingsdto

import com.swift.swiftscore.domain.model.Standings

data class StandingsDto(
    val standings: List<Team>
)

fun StandingsDto.toStandings(): Standings {
    return Standings(
        standings = standings
    )
}