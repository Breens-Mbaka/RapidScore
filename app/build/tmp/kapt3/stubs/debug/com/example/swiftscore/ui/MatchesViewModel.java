package com.example.swiftscore.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0006\u0010\u000b\u001a\u00020\u0017J\u0011\u0010\u0018\u001a\u00020\u0017H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0016\u0010\u0011\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cJ!\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ&\u0010\u0014\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u001cJ1\u0010\"\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u001cH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0&H\u0002J\u001c\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00100\t2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00100&H\u0002J\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00130\t2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00130&H\u0002R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006)"}, d2 = {"Lcom/example/swiftscore/ui/MatchesViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "app", "Landroid/app/Application;", "matchesRepository", "Lcom/example/swiftscore/repository/MatchesRepository;", "(Landroid/app/Application;Lcom/example/swiftscore/repository/MatchesRepository;)V", "leagueTable", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/swiftscore/util/Resource;", "Lcom/example/swiftscore/models/standingsmodel/StandingsResponse;", "getLeagueTable", "()Landroidx/lifecycle/MutableLiveData;", "getMatchesRepository", "()Lcom/example/swiftscore/repository/MatchesRepository;", "topScorers", "Lcom/example/swiftscore/models/topscorersmodel/TopScorersResponse;", "getTopScorers", "upcomingMatches", "Lcom/example/swiftscore/models/upcomingmatchesmodel/UpcomingMatchesResponse;", "getUpcomingMatches", "checkInternetConnection", "", "", "getLeagueTableCall", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/Job;", "apiKey", "", "seasonId", "getTopScorersCall", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dateFrom", "dateTo", "getUpcomingMatchesCall", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleLeagueTableResponse", "response", "Lretrofit2/Response;", "handleTopScorersResponse", "handleUpcomingMatchesResponse", "app_debug"})
public final class MatchesViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.swiftscore.repository.MatchesRepository matchesRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.swiftscore.util.Resource<com.example.swiftscore.models.upcomingmatchesmodel.UpcomingMatchesResponse>> upcomingMatches = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.swiftscore.util.Resource<com.example.swiftscore.models.topscorersmodel.TopScorersResponse>> topScorers = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.swiftscore.util.Resource<com.example.swiftscore.models.standingsmodel.StandingsResponse>> leagueTable = null;
    
    public MatchesViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app, @org.jetbrains.annotations.NotNull()
    com.example.swiftscore.repository.MatchesRepository matchesRepository) {
        super(null);
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
    
    private final java.lang.Object getUpcomingMatchesCall(java.lang.String apiKey, java.lang.String seasonId, java.lang.String dateFrom, java.lang.String dateTo, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object getLeagueTableCall(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object getTopScorersCall(java.lang.String apiKey, java.lang.String seasonId, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final boolean checkInternetConnection() {
        return false;
    }
}