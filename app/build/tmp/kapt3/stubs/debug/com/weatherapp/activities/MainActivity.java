package com.weatherapp.activities;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.provider.Settings;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.location.*;
import com.google.gson.Gson;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;
import com.weatherapp.R;
import com.weatherapp.MyApplication;
import com.weatherapp.models.WeatherResponse;
import com.weatherapp.utils.Constants;
import kotlinx.android.synthetic.main.activity_main.*;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.inject.Inject;

/**
 * The useful link or some more explanation for this app you can checkout this link :
 * https://medium.com/@sasude9/basic-android-weather-app-6a7c0855caf4
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\b\u0010\u001f\u001a\u00020\u001bH\u0002J\b\u0010 \u001a\u00020!H\u0002J\u0012\u0010\"\u001a\u00020\u001b2\b\u0010#\u001a\u0004\u0018\u00010$H\u0015J\u0012\u0010%\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\b\u0010(\u001a\u00020\u001bH\u0014J\u0010\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020\u001bH\u0003J\b\u0010-\u001a\u00020\u001bH\u0002J\b\u0010.\u001a\u00020\u001bH\u0002J\u0012\u0010/\u001a\u0004\u0018\u00010\u001d2\u0006\u00100\u001a\u000201H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u00062"}, d2 = {"Lcom/weatherapp/activities/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "mFusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "mLatitude", "", "mLocationCallback", "Lcom/google/android/gms/location/LocationCallback;", "mLongitude", "mProgressDialog", "Landroid/app/Dialog;", "mSharedPreferences", "Landroid/content/SharedPreferences;", "weatherViewModel", "Lcom/weatherapp/activities/WeatherViewModel;", "getWeatherViewModel", "()Lcom/weatherapp/activities/WeatherViewModel;", "setWeatherViewModel", "(Lcom/weatherapp/activities/WeatherViewModel;)V", "weatherViewModelFactory", "Lcom/weatherapp/activities/WeatherViewModelFactory;", "getWeatherViewModelFactory", "()Lcom/weatherapp/activities/WeatherViewModelFactory;", "setWeatherViewModelFactory", "(Lcom/weatherapp/activities/WeatherViewModelFactory;)V", "getLocationWeatherDetails", "", "getUnit", "", "value", "hideProgressDialog", "isLocationEnabled", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onDestroy", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "requestLocationData", "showCustomProgressDialog", "showRationalDialogForPermissions", "unixTime", "timex", "", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.weatherapp.activities.WeatherViewModelFactory weatherViewModelFactory;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.weatherapp.activities.WeatherViewModel weatherViewModel;
    private com.google.android.gms.location.FusedLocationProviderClient mFusedLocationClient;
    private android.app.Dialog mProgressDialog;
    private double mLatitude = 0.0;
    private double mLongitude = 0.0;
    private android.content.SharedPreferences mSharedPreferences;
    
    /**
     * A location callback object of fused location provider client where we will get the current location details.
     */
    private final com.google.android.gms.location.LocationCallback mLocationCallback = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.weatherapp.activities.WeatherViewModelFactory getWeatherViewModelFactory() {
        return null;
    }
    
    public final void setWeatherViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.weatherapp.activities.WeatherViewModelFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.weatherapp.activities.WeatherViewModel getWeatherViewModel() {
        return null;
    }
    
    public final void setWeatherViewModel(@org.jetbrains.annotations.NotNull()
    com.weatherapp.activities.WeatherViewModel p0) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.N)
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    /**
     * A function which is used to verify that the location or GPS is enable or not of the user's device.
     */
    private final boolean isLocationEnabled() {
        return false;
    }
    
    /**
     * A function used to show the alert dialog when the permissions are denied and need to allow it from settings app info.
     */
    private final void showRationalDialogForPermissions() {
    }
    
    /**
     * A function to request the current location. Using the fused location provider client.
     */
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void requestLocationData() {
    }
    
    /**
     * Function is used to get the weather details of the current location based on the latitude longitude
     */
    private final void getLocationWeatherDetails() {
    }
    
    /**
     * Method is used to show the Custom Progress Dialog.
     */
    private final void showCustomProgressDialog() {
    }
    
    /**
     * This function is used to dismiss the progress dialog if it is visible to user.
     */
    private final void hideProgressDialog() {
    }
    
    /**
     * Function is used to get the temperature unit value.
     */
    private final java.lang.String getUnit(java.lang.String value) {
        return null;
    }
    
    /**
     * The function is used to get the formatted time based on the Format and the LOCALE we pass to it.
     */
    private final java.lang.String unixTime(long timex) {
        return null;
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public MainActivity() {
        super();
    }
}