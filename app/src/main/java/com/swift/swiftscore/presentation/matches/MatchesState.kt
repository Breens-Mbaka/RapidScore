package com.swift.swiftscore.presentation.matches

import com.swift.swiftscore.data.remote.dto.matchesdto.Matches

data class MatchesState(
    val isLoading: Boolean = false,
    val matches: List<Matches>? = emptyList(),
    val error: String = ""
)
