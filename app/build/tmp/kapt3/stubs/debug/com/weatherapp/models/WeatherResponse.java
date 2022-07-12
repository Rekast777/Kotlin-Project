package com.weatherapp.models;

import java.io.Serializable;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\f\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\f\u00a2\u0006\u0002\u0010\u0017J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\fH\u00c6\u0003J\t\u0010.\u001a\u00020\bH\u00c6\u0003J\t\u0010/\u001a\u00020\fH\u00c6\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u00101\u001a\u00020\bH\u00c6\u0003J\t\u00102\u001a\u00020\nH\u00c6\u0003J\t\u00103\u001a\u00020\fH\u00c6\u0003J\t\u00104\u001a\u00020\u000eH\u00c6\u0003J\t\u00105\u001a\u00020\u0010H\u00c6\u0003J\t\u00106\u001a\u00020\fH\u00c6\u0003J\t\u00107\u001a\u00020\u0013H\u00c6\u0003J\u0087\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\fH\u00c6\u0001J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<H\u00d6\u0003J\t\u0010=\u001a\u00020\fH\u00d6\u0001J\t\u0010>\u001a\u00020\bH\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0016\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0011\u0010\u0014\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0015\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001dR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+\u00a8\u0006?"}, d2 = {"Lcom/weatherapp/models/WeatherResponse;", "Ljava/io/Serializable;", "coord", "Lcom/weatherapp/models/Coord;", "weather", "", "Lcom/weatherapp/models/Weather;", "base", "", "main", "Lcom/weatherapp/models/Main;", "visibility", "", "wind", "Lcom/weatherapp/models/Wind;", "clouds", "Lcom/weatherapp/models/Clouds;", "dt", "sys", "Lcom/weatherapp/models/Sys;", "id", "name", "cod", "(Lcom/weatherapp/models/Coord;Ljava/util/List;Ljava/lang/String;Lcom/weatherapp/models/Main;ILcom/weatherapp/models/Wind;Lcom/weatherapp/models/Clouds;ILcom/weatherapp/models/Sys;ILjava/lang/String;I)V", "getBase", "()Ljava/lang/String;", "getClouds", "()Lcom/weatherapp/models/Clouds;", "getCod", "()I", "getCoord", "()Lcom/weatherapp/models/Coord;", "getDt", "getId", "getMain", "()Lcom/weatherapp/models/Main;", "getName", "getSys", "()Lcom/weatherapp/models/Sys;", "getVisibility", "getWeather", "()Ljava/util/List;", "getWind", "()Lcom/weatherapp/models/Wind;", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
public final class WeatherResponse implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    private final com.weatherapp.models.Coord coord = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.weatherapp.models.Weather> weather = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String base = null;
    @org.jetbrains.annotations.NotNull()
    private final com.weatherapp.models.Main main = null;
    private final int visibility = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.weatherapp.models.Wind wind = null;
    @org.jetbrains.annotations.NotNull()
    private final com.weatherapp.models.Clouds clouds = null;
    private final int dt = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.weatherapp.models.Sys sys = null;
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    private final int cod = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final com.weatherapp.models.Coord getCoord() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.weatherapp.models.Weather> getWeather() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.weatherapp.models.Main getMain() {
        return null;
    }
    
    public final int getVisibility() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.weatherapp.models.Wind getWind() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.weatherapp.models.Clouds getClouds() {
        return null;
    }
    
    public final int getDt() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.weatherapp.models.Sys getSys() {
        return null;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final int getCod() {
        return 0;
    }
    
    public WeatherResponse(@org.jetbrains.annotations.NotNull()
    com.weatherapp.models.Coord coord, @org.jetbrains.annotations.NotNull()
    java.util.List<com.weatherapp.models.Weather> weather, @org.jetbrains.annotations.NotNull()
    java.lang.String base, @org.jetbrains.annotations.NotNull()
    com.weatherapp.models.Main main, int visibility, @org.jetbrains.annotations.NotNull()
    com.weatherapp.models.Wind wind, @org.jetbrains.annotations.NotNull()
    com.weatherapp.models.Clouds clouds, int dt, @org.jetbrains.annotations.NotNull()
    com.weatherapp.models.Sys sys, int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, int cod) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.weatherapp.models.Coord component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.weatherapp.models.Weather> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.weatherapp.models.Main component4() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.weatherapp.models.Wind component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.weatherapp.models.Clouds component7() {
        return null;
    }
    
    public final int component8() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.weatherapp.models.Sys component9() {
        return null;
    }
    
    public final int component10() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    public final int component12() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.weatherapp.models.WeatherResponse copy(@org.jetbrains.annotations.NotNull()
    com.weatherapp.models.Coord coord, @org.jetbrains.annotations.NotNull()
    java.util.List<com.weatherapp.models.Weather> weather, @org.jetbrains.annotations.NotNull()
    java.lang.String base, @org.jetbrains.annotations.NotNull()
    com.weatherapp.models.Main main, int visibility, @org.jetbrains.annotations.NotNull()
    com.weatherapp.models.Wind wind, @org.jetbrains.annotations.NotNull()
    com.weatherapp.models.Clouds clouds, int dt, @org.jetbrains.annotations.NotNull()
    com.weatherapp.models.Sys sys, int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, int cod) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}