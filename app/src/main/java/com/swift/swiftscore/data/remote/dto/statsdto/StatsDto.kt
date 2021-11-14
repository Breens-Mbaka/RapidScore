package com.swift.swiftscore.data.remote.dto.statsdto

import com.google.gson.annotations.SerializedName
import com.swift.swiftscore.domain.model.Stat

data class StatsDto(
    @SerializedName("data")
    val player: List<Data>,
    val query: Query
)

fun StatsDto.toStats() : Stat{
    return Stat(
        player = player
    )
}