package com.weatherapp.activities;

import java.lang.System;

/**
 * The useful link or some more explanation for this app you can checkout this link :
 * https://medium.com/@sasude9/basic-android-weather-app-6a7c0855caf4
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u0012\u0010\u001c\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0015J\u0012\u0010\u001f\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\u0015H\u0014J\u0010\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u0015H\u0003J\b\u0010\'\u001a\u00020\u0015H\u0003J\b\u0010(\u001a\u00020\u0015H\u0002J\b\u0010)\u001a\u00020\u0015H\u0002J\u0012\u0010*\u001a\u0004\u0018\u00010\u00172\u0006\u0010+\u001a\u00020,H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006-"}, d2 = {"Lcom/weatherapp/activities/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "mFusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "mLatitude", "", "mLocationCallback", "Lcom/google/android/gms/location/LocationCallback;", "mLongitude", "mProgressDialog", "Landroid/app/Dialog;", "mSharedPreferences", "Landroid/content/SharedPreferences;", "viewModel", "Lcom/weatherapp/activities/WeatherViewModel;", "getViewModel", "()Lcom/weatherapp/activities/WeatherViewModel;", "viewModel$delegate", "Lerror/NonExistentClass;", "getLocationWeatherDetails", "", "getUnit", "", "value", "hideProgressDialog", "isLocationEnabled", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onDestroy", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "requestLocationData", "setupUI", "showCustomProgressDialog", "showRationalDialogForPermissions", "unixTime", "timex", "", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private final error.NonExistentClass viewModel$delegate = null;
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
    
    private final com.weatherapp.activities.WeatherViewModel getViewModel() {
        return null;
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
     * Function is used to set the result in the UI elements.
     */
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.N)
    private final void setupUI() {
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