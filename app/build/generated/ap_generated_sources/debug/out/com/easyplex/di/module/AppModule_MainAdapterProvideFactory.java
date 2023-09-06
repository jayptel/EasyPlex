package com.easyplex.di.module;

import com.easyplex.ui.home.adapters.MainAdapter;
import com.easyplex.ui.manager.SettingsManager;
import com.easyplex.util.AppController;
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
public final class AppModule_MainAdapterProvideFactory implements Factory<MainAdapter> {
  private final AppModule module;

  private final Provider<SettingsManager> settingsManagerProvider;

  private final Provider<AppController> appControllerProvider;

  public AppModule_MainAdapterProvideFactory(AppModule module,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<AppController> appControllerProvider) {
    this.module = module;
    this.settingsManagerProvider = settingsManagerProvider;
    this.appControllerProvider = appControllerProvider;
  }

  @Override
  public MainAdapter get() {
    return mainAdapterProvide(module, settingsManagerProvider.get(), appControllerProvider.get());
  }

  public static AppModule_MainAdapterProvideFactory create(AppModule module,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<AppController> appControllerProvider) {
    return new AppModule_MainAdapterProvideFactory(module, settingsManagerProvider, appControllerProvider);
  }

  public static MainAdapter mainAdapterProvide(AppModule instance, SettingsManager settingsManager,
      AppController appController) {
    return Preconditions.checkNotNullFromProvides(instance.mainAdapterProvide(settingsManager, appController));
  }
}
