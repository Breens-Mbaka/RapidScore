package com.example.swiftscore

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        setLogoInActionBar()
        bottomNavigationView.setupWithNavController(homeNavHostFragment.findNavController())

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