package com.swift.swiftscore.data.remote.dto.statsdto

data class Data(
    val goals: Goals,
    val league_id: Int,
    val matches_played: Int,
    val minutes_played: Int,
    val penalties: Int,
    val player: Player,
    val pos: Int,
    val season_id: Int,
    val substituted_in: Any,
    val team: Team
)