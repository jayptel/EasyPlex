package com.easyplex.data.repository;

import com.easyplex.data.remote.ApiInterface;
import com.easyplex.ui.manager.SettingsManager;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Named;
import javax.inject.Provider;

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
public final class SettingsRepository_MembersInjector implements MembersInjector<SettingsRepository> {
  private final Provider<ApiInterface> apiInterfaceProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  private final Provider<ApiInterface> requestStatusApiProvider;

  private final Provider<ApiInterface> requestImdbApiProvider;

  public SettingsRepository_MembersInjector(Provider<ApiInterface> apiInterfaceProvider,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<ApiInterface> requestStatusApiProvider,
      Provider<ApiInterface> requestImdbApiProvider) {
    this.apiInterfaceProvider = apiInterfaceProvider;
    this.settingsManagerProvider = settingsManagerProvider;
    this.requestStatusApiProvider = requestStatusApiProvider;
    this.requestImdbApiProvider = requestImdbApiProvider;
  }

  public static MembersInjector<SettingsRepository> create(
      Provider<ApiInterface> apiInterfaceProvider,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<ApiInterface> requestStatusApiProvider,
      Provider<ApiInterface> requestImdbApiProvider) {
    return new SettingsRepository_MembersInjector(apiInterfaceProvider, settingsManagerProvider, requestStatusApiProvider, requestImdbApiProvider);
  }

  @Override
  public void injectMembers(SettingsRepository instance) {
    injectApiInterface(instance, apiInterfaceProvider.get());
    injectSettingsManager(instance, settingsManagerProvider.get());
    injectRequestStatusApi(instance, requestStatusApiProvider.get());
    injectRequestImdbApi(instance, requestImdbApiProvider.get());
  }

  @InjectedFieldSignature("com.easyplex.data.repository.SettingsRepository.apiInterface")
  public static void injectApiInterface(SettingsRepository instance, ApiInterface apiInterface) {
    instance.apiInterface = apiInterface;
  }

  @InjectedFieldSignature("com.easyplex.data.repository.SettingsRepository.settingsManager")
  public static void injectSettingsManager(SettingsRepository instance,
      SettingsManager settingsManager) {
    instance.settingsManager = settingsManager;
  }

  @InjectedFieldSignature("com.easyplex.data.repository.SettingsRepository.requestStatusApi")
  @Named("status")
  public static void injectRequestStatusApi(SettingsRepository instance,
      ApiInterface requestStatusApi) {
    instance.requestStatusApi = requestStatusApi;
  }

  @InjectedFieldSignature("com.easyplex.data.repository.SettingsRepository.requestImdbApi")
  @Named("imdb")
  public static void injectRequestImdbApi(SettingsRepository instance,
      ApiInterface requestImdbApi) {
    instance.requestImdbApi = requestImdbApi;
  }
}
