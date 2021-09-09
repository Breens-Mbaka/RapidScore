package com.example.swiftscore.models.topscorersmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0001\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0001\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u000fH\u00c6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00c6\u0003J\t\u0010#\u001a\u00020\u0005H\u00c6\u0003J\t\u0010$\u001a\u00020\u0005H\u00c6\u0003J\t\u0010%\u001a\u00020\u0001H\u00c6\u0003J\t\u0010&\u001a\u00020\nH\u00c6\u0003J\t\u0010\'\u001a\u00020\u0005H\u00c6\u0003J\t\u0010(\u001a\u00020\u0005H\u00c6\u0003J\t\u0010)\u001a\u00020\u0001H\u00c6\u0003Jm\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u00c6\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010.\u001a\u00020\u0005H\u00d6\u0001J\t\u0010/\u001a\u000200H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f\u00a8\u00061"}, d2 = {"Lcom/example/swiftscore/models/topscorersmodel/DataXXX;", "", "goals", "Lcom/example/swiftscore/models/topscorersmodel/Goals;", "league_id", "", "matches_played", "minutes_played", "penalties", "player", "Lcom/example/swiftscore/models/topscorersmodel/Player;", "pos", "season_id", "substituted_in", "team", "Lcom/example/swiftscore/models/topscorersmodel/Team;", "(Lcom/example/swiftscore/models/topscorersmodel/Goals;IIILjava/lang/Object;Lcom/example/swiftscore/models/topscorersmodel/Player;IILjava/lang/Object;Lcom/example/swiftscore/models/topscorersmodel/Team;)V", "getGoals", "()Lcom/example/swiftscore/models/topscorersmodel/Goals;", "getLeague_id", "()I", "getMatches_played", "getMinutes_played", "getPenalties", "()Ljava/lang/Object;", "getPlayer", "()Lcom/example/swiftscore/models/topscorersmodel/Player;", "getPos", "getSeason_id", "getSubstituted_in", "getTeam", "()Lcom/example/swiftscore/models/topscorersmodel/Team;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class DataXXX {
    @org.jetbrains.annotations.NotNull()
    private final com.example.swiftscore.models.topscorersmodel.Goals goals = null;
    private final int league_id = 0;
    private final int matches_played = 0;
    private final int minutes_played = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object penalties = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.swiftscore.models.topscorersmodel.Player player = null;
    private final int pos = 0;
    private final int season_id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object substituted_in = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.swiftscore.models.topscorersmodel.Team team = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.swiftscore.models.topscorersmodel.DataXXX copy(@org.jetbrains.annotations.NotNull()
    com.example.swiftscore.models.topscorersmodel.Goals goals, int league_id, int matches_played, int minutes_played, @org.jetbrains.annotations.NotNull()
    java.lang.Object penalties, @org.jetbrains.annotations.NotNull()
    com.example.swiftscore.models.topscorersmodel.Player player, int pos, int season_id, @org.jetbrains.annotations.NotNull()
    java.lang.Object substituted_in, @org.jetbrains.annotations.NotNull()
    com.example.swiftscore.models.topscorersmodel.Team team) {
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
    
    public DataXXX(@org.jetbrains.annotations.NotNull()
    com.example.swiftscore.models.topscorersmodel.Goals goals, int league_id, int matches_played, int minutes_played, @org.jetbrains.annotations.NotNull()
    java.lang.Object penalties, @org.jetbrains.annotations.NotNull()
    com.example.swiftscore.models.topscorersmodel.Player player, int pos, int season_id, @org.jetbrains.annotations.NotNull()
    java.lang.Object substituted_in, @org.jetbrains.annotations.NotNull()
    com.example.swiftscore.models.topscorersmodel.Team team) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.swiftscore.models.topscorersmodel.Goals component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.swiftscore.models.topscorersmodel.Goals getGoals() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getLeague_id() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getMatches_played() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getMinutes_played() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getPenalties() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.swiftscore.models.topscorersmodel.Player component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.swiftscore.models.topscorersmodel.Player getPlayer() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getPos() {
        return 0;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getSeason_id() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getSubstituted_in() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.swiftscore.models.topscorersmodel.Team component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.swiftscore.models.topscorersmodel.Team getTeam() {
        return null;
    }
}