package com.easyplex.ui.mylist;

import androidx.lifecycle.ViewModelProvider;
import com.easyplex.data.repository.AuthRepository;
import com.easyplex.data.repository.MediaRepository;
import com.easyplex.ui.manager.SettingsManager;
import com.easyplex.ui.manager.TokenManager;
import com.easyplex.ui.viewmodels.MoviesListViewModel;
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
public final class MoviesListFragment_MembersInjector implements MembersInjector<MoviesListFragment> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  private final Provider<AuthRepository> authRepositoryProvider;

  private final Provider<MediaRepository> mediaRepositoryProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  private final Provider<TokenManager> tokenManagerProvider;

  private final Provider<MoviesListViewModel> moviesListViewModelProvider;

  public MoviesListFragment_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<AuthRepository> authRepositoryProvider,
      Provider<MediaRepository> mediaRepositoryProvider,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<TokenManager> tokenManagerProvider,
      Provider<MoviesListViewModel> moviesListViewModelProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.authRepositoryProvider = authRepositoryProvider;
    this.mediaRepositoryProvider = mediaRepositoryProvider;
    this.settingsManagerProvider = settingsManagerProvider;
    this.tokenManagerProvider = tokenManagerProvider;
    this.moviesListViewModelProvider = moviesListViewModelProvider;
  }

  public static MembersInjector<MoviesListFragment> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<AuthRepository> authRepositoryProvider,
      Provider<MediaRepository> mediaRepositoryProvider,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<TokenManager> tokenManagerProvider,
      Provider<MoviesListViewModel> moviesListViewModelProvider) {
    return new MoviesListFragment_MembersInjector(viewModelFactoryProvider, authRepositoryProvider, mediaRepositoryProvider, settingsManagerProvider, tokenManagerProvider, moviesListViewModelProvider);
  }

  @Override
  public void injectMembers(MoviesListFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectAuthRepository(instance, authRepositoryProvider.get());
    injectMediaRepository(instance, mediaRepositoryProvider.get());
    injectSettingsManager(instance, settingsManagerProvider.get());
    injectTokenManager(instance, tokenManagerProvider.get());
    injectMoviesListViewModel(instance, moviesListViewModelProvider.get());
  }

  @InjectedFieldSignature("com.easyplex.ui.mylist.MoviesListFragment.viewModelFactory")
  public static void injectViewModelFactory(MoviesListFragment instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }

  @InjectedFieldSignature("com.easyplex.ui.mylist.MoviesListFragment.authRepository")
  public static void injectAuthRepository(MoviesListFragment instance,
      AuthRepository authRepository) {
    instance.authRepository = authRepository;
  }

  @InjectedFieldSignature("com.easyplex.ui.mylist.MoviesListFragment.mediaRepository")
  public static void injectMediaRepository(MoviesListFragment instance,
      MediaRepository mediaRepository) {
    instance.mediaRepository = mediaRepository;
  }

  @InjectedFieldSignature("com.easyplex.ui.mylist.MoviesListFragment.settingsManager")
  public static void injectSettingsManager(MoviesListFragment instance,
      SettingsManager settingsManager) {
    instance.settingsManager = settingsManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.mylist.MoviesListFragment.tokenManager")
  public static void injectTokenManager(MoviesListFragment instance, TokenManager tokenManager) {
    instance.tokenManager = tokenManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.mylist.MoviesListFragment.moviesListViewModel")
  public static void injectMoviesListViewModel(MoviesListFragment instance,
      MoviesListViewModel moviesListViewModel) {
    instance.moviesListViewModel = moviesListViewModel;
  }
}
