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
public final class NetworksViewModel_Factory implements Factory<NetworksViewModel> {
  private final Provider<MediaRepository> mediaRepositoryProvider;

  public NetworksViewModel_Factory(Provider<MediaRepository> mediaRepositoryProvider) {
    this.mediaRepositoryProvider = mediaRepositoryProvider;
  }

  @Override
  public NetworksViewModel get() {
    return newInstance(mediaRepositoryProvider.get());
  }

  public static NetworksViewModel_Factory create(
      Provider<MediaRepository> mediaRepositoryProvider) {
    return new NetworksViewModel_Factory(mediaRepositoryProvider);
  }

  public static NetworksViewModel newInstance(MediaRepository mediaRepository) {
    return new NetworksViewModel(mediaRepository);
  }
}
