package com.easyplex.data.datasource.series;

import com.easyplex.data.remote.ApiInterface;
import com.easyplex.ui.manager.SettingsManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class SerieDataSourceFactory_Factory implements Factory<SerieDataSourceFactory> {
  private final Provider<ApiInterface> requestInterfaceProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  public SerieDataSourceFactory_Factory(Provider<ApiInterface> requestInterfaceProvider,
      Provider<SettingsManager> settingsManagerProvider) {
    this.requestInterfaceProvider = requestInterfaceProvider;
    this.settingsManagerProvider = settingsManagerProvider;
  }

  @Override
  public SerieDataSourceFactory get() {
    return newInstance(requestInterfaceProvider.get(), settingsManagerProvider.get());
  }

  public static SerieDataSourceFactory_Factory create(
      Provider<ApiInterface> requestInterfaceProvider,
      Provider<SettingsManager> settingsManagerProvider) {
    return new SerieDataSourceFactory_Factory(requestInterfaceProvider, settingsManagerProvider);
  }

  public static SerieDataSourceFactory newInstance(ApiInterface requestInterface,
      SettingsManager settingsManager) {
    return new SerieDataSourceFactory(requestInterface, settingsManager);
  }
}
