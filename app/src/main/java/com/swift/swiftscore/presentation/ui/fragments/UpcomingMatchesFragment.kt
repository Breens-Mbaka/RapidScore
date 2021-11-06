package com.swift.swiftscore.presentation.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.swift.swiftscore.R
import com.swift.swiftscore.presentation.adapters.UpcomingMatchesAdapter
import com.swift.swiftscore.databinding.FragmentUpcomingMatchesBinding
import com.swift.swiftscore.models.upcomingmatchesmodel.UpcomingMatchesResponse
import com.swift.swiftscore.presentation.ui.HomeActivity
import com.swift.swiftscore.presentation.ui.viewmodels.MatchesViewModel
import com.swift.swiftscore.util.Constants.Companion.API_KEY
import com.swift.swiftscore.util.Constants.Companion.CURRENT_DATE
import com.swift.swiftscore.util.Constants.Companion.LIGUE1_ID_MATCHES
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_10_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_10_FROM_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_10_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_10_START_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_11_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_11_FROM_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_11_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_11_START_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_12_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_12_FROM_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_12_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_12_START_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_13_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_13_FROM_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_13_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_13_START_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_14_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_14_FROM_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_14_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_14_START_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_15_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_15_FROM_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_15_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_15_START_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_16_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_16_FROM_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_16_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_16_START_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_17_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_17_FROM_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_17_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_17_START_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_18_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_18_FROM_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_18_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_18_START_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_19_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_19_FROM_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_19_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_19_START_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_1_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_1_FROM_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_1_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_1_START_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_20_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_20_FROM_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_20_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_20_START_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_21_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_21_FROM_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_21_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_21_START_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_22_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_22_FROM_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_22_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_22_START_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_23_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_23_FROM_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_23_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_23_START_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_24_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_24_FROM_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_24_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_24_START_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_25_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_25_FROM_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_25_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_25_START_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_26_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_26_FROM_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_26_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_26_START_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_27_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_27_FROM_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_27_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_27_START_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_28_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_28_FROM_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_28_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_28_START_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_29_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_29_FROM_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_29_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_29_START_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_2_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_2_FROM_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_2_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_2_START_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_30_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_30_FROM_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_30_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_30_START_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_31_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_31_FROM_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_31_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_31_START_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_32_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_32_FROM_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_32_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_32_START_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_33_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_33_FROM_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_33_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_33_START_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_34_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_34_FROM_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_34_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_34_START_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_35_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_35_FROM_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_35_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_35_START_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_36_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_36_FROM_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_36_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_36_START_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_37_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_37_FROM_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_37_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_37_START_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_38_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_38_FROM_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_38_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_38_START_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_3_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_3_FROM_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_3_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_3_START_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_4_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_4_FROM_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_4_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_4_START_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_5_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_5_FROM_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_5_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_5_START_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_6_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_6_FROM_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_6_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_6_START_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_7_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_7_FROM_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_7_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_7_START_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_8_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_8_FROM_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_8_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_8_START_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_9_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_9_FROM_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_9_START_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_9_START_DATE_LIGUE1
import com.swift.swiftscore.util.Constants.Companion.PL_ID_MATCHES
import com.swift.swiftscore.common.Resource

class UpcomingMatchesFragment : Fragment(R.layout.fragment_upcoming_matches) {

    private var _binding: FragmentUpcomingMatchesBinding? = null
    private val binding get() = _binding!!

    lateinit var viewModel: MatchesViewModel
    lateinit var upcomingMatchesAdapter: UpcomingMatchesAdapter
    val TAG = "UpcomingMatchesFragment"
    private var league: Boolean = true
    private var leagueId: String = PL_ID_MATCHES

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentUpcomingMatchesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as HomeActivity).matchesViewModel
        setupRecyclerView()
        observeUpcomingMatches()
        filterMatchDays()
        changeLeague()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun changeLeague() {
        binding.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                adapterView: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val leagueSelected = adapterView?.getItemAtPosition(position).toString()
                if (leagueSelected == "Premier League") {
                    leagueId = PL_ID_MATCHES
                    Toast.makeText(context, leagueSelected, Toast.LENGTH_LONG).show()
                    viewModel.getUpcomingMatches(API_KEY, PL_ID_MATCHES, CURRENT_DATE, MATCHDAY_38_FROM_DATE)
                } else if (leagueSelected == "Ligue 1") {
                    leagueId = LIGUE1_ID_MATCHES
                    viewModel.getUpcomingMatches(API_KEY, LIGUE1_ID_MATCHES, CURRENT_DATE,
                        MATCHDAY_38_FROM_DATE_LIGUE1)
                    filterMatchDaysForLigue1()
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

        }
    }

    private fun observeUpcomingMatches() {
        viewModel.upcomingMatches.observe(viewLifecycleOwner, { response ->
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
        binding.iconConnection.visibility = View.INVISIBLE
        binding.tvPoorConnection.visibility = View.INVISIBLE
        binding.tvCheckConnection.visibility = View.INVISIBLE
        binding.tvTryAgain.visibility = View.INVISIBLE
        binding.btnRetry.visibility = View.INVISIBLE
        binding.imgNoData.visibility = View.INVISIBLE
        binding.tvAvailability.visibility = View.INVISIBLE
        binding.tvLater.visibility = View.INVISIBLE
        binding.rvUpcomingMatches.visibility = View.VISIBLE
        upcomingMatchesAdapter.differ.submitList(upcomingMatchesResponse.data)
    }

    private fun responseError(message: String) {
        if (message == "") {
            binding.imgNoData.visibility = View.VISIBLE
            binding.tvAvailability.visibility = View.VISIBLE
            binding.tvLater.visibility = View.VISIBLE
            binding.rvUpcomingMatches.visibility = View.INVISIBLE
        } else {
            binding.iconConnection.visibility = View.VISIBLE
            binding.tvPoorConnection.visibility = View.VISIBLE
            binding.tvCheckConnection.visibility = View.VISIBLE
            binding.tvTryAgain.visibility = View.VISIBLE
            binding.btnRetry.visibility = View.VISIBLE
            binding.rvUpcomingMatches.visibility = View.INVISIBLE
            binding.btnRetry.setOnClickListener {
                viewModel.getUpcomingMatches(
                    API_KEY,
                    leagueId,
                    CURRENT_DATE,
                    MATCHDAY_38_FROM_DATE
                )
            }
        }
    }

    private fun filterMatchDays() {
        binding.matchday1.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_1_START_DATE,
                MATCHDAY_1_FROM_DATE,
            )

        }
        binding.matchday2.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_2_START_DATE,
                MATCHDAY_2_FROM_DATE
            )
        }
        binding.matchday3.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_3_START_DATE,
                MATCHDAY_3_FROM_DATE
            )
        }
        binding.matchday4.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_4_START_DATE,
                MATCHDAY_4_FROM_DATE
            )
        }
        binding.matchday5.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_5_START_DATE,
                MATCHDAY_5_FROM_DATE
            )
        }
        binding.matchday6.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_6_START_DATE,
                MATCHDAY_6_FROM_DATE
            )
        }
        binding.matchday7.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_7_START_DATE,
                MATCHDAY_7_FROM_DATE
            )
        }
        binding.matchday8.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_8_START_DATE,
                MATCHDAY_8_FROM_DATE
            )
        }
        binding.matchday9.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_9_START_DATE,
                MATCHDAY_9_FROM_DATE
            )
        }
        binding.matchday10.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_10_START_DATE,
                MATCHDAY_10_FROM_DATE
            )
        }
        binding.matchday11.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_11_START_DATE,
                MATCHDAY_11_FROM_DATE
            )
        }
        binding.matchday12.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_12_START_DATE,
                MATCHDAY_12_FROM_DATE
            )
        }
        binding.matchday13.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_13_START_DATE,
                MATCHDAY_13_FROM_DATE
            )
        }
        binding.matchday14.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_14_START_DATE,
                MATCHDAY_14_FROM_DATE
            )
        }
        binding.matchday15.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_15_START_DATE,
                MATCHDAY_15_FROM_DATE
            )
        }
        binding.matchday16.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_16_START_DATE,
                MATCHDAY_16_FROM_DATE
            )
        }
        binding.matchday17.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_17_START_DATE,
                MATCHDAY_17_FROM_DATE
            )
        }
        binding.matchday18.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_18_START_DATE,
                MATCHDAY_18_FROM_DATE
            )
        }
        binding.matchday19.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_19_START_DATE,
                MATCHDAY_19_FROM_DATE
            )
        }
        binding.matchday20.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_20_START_DATE,
                MATCHDAY_20_FROM_DATE
            )
        }
        binding.matchday21.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_21_START_DATE,
                MATCHDAY_21_FROM_DATE
            )
        }
        binding.matchday22.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_22_START_DATE,
                MATCHDAY_22_FROM_DATE
            )
        }
        binding.matchday23.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_23_START_DATE,
                MATCHDAY_23_FROM_DATE
            )
        }
        binding.matchday24.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_24_START_DATE,
                MATCHDAY_24_FROM_DATE
            )
        }
        binding.matchday25.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_25_START_DATE,
                MATCHDAY_25_FROM_DATE
            )
        }
        binding.matchday26.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_26_START_DATE,
                MATCHDAY_26_FROM_DATE
            )
        }
        binding.matchday27.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_27_START_DATE,
                MATCHDAY_27_FROM_DATE
            )
        }
        binding.matchday28.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_28_START_DATE,
                MATCHDAY_28_FROM_DATE
            )
        }
        binding.matchday29.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_29_START_DATE,
                MATCHDAY_29_FROM_DATE
            )
        }
        binding.matchday30.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_30_START_DATE,
                MATCHDAY_30_FROM_DATE
            )
        }
        binding.matchday31.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_31_START_DATE,
                MATCHDAY_31_FROM_DATE
            )
        }
        binding.matchday32.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_32_START_DATE,
                MATCHDAY_32_FROM_DATE
            )
        }
        binding.matchday33.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_33_START_DATE,
                MATCHDAY_33_FROM_DATE
            )
        }
        binding.matchday34.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_34_START_DATE,
                MATCHDAY_34_FROM_DATE
            )
        }
        binding.matchday35.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_35_START_DATE,
                MATCHDAY_35_FROM_DATE
            )
        }
        binding.matchday36.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_36_START_DATE,
                MATCHDAY_36_FROM_DATE
            )
        }
        binding.matchday37.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_37_START_DATE,
                MATCHDAY_37_FROM_DATE
            )
        }
        binding.matchday38.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_38_START_DATE,
                MATCHDAY_38_FROM_DATE
            )
        }
    }

    private fun filterMatchDaysForLigue1() {
        binding.matchday1.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_1_START_DATE_LIGUE1,
                MATCHDAY_1_FROM_DATE_LIGUE1,
            )

        }
        binding.matchday2.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_2_START_DATE_LIGUE1,
                MATCHDAY_2_FROM_DATE_LIGUE1
            )
        }
        binding.matchday3.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_3_START_DATE_LIGUE1,
                MATCHDAY_3_FROM_DATE_LIGUE1
            )
        }
        binding.matchday4.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_4_START_DATE_LIGUE1,
                MATCHDAY_4_FROM_DATE_LIGUE1
            )
        }
        binding.matchday5.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_5_START_DATE_LIGUE1,
                MATCHDAY_5_FROM_DATE_LIGUE1
            )
        }
        binding.matchday6.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_6_START_DATE_LIGUE1,
                MATCHDAY_6_FROM_DATE_LIGUE1
            )
        }
        binding.matchday7.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_7_START_DATE_LIGUE1,
                MATCHDAY_7_FROM_DATE_LIGUE1
            )
        }
        binding.matchday8.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_8_START_DATE_LIGUE1,
                MATCHDAY_8_FROM_DATE_LIGUE1
            )
        }
        binding.matchday9.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_9_START_DATE_LIGUE1,
                MATCHDAY_9_FROM_DATE_LIGUE1
            )
        }
        binding.matchday10.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_10_START_DATE_LIGUE1,
                MATCHDAY_10_FROM_DATE_LIGUE1
            )
        }
        binding.matchday11.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_11_START_DATE_LIGUE1,
                MATCHDAY_11_FROM_DATE_LIGUE1
            )
        }
        binding.matchday12.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_12_START_DATE_LIGUE1,
                MATCHDAY_12_FROM_DATE_LIGUE1
            )
        }
        binding.matchday13.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_13_START_DATE_LIGUE1,
                MATCHDAY_13_FROM_DATE_LIGUE1
            )
        }
        binding.matchday14.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_14_START_DATE_LIGUE1,
                MATCHDAY_14_FROM_DATE_LIGUE1
            )
        }
        binding.matchday15.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_15_START_DATE_LIGUE1,
                MATCHDAY_15_FROM_DATE_LIGUE1
            )
        }
        binding.matchday16.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_16_START_DATE_LIGUE1,
                MATCHDAY_16_FROM_DATE_LIGUE1
            )
        }
        binding.matchday17.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_17_START_DATE_LIGUE1,
                MATCHDAY_17_FROM_DATE_LIGUE1
            )
        }
        binding.matchday18.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_18_START_DATE_LIGUE1,
                MATCHDAY_18_FROM_DATE_LIGUE1
            )
        }
        binding.matchday19.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_19_START_DATE_LIGUE1,
                MATCHDAY_19_FROM_DATE_LIGUE1
            )
        }
        binding.matchday20.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_20_START_DATE_LIGUE1,
                MATCHDAY_20_FROM_DATE_LIGUE1
            )
        }
        binding.matchday21.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_21_START_DATE_LIGUE1,
                MATCHDAY_21_FROM_DATE_LIGUE1
            )
        }
        binding.matchday22.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_22_START_DATE_LIGUE1,
                MATCHDAY_22_FROM_DATE_LIGUE1
            )
        }
        binding.matchday23.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_23_START_DATE_LIGUE1,
                MATCHDAY_23_FROM_DATE_LIGUE1
            )
        }
        binding.matchday24.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_24_START_DATE_LIGUE1,
                MATCHDAY_24_FROM_DATE_LIGUE1
            )
        }
        binding.matchday25.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_25_START_DATE_LIGUE1,
                MATCHDAY_25_FROM_DATE_LIGUE1
            )
        }
        binding.matchday26.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_26_START_DATE_LIGUE1,
                MATCHDAY_26_FROM_DATE_LIGUE1
            )
        }
        binding.matchday27.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_27_START_DATE_LIGUE1,
                MATCHDAY_27_FROM_DATE_LIGUE1
            )
        }
        binding.matchday28.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_28_START_DATE_LIGUE1,
                MATCHDAY_28_FROM_DATE_LIGUE1
            )
        }
        binding.matchday29.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_29_START_DATE_LIGUE1,
                MATCHDAY_29_FROM_DATE_LIGUE1
            )
        }
        binding.matchday30.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_30_START_DATE_LIGUE1,
                MATCHDAY_30_FROM_DATE_LIGUE1
            )
        }
        binding.matchday31.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_31_START_DATE_LIGUE1,
                MATCHDAY_31_FROM_DATE_LIGUE1
            )
        }
        binding.matchday32.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_32_START_DATE_LIGUE1,
                MATCHDAY_32_FROM_DATE_LIGUE1
            )
        }
        binding.matchday33.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_33_START_DATE_LIGUE1,
                MATCHDAY_33_FROM_DATE_LIGUE1
            )
        }
        binding.matchday34.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_34_START_DATE_LIGUE1,
                MATCHDAY_34_FROM_DATE_LIGUE1
            )
        }
        binding.matchday35.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_35_START_DATE_LIGUE1,
                MATCHDAY_35_FROM_DATE_LIGUE1
            )
        }
        binding.matchday36.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_36_START_DATE_LIGUE1,
                MATCHDAY_36_FROM_DATE_LIGUE1
            )
        }
        binding.matchday37.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_37_START_DATE_LIGUE1,
                MATCHDAY_37_FROM_DATE_LIGUE1
            )
        }
        binding.matchday38.setOnClickListener {
            viewModel.getUpcomingMatches(
                API_KEY,
                leagueId,
                MATCHDAY_38_START_DATE_LIGUE1,
                MATCHDAY_38_FROM_DATE_LIGUE1
            )
        }
    }

    private fun hideProgressBar() {
        binding.progressBar.visibility = View.INVISIBLE

    }

    private fun showProgressBar() {
        binding.progressBar.visibility = View.VISIBLE
    }

    private fun setupRecyclerView() {
        upcomingMatchesAdapter = UpcomingMatchesAdapter()
        binding.rvUpcomingMatches.apply {
            adapter = upcomingMatchesAdapter
            layoutManager = LinearLayoutManager(activity)
        }
    }
}