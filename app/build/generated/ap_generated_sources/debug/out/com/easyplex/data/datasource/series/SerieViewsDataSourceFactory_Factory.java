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
public final class SerieViewsDataSourceFactory_Factory implements Factory<SerieViewsDataSourceFactory> {
  private final Provider<ApiInterface> requestInterfaceProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  public SerieViewsDataSourceFactory_Factory(Provider<ApiInterface> requestInterfaceProvider,
      Provider<SettingsManager> settingsManagerProvider) {
    this.requestInterfaceProvider = requestInterfaceProvider;
    this.settingsManagerProvider = settingsManagerProvider;
  }

  @Override
  public SerieViewsDataSourceFactory get() {
    return newInstance(requestInterfaceProvider.get(), settingsManagerProvider.get());
  }

  public static SerieViewsDataSourceFactory_Factory create(
      Provider<ApiInterface> requestInterfaceProvider,
      Provider<SettingsManager> settingsManagerProvider) {
    return new SerieViewsDataSourceFactory_Factory(requestInterfaceProvider, settingsManagerProvider);
  }

  public static SerieViewsDataSourceFactory newInstance(ApiInterface requestInterface,
      SettingsManager settingsManager) {
    return new SerieViewsDataSourceFactory(requestInterface, settingsManager);
  }
}
