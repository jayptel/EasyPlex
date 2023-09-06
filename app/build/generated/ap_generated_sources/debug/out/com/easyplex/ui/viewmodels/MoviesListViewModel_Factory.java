package com.easyplex.ui.viewmodels;

import com.easyplex.data.repository.MediaRepository;
import com.easyplex.ui.manager.AuthManager;
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
public final class MoviesListViewModel_Factory implements Factory<MoviesListViewModel> {
  private final Provider<MediaRepository> mediaRepositoryProvider;

  private final Provider<AuthManager> authManagerProvider;

  private final Provider<AuthManager> authManagerProvider2;

  public MoviesListViewModel_Factory(Provider<MediaRepository> mediaRepositoryProvider,
      Provider<AuthManager> authManagerProvider, Provider<AuthManager> authManagerProvider2) {
    this.mediaRepositoryProvider = mediaRepositoryProvider;
    this.authManagerProvider = authManagerProvider;
    this.authManagerProvider2 = authManagerProvider2;
  }

  @Override
  public MoviesListViewModel get() {
    MoviesListViewModel instance = newInstance(mediaRepositoryProvider.get(), authManagerProvider.get());
    MoviesListViewModel_MembersInjector.injectAuthManager(instance, authManagerProvider2.get());
    return instance;
  }

  public static MoviesListViewModel_Factory create(
      Provider<MediaRepository> mediaRepositoryProvider, Provider<AuthManager> authManagerProvider,
      Provider<AuthManager> authManagerProvider2) {
    return new MoviesListViewModel_Factory(mediaRepositoryProvider, authManagerProvider, authManagerProvider2);
  }

  public static MoviesListViewModel newInstance(MediaRepository mediaRepository,
      AuthManager authManager) {
    return new MoviesListViewModel(mediaRepository, authManager);
  }
}
