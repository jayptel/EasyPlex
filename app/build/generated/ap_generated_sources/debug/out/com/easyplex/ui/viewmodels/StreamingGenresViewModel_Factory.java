package com.easyplex.ui.viewmodels;

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
public final class StreamingGenresViewModel_Factory implements Factory<StreamingGenresViewModel> {
  private final Provider<MediaRepository> mediaRepositoryProvider;

  public StreamingGenresViewModel_Factory(Provider<MediaRepository> mediaRepositoryProvider) {
    this.mediaRepositoryProvider = mediaRepositoryProvider;
  }

  @Override
  public StreamingGenresViewModel get() {
    return newInstance(mediaRepositoryProvider.get());
  }

  public static StreamingGenresViewModel_Factory create(
      Provider<MediaRepository> mediaRepositoryProvider) {
    return new StreamingGenresViewModel_Factory(mediaRepositoryProvider);
  }

  public static StreamingGenresViewModel newInstance(MediaRepository mediaRepository) {
    return new StreamingGenresViewModel(mediaRepository);
  }
}
