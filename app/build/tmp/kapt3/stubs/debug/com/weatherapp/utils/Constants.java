package com.weatherapp.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/weatherapp/utils/Constants;", "", "()V", "APP_ID", "", "BASE_URL", "METRIC_UNIT", "PREFERENCE_NAME", "WEATHER_RESPONSE_DATA", "isNetworkAvailable", "", "context", "Landroid/content/Context;", "app_debug"})
public final class Constants {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String APP_ID = "9e90e39f30cbe79ec8340b19d7dccad9";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL = "https://api.openweathermap.org/data/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String METRIC_UNIT = "metric";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREFERENCE_NAME = "WeatherAppPreference";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WEATHER_RESPONSE_DATA = "weather_response_data";
    public static final com.weatherapp.utils.Constants INSTANCE = null;
    
    /**
     * This function is used check the weather the device is connected to the Internet or not.
     */
    public final boolean isNetworkAvailable(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    private Constants() {
        super();
    }
}