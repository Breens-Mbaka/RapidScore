package com.example.swiftscore.models.upcomingmatchesmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u0001\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\f\u0012\u0006\u0010\u0018\u001a\u00020\t\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u00a2\u0006\u0002\u0010\u001bJ\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\u0011H\u00c6\u0003J\t\u00108\u001a\u00020\tH\u00c6\u0003J\t\u00109\u001a\u00020\u0014H\u00c6\u0003J\t\u0010:\u001a\u00020\u0016H\u00c6\u0003J\t\u0010;\u001a\u00020\fH\u00c6\u0003J\t\u0010<\u001a\u00020\tH\u00c6\u0003J\t\u0010=\u001a\u00020\u001aH\u00c6\u0003J\t\u0010>\u001a\u00020\u0005H\u00c6\u0003J\t\u0010?\u001a\u00020\u0007H\u00c6\u0003J\t\u0010@\u001a\u00020\tH\u00c6\u0003J\t\u0010A\u001a\u00020\tH\u00c6\u0003J\t\u0010B\u001a\u00020\fH\u00c6\u0003J\t\u0010C\u001a\u00020\fH\u00c6\u0003J\t\u0010D\u001a\u00020\u0001H\u00c6\u0003J\t\u0010E\u001a\u00020\u0001H\u00c6\u0003J\u00a9\u0001\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\f2\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u00c6\u0001J\u0013\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010J\u001a\u00020\tH\u00d6\u0001J\t\u0010K\u001a\u00020\fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\r\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010&R\u0011\u0010\u000e\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u000f\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0012\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010#R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u0017\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010&R\u0011\u0010\u0018\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010#R\u0011\u0010\u0019\u001a\u00020\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00105\u00a8\u0006L"}, d2 = {"Lcom/example/swiftscore/models/upcomingmatchesmodel/Table;", "", "away_team", "Lcom/example/swiftscore/models/upcomingmatchesmodel/AwayTeam;", "group", "Lcom/example/swiftscore/models/upcomingmatchesmodel/Group;", "home_team", "Lcom/example/swiftscore/models/upcomingmatchesmodel/HomeTeam;", "league_id", "", "match_id", "match_start", "", "match_start_iso", "minute", "referee_id", "round", "Lcom/example/swiftscore/models/upcomingmatchesmodel/Round;", "season_id", "stage", "Lcom/example/swiftscore/models/upcomingmatchesmodel/Stage;", "stats", "Lcom/example/swiftscore/models/upcomingmatchesmodel/Stats;", "status", "status_code", "venue", "Lcom/example/swiftscore/models/upcomingmatchesmodel/Venue;", "(Lcom/example/swiftscore/models/upcomingmatchesmodel/AwayTeam;Lcom/example/swiftscore/models/upcomingmatchesmodel/Group;Lcom/example/swiftscore/models/upcomingmatchesmodel/HomeTeam;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/example/swiftscore/models/upcomingmatchesmodel/Round;ILcom/example/swiftscore/models/upcomingmatchesmodel/Stage;Lcom/example/swiftscore/models/upcomingmatchesmodel/Stats;Ljava/lang/String;ILcom/example/swiftscore/models/upcomingmatchesmodel/Venue;)V", "getAway_team", "()Lcom/example/swiftscore/models/upcomingmatchesmodel/AwayTeam;", "getGroup", "()Lcom/example/swiftscore/models/upcomingmatchesmodel/Group;", "getHome_team", "()Lcom/example/swiftscore/models/upcomingmatchesmodel/HomeTeam;", "getLeague_id", "()I", "getMatch_id", "getMatch_start", "()Ljava/lang/String;", "getMatch_start_iso", "getMinute", "()Ljava/lang/Object;", "getReferee_id", "getRound", "()Lcom/example/swiftscore/models/upcomingmatchesmodel/Round;", "getSeason_id", "getStage", "()Lcom/example/swiftscore/models/upcomingmatchesmodel/Stage;", "getStats", "()Lcom/example/swiftscore/models/upcomingmatchesmodel/Stats;", "getStatus", "getStatus_code", "getVenue", "()Lcom/example/swiftscore/models/upcomingmatchesmodel/Venue;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Table {
    @org.jetbrains.annotations.NotNull()
    private final com.example.swiftscore.models.upcomingmatchesmodel.AwayTeam away_team = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.swiftscore.models.upcomingmatchesmodel.Group group = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.swiftscore.models.upcomingmatchesmodel.HomeTeam home_team = null;
    private final int league_id = 0;
    private final int match_id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String match_start = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String match_start_iso = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object minute = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object referee_id = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.swiftscore.models.upcomingmatchesmodel.Round round = null;
    private final int season_id = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.example.swiftscore.models.upcomingmatchesmodel.Stage stage = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.swiftscore.models.upcomingmatchesmodel.Stats stats = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String status = null;
    private final int status_code = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.example.swiftscore.models.upcomingmatchesmodel.Venue venue = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.swiftscore.models.upcomingmatchesmodel.Table copy(@org.jetbrains.annotations.NotNull()
    com.example.swiftscore.models.upcomingmatchesmodel.AwayTeam away_team, @org.jetbrains.annotations.NotNull()
    com.example.swiftscore.models.upcomingmatchesmodel.Group group, @org.jetbrains.annotations.NotNull()
    com.example.swiftscore.models.upcomingmatchesmodel.HomeTeam home_team, int league_id, int match_id, @org.jetbrains.annotations.NotNull()
    java.lang.String match_start, @org.jetbrains.annotations.NotNull()
    java.lang.String match_start_iso, @org.jetbrains.annotations.NotNull()
    java.lang.Object minute, @org.jetbrains.annotations.NotNull()
    java.lang.Object referee_id, @org.jetbrains.annotations.NotNull()
    com.example.swiftscore.models.upcomingmatchesmodel.Round round, int season_id, @org.jetbrains.annotations.NotNull()
    com.example.swiftscore.models.upcomingmatchesmodel.Stage stage, @org.jetbrains.annotations.NotNull()
    com.example.swiftscore.models.upcomingmatchesmodel.Stats stats, @org.jetbrains.annotations.NotNull()
    java.lang.String status, int status_code, @org.jetbrains.annotations.NotNull()
    com.example.swiftscore.models.upcomingmatchesmodel.Venue venue) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Table(@org.jetbrains.annotations.NotNull()
    com.example.swiftscore.models.upcomingmatchesmodel.AwayTeam away_team, @org.jetbrains.annotations.NotNull()
    com.example.swiftscore.models.upcomingmatchesmodel.Group group, @org.jetbrains.annotations.NotNull()
    com.example.swiftscore.models.upcomingmatchesmodel.HomeTeam home_team, int league_id, int match_id, @org.jetbrains.annotations.NotNull()
    java.lang.String match_start, @org.jetbrains.annotations.NotNull()
    java.lang.String match_start_iso, @org.jetbrains.annotations.NotNull()
    java.lang.Object minute, @org.jetbrains.annotations.NotNull()
    java.lang.Object referee_id, @org.jetbrains.annotations.NotNull()
    com.example.swiftscore.models.upcomingmatchesmodel.Round round, int season_id, @org.jetbrains.annotations.NotNull()
    com.example.swiftscore.models.upcomingmatchesmodel.Stage stage, @org.jetbrains.annotations.NotNull()
    com.example.swiftscore.models.upcomingmatchesmodel.Stats stats, @org.jetbrains.annotations.NotNull()
    java.lang.String status, int status_code, @org.jetbrains.annotations.NotNull()
    com.example.swiftscore.models.upcomingmatchesmodel.Venue venue) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.swiftscore.models.upcomingmatchesmodel.AwayTeam component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.swiftscore.models.upcomingmatchesmodel.AwayTeam getAway_team() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.swiftscore.models.upcomingmatchesmodel.Group component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.swiftscore.models.upcomingmatchesmodel.Group getGroup() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.swiftscore.models.upcomingmatchesmodel.HomeTeam component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.swiftscore.models.upcomingmatchesmodel.HomeTeam getHome_team() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getLeague_id() {
        return 0;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getMatch_id() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMatch_start() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMatch_start_iso() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getMinute() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getReferee_id() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.swiftscore.models.upcomingmatchesmodel.Round component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.swiftscore.models.upcomingmatchesmodel.Round getRound() {
        return null;
    }
    
    public final int component11() {
        return 0;
    }
    
    public final int getSeason_id() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.swiftscore.models.upcomingmatchesmodel.Stage component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.swiftscore.models.upcomingmatchesmodel.Stage getStage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.swiftscore.models.upcomingmatchesmodel.Stats component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.swiftscore.models.upcomingmatchesmodel.Stats getStats() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final int component15() {
        return 0;
    }
    
    public final int getStatus_code() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.swiftscore.models.upcomingmatchesmodel.Venue component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.swiftscore.models.upcomingmatchesmodel.Venue getVenue() {
        return null;
    }
}