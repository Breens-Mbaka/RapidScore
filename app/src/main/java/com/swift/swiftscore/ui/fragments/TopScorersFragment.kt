package com.swift.swiftscore.ui.fragments

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.swift.swiftscore.BuildConfig.API_KEY
import com.swift.swiftscore.R
import com.swift.swiftscore.adapters.TopScorerAdapter
import com.swift.swiftscore.models.topscorersmodel.TopScorersResponse
import com.swift.swiftscore.ui.HomeActivity
import com.swift.swiftscore.ui.viewmodels.TopScorersViewModel
import com.swift.swiftscore.util.Constants.Companion.LIGUE1_ID_MATCHES
import com.swift.swiftscore.util.Constants.Companion.PL_ID_MATCHES
import com.swift.swiftscore.util.Resource
import kotlinx.android.synthetic.main.fragment_top_scorers.*

class TopScorersFragment : Fragment(R.layout.fragment_top_scorers) {

    lateinit var viewModel: TopScorersViewModel
    lateinit var topScorerAdapter: TopScorerAdapter
    val TAG = "UpcomingMatchesFragment"

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as HomeActivity).topScorersModel
        setupRecyclerView()
        observeViewModel()
        changeLeagueTopScorers()
    }

    private fun changeLeagueTopScorers() {
        spinner3.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                adapterView: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val leagueSelected = adapterView?.getItemAtPosition(position).toString()
                if (leagueSelected == "Ligue 1") {
                    viewModel.getTopScorers(API_KEY, LIGUE1_ID_MATCHES)
                }
                else if(leagueSelected == "Premier League") {
                    viewModel.getTopScorers(API_KEY, PL_ID_MATCHES)
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }
    }

    private fun observeViewModel() {
        viewModel.topScorers.observe(viewLifecycleOwner, Observer { response ->
            when (response) {
                is Resource.Success -> {
                    hideProgressBar()
                    response.data?.let { topScorersResponse ->
                        responseSuccess(topScorersResponse)
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

    private fun responseSuccess(topScorersResponse: TopScorersResponse) {
        iconConnection.visibility = View.INVISIBLE
        tvPoorConnection.visibility = View.INVISIBLE
        tvCheckConnection.visibility = View.INVISIBLE
        tvTryAgain.visibility = View.INVISIBLE
        btnRetry.visibility = View.INVISIBLE
        tvAvailability.visibility = View.INVISIBLE
        tvLater.visibility = View.INVISIBLE
        rvTopScorers.visibility = View.VISIBLE
        topScorerAdapter.differ.submitList(topScorersResponse.data)
    }

    private fun responseError() {
        iconConnection.visibility = View.VISIBLE
        tvPoorConnection.visibility = View.VISIBLE
        tvCheckConnection.visibility = View.VISIBLE
        tvTryAgain.visibility = View.VISIBLE
        btnRetry.visibility = View.VISIBLE
        rvTopScorers.visibility = View.INVISIBLE
        btnRetry.setOnClickListener {
            viewModel.getTopScorers(
                com.swift.swiftscore.BuildConfig.API_KEY,
                PL_ID_MATCHES
            )
        }
    }

    private fun showProgressBar() {
        progressBar.visibility = View.VISIBLE
    }

    private fun hideProgressBar() {
        progressBar.visibility = View.INVISIBLE
    }

    private fun setupRecyclerView() {
        topScorerAdapter = TopScorerAdapter()
        rvTopScorers.apply {
            adapter = topScorerAdapter
            layoutManager = LinearLayoutManager(activity)
        }
    }
}