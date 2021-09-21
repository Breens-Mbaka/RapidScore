package com.swift.swiftscore.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.swift.swiftscore.BuildConfig.API_KEY
import com.swift.swiftscore.R
import com.swift.swiftscore.adapters.UpcomingMatchesAdapter
import com.swift.swiftscore.models.upcomingmatchesmodel.UpcomingMatchesResponse
import com.swift.swiftscore.ui.HomeActivity
import com.swift.swiftscore.ui.viewmodels.MatchesViewModel
import com.swift.swiftscore.util.Constants.Companion.CURRENT_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_10_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_10_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_11_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_11_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_12_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_12_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_13_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_13_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_14_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_14_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_15_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_15_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_16_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_16_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_17_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_17_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_18_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_18_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_19_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_19_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_1_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_1_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_20_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_20_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_21_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_21_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_22_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_22_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_23_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_23_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_24_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_24_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_25_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_25_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_26_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_26_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_27_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_27_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_28_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_28_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_29_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_29_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_2_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_2_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_30_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_30_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_31_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_31_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_32_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_32_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_33_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_33_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_34_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_34_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_35_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_35_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_36_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_36_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_37_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_37_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_38_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_38_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_3_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_3_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_4_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_4_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_5_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_5_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_6_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_6_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_7_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_7_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_8_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_8_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_9_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_9_START_DATE
import com.swift.swiftscore.util.Constants.Companion.SEASON_ID
import com.swift.swiftscore.util.Resource
import kotlinx.android.synthetic.main.custom_upcoming_matches.*
import kotlinx.android.synthetic.main.fragment_upcoming_matches.*

class UpcomingMatchesFragment : Fragment(R.layout.fragment_upcoming_matches) {

    lateinit var viewModel: MatchesViewModel
    lateinit var upcomingMatchesAdapter: UpcomingMatchesAdapter
    val TAG = "UpcomingMatchesFragment"

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as HomeActivity).matchesViewModel
        setupRecyclerView()
        observeUpcomingMatches()
        filterMatchDays()
    }

    private fun observeUpcomingMatches() {
        viewModel.upcomingMatches.observe(viewLifecycleOwner, Observer { response ->
            when (response) {
                is Resource.Success -> {
                    hideProgressBar()
                    response.data?.let { upcomingMatchesResponse ->
                        responseSuccess(upcomingMatchesResponse)
                    }
                }
                is Resource.Error -> {
                    hideProgressBar()
                    response.message?.let { message ->
                        responseError(message)
                    }
                }
                is Resource.Loading -> {
                    showProgressBar()
                }
            }
        })
    }

    private fun responseSuccess(upcomingMatchesResponse: UpcomingMatchesResponse) {
        iconConnection.visibility = View.INVISIBLE
        tvPoorConnection.visibility = View.INVISIBLE
        tvCheckConnection.visibility = View.INVISIBLE
        tvTryAgain.visibility = View.INVISIBLE
        btnRetry.visibility = View.INVISIBLE
        imgNoData.visibility = View.INVISIBLE
        tvAvailability.visibility = View.INVISIBLE
        tvLater.visibility = View.INVISIBLE
        rvUpcomingMatches.visibility = View.VISIBLE
        upcomingMatchesAdapter.differ.submitList(upcomingMatchesResponse.data)
    }

    private fun responseError(message: String) {
        if (message == "") {
            imgNoData.visibility = View.VISIBLE
            tvAvailability.visibility = View.VISIBLE
            tvLater.visibility = View.VISIBLE
            rvUpcomingMatches.visibility = View.INVISIBLE
        } else {
            iconConnection.visibility = View.VISIBLE
            tvPoorConnection.visibility = View.VISIBLE
            tvCheckConnection.visibility = View.VISIBLE
            tvTryAgain.visibility = View.VISIBLE
            btnRetry.visibility = View.VISIBLE
            rvUpcomingMatches.visibility = View.INVISIBLE
            btnRetry.setOnClickListener {
                viewModel.getUpcomingMatches(
                    API_KEY,
                    SEASON_ID,
                    CURRENT_DATE,
                    MATCHDAY_38_FROM_DATE
                )
            }
        }
    }

    private fun filterMatchDays() {
        matchday1.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                SEASON_ID,
                MATCHDAY_1_START_DATE,
                MATCHDAY_1_FROM_DATE
            )

        }
        matchday2.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                SEASON_ID,
                MATCHDAY_2_START_DATE,
                MATCHDAY_2_FROM_DATE
            )
        }
        matchday3.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                SEASON_ID,
                MATCHDAY_3_START_DATE,
                MATCHDAY_3_FROM_DATE
            )
        }
        matchday4.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                SEASON_ID,
                MATCHDAY_4_START_DATE,
                MATCHDAY_4_FROM_DATE
            )
        }
        matchday5.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                SEASON_ID,
                MATCHDAY_5_START_DATE,
                MATCHDAY_5_FROM_DATE
            )
        }
        matchday6.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                SEASON_ID,
                MATCHDAY_6_START_DATE,
                MATCHDAY_6_FROM_DATE
            )
        }
        matchday7.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                SEASON_ID,
                MATCHDAY_7_START_DATE,
                MATCHDAY_7_FROM_DATE
            )
        }
        matchday8.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                SEASON_ID,
                MATCHDAY_8_START_DATE,
                MATCHDAY_8_FROM_DATE
            )
        }
        matchday9.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                SEASON_ID,
                MATCHDAY_9_START_DATE,
                MATCHDAY_9_FROM_DATE
            )
        }
        matchday10.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                SEASON_ID,
                MATCHDAY_10_START_DATE,
                MATCHDAY_10_FROM_DATE
            )
        }
        matchday11.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                SEASON_ID,
                MATCHDAY_11_START_DATE,
                MATCHDAY_11_FROM_DATE
            )
        }
        matchday12.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                SEASON_ID,
                MATCHDAY_12_START_DATE,
                MATCHDAY_12_FROM_DATE
            )
        }
        matchday13.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                SEASON_ID,
                MATCHDAY_13_START_DATE,
                MATCHDAY_13_FROM_DATE
            )
        }
        matchday14.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                SEASON_ID,
                MATCHDAY_14_START_DATE,
                MATCHDAY_14_FROM_DATE
            )
        }
        matchday15.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                SEASON_ID,
                MATCHDAY_15_START_DATE,
                MATCHDAY_15_FROM_DATE
            )
        }
        matchday16.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                SEASON_ID,
                MATCHDAY_16_START_DATE,
                MATCHDAY_16_FROM_DATE
            )
        }
        matchday17.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                SEASON_ID,
                MATCHDAY_17_START_DATE,
                MATCHDAY_17_FROM_DATE
            )
        }
        matchday18.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                SEASON_ID,
                MATCHDAY_18_START_DATE,
                MATCHDAY_18_FROM_DATE
            )
        }
        matchday19.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                SEASON_ID,
                MATCHDAY_19_START_DATE,
                MATCHDAY_19_FROM_DATE
            )
        }
        matchday20.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                SEASON_ID,
                MATCHDAY_20_START_DATE,
                MATCHDAY_20_FROM_DATE
            )
        }
        matchday21.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                SEASON_ID,
                MATCHDAY_21_START_DATE,
                MATCHDAY_21_FROM_DATE
            )
        }
        matchday22.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                SEASON_ID,
                MATCHDAY_22_START_DATE,
                MATCHDAY_22_FROM_DATE
            )
        }
        matchday23.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                SEASON_ID,
                MATCHDAY_23_START_DATE,
                MATCHDAY_23_FROM_DATE
            )
        }
        matchday24.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                SEASON_ID,
                MATCHDAY_24_START_DATE,
                MATCHDAY_24_FROM_DATE
            )
        }
        matchday25.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                SEASON_ID,
                MATCHDAY_25_START_DATE,
                MATCHDAY_25_FROM_DATE
            )
        }
        matchday26.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                SEASON_ID,
                MATCHDAY_26_START_DATE,
                MATCHDAY_26_FROM_DATE
            )
        }
        matchday27.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                SEASON_ID,
                MATCHDAY_27_START_DATE,
                MATCHDAY_27_FROM_DATE
            )
        }
        matchday28.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                SEASON_ID,
                MATCHDAY_28_START_DATE,
                MATCHDAY_28_FROM_DATE
            )
        }
        matchday29.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                SEASON_ID,
                MATCHDAY_29_START_DATE,
                MATCHDAY_29_FROM_DATE
            )
        }
        matchday30.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                SEASON_ID,
                MATCHDAY_30_START_DATE,
                MATCHDAY_30_FROM_DATE
            )
        }
        matchday31.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                SEASON_ID,
                MATCHDAY_31_START_DATE,
                MATCHDAY_31_FROM_DATE
            )
        }
        matchday32.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                SEASON_ID,
                MATCHDAY_32_START_DATE,
                MATCHDAY_32_FROM_DATE
            )
        }
        matchday33.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                SEASON_ID,
                MATCHDAY_33_START_DATE,
                MATCHDAY_33_FROM_DATE
            )
        }
        matchday34.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                SEASON_ID,
                MATCHDAY_34_START_DATE,
                MATCHDAY_34_FROM_DATE
            )
        }
        matchday35.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                SEASON_ID,
                MATCHDAY_35_START_DATE,
                MATCHDAY_35_FROM_DATE
            )
        }
        matchday36.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                SEASON_ID,
                MATCHDAY_36_START_DATE,
                MATCHDAY_36_FROM_DATE
            )
        }
        matchday37.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                SEASON_ID,
                MATCHDAY_37_START_DATE,
                MATCHDAY_37_FROM_DATE
            )
        }
        matchday38.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                SEASON_ID,
                MATCHDAY_38_START_DATE,
                MATCHDAY_38_FROM_DATE
            )
        }
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