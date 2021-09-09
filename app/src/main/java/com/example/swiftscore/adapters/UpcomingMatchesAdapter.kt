package com.example.swiftscore.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.swiftscore.R
import com.example.swiftscore.models.upcomingmatchesmodel.Table
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
            if(match.status_code == 3) {
                ftScore.text = match.stats.ft_score as CharSequence?
            } else {
                ftScore.text = ""
            }
        }
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }
}