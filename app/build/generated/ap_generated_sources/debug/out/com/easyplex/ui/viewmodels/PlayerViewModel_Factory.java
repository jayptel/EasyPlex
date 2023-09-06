package com.easyplex.ui.viewmodels;

import com.easyplex.data.repository.AnimeRepository;
import com.easyplex.data.repository.MediaRepository;
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
public final class PlayerViewModel_Factory implements Factory<PlayerViewModel> {
  private final Provider<MediaRepository> mediaRepositoryProvider;

  private final Provider<AnimeRepository> animeRepositoryProvider;

  public PlayerViewModel_Factory(Provider<MediaRepository> mediaRepositoryProvider,
      Provider<AnimeRepository> animeRepositoryProvider) {
    this.mediaRepositoryProvider = mediaRepositoryProvider;
    this.animeRepositoryProvider = animeRepositoryProvider;
  }

  @Override
  public PlayerViewModel get() {
    return newInstance(mediaRepositoryProvider.get(), animeRepositoryProvider.get());
  }

  public static PlayerViewModel_Factory create(Provider<MediaRepository> mediaRepositoryProvider,
      Provider<AnimeRepository> animeRepositoryProvider) {
    return new PlayerViewModel_Factory(mediaRepositoryProvider, animeRepositoryProvider);
  }

  public static PlayerViewModel newInstance(MediaRepository mediaRepository,
      AnimeRepository animeRepository) {
    return new PlayerViewModel(mediaRepository, animeRepository);
  }
}
