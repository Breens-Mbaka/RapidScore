package com.swift.swiftscore.presentation.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.swift.swiftscore.R
import com.swift.swiftscore.presentation.adapters.LeagueTableAdapter
import com.swift.swiftscore.databinding.FragmentLeagueTableBinding
import com.swift.swiftscore.models.standingsmodel.StandingsResponse
import com.swift.swiftscore.presentation.ui.HomeActivity
import com.swift.swiftscore.presentation.ui.viewmodels.StandingsViewModel
import com.swift.swiftscore.util.Constants.Companion.LIGUE_1_ID_TABLE
import com.swift.swiftscore.util.Constants.Companion.PL_ID_TABLE
import com.swift.swiftscore.util.Constants.Companion.PL_SEASON
import com.swift.swiftscore.common.Resource

class LeagueTableFragment : Fragment(R.layout.fragment_league_table) {

    private var _binding: FragmentLeagueTableBinding? = null
    private val binding get() = _binding!!

    lateinit var viewModel: StandingsViewModel
    lateinit var leagueTableAdapter: LeagueTableAdapter
    val TAG = "LeagueTableFragment"

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLeagueTableBinding.inflate(inflater, container, false)
        return binding.root
    }

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
        changeLeagueTable()
    }

    private fun changeLeagueTable() {
        binding.spinner2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                adapterView: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val leagueSelected = adapterView?.getItemAtPosition(position).toString()
                if (leagueSelected == "Ligue 1") {
                    viewModel.getLeagueTable(LIGUE_1_ID_TABLE, PL_SEASON)
                }
                else if(leagueSelected == "Premier League") {
                    viewModel.getLeagueTable(PL_ID_TABLE, PL_SEASON)
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

        }
    }

    private fun responseSuccess(standingsResponse: StandingsResponse) {
        binding.iconConnection.visibility = View.INVISIBLE
        binding.tvPoorConnection.visibility = View.INVISIBLE
        binding.tvCheckConnection.visibility = View.INVISIBLE
        binding.tvTryAgain.visibility = View.INVISIBLE
        binding.btnRetry.visibility = View.INVISIBLE
        binding.tvAvailability.visibility = View.INVISIBLE
        binding.tvLater.visibility = View.INVISIBLE
        binding.rvLeagueTable.visibility = View.VISIBLE
        leagueTableAdapter.differ.submitList(standingsResponse.table)
    }

    private fun responseError() {
        binding.iconConnection.visibility = View.VISIBLE
        binding.tvPoorConnection.visibility = View.VISIBLE
        binding.tvCheckConnection.visibility = View.VISIBLE
        binding.tvTryAgain.visibility = View.VISIBLE
        binding.btnRetry.visibility = View.VISIBLE
        binding.rvLeagueTable.visibility = View.INVISIBLE
        binding.btnRetry.setOnClickListener {
            viewModel.getLeagueTable(PL_ID_TABLE, PL_SEASON)
        }
    }

    private fun showProgressBar() {
        binding.progressBar.visibility = View.VISIBLE
    }

    private fun hideProgressBar() {
        binding.progressBar.visibility = View.INVISIBLE
    }

    private fun setupRecyclerView() {
        leagueTableAdapter = LeagueTableAdapter()
        binding.rvLeagueTable.apply {
            adapter = leagueTableAdapter
            layoutManager = LinearLayoutManager(activity)
        }
    }
}