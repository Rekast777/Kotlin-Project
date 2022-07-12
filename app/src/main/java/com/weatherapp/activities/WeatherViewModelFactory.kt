package com.weatherapp.activities

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.weatherapp.network.WeatherService
import javax.inject.Inject

class WeatherViewModelFactory @Inject constructor(private val service: WeatherService): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(WeatherViewModel::class.java)){
            return WeatherViewModel(service) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }

}