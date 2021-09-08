package com.example.swiftscore.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.swiftscore.R
import com.example.swiftscore.models.clubdetailmodel.DataX
import com.example.swiftscore.models.topscorersmodel.DataXXX
import kotlinx.android.synthetic.main.custom_league_table.view.*
import kotlinx.android.synthetic.main.custom_top_scorers.view.*

class TopScorerAdapter: RecyclerView.Adapter<TopScorerAdapter.TopScorerViewHolder>() {
    inner class TopScorerViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    private val differCallback = object : DiffUtil.ItemCallback<DataXXX>(){
        override fun areItemsTheSame(oldItem: DataXXX, newItem: DataXXX): Boolean {
            return oldItem.player.player_name == newItem.player.player_name
        }

        override fun areContentsTheSame(oldItem: DataXXX, newItem: DataXXX): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this, differCallback)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopScorerViewHolder {
        return TopScorerViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.custom_top_scorers,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: TopScorerViewHolder, position: Int) {
        val player = differ.currentList[position]
        holder.itemView.apply {
            playerPosition.text = player.pos.toString()
            playerName.text = player.player.player_name
            clubName.text = player.team.team_name
            goals.text = player.goals.overall.toString()
        }
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }
}