// Generated by Dagger (https://dagger.dev).
package com.example.network.di;

import com.example.network.api.TranslationApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideTranslationApiFactory implements Factory<TranslationApi> {
  @Override
  public TranslationApi get() {
    return provideTranslationApi();
  }

  public static NetworkModule_ProvideTranslationApiFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static TranslationApi provideTranslationApi() {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideTranslationApi());
  }

  private static final class InstanceHolder {
    private static final NetworkModule_ProvideTranslationApiFactory INSTANCE = new NetworkModule_ProvideTranslationApiFactory();
  }
}
