package com.swift.swiftscore.presentation.ui

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.swift.swiftscore.R
import com.swift.swiftscore.databinding.ActivityHomeBinding
import com.swift.swiftscore.repository.MatchesRepository
import com.swift.swiftscore.repository.StandingsRepository
import com.swift.swiftscore.repository.TopScorersRepository
import com.swift.swiftscore.presentation.ui.viewmodels.*

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    lateinit var matchesViewModel: MatchesViewModel
    lateinit var standingsViewModel: StandingsViewModel
    lateinit var topScorersModel: TopScorersViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        val view = binding.root
        setTheme(R.style.Theme_SwiftScore)
        setContentView(view)

        initiateMatchesViewModel()
        initiateStandingsViewModel()
        initiateTopScorersViewModel()

        setLogoInActionBar()
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.homeNavHostFragment) as NavHostFragment
        val navController = navHostFragment.navController
        binding.bottomNavigationView.setupWithNavController(navController)
        binding.bottomNavigationView.itemIconTintList = null
    }

    private fun initiateMatchesViewModel() {
        val matchesRepository = MatchesRepository()
        val viewModelProviderFactory =
            MatchesViewModelProviderFactory(application, matchesRepository)
        matchesViewModel =
            ViewModelProvider(this, viewModelProviderFactory)[MatchesViewModel::class.java]
    }

    private fun initiateStandingsViewModel() {
        val standingsRepository = StandingsRepository()
        val viewModelProviderFactory =
            StandingsViewModelProviderFactory(application, standingsRepository)
        standingsViewModel =
            ViewModelProvider(this, viewModelProviderFactory)[StandingsViewModel::class.java]
    }

    private fun initiateTopScorersViewModel() {
        val topScorersViewModelRepository = TopScorersRepository()
        val viewModelProviderFactory =
            TopScorersViewModelProviderFactory(application, topScorersViewModelRepository)
        topScorersModel =
            ViewModelProvider(this, viewModelProviderFactory)[TopScorersViewModel::class.java]
    }

    private fun setLogoInActionBar() {
        val actionBar = supportActionBar
        supportActionBar?.setDisplayShowTitleEnabled(false)

        actionBar?.setDisplayShowCustomEnabled(true)
        val inflater: LayoutInflater =
            this.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view: View = inflater.inflate(R.layout.custom_logo_actionbar, null)
        actionBar?.customView = view
    }
}