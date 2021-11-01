package com.swift.swiftscore.api

import com.swift.swiftscore.models.clubdetailmodel.ClubDetailsResponse
import com.swift.swiftscore.models.standingsmodel.StandingsResponse
import com.swift.swiftscore.models.topscorersmodel.TopScorersResponse
import com.swift.swiftscore.models.upcomingmatchesmodel.UpcomingMatchesResponse
import com.swift.swiftscore.util.Constants.Companion.API_KEY
import com.swift.swiftscore.util.Constants.Companion.CURRENT_DATE
import com.swift.swiftscore.util.Constants.Companion.MATCHDAY_38_FROM_DATE
import com.swift.swiftscore.util.Constants.Companion.PL_ID_MATCHES
import com.swift.swiftscore.util.Constants.Companion.PL_ID_TABLE
import com.swift.swiftscore.util.Constants.Companion.PL_SEASON
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MatchesApi {
    //get the league table standings
    @GET("api/v1/json/1/lookuptable.php")
    suspend fun getLeagueTable(
        @Query("l")
        leagueId: String = PL_ID_TABLE,
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
        seasonId: String = PL_ID_MATCHES,
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
        seasonId: String = PL_ID_MATCHES
    ): Response<TopScorersResponse>
}