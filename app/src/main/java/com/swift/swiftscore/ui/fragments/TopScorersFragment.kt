package com.swift.swiftscore.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.swift.swiftscore.R
import com.swift.swiftscore.adapters.TopScorerAdapter
import com.swift.swiftscore.databinding.FragmentTopScorersBinding
import com.swift.swiftscore.models.topscorersmodel.TopScorersResponse
import com.swift.swiftscore.ui.HomeActivity
import com.swift.swiftscore.ui.viewmodels.TopScorersViewModel
import com.swift.swiftscore.util.Constants.Companion.API_KEY
import com.swift.swiftscore.util.Constants.Companion.LIGUE1_ID_MATCHES
import com.swift.swiftscore.util.Constants.Companion.PL_ID_MATCHES
import com.swift.swiftscore.util.Resource

class TopScorersFragment : Fragment(R.layout.fragment_top_scorers) {

    private var _binding: FragmentTopScorersBinding? = null
    private val binding get() = _binding!!

    lateinit var viewModel: TopScorersViewModel
    lateinit var topScorerAdapter: TopScorerAdapter
    val TAG = "UpcomingMatchesFragment"

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTopScorersBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as HomeActivity).topScorersModel
        setupRecyclerView()
        observeViewModel()
        changeLeagueTopScorers()
    }

    private fun changeLeagueTopScorers() {
        binding.spinner3.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
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
        binding.iconConnection.visibility = View.INVISIBLE
        binding.tvPoorConnection.visibility = View.INVISIBLE
        binding.tvCheckConnection.visibility = View.INVISIBLE
        binding.tvTryAgain.visibility = View.INVISIBLE
        binding.btnRetry.visibility = View.INVISIBLE
        binding.tvAvailability.visibility = View.INVISIBLE
        binding.tvLater.visibility = View.INVISIBLE
        binding.rvTopScorers.visibility = View.VISIBLE
        topScorerAdapter.differ.submitList(topScorersResponse.data)
    }

    private fun responseError() {
        binding.iconConnection.visibility = View.VISIBLE
        binding.tvPoorConnection.visibility = View.VISIBLE
        binding.tvCheckConnection.visibility = View.VISIBLE
        binding.tvTryAgain.visibility = View.VISIBLE
        binding.btnRetry.visibility = View.VISIBLE
        binding.rvTopScorers.visibility = View.INVISIBLE
        binding.btnRetry.setOnClickListener {
            viewModel.getTopScorers(
                API_KEY,
                PL_ID_MATCHES
            )
        }
    }

    private fun showProgressBar() {
        binding.progressBar.visibility = View.VISIBLE
    }

    private fun hideProgressBar() {
        binding.progressBar.visibility = View.INVISIBLE
    }

    private fun setupRecyclerView() {
        topScorerAdapter = TopScorerAdapter()
        binding.rvTopScorers.apply {
            adapter = topScorerAdapter
            layoutManager = LinearLayoutManager(activity)
        }
    }
}