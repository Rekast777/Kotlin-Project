// Generated by Dagger (https://dagger.dev).
package com.weatherapp.di;

import com.weatherapp.network.WeatherService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideRetrofitFactory implements Factory<WeatherService> {
  private final NetworkModule module;

  public NetworkModule_ProvideRetrofitFactory(NetworkModule module) {
    this.module = module;
  }

  @Override
  public WeatherService get() {
    return provideRetrofit(module);
  }

  public static NetworkModule_ProvideRetrofitFactory create(NetworkModule module) {
    return new NetworkModule_ProvideRetrofitFactory(module);
  }

  public static WeatherService provideRetrofit(NetworkModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideRetrofit());
  }
}