package com.swift.swiftscore.ui.viewmodels

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.swift.swiftscore.repository.StandingsRepository

class StandingsViewModelProviderFactory(
    val app: Application,
    val standingsRepository: StandingsRepository
): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return StandingsViewModel(app,standingsRepository) as T
    }
}