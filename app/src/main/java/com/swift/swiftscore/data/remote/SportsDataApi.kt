package com.swift.swiftscore.data.remote

import com.swift.swiftscore.data.remote.dto.matchesdto.MatchesDto
import com.swift.swiftscore.data.remote.dto.standingsdto.StandingsDto
import com.swift.swiftscore.data.remote.dto.statsdto.StatsDto
import com.swift.swiftscore.util.Constants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface SportsDataApi {
    //get all upcoming matches
    @GET("api/v1/soccer/matches")
    suspend fun getUpcomingMatches(
        @Query("apikey")
        apiKey: String = Constants.API_KEY,
        @Query("season_id")
        seasonId: String = Constants.PL_ID_MATCHES,
        @Query("date_from")
        dateFrom: String = Constants.CURRENT_DATE,
        @Query("date_to")
        dateTo: String = Constants.MATCHDAY_38_FROM_DATE
    ): MatchesDto

    //get the league table standings
    @GET("api/v1/json/1/lookuptable.php")
    suspend fun getLeagueTable(
        @Query("l")
        leagueId: String = Constants.PL_ID_TABLE,
        @Query("s")
        season: String = Constants.PL_SEASON,
    ): StandingsDto

    //get top scorers
    @GET("api/v1/soccer/topscorers")
    suspend fun getTopScorers(
        @Query("apikey")
        apiKey: String = Constants.API_KEY,
        @Query("season_id")
        seasonId: String = Constants.PL_ID_MATCHES
    ): StatsDto
}