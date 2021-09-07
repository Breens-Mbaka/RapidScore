package com.example.swiftscore.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.swiftscore.HomeActivity
import com.example.swiftscore.R
import com.example.swiftscore.ui.MatchesViewModel

class UpcomingMatchesFragment : Fragment(R.layout.fragment_upcoming_matches) {

    lateinit var viewModel: MatchesViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as HomeActivity).viewModel
    }
}