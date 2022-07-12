package com.weatherapp.network

import android.annotation.SuppressLint
import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import com.google.gson.Gson
import com.weatherapp.models.WeatherResponse
import com.weatherapp.utils.Constants
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * An Interface which defines the HTTP operations Functions.
 */


interface WeatherService {

    @GET("2.5/weather")
    fun getWeather(
        @Query("lat") lat: Double,
        @Query("lon") lon: Double,
        @Query("units") units: String?,
        @Query("appid") appid: String?
    ): Observable<WeatherResponse>
}

