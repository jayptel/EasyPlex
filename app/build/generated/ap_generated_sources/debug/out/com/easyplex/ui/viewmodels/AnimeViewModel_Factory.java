package com.easyplex.ui.viewmodels;

import com.easyplex.data.repository.AnimeRepository;
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
public final class AnimeViewModel_Factory implements Factory<AnimeViewModel> {
  private final Provider<AnimeRepository> animeRepositoryProvider;

  private final Provider<MediaRepository> mediaRepositoryProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  public AnimeViewModel_Factory(Provider<AnimeRepository> animeRepositoryProvider,
      Provider<MediaRepository> mediaRepositoryProvider,
      Provider<SettingsManager> settingsManagerProvider) {
    this.animeRepositoryProvider = animeRepositoryProvider;
    this.mediaRepositoryProvider = mediaRepositoryProvider;
    this.settingsManagerProvider = settingsManagerProvider;
  }

  @Override
  public AnimeViewModel get() {
    return newInstance(animeRepositoryProvider.get(), mediaRepositoryProvider.get(), settingsManagerProvider.get());
  }

  public static AnimeViewModel_Factory create(Provider<AnimeRepository> animeRepositoryProvider,
      Provider<MediaRepository> mediaRepositoryProvider,
      Provider<SettingsManager> settingsManagerProvider) {
    return new AnimeViewModel_Factory(animeRepositoryProvider, mediaRepositoryProvider, settingsManagerProvider);
  }

  public static AnimeViewModel newInstance(AnimeRepository animeRepository,
      MediaRepository mediaRepository, SettingsManager settingsManager) {
    return new AnimeViewModel(animeRepository, mediaRepository, settingsManager);
  }
}
