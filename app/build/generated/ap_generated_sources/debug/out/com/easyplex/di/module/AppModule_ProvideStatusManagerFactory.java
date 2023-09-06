package com.easyplex.di.module;

import android.app.Application;
import com.easyplex.ui.manager.StatusManager;
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
public final class AppModule_ProvideStatusManagerFactory implements Factory<StatusManager> {
  private final AppModule module;

  private final Provider<Application> applicationProvider;

  public AppModule_ProvideStatusManagerFactory(AppModule module,
      Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public StatusManager get() {
    return provideStatusManager(module, applicationProvider.get());
  }

  public static AppModule_ProvideStatusManagerFactory create(AppModule module,
      Provider<Application> applicationProvider) {
    return new AppModule_ProvideStatusManagerFactory(module, applicationProvider);
  }

  public static StatusManager provideStatusManager(AppModule instance, Application application) {
    return Preconditions.checkNotNullFromProvides(instance.provideStatusManager(application));
  }
}
