package com.example.swiftscore.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.swiftscore.R
import com.example.swiftscore.adapters.LeagueTableAdapter
import com.example.swiftscore.ui.HomeActivity
import com.example.swiftscore.ui.MatchesViewModel
import com.example.swiftscore.util.Resource
import kotlinx.android.synthetic.main.fragment_league_table.*

class LeagueTableFragment : Fragment(R.layout.fragment_league_table) {

    lateinit var viewModel: MatchesViewModel
    lateinit var leagueTableAdapter: LeagueTableAdapter
    val TAG = "LeagueTableFragment"

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as HomeActivity).viewModel
        setupRecyclerView()

        viewModel.leagueTable.observe(viewLifecycleOwner, Observer { response ->
            when (response) {
                is Resource.Success -> {
                    hideProgressBar()
                    response.data?.let { standingsResponse ->
                        leagueTableAdapter.differ.submitList(standingsResponse.table)
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

    private fun showProgressBar() {
        progressBar.visibility = View.VISIBLE
    }

    private fun hideProgressBar() {
        progressBar.visibility = View.INVISIBLE
    }

    private fun setupRecyclerView() {
        leagueTableAdapter = LeagueTableAdapter()
        rvLeagueTable.apply {
            adapter = leagueTableAdapter
            layoutManager = LinearLayoutManager(activity)
        }
    }
}