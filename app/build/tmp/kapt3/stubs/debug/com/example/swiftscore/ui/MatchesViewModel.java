package com.example.swiftscore.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\u0013J\u0016\u0010\u000f\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016J&\u0010\u0012\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0016J\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u001cH\u0002J\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001cH\u0002J\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u001cH\u0002R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\n\u00a8\u0006\u001f"}, d2 = {"Lcom/example/swiftscore/ui/MatchesViewModel;", "Landroidx/lifecycle/ViewModel;", "matchesRepository", "Lcom/example/swiftscore/repository/MatchesRepository;", "(Lcom/example/swiftscore/repository/MatchesRepository;)V", "leagueTable", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/swiftscore/util/Resource;", "Lcom/example/swiftscore/models/standingsmodel/StandingsResponse;", "getLeagueTable", "()Landroidx/lifecycle/MutableLiveData;", "getMatchesRepository", "()Lcom/example/swiftscore/repository/MatchesRepository;", "topScorers", "Lcom/example/swiftscore/models/topscorersmodel/TopScorersResponse;", "getTopScorers", "upcomingMatches", "Lcom/example/swiftscore/models/upcomingmatchesmodel/UpcomingMatchesResponse;", "getUpcomingMatches", "", "Lkotlinx/coroutines/Job;", "apiKey", "", "seasonId", "dateFrom", "dateTo", "handleLeagueTableResponse", "response", "Lretrofit2/Response;", "handleTopScorersResponse", "handleUpcomingMatchesResponse", "app_debug"})
public final class MatchesViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.swiftscore.repository.MatchesRepository matchesRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.swiftscore.util.Resource<com.example.swiftscore.models.upcomingmatchesmodel.UpcomingMatchesResponse>> upcomingMatches = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.swiftscore.util.Resource<com.example.swiftscore.models.topscorersmodel.TopScorersResponse>> topScorers = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.swiftscore.util.Resource<com.example.swiftscore.models.standingsmodel.StandingsResponse>> leagueTable = null;
    
    public MatchesViewModel(@org.jetbrains.annotations.NotNull()
    com.example.swiftscore.repository.MatchesRepository matchesRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.swiftscore.repository.MatchesRepository getMatchesRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.swiftscore.util.Resource<com.example.swiftscore.models.upcomingmatchesmodel.UpcomingMatchesResponse>> getUpcomingMatches() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.swiftscore.util.Resource<com.example.swiftscore.models.topscorersmodel.TopScorersResponse>> getTopScorers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.swiftscore.util.Resource<com.example.swiftscore.models.standingsmodel.StandingsResponse>> getLeagueTable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getUpcomingMatches(@org.jetbrains.annotations.NotNull()
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    java.lang.String seasonId, @org.jetbrains.annotations.NotNull()
    java.lang.String dateFrom, @org.jetbrains.annotations.NotNull()
    java.lang.String dateTo) {
        return null;
    }
    
    private final com.example.swiftscore.util.Resource<com.example.swiftscore.models.upcomingmatchesmodel.UpcomingMatchesResponse> handleUpcomingMatchesResponse(retrofit2.Response<com.example.swiftscore.models.upcomingmatchesmodel.UpcomingMatchesResponse> response) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getTopScorers(@org.jetbrains.annotations.NotNull()
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    java.lang.String seasonId) {
        return null;
    }
    
    private final com.example.swiftscore.util.Resource<com.example.swiftscore.models.topscorersmodel.TopScorersResponse> handleTopScorersResponse(retrofit2.Response<com.example.swiftscore.models.topscorersmodel.TopScorersResponse> response) {
        return null;
    }
    
    public final void getLeagueTable() {
    }
    
    private final com.example.swiftscore.util.Resource<com.example.swiftscore.models.standingsmodel.StandingsResponse> handleLeagueTableResponse(retrofit2.Response<com.example.swiftscore.models.standingsmodel.StandingsResponse> response) {
        return null;
    }
}