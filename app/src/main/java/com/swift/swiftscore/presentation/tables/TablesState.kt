package com.swift.swiftscore.presentation.tables

import com.swift.swiftscore.data.remote.dto.standingsdto.Team

data class TablesState(
    val isLoading: Boolean = false,
    val stats: List<Team>? = emptyList(),
    val error: String = ""
)
