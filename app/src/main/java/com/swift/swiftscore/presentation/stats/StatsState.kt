package com.swift.swiftscore.presentation.stats

import com.swift.swiftscore.data.remote.dto.statsdto.Data

data class StatsState(
    val isLoading: Boolean = false,
    val stats: List<Data>? = emptyList(),
    val error: String = ""
)
