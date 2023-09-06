package com.easyplex.data.repository;

import com.easyplex.data.remote.ApiInterface;
import com.easyplex.ui.manager.SettingsManager;
import com.easyplex.ui.manager.TokenManager;
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
public final class AnimeRepository_MembersInjector implements MembersInjector<AnimeRepository> {
  private final Provider<ApiInterface> requestImdbApiProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  private final Provider<TokenManager> tokenManagerProvider;

  public AnimeRepository_MembersInjector(Provider<ApiInterface> requestImdbApiProvider,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<TokenManager> tokenManagerProvider) {
    this.requestImdbApiProvider = requestImdbApiProvider;
    this.settingsManagerProvider = settingsManagerProvider;
    this.tokenManagerProvider = tokenManagerProvider;
  }

  public static MembersInjector<AnimeRepository> create(
      Provider<ApiInterface> requestImdbApiProvider,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<TokenManager> tokenManagerProvider) {
    return new AnimeRepository_MembersInjector(requestImdbApiProvider, settingsManagerProvider, tokenManagerProvider);
  }

  @Override
  public void injectMembers(AnimeRepository instance) {
    injectRequestImdbApi(instance, requestImdbApiProvider.get());
    injectSettingsManager(instance, settingsManagerProvider.get());
    injectTokenManager(instance, tokenManagerProvider.get());
  }

  @InjectedFieldSignature("com.easyplex.data.repository.AnimeRepository.requestImdbApi")
  @Named("imdb")
  public static void injectRequestImdbApi(AnimeRepository instance, ApiInterface requestImdbApi) {
    instance.requestImdbApi = requestImdbApi;
  }

  @InjectedFieldSignature("com.easyplex.data.repository.AnimeRepository.settingsManager")
  public static void injectSettingsManager(AnimeRepository instance,
      SettingsManager settingsManager) {
    instance.settingsManager = settingsManager;
  }

  @InjectedFieldSignature("com.easyplex.data.repository.AnimeRepository.tokenManager")
  public static void injectTokenManager(AnimeRepository instance, TokenManager tokenManager) {
    instance.tokenManager = tokenManager;
  }
}
