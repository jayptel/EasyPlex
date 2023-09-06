package com.easyplex.di.module;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("javax.inject.Named")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_MainPlayerFactory implements Factory<String> {
  private final AppModule module;

  private final Provider<Application> applicationProvider;

  public AppModule_MainPlayerFactory(AppModule module, Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public String get() {
    return mainPlayer(module, applicationProvider.get());
  }

  public static AppModule_MainPlayerFactory create(AppModule module,
      Provider<Application> applicationProvider) {
    return new AppModule_MainPlayerFactory(module, applicationProvider);
  }

  public static String mainPlayer(AppModule instance, Application application) {
    return Preconditions.checkNotNullFromProvides(instance.mainPlayer(application));
  }
}
