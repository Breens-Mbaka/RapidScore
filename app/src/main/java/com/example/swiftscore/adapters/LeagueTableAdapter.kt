package com.example.swiftscore.adapters

import android.graphics.drawable.PictureDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestBuilder
import com.example.swiftscore.R
import com.example.swiftscore.models.standingsmodel.Table
import com.github.twocoffeesoneteam.glidetovectoryou.GlideToVectorYou
import kotlinx.android.synthetic.main.custom_league_table.view.*
import kotlinx.android.synthetic.main.custom_upcoming_matches.view.*

class LeagueTableAdapter : RecyclerView.Adapter<LeagueTableAdapter.LeagueTableViewHolder>() {
    inner class LeagueTableViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    private val differCallback = object : DiffUtil.ItemCallback<Table>() {
        override fun areItemsTheSame(oldItem: Table, newItem: Table): Boolean {
            return oldItem.strTeamBadge == newItem.strTeamBadge
        }

        override fun areContentsTheSame(oldItem: Table, newItem: Table): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this, differCallback)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LeagueTableViewHolder {
        return LeagueTableViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.custom_league_table,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: LeagueTableViewHolder, position: Int) {
        val standing = differ.currentList[position]
        holder.itemView.apply {
            teamPosition.text = standing.intRank
            Glide.with(this).load(standing.strTeamBadge).into(teamCrest)
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