package com.weatherapp.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010#\u001a\u00020$J\u0010\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\rH\u0002J\b\u0010\'\u001a\u00020$H\u0014J\u000e\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020\tJ\u000e\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020\tR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\u00128F\u00a2\u0006\u0006\u001a\u0004\b \u0010\u0013R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\"\u0010\u0013\u00a8\u0006,"}, d2 = {"Lcom/weatherapp/activities/WeatherViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_isConnectedOrNot", "Landroidx/lifecycle/MutableLiveData;", "", "_isLoading", "", "_mLatitude", "", "kotlin.jvm.PlatformType", "_mLongitude", "_weatherList2", "Lcom/weatherapp/models/WeatherResponse;", "_weatherResponse", "contextWeather", "Landroid/content/Context;", "isConnectedOrNot", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "isLoading", "mLatitude", "getMLatitude", "mLongitude", "getMLongitude", "myCompositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getMyCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "myCompositeDisposable$delegate", "Lkotlin/Lazy;", "weatherList2", "getWeatherList2", "weatherResponse", "getWeatherResponse", "getWeather", "", "handleResponse", "stuff", "onCleared", "setLatitude", "latitude", "setLongitude", "longitude", "app_debug"})
public final class WeatherViewModel extends androidx.lifecycle.ViewModel {
    private final kotlin.Lazy myCompositeDisposable$delegate = null;
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> _isConnectedOrNot;
    private androidx.lifecycle.MutableLiveData<java.lang.Double> _mLatitude;
    private androidx.lifecycle.MutableLiveData<java.lang.Double> _mLongitude;
    private android.content.Context contextWeather;
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isLoading;
    private androidx.lifecycle.MutableLiveData<com.weatherapp.models.WeatherResponse> _weatherResponse;
    private androidx.lifecycle.MutableLiveData<com.weatherapp.models.WeatherResponse> _weatherList2;
    
    private final io.reactivex.disposables.CompositeDisposable getMyCompositeDisposable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> isConnectedOrNot() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Double> getMLatitude() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Double> getMLongitude() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.weatherapp.models.WeatherResponse> getWeatherResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.weatherapp.models.WeatherResponse> getWeatherList2() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final void getWeather() {
    }
    
    public final void setLatitude(double latitude) {
    }
    
    public final void setLongitude(double longitude) {
    }
    
    private final void handleResponse(com.weatherapp.models.WeatherResponse stuff) {
    }
    
    public WeatherViewModel() {
        super();
    }
}