package com.swift.swiftscore.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.swift.swiftscore.databinding.CustomTopScorersBinding
import com.swift.swiftscore.models.topscorersmodel.DataXXX

class TopScorerAdapter : RecyclerView.Adapter<TopScorerAdapter.TopScorerViewHolder>() {
    inner class TopScorerViewHolder(val binding: CustomTopScorersBinding) : RecyclerView.ViewHolder(binding.root)

    private val differCallback = object : DiffUtil.ItemCallback<DataXXX>() {
        override fun areItemsTheSame(oldItem: DataXXX, newItem: DataXXX): Boolean {
            return oldItem.player.player_name == newItem.player.player_name
        }

        override fun areContentsTheSame(oldItem: DataXXX, newItem: DataXXX): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this, differCallback)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopScorerAdapter.TopScorerViewHolder {
        val binding = CustomTopScorersBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TopScorerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TopScorerViewHolder, position: Int) {
        val player = differ.currentList[position]
        holder.binding.apply {
            val rank = player.pos
            if (rank < 10) {
                var position = "0$rank"
                playerPosition.text = position
            } else {
                playerPosition.text = player.pos.toString()
            }
            val name: String? = player.player.player_name
            val fullNamesArray = arrayListOf<String>()
            val arr = name?.split(" ")
            if (arr != null) {
                fullNamesArray.addAll(arr)
            }
            if (fullNamesArray.size >= 1) {
                playerName.text = "${fullNamesArray[0]} ${fullNamesArray[1]}"
            } else {
                playerName.text = name
            }
            clubName.text = player.team.team_name
            goals.text = player.goals.overall.toString()
        }
    }

    override fun getItemCount(): Int {
        return 10
    }
}
