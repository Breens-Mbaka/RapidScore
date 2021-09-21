package com.swift.swiftscore.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.swift.swiftscore.R
import com.swift.swiftscore.models.upcomingmatchesmodel.Table
import kotlinx.android.synthetic.main.custom_upcoming_matches.view.*

class UpcomingMatchesAdapter : RecyclerView.Adapter<UpcomingMatchesAdapter.MatchesViewHolder>() {
    inner class MatchesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

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
        return MatchesViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.custom_upcoming_matches,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MatchesViewHolder, position: Int) {
        val match = differ.currentList[position]
        holder.itemView.apply {
            Glide.with(this).load(match.home_team.logo).into(homeTeamCrest)
            tvHomeTeam.text = match.home_team.short_code
            Glide.with(this).load(match.away_team.logo).into(awayTeamCrest)
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