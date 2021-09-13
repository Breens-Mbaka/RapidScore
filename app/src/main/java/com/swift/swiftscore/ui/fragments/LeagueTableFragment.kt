package com.swift.swiftscore.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.swift.swiftscore.R
import com.swift.swiftscore.adapters.LeagueTableAdapter
import com.swift.swiftscore.models.standingsmodel.StandingsResponse
import com.swift.swiftscore.ui.HomeActivity
import com.swift.swiftscore.ui.viewmodels.StandingsViewModel
import com.swift.swiftscore.util.Resource
import kotlinx.android.synthetic.main.fragment_league_table.*

class LeagueTableFragment : Fragment(R.layout.fragment_league_table) {

    lateinit var viewModel: StandingsViewModel
    lateinit var leagueTableAdapter: LeagueTableAdapter
    val TAG = "LeagueTableFragment"

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as HomeActivity).standingsViewModel
        setupRecyclerView()

        viewModel.standingsTable.observe(viewLifecycleOwner, Observer { response ->
            when (response) {
                is Resource.Success -> {
                    hideProgressBar()
                    response.data?.let { standingsResponse ->
                        responseSuccess(standingsResponse)
                    }
                }
                is Resource.Error -> {
                    hideProgressBar()
                    response.message?.let {
                        responseError()
                    }
                }
                is Resource.Loading -> {
                    showProgressBar()
                }
            }
        })
    }

    private fun responseSuccess(standingsResponse: StandingsResponse) {
        iconConnection.visibility = View.INVISIBLE
        tvPoorConnection.visibility = View.INVISIBLE
        tvCheckConnection.visibility = View.INVISIBLE
        tvTryAgain.visibility = View.INVISIBLE
        btnRetry.visibility = View.INVISIBLE
        tvAvailability.visibility = View.INVISIBLE
        tvLater.visibility = View.INVISIBLE
        rvLeagueTable.visibility = View.VISIBLE
        leagueTableAdapter.differ.submitList(standingsResponse.table)
    }

    private fun responseError() {
        iconConnection.visibility = View.VISIBLE
        tvPoorConnection.visibility = View.VISIBLE
        tvCheckConnection.visibility = View.VISIBLE
        tvTryAgain.visibility = View.VISIBLE
        btnRetry.visibility = View.VISIBLE
        rvLeagueTable.visibility = View.INVISIBLE
        btnRetry.setOnClickListener {
            viewModel.getLeagueTable()
        }
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