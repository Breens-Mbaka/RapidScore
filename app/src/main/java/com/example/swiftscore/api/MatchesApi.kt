package com.example.swiftscore.api

import com.example.swiftscore.models.clubdetailmodel.ClubDetailsResponse
import com.example.swiftscore.models.standingsmodel.StandingResponse
import com.example.swiftscore.models.topscorersmodel.TopScorersResponse
import com.example.swiftscore.models.upcomingmatchesmodel.UpcomingMatchesResponse
import com.example.swiftscore.util.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MatchesApi {
    //get the league table standings
    @GET("api/v1/soccer/standings")
    suspend fun getLeagueTable(
        @Query("apikey")
        apiKey: String = API_KEY
    ): Response<StandingResponse>

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
        seasonId: String = "1980",
        @Query("date_from")
        dateFrom: String = "2021-09-11",
        @Query("date_to")
        dateTo: String = "2021-09-13"
    ): Response<UpcomingMatchesResponse>

    //get top scorers
    @GET("api/v1/soccer/topscorers")
    suspend fun getTopScorers(
        @Query("apikey")
        apiKey: String = API_KEY,
        @Query("season_id")
        seasonId: String = "1980"
    ): Response<TopScorersResponse>
}