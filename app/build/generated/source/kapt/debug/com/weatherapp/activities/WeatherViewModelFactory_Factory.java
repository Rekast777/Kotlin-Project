// Generated by Dagger (https://dagger.dev).
package com.weatherapp.activities;

import com.weatherapp.network.WeatherService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WeatherViewModelFactory_Factory implements Factory<WeatherViewModelFactory> {
  private final Provider<WeatherService> serviceProvider;

  public WeatherViewModelFactory_Factory(Provider<WeatherService> serviceProvider) {
    this.serviceProvider = serviceProvider;
  }

  @Override
  public WeatherViewModelFactory get() {
    return newInstance(serviceProvider.get());
  }

  public static WeatherViewModelFactory_Factory create(Provider<WeatherService> serviceProvider) {
    return new WeatherViewModelFactory_Factory(serviceProvider);
  }

  public static WeatherViewModelFactory newInstance(WeatherService service) {
    return new WeatherViewModelFactory(service);
  }
}
