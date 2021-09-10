package com.example.swiftscore.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.swiftscore.BuildConfig
import com.example.swiftscore.R
import com.example.swiftscore.adapters.TopScorerAdapter
import com.example.swiftscore.ui.HomeActivity
import com.example.swiftscore.ui.MatchesViewModel
import com.example.swiftscore.util.Constants
import com.example.swiftscore.util.Resource
import kotlinx.android.synthetic.main.fragment_top_scorers.*
import kotlinx.android.synthetic.main.fragment_top_scorers.btnRetry
import kotlinx.android.synthetic.main.fragment_top_scorers.iconConnection
import kotlinx.android.synthetic.main.fragment_top_scorers.progressBar
import kotlinx.android.synthetic.main.fragment_top_scorers.tvCheckConnection
import kotlinx.android.synthetic.main.fragment_top_scorers.tvPoorConnection
import kotlinx.android.synthetic.main.fragment_top_scorers.tvTryAgain

class TopScorersFragment : Fragment(R.layout.fragment_top_scorers) {

    lateinit var viewModel: MatchesViewModel
    lateinit var topScorerAdapter: TopScorerAdapter
    val TAG = "UpcomingMatchesFragment"

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as HomeActivity).viewModel
        setupRecyclerView()

        viewModel.topScorers.observe(viewLifecycleOwner, Observer { response ->
            when (response) {
                is Resource.Success -> {
                    hideProgressBar()
                    response.data?.let { topScorersResponse ->
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
                }
                is Resource.Error -> {
                    hideProgressBar()
                    response.message?.let { message ->
                        iconConnection.visibility = View.VISIBLE
                        tvPoorConnection.visibility = View.VISIBLE
                        tvCheckConnection.visibility = View.VISIBLE
                        tvTryAgain.visibility = View.VISIBLE
                        btnRetry.visibility = View.VISIBLE
                        rvTopScorers.visibility = View.INVISIBLE
                        btnRetry.setOnClickListener {
                            viewModel.getTopScorers(
                                BuildConfig.API_KEY,
                                Constants.SEASON_ID
                            )
                        }
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
        topScorerAdapter = TopScorerAdapter()
        rvTopScorers.apply {
            adapter = topScorerAdapter
            layoutManager = LinearLayoutManager(activity)
        }
    }
}