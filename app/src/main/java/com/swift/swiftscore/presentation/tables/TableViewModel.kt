package com.swift.swiftscore.presentation.tables

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.swift.swiftscore.common.Resource
import com.swift.swiftscore.domain.use_case.GetTableUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class TableViewModel @Inject constructor
    (private val getStandingsUseCase: GetTableUseCase) : ViewModel() {
    private val _state = mutableStateOf(TablesState())
    val state: State<TablesState> = _state

    init {
        getStandings()
    }

    private fun getStandings() {
        getStandingsUseCase().onEach { result ->
            when(result) {
                is Resource.Success -> {
                    _state.value = TablesState(stats = result.data?.standings ?: emptyList())
                }
                is Resource.Error -> {
                    _state.value = TablesState(error = result.message ?: "An unexpected error occurred")
                }
                is Resource.Loading -> {
                    _state.value = TablesState(isLoading = true)
                }
            }
        }.launchIn(viewModelScope)
    }
}