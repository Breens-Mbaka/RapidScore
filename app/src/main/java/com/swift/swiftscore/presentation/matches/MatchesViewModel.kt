package com.swift.swiftscore.presentation.matches

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.swift.swiftscore.common.Resource
import com.swift.swiftscore.domain.use_case.GetMatchesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class MatchesViewModel @Inject constructor
    (private val getMatchesUseCase: GetMatchesUseCase) : ViewModel() {
    private val _state = mutableStateOf(MatchesState())
    val state: State<MatchesState> = _state

    init {
        getMatches()
    }

    private fun getMatches() {
        getMatchesUseCase().onEach { result ->
            when(result) {
                is Resource.Success -> {
                    _state.value = MatchesState(matches = result.data?.match)
                }
                is Resource.Error -> {
                    _state.value = MatchesState(error = result.message ?: "An unexpected error occurred")
                }
                is Resource.Loading -> {
                    _state.value = MatchesState(isLoading = true)
                }
            }
        }.launchIn(viewModelScope)
    }
}