package com.easyplex.data.repository;

import com.easyplex.data.local.dao.AnimesDao;
import com.easyplex.data.local.dao.MoviesDao;
import com.easyplex.data.remote.ApiInterface;
import com.easyplex.ui.manager.SettingsManager;
import com.easyplex.ui.manager.TokenManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class AnimeRepository_Factory implements Factory<AnimeRepository> {
  private final Provider<ApiInterface> requestMainApiProvider;

  private final Provider<MoviesDao> moviesDaoProvider;

  private final Provider<AnimesDao> animesDaoProvider;

  private final Provider<ApiInterface> requestImdbApiProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  private final Provider<TokenManager> tokenManagerProvider;

  public AnimeRepository_Factory(Provider<ApiInterface> requestMainApiProvider,
      Provider<MoviesDao> moviesDaoProvider, Provider<AnimesDao> animesDaoProvider,
      Provider<ApiInterface> requestImdbApiProvider,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<TokenManager> tokenManagerProvider) {
    this.requestMainApiProvider = requestMainApiProvider;
    this.moviesDaoProvider = moviesDaoProvider;
    this.animesDaoProvider = animesDaoProvider;
    this.requestImdbApiProvider = requestImdbApiProvider;
    this.settingsManagerProvider = settingsManagerProvider;
    this.tokenManagerProvider = tokenManagerProvider;
  }

  @Override
  public AnimeRepository get() {
    AnimeRepository instance = newInstance(requestMainApiProvider.get(), moviesDaoProvider.get(), animesDaoProvider.get());
    AnimeRepository_MembersInjector.injectRequestImdbApi(instance, requestImdbApiProvider.get());
    AnimeRepository_MembersInjector.injectSettingsManager(instance, settingsManagerProvider.get());
    AnimeRepository_MembersInjector.injectTokenManager(instance, tokenManagerProvider.get());
    return instance;
  }

  public static AnimeRepository_Factory create(Provider<ApiInterface> requestMainApiProvider,
      Provider<MoviesDao> moviesDaoProvider, Provider<AnimesDao> animesDaoProvider,
      Provider<ApiInterface> requestImdbApiProvider,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<TokenManager> tokenManagerProvider) {
    return new AnimeRepository_Factory(requestMainApiProvider, moviesDaoProvider, animesDaoProvider, requestImdbApiProvider, settingsManagerProvider, tokenManagerProvider);
  }

  public static AnimeRepository newInstance(ApiInterface requestMainApi, MoviesDao moviesDao,
      AnimesDao animesDao) {
    return new AnimeRepository(requestMainApi, moviesDao, animesDao);
  }
}
