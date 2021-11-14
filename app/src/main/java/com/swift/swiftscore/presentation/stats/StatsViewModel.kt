package com.swift.swiftscore.presentation.stats

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.swift.swiftscore.common.Resource
import com.swift.swiftscore.domain.use_case.GetStatsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class StatsViewModel @Inject constructor
    (private val getStatsUseCase: GetStatsUseCase) : ViewModel() {
    private val _state = mutableStateOf(StatsState())
    val state: State<StatsState> = _state

    init {
        getStats()
    }

    private fun getStats() {
        getStatsUseCase().onEach { result ->
            when(result) {
                is Resource.Success -> {
                    _state.value = StatsState(stats = result.data?.player ?: emptyList())
                }
                is Resource.Error -> {
                    _state.value = StatsState(error = result.message ?: "An unexpected error occurred")
                }
                is Resource.Loading -> {
                    _state.value = StatsState(isLoading = true)
                }
            }
        }.launchIn(viewModelScope)
    }
}