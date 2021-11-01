package com.swift.swiftscore.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.swift.swiftscore.databinding.CustomUpcomingMatchesBinding
import com.swift.swiftscore.models.upcomingmatchesmodel.Table

class UpcomingMatchesAdapter : RecyclerView.Adapter<UpcomingMatchesAdapter.MatchesViewHolder>() {
    inner class MatchesViewHolder(val binding: CustomUpcomingMatchesBinding) : RecyclerView.ViewHolder(binding.root)

    private val differCallback = object : DiffUtil.ItemCallback<Table>() {
        override fun areItemsTheSame(oldItem: Table, newItem: Table): Boolean {
            return oldItem.match_start == newItem.match_start
        }

        override fun areContentsTheSame(oldItem: Table, newItem: Table): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this, differCallback)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MatchesViewHolder {
        val binding = CustomUpcomingMatchesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MatchesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MatchesViewHolder, position: Int) {
        val match = differ.currentList[position]
        holder.binding.apply {
            homeTeamCrest.load(match.home_team.logo)
            tvHomeTeam.text = match.home_team.short_code
            awayTeamCrest.load(match.away_team.logo)
            tvAwayTeam.text = match.away_team.short_code
            tvSchedule.text = match.match_start
            if(match.status == "finished") {
                homeScore.text = match.stats.home_score.toString()
                awayScore.text = match.stats.away_score.toString()
                homeScore.visibility = View.VISIBLE
                awayScore.visibility = View.VISIBLE
            } else {
                homeScore.visibility = View.INVISIBLE
                awayScore.visibility = View.INVISIBLE
            }
        }
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }
}