package com.easyplex.di.module;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class AppModule_ShadowEnableFactory implements Factory<Boolean> {
  private final AppModule module;

  private final Provider<Application> applicationProvider;

  public AppModule_ShadowEnableFactory(AppModule module,
      Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public Boolean get() {
    return shadowEnable(module, applicationProvider.get());
  }

  public static AppModule_ShadowEnableFactory create(AppModule module,
      Provider<Application> applicationProvider) {
    return new AppModule_ShadowEnableFactory(module, applicationProvider);
  }

  public static boolean shadowEnable(AppModule instance, Application application) {
    return instance.shadowEnable(application);
  }
}
