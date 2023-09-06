package com.easyplex.data.repository;

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
public final class SettingsRepository_Factory implements Factory<SettingsRepository> {
  private final Provider<ApiInterface> apiInterfaceProvider;

  private final Provider<ApiInterface> apiInterfaceProvider2;

  private final Provider<SettingsManager> settingsManagerProvider;

  private final Provider<ApiInterface> requestStatusApiProvider;

  private final Provider<ApiInterface> requestImdbApiProvider;

  public SettingsRepository_Factory(Provider<ApiInterface> apiInterfaceProvider,
      Provider<ApiInterface> apiInterfaceProvider2,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<ApiInterface> requestStatusApiProvider,
      Provider<ApiInterface> requestImdbApiProvider) {
    this.apiInterfaceProvider = apiInterfaceProvider;
    this.apiInterfaceProvider2 = apiInterfaceProvider2;
    this.settingsManagerProvider = settingsManagerProvider;
    this.requestStatusApiProvider = requestStatusApiProvider;
    this.requestImdbApiProvider = requestImdbApiProvider;
  }

  @Override
  public SettingsRepository get() {
    SettingsRepository instance = newInstance(apiInterfaceProvider.get());
    SettingsRepository_MembersInjector.injectApiInterface(instance, apiInterfaceProvider2.get());
    SettingsRepository_MembersInjector.injectSettingsManager(instance, settingsManagerProvider.get());
    SettingsRepository_MembersInjector.injectRequestStatusApi(instance, requestStatusApiProvider.get());
    SettingsRepository_MembersInjector.injectRequestImdbApi(instance, requestImdbApiProvider.get());
    return instance;
  }

  public static SettingsRepository_Factory create(Provider<ApiInterface> apiInterfaceProvider,
      Provider<ApiInterface> apiInterfaceProvider2,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<ApiInterface> requestStatusApiProvider,
      Provider<ApiInterface> requestImdbApiProvider) {
    return new SettingsRepository_Factory(apiInterfaceProvider, apiInterfaceProvider2, settingsManagerProvider, requestStatusApiProvider, requestImdbApiProvider);
  }

  public static SettingsRepository newInstance(ApiInterface apiInterface) {
    return new SettingsRepository(apiInterface);
  }
}
