package com.swift.swiftscore.ui

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.swift.swiftscore.R
import com.swift.swiftscore.repository.MatchesRepository
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    lateinit var viewModel: MatchesViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_SwiftScore)
        setContentView(R.layout.activity_home)

        val matchesRepository = MatchesRepository()
        val viewModelProviderFactory = MatchesViewModelProviderFactory(application,matchesRepository)
        viewModel =
            ViewModelProvider(this, viewModelProviderFactory).get(MatchesViewModel::class.java)

        setLogoInActionBar()
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.homeNavHostFragment) as NavHostFragment
        val navController = navHostFragment.navController
        bottomNavigationView.setupWithNavController(navController)
        bottomNavigationView.itemIconTintList = null
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