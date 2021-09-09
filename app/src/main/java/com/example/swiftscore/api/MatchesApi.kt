package com.example.swiftscore.api

import com.example.swiftscore.BuildConfig
import com.example.swiftscore.BuildConfig.API_KEY
import com.example.swiftscore.models.clubdetailmodel.ClubDetailsResponse
import com.example.swiftscore.models.standingsmodel.StandingsResponse
import com.example.swiftscore.models.topscorersmodel.TopScorersResponse
import com.example.swiftscore.models.upcomingmatchesmodel.UpcomingMatchesResponse
import com.example.swiftscore.util.Constants.Companion.CURRENT_DATE
import com.example.swiftscore.util.Constants.Companion.MATCHDAY_1_START_DATE
import com.example.swiftscore.util.Constants.Companion.MATCHDAY_38_FROM_DATE
import com.example.swiftscore.util.Constants.Companion.PL_ID
import com.example.swiftscore.util.Constants.Companion.PL_SEASON
import com.example.swiftscore.util.Constants.Companion.SEASON_ID
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MatchesApi {
    //get the league table standings
    @GET("api/v1/json/1/lookuptable.php")
    suspend fun getLeagueTable(
        @Query("l")
        leagueId: String = PL_ID,
        @Query("s")
        season: String = PL_SEASON,
    ): Response<StandingsResponse>

    //get all team details
    @GET("api/v1/soccer/teams/{:id}")
    suspend fun getTeamDetails(
        @Path(":id") id: Int,
        @Query("apikey")
        apiKey: String = API_KEY,
    ): Response<ClubDetailsResponse>

    //get all upcoming matches
    @GET("api/v1/soccer/matches")
    suspend fun getUpcomingMatches(
        @Query("apikey")
        apiKey: String = API_KEY,
        @Query("season_id")
        seasonId: String = SEASON_ID,
        @Query("date_from")
        dateFrom: String = CURRENT_DATE,
        @Query("date_to")
        dateTo: String = MATCHDAY_38_FROM_DATE
    ): Response<UpcomingMatchesResponse>

    //get top scorers
    @GET("api/v1/soccer/topscorers")
    suspend fun getTopScorers(
        @Query("apikey")
        apiKey: String = API_KEY,
        @Query("season_id")
        seasonId: String = SEASON_ID
    ): Response<TopScorersResponse>
}