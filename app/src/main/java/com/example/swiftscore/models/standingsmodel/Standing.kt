package com.example.swiftscore.models.standingsmodel

data class Standing(
    val away: Away,
    val home: Home,
    val overall: Overall,
    val points: Int,
    val position: Int,
    val result: String,
    val status: String,
    val team_id: Int
)