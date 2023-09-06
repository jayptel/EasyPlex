package com.easyplex.di.module;

import android.app.Application;
import com.easyplex.ui.manager.AdsManager;
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
public final class AppModule_ProvideAdsManagerFactory implements Factory<AdsManager> {
  private final AppModule module;

  private final Provider<Application> applicationProvider;

  public AppModule_ProvideAdsManagerFactory(AppModule module,
      Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public AdsManager get() {
    return provideAdsManager(module, applicationProvider.get());
  }

  public static AppModule_ProvideAdsManagerFactory create(AppModule module,
      Provider<Application> applicationProvider) {
    return new AppModule_ProvideAdsManagerFactory(module, applicationProvider);
  }

  public static AdsManager provideAdsManager(AppModule instance, Application application) {
    return Preconditions.checkNotNullFromProvides(instance.provideAdsManager(application));
  }
}
