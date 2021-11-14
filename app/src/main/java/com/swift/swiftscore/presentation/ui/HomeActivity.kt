package com.swift.swiftscore.presentation.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.swift.swiftscore.R
import com.swift.swiftscore.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        val view = binding.root
        setTheme(R.style.Theme_SwiftScore)
        setContentView(view)
    }
}