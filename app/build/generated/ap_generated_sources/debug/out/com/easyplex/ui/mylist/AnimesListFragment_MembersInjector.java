package com.easyplex.ui.mylist;

import androidx.lifecycle.ViewModelProvider;
import com.easyplex.data.repository.AnimeRepository;
import com.easyplex.data.repository.AuthRepository;
import com.easyplex.data.repository.MediaRepository;
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
public final class AnimesListFragment_MembersInjector implements MembersInjector<AnimesListFragment> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  private final Provider<AnimeRepository> animeRepositoryProvider;

  private final Provider<AuthRepository> authRepositoryProvider;

  private final Provider<MediaRepository> mediaRepositoryProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  private final Provider<TokenManager> tokenManagerProvider;

  public AnimesListFragment_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<AnimeRepository> animeRepositoryProvider,
      Provider<AuthRepository> authRepositoryProvider,
      Provider<MediaRepository> mediaRepositoryProvider,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<TokenManager> tokenManagerProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.animeRepositoryProvider = animeRepositoryProvider;
    this.authRepositoryProvider = authRepositoryProvider;
    this.mediaRepositoryProvider = mediaRepositoryProvider;
    this.settingsManagerProvider = settingsManagerProvider;
    this.tokenManagerProvider = tokenManagerProvider;
  }

  public static MembersInjector<AnimesListFragment> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<AnimeRepository> animeRepositoryProvider,
      Provider<AuthRepository> authRepositoryProvider,
      Provider<MediaRepository> mediaRepositoryProvider,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<TokenManager> tokenManagerProvider) {
    return new AnimesListFragment_MembersInjector(viewModelFactoryProvider, animeRepositoryProvider, authRepositoryProvider, mediaRepositoryProvider, settingsManagerProvider, tokenManagerProvider);
  }

  @Override
  public void injectMembers(AnimesListFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectAnimeRepository(instance, animeRepositoryProvider.get());
    injectAuthRepository(instance, authRepositoryProvider.get());
    injectMediaRepository(instance, mediaRepositoryProvider.get());
    injectSettingsManager(instance, settingsManagerProvider.get());
    injectTokenManager(instance, tokenManagerProvider.get());
  }

  @InjectedFieldSignature("com.easyplex.ui.mylist.AnimesListFragment.viewModelFactory")
  public static void injectViewModelFactory(AnimesListFragment instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }

  @InjectedFieldSignature("com.easyplex.ui.mylist.AnimesListFragment.animeRepository")
  public static void injectAnimeRepository(AnimesListFragment instance,
      AnimeRepository animeRepository) {
    instance.animeRepository = animeRepository;
  }

  @InjectedFieldSignature("com.easyplex.ui.mylist.AnimesListFragment.authRepository")
  public static void injectAuthRepository(AnimesListFragment instance,
      AuthRepository authRepository) {
    instance.authRepository = authRepository;
  }

  @InjectedFieldSignature("com.easyplex.ui.mylist.AnimesListFragment.mediaRepository")
  public static void injectMediaRepository(AnimesListFragment instance,
      MediaRepository mediaRepository) {
    instance.mediaRepository = mediaRepository;
  }

  @InjectedFieldSignature("com.easyplex.ui.mylist.AnimesListFragment.settingsManager")
  public static void injectSettingsManager(AnimesListFragment instance,
      SettingsManager settingsManager) {
    instance.settingsManager = settingsManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.mylist.AnimesListFragment.tokenManager")
  public static void injectTokenManager(AnimesListFragment instance, TokenManager tokenManager) {
    instance.tokenManager = tokenManager;
  }
}
