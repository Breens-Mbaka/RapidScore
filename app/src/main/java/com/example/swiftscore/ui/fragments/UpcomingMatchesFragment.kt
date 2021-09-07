package com.example.swiftscore.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.swiftscore.ui.HomeActivity
import com.example.swiftscore.R
import com.example.swiftscore.adapters.UpcomingMatchesAdapter
import com.example.swiftscore.ui.MatchesViewModel
import com.example.swiftscore.util.Resource
import kotlinx.android.synthetic.main.fragment_upcoming_matches.*

class UpcomingMatchesFragment : Fragment(R.layout.fragment_upcoming_matches) {

    lateinit var viewModel: MatchesViewModel
    lateinit var upcomingMatchesAdapter: UpcomingMatchesAdapter
    val TAG = "UpcomingMatchesFragment"

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as HomeActivity).viewModel
        setupRecyclerView()

        viewModel.upcomingMatches.observe(viewLifecycleOwner, Observer { response ->
            when(response) {
                is Resource.Success -> {
                    hideProgressBar()
                    response.data?.let { upcomingMatchesResponse ->
                        upcomingMatchesAdapter.differ.submitList(upcomingMatchesResponse.data)
                    }
                }
                is Resource.Error -> {
                    hideProgressBar()
                    response.message?.let { message ->
                        Log.e(TAG, "An error occured: $message")
                    }
                }
                is Resource.Loading -> {
                    showProgressBar()
                }
            }
        })
    }

    private fun hideProgressBar() {
        progressBar.visibility = View.INVISIBLE
    }

    private fun showProgressBar() {
        progressBar.visibility = View.VISIBLE
    }

    private fun setupRecyclerView() {
        upcomingMatchesAdapter = UpcomingMatchesAdapter()
        rvUpcomingMatches.apply {
            adapter = upcomingMatchesAdapter
            layoutManager = LinearLayoutManager(activity)
        }
    }
}