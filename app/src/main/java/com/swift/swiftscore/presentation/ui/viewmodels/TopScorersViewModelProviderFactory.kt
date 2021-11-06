package com.swift.swiftscore.presentation.ui.viewmodels

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.swift.swiftscore.repository.TopScorersRepository

class TopScorersViewModelProviderFactory(
    val app: Application,
    val topScorersRepository: TopScorersRepository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return TopScorersViewModel(app, topScorersRepository) as T
    }
}