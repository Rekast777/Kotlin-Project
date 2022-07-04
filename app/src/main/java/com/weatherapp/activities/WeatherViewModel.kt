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
import com.weatherapp.network.WeatherAPI.service

import com.weatherapp.network.WeatherService
import com.weatherapp.utils.Constants
import com.weatherapp.utils.Constants.BASE_URL
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import retrofit.*
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


import javax.inject.Inject




class  WeatherViewModel: ViewModel() {

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




/*
    fun YourNonActivityClass(context: Context)  {
        contextWeather = context
    }*/

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

                    val weatherResponseJsonString = Gson().toJson(weatherList)
                    Log.i("response view model", "$weatherResponseJsonString")

                    _weatherResponse.postValue(response)


            },{
                _isLoading.value = false
                Log.e("Error", "onError.getWeather()", it)
            }))


        /*
        val listCall: Call<WeatherResponse> = service.getWeather(
            _mLatitude.value!!, _mLongitude.value!!, Constants.METRIC_UNIT, Constants.APP_ID
        )*/
        /*listCall.enqueue(object : Callback<WeatherResponse> {
            @RequiresApi(Build.VERSION_CODES.N)
            @SuppressLint("SetTextI18n")
            override fun onResponse(response: Response<WeatherResponse>, retrofit: Retrofit) {
                _isLoading.value = false
                // Check weather the response is success or not.
                if (response.isSuccess) {

                    //hideProgressDialog() // Hides the progress dialog

                    /** The de-serialized response body of a successful response. */
                    val weatherList: WeatherResponse = response.body()
                    Log.i("Response Result", "$weatherList")

                    _weatherList2.value = response.body()
                    val test3 = _weatherList2.value
                    Log.i("weather list view model", "$test3")
                    // TODO (STEP 4: Here we convert the response object to string and store the string in the SharedPreference.)
                    // START
                    // Here we have converted the model class in to Json String to store it in the SharedPreferences.
                    val weatherResponseJsonString = Gson().toJson(weatherList)
                    Log.i("response view model", "$weatherResponseJsonString")
                    // Save the converted string to shared preferences
                    //val editor = mSharedPreferences.edit()
                    //editor.putString(Constants.WEATHER_RESPONSE_DATA, weatherResponseJsonString)
                    //editor.apply()
                    // END

                    // TODO (STEP 5: Remove the weather detail object as we will be getting
                    //  the object in form of a string in the setup UI method.)
                    // START
                    //setupUI()
                    _weatherResponse.postValue(response.body())
                    // END
                } else {
                    // If the response is not success then we check the response code.
                    val sc = response.code()
                    when (sc) {
                        400 -> {
                            Log.e("Error 400", "Bad Request")
                        }
                        404 -> {
                            Log.e("Error 404", "Not Found")
                        }
                        else -> {
                            Log.e("Error", "Generic Error")
                        }
                    }
                }
            }

            override fun onFailure(t: Throwable) {
                //hideProgressDialog() // Hides the progress dialog
                Log.e("Errorrrrr", t.message.toString())
            }
        }) */
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