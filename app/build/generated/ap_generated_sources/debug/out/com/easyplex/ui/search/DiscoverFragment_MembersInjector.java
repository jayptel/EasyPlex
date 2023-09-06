package com.easyplex.ui.search;

import android.content.SharedPreferences;
import androidx.lifecycle.ViewModelProvider;
import com.easyplex.data.repository.AnimeRepository;
import com.easyplex.data.repository.MediaRepository;
import com.easyplex.ui.manager.AuthManager;
import com.easyplex.ui.manager.SettingsManager;
import com.easyplex.ui.manager.TokenManager;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class DiscoverFragment_MembersInjector implements MembersInjector<DiscoverFragment> {
  private final Provider<TokenManager> tokenManagerProvider;

  private final Provider<SharedPreferences> preferencesProvider;

  private final Provider<AuthManager> authManagerProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  private final Provider<MediaRepository> mediaRepositoryProvider;

  private final Provider<AnimeRepository> animeRepositoryProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public DiscoverFragment_MembersInjector(Provider<TokenManager> tokenManagerProvider,
      Provider<SharedPreferences> preferencesProvider, Provider<AuthManager> authManagerProvider,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<MediaRepository> mediaRepositoryProvider,
      Provider<AnimeRepository> animeRepositoryProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.tokenManagerProvider = tokenManagerProvider;
    this.preferencesProvider = preferencesProvider;
    this.authManagerProvider = authManagerProvider;
    this.settingsManagerProvider = settingsManagerProvider;
    this.mediaRepositoryProvider = mediaRepositoryProvider;
    this.animeRepositoryProvider = animeRepositoryProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<DiscoverFragment> create(
      Provider<TokenManager> tokenManagerProvider, Provider<SharedPreferences> preferencesProvider,
      Provider<AuthManager> authManagerProvider, Provider<SettingsManager> settingsManagerProvider,
      Provider<MediaRepository> mediaRepositoryProvider,
      Provider<AnimeRepository> animeRepositoryProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new DiscoverFragment_MembersInjector(tokenManagerProvider, preferencesProvider, authManagerProvider, settingsManagerProvider, mediaRepositoryProvider, animeRepositoryProvider, viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(DiscoverFragment instance) {
    injectTokenManager(instance, tokenManagerProvider.get());
    injectPreferences(instance, preferencesProvider.get());
    injectAuthManager(instance, authManagerProvider.get());
    injectSettingsManager(instance, settingsManagerProvider.get());
    injectMediaRepository(instance, mediaRepositoryProvider.get());
    injectAnimeRepository(instance, animeRepositoryProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("com.easyplex.ui.search.DiscoverFragment.tokenManager")
  public static void injectTokenManager(DiscoverFragment instance, TokenManager tokenManager) {
    instance.tokenManager = tokenManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.search.DiscoverFragment.preferences")
  public static void injectPreferences(DiscoverFragment instance, SharedPreferences preferences) {
    instance.preferences = preferences;
  }

  @InjectedFieldSignature("com.easyplex.ui.search.DiscoverFragment.authManager")
  public static void injectAuthManager(DiscoverFragment instance, AuthManager authManager) {
    instance.authManager = authManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.search.DiscoverFragment.settingsManager")
  public static void injectSettingsManager(DiscoverFragment instance,
      SettingsManager settingsManager) {
    instance.settingsManager = settingsManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.search.DiscoverFragment.mediaRepository")
  public static void injectMediaRepository(DiscoverFragment instance,
      MediaRepository mediaRepository) {
    instance.mediaRepository = mediaRepository;
  }

  @InjectedFieldSignature("com.easyplex.ui.search.DiscoverFragment.animeRepository")
  public static void injectAnimeRepository(DiscoverFragment instance,
      AnimeRepository animeRepository) {
    instance.animeRepository = animeRepository;
  }

  @InjectedFieldSignature("com.easyplex.ui.search.DiscoverFragment.viewModelFactory")
  public static void injectViewModelFactory(DiscoverFragment instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
