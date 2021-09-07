package com.example.swiftscore.ui

import androidx.lifecycle.ViewModel
import com.example.swiftscore.repository.MatchesRepository

class MatchesViewModel(
    val matchesRepository: MatchesRepository
) : ViewModel() {
}