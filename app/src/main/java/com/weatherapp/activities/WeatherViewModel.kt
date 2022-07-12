package com.weatherapp.activities

import android.annotation.SuppressLint
import android.app.AppOpsManager
import android.content.Context
import android.graphics.Typeface.create
import android.location.Location
import android.location.LocationManager
import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat.getSystemService
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.android.gms.location.LocationCallback
import com.google.android.gms.location.LocationResult
import com.google.gson.Gson
import com.weatherapp.models.WeatherResponse
//import com.weatherapp.network.WeatherAPI.service

import com.weatherapp.network.WeatherService
import com.weatherapp.utils.Constants
import com.weatherapp.utils.Constants.BASE_URL
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


import javax.inject.Inject




class WeatherViewModel @Inject constructor(val service: WeatherService): ViewModel() {

    private val myCompositeDisposable: CompositeDisposable by lazy { CompositeDisposable()}

    private var _isConnectedOrNot = MutableLiveData(0)
    val isConnectedOrNot: LiveData<Int>
        get() = _isConnectedOrNot

    private var _mLatitude = MutableLiveData(0.0)
    val mLatitude: LiveData<Double>
        get() = mLatitude


    private var _mLongitude = MutableLiveData(0.0)
    val mLongitude: LiveData<Double>
        get() = mLongitude

    private lateinit var contextWeather: Context

    private var _isLoading  = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean>
        get() = _isLoading

    private var _weatherResponse  = MutableLiveData<WeatherResponse>()
    val weatherResponse: LiveData<WeatherResponse>
        get() = _weatherResponse


    private var _weatherList2  = MutableLiveData<WeatherResponse>()
    val weatherList2: LiveData<WeatherResponse>
        get() = _weatherList2


    override fun onCleared() {
        super.onCleared()
        myCompositeDisposable.clear()
    }

    fun getWeather(){
        Log.i("View model status", "ENTERING")

        _isLoading.value = true

        myCompositeDisposable?.add(service.getWeather(_mLatitude.value!!, _mLongitude.value!!, Constants.METRIC_UNIT, Constants.APP_ID)
            //Send the Observable’s notifications to the main UI thread//

            .observeOn(AndroidSchedulers.mainThread())
            //Subscribe to the Observer away from the main UI thread//
            .subscribeOn(Schedulers.io())
            .subscribe({response ->
                    _isLoading.value = false
                    val weatherList: WeatherResponse = response
                    Log.i("Response Result", "$weatherList")

                    _weatherList2.value = response
                    val test3 = _weatherList2.value
                    Log.i("weather list view model", "$test3")
                    Log.i("ISLOADINGGGGGGGGG", "${_isLoading.value}")
                    val weatherResponseJsonString = Gson().toJson(weatherList)
                    Log.i("response view model", "$weatherResponseJsonString")

                    _weatherResponse.postValue(response)


            },{
                _isLoading.value = false
                Log.e("Error", "onError.getWeather()", it)
            }))
        Log.i("View model status", "EXITING")
    }

    fun setLatitude(latitude: Double){
        _mLatitude.value = latitude
    }

    fun setLongitude(longitude: Double){
        _mLongitude.value = longitude
    }


    private fun handleResponse(stuff: WeatherResponse){
        _weatherList2.value = stuff
    }


}