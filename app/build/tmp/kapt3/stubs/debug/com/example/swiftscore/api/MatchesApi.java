package com.example.swiftscore.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ+\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0003\u0010\r\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ+\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\b\b\u0003\u0010\r\u001a\u00020\u00062\b\b\u0003\u0010\u0011\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ?\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0003\u0010\r\u001a\u00020\u00062\b\b\u0003\u0010\u0011\u001a\u00020\u00062\b\b\u0003\u0010\u0014\u001a\u00020\u00062\b\b\u0003\u0010\u0015\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/example/swiftscore/api/MatchesApi;", "", "getLeagueTable", "Lretrofit2/Response;", "Lcom/example/swiftscore/models/standingsmodel/StandingsResponse;", "leagueId", "", "season", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTeamDetails", "Lcom/example/swiftscore/models/clubdetailmodel/ClubDetailsResponse;", "id", "", "apiKey", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTopScorers", "Lcom/example/swiftscore/models/topscorersmodel/TopScorersResponse;", "seasonId", "getUpcomingMatches", "Lcom/example/swiftscore/models/upcomingmatchesmodel/UpcomingMatchesResponse;", "dateFrom", "dateTo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface MatchesApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "api/v1/json/1/lookuptable.php")
    public abstract java.lang.Object getLeagueTable(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "l")
    java.lang.String leagueId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "s")
    java.lang.String season, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.swiftscore.models.standingsmodel.StandingsResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "api/v1/soccer/teams/{:id}")
    public abstract java.lang.Object getTeamDetails(@retrofit2.http.Path(value = ":id")
    int id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "apikey")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.swiftscore.models.clubdetailmodel.ClubDetailsResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "api/v1/soccer/matches")
    public abstract java.lang.Object getUpcomingMatches(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "apikey")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "season_id")
    java.lang.String seasonId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "date_from")
    java.lang.String dateFrom, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "date_to")
    java.lang.String dateTo, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.swiftscore.models.upcomingmatchesmodel.UpcomingMatchesResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "api/v1/soccer/topscorers")
    public abstract java.lang.Object getTopScorers(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "apikey")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "season_id")
    java.lang.String seasonId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.swiftscore.models.topscorersmodel.TopScorersResponse>> continuation);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public final class DefaultImpls {
    }
}