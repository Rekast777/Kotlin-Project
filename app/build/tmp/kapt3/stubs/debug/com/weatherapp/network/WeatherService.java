package com.weatherapp.network;

import android.annotation.SuppressLint;
import android.os.Build;
import android.util.Log;
import androidx.annotation.RequiresApi;
import com.google.gson.Gson;
import com.weatherapp.models.WeatherResponse;
import com.weatherapp.utils.Constants;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * An Interface which defines the HTTP operations Functions.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J:\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\tH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/weatherapp/network/WeatherService;", "", "getWeather", "Lio/reactivex/Observable;", "Lcom/weatherapp/models/WeatherResponse;", "lat", "", "lon", "units", "", "appid", "app_debug"})
public abstract interface WeatherService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "2.5/weather")
    public abstract io.reactivex.Observable<com.weatherapp.models.WeatherResponse> getWeather(@retrofit2.http.Query(value = "lat")
    double lat, @retrofit2.http.Query(value = "lon")
    double lon, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "units")
    java.lang.String units, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "appid")
    java.lang.String appid);
}