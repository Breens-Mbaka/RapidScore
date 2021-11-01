package com.swift.swiftscore.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.swift.swiftscore.databinding.CustomLeagueTableBinding
import com.swift.swiftscore.models.standingsmodel.Table

class LeagueTableAdapter : RecyclerView.Adapter<LeagueTableAdapter.LeagueTableViewHolder>() {
    inner class LeagueTableViewHolder(val binding: CustomLeagueTableBinding) : RecyclerView.ViewHolder(binding.root)

    private val differCallback = object : DiffUtil.ItemCallback<Table>() {
        override fun areItemsTheSame(oldItem: Table, newItem: Table): Boolean {
            return oldItem.strTeamBadge == newItem.strTeamBadge
        }

        override fun areContentsTheSame(oldItem: Table, newItem: Table): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this, differCallback)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LeagueTableAdapter.LeagueTableViewHolder {
        val binding = CustomLeagueTableBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LeagueTableViewHolder(binding)
    }

    override fun onBindViewHolder(holder: LeagueTableAdapter.LeagueTableViewHolder, position: Int) {
        val standing = differ.currentList[position]
        holder.binding.apply {
            val rank = Integer.parseInt(standing.intRank)
            if (rank < 10) {
                val rank = "0$rank"
                teamPosition.text = rank
            } else {
                teamPosition.text = standing.intRank
            }

            teamCrest.load(standing.strTeamBadge)
            teamName.text = standing.strTeam
            gamesPlayed.text = standing.intPlayed
            goalDifference.text = standing.intGoalDifference
            points.text = standing.intPoints
        }
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }
}