package com.example.swiftscore.models.standingsmodel

import com.example.swiftscore.models.standingsmodel.Standing

data class Data(
    val has_groups: Int,
    val league_id: Int,
    val season_id: Int,
    val standings: List<Standing>
)