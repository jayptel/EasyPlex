package com.easyplex.di.module;

import android.app.Application;
import android.content.SharedPreferences;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideSharedPreferencesFactory implements Factory<SharedPreferences> {
  private final AppModule module;

  private final Provider<Application> applicationProvider;

  public AppModule_ProvideSharedPreferencesFactory(AppModule module,
      Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public SharedPreferences get() {
    return provideSharedPreferences(module, applicationProvider.get());
  }

  public static AppModule_ProvideSharedPreferencesFactory create(AppModule module,
      Provider<Application> applicationProvider) {
    return new AppModule_ProvideSharedPreferencesFactory(module, applicationProvider);
  }

  public static SharedPreferences provideSharedPreferences(AppModule instance,
      Application application) {
    return Preconditions.checkNotNullFromProvides(instance.provideSharedPreferences(application));
  }
}
