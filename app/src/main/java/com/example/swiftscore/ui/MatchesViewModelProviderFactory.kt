package com.example.swiftscore.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.swiftscore.repository.MatchesRepository

class MatchesViewModelProviderFactory(
    val matchesRepository: MatchesRepository
) : ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MatchesViewModel(matchesRepository) as T
    }
}