package com.swift.swiftscore.presentation.ui.viewmodels

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.swift.swiftscore.repository.MatchesRepository

class MatchesViewModelProviderFactory(
    val app: Application,
    val matchesRepository: MatchesRepository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MatchesViewModel(app, matchesRepository) as T
    }
}