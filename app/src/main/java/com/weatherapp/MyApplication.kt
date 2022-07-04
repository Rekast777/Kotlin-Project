package com.weatherapp

import android.app.Application
import com.weatherapp.di.AppComponent
import com.weatherapp.di.DaggerAppComponent

class MyApplication: Application() {
    /*
    val appComponent: AppComponent by lazy{
        DaggerAppComponent.factory().create(applicationContext)
    }*/
}