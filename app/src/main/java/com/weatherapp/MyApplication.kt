package com.weatherapp

import android.app.Application
import com.weatherapp.di.DaggerAppComponent

class MyApplication: Application() {
    val appComponent = DaggerAppComponent.create()
}