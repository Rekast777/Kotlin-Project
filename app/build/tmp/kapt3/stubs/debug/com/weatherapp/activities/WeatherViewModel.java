package com.weatherapp.activities;

import android.annotation.SuppressLint;
import android.app.AppOpsManager;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import com.google.gson.Gson;
import com.weatherapp.models.WeatherResponse;
import com.weatherapp.network.WeatherService;
import com.weatherapp.utils.Constants;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\'\u001a\u00020(J\u0010\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u000fH\u0002J\b\u0010+\u001a\u00020(H\u0014J\u000e\u0010,\u001a\u00020(2\u0006\u0010-\u001a\u00020\u000bJ\u000e\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u00020\u000bR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00148F\u00a2\u0006\u0006\u001a\u0004\b$\u0010\u0015R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00148F\u00a2\u0006\u0006\u001a\u0004\b&\u0010\u0015\u00a8\u00060"}, d2 = {"Lcom/weatherapp/activities/WeatherViewModel;", "Landroidx/lifecycle/ViewModel;", "service", "Lcom/weatherapp/network/WeatherService;", "(Lcom/weatherapp/network/WeatherService;)V", "_isConnectedOrNot", "Landroidx/lifecycle/MutableLiveData;", "", "_isLoading", "", "_mLatitude", "", "kotlin.jvm.PlatformType", "_mLongitude", "_weatherList2", "Lcom/weatherapp/models/WeatherResponse;", "_weatherResponse", "contextWeather", "Landroid/content/Context;", "isConnectedOrNot", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "isLoading", "mLatitude", "getMLatitude", "mLongitude", "getMLongitude", "myCompositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getMyCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "myCompositeDisposable$delegate", "Lkotlin/Lazy;", "getService", "()Lcom/weatherapp/network/WeatherService;", "weatherList2", "getWeatherList2", "weatherResponse", "getWeatherResponse", "getWeather", "", "handleResponse", "stuff", "onCleared", "setLatitude", "latitude", "setLongitude", "longitude", "app_debug"})
public final class WeatherViewModel extends androidx.lifecycle.ViewModel {
    private final kotlin.Lazy myCompositeDisposable$delegate = null;
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> _isConnectedOrNot;
    private androidx.lifecycle.MutableLiveData<java.lang.Double> _mLatitude;
    private androidx.lifecycle.MutableLiveData<java.lang.Double> _mLongitude;
    private android.content.Context contextWeather;
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isLoading;
    private androidx.lifecycle.MutableLiveData<com.weatherapp.models.WeatherResponse> _weatherResponse;
    private androidx.lifecycle.MutableLiveData<com.weatherapp.models.WeatherResponse> _weatherList2;
    @org.jetbrains.annotations.NotNull()
    private final com.weatherapp.network.WeatherService service = null;
    
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
    
    @org.jetbrains.annotations.NotNull()
    public final com.weatherapp.network.WeatherService getService() {
        return null;
    }
    
    @javax.inject.Inject()
    public WeatherViewModel(@org.jetbrains.annotations.NotNull()
    com.weatherapp.network.WeatherService service) {
        super();
    }
}