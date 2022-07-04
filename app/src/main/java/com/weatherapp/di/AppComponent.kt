package com.weatherapp.di

import com.weatherapp.activities.MainActivity
import dagger.Component

@Component
interface AppComponent {
    fun inject(activity: MainActivity)
}