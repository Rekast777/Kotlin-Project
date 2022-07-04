package com.weatherapp

import com.weatherapp.network.WeatherService
import com.weatherapp.utils.Constants
import retrofit.GsonConverterFactory
import retrofit.Retrofit

class WeatherService {

    companion object {

        private val retrofit by lazy {
            Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }

        val weatherService by lazy {
            retrofit.create<WeatherService>(WeatherService::class.java)
        }
    }

}