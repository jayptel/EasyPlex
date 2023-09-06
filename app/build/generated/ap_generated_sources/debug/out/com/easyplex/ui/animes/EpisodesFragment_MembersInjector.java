package com.easyplex.ui.animes;

import android.content.SharedPreferences;
import androidx.lifecycle.ViewModelProvider;
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
public final class EpisodesFragment_MembersInjector implements MembersInjector<EpisodesFragment> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  private final Provider<TokenManager> tokenManagerProvider;

  private final Provider<MediaRepository> mediaRepositoryProvider;

  private final Provider<SharedPreferences> sharedPreferencesProvider;

  private final Provider<AuthManager> authManagerProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  public EpisodesFragment_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<TokenManager> tokenManagerProvider,
      Provider<MediaRepository> mediaRepositoryProvider,
      Provider<SharedPreferences> sharedPreferencesProvider,
      Provider<AuthManager> authManagerProvider,
      Provider<SettingsManager> settingsManagerProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.tokenManagerProvider = tokenManagerProvider;
    this.mediaRepositoryProvider = mediaRepositoryProvider;
    this.sharedPreferencesProvider = sharedPreferencesProvider;
    this.authManagerProvider = authManagerProvider;
    this.settingsManagerProvider = settingsManagerProvider;
  }

  public static MembersInjector<EpisodesFragment> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<TokenManager> tokenManagerProvider,
      Provider<MediaRepository> mediaRepositoryProvider,
      Provider<SharedPreferences> sharedPreferencesProvider,
      Provider<AuthManager> authManagerProvider,
      Provider<SettingsManager> settingsManagerProvider) {
    return new EpisodesFragment_MembersInjector(viewModelFactoryProvider, tokenManagerProvider, mediaRepositoryProvider, sharedPreferencesProvider, authManagerProvider, settingsManagerProvider);
  }

  @Override
  public void injectMembers(EpisodesFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectTokenManager(instance, tokenManagerProvider.get());
    injectMediaRepository(instance, mediaRepositoryProvider.get());
    injectSharedPreferences(instance, sharedPreferencesProvider.get());
    injectAuthManager(instance, authManagerProvider.get());
    injectSettingsManager(instance, settingsManagerProvider.get());
  }

  @InjectedFieldSignature("com.easyplex.ui.animes.EpisodesFragment.viewModelFactory")
  public static void injectViewModelFactory(EpisodesFragment instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }

  @InjectedFieldSignature("com.easyplex.ui.animes.EpisodesFragment.tokenManager")
  public static void injectTokenManager(EpisodesFragment instance, TokenManager tokenManager) {
    instance.tokenManager = tokenManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.animes.EpisodesFragment.mediaRepository")
  public static void injectMediaRepository(EpisodesFragment instance,
      MediaRepository mediaRepository) {
    instance.mediaRepository = mediaRepository;
  }

  @InjectedFieldSignature("com.easyplex.ui.animes.EpisodesFragment.sharedPreferences")
  public static void injectSharedPreferences(EpisodesFragment instance,
      SharedPreferences sharedPreferences) {
    instance.sharedPreferences = sharedPreferences;
  }

  @InjectedFieldSignature("com.easyplex.ui.animes.EpisodesFragment.authManager")
  public static void injectAuthManager(EpisodesFragment instance, AuthManager authManager) {
    instance.authManager = authManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.animes.EpisodesFragment.settingsManager")
  public static void injectSettingsManager(EpisodesFragment instance,
      SettingsManager settingsManager) {
    instance.settingsManager = settingsManager;
  }
}
