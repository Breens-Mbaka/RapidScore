package com.swift.swiftscore.data.remote

import com.swift.swiftscore.models.standingsmodel.StandingsResponse
import com.swift.swiftscore.models.topscorersmodel.TopScorersResponse
import com.swift.swiftscore.models.upcomingmatchesmodel.UpcomingMatchesResponse
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
    ): Response<UpcomingMatchesResponse>

    //get the league table standings
    @GET("api/v1/json/1/lookuptable.php")
    suspend fun getLeagueTable(
        @Query("l")
        leagueId: String = Constants.PL_ID_TABLE,
        @Query("s")
        season: String = Constants.PL_SEASON,
    ): Response<StandingsResponse>

    //get top scorers
    @GET("api/v1/soccer/topscorers")
    suspend fun getTopScorers(
        @Query("apikey")
        apiKey: String = Constants.API_KEY,
        @Query("season_id")
        seasonId: String = Constants.PL_ID_MATCHES
    ): Response<TopScorersResponse>
}