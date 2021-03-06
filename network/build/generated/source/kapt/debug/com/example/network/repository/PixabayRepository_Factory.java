// Generated by Dagger (https://dagger.dev).
package com.example.network.repository;

import com.example.network.api.PixabayApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PixabayRepository_Factory implements Factory<PixabayRepository> {
  private final Provider<PixabayApi> pixabayApiProvider;

  public PixabayRepository_Factory(Provider<PixabayApi> pixabayApiProvider) {
    this.pixabayApiProvider = pixabayApiProvider;
  }

  @Override
  public PixabayRepository get() {
    return newInstance(pixabayApiProvider.get());
  }

  public static PixabayRepository_Factory create(Provider<PixabayApi> pixabayApiProvider) {
    return new PixabayRepository_Factory(pixabayApiProvider);
  }

  public static PixabayRepository newInstance(PixabayApi pixabayApi) {
    return new PixabayRepository(pixabayApi);
  }
}
