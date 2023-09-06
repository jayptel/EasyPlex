package com.easyplex.di.module;

import android.app.Application;
import com.easyplex.ui.manager.SettingsManager;
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
public final class AppModule_ProvideSettingsManagerFactory implements Factory<SettingsManager> {
  private final AppModule module;

  private final Provider<Application> applicationProvider;

  public AppModule_ProvideSettingsManagerFactory(AppModule module,
      Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public SettingsManager get() {
    return provideSettingsManager(module, applicationProvider.get());
  }

  public static AppModule_ProvideSettingsManagerFactory create(AppModule module,
      Provider<Application> applicationProvider) {
    return new AppModule_ProvideSettingsManagerFactory(module, applicationProvider);
  }

  public static SettingsManager provideSettingsManager(AppModule instance,
      Application application) {
    return Preconditions.checkNotNullFromProvides(instance.provideSettingsManager(application));
  }
}
