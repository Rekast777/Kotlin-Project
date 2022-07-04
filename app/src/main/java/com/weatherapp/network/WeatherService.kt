package com.weatherapp.network

import android.annotation.SuppressLint
import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import com.google.gson.Gson
import com.weatherapp.models.WeatherResponse
import com.weatherapp.utils.Constants
import io.reactivex.Observable
import retrofit.Call
import retrofit.GsonConverterFactory
import retrofit.Retrofit
import retrofit.http.GET
import retrofit.http.Query

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

val retrofit: Retrofit =  Retrofit.Builder().baseUrl(Constants.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build()


object WeatherAPI{
    val service: WeatherService by lazy{
        retrofit.create<WeatherService>(WeatherService::class.java)
    }


}


