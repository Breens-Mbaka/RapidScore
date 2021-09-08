package com.example.swiftscore.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.swiftscore.R
import com.example.swiftscore.adapters.TopScorerAdapter
import com.example.swiftscore.ui.HomeActivity
import com.example.swiftscore.ui.MatchesViewModel
import com.example.swiftscore.util.Resource
import kotlinx.android.synthetic.main.fragment_top_scorers.*

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
                        topScorerAdapter.differ.submitList(topScorersResponse.data)
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
        topScorerAdapter = TopScorerAdapter()
        rvTopScorers.apply {
            adapter = topScorerAdapter
            layoutManager = LinearLayoutManager(activity)
        }
    }
}