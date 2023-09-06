package com.easyplex.ui.viewmodels;

import com.easyplex.data.repository.AuthRepository;
import com.easyplex.data.repository.MediaRepository;
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
public final class MovieDetailViewModel_Factory implements Factory<MovieDetailViewModel> {
  private final Provider<MediaRepository> mediaRepositoryProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  private final Provider<AuthRepository> authRepositoryProvider;

  public MovieDetailViewModel_Factory(Provider<MediaRepository> mediaRepositoryProvider,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<AuthRepository> authRepositoryProvider) {
    this.mediaRepositoryProvider = mediaRepositoryProvider;
    this.settingsManagerProvider = settingsManagerProvider;
    this.authRepositoryProvider = authRepositoryProvider;
  }

  @Override
  public MovieDetailViewModel get() {
    return newInstance(mediaRepositoryProvider.get(), settingsManagerProvider.get(), authRepositoryProvider.get());
  }

  public static MovieDetailViewModel_Factory create(
      Provider<MediaRepository> mediaRepositoryProvider,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<AuthRepository> authRepositoryProvider) {
    return new MovieDetailViewModel_Factory(mediaRepositoryProvider, settingsManagerProvider, authRepositoryProvider);
  }

  public static MovieDetailViewModel newInstance(MediaRepository mediaRepository,
      SettingsManager settingsManager, AuthRepository authRepository) {
    return new MovieDetailViewModel(mediaRepository, settingsManager, authRepository);
  }
}
