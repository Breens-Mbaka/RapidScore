package com.swift.swiftscore.data.remote.dto.matchesdto

import com.google.gson.annotations.SerializedName
import com.swift.swiftscore.domain.model.Match


data class MatchesDto(
    @SerializedName("data")
    val match: List<Matches>,
    val query: QueryXX
)

fun MatchesDto.toMatch(): Match {
    return Match(
        match = match
    )
}