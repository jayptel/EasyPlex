package com.easyplex.ui.viewmodels;

import com.easyplex.data.remote.ApiInterface;
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
public final class GenresViewModel_Factory implements Factory<GenresViewModel> {
  private final Provider<MediaRepository> mediaRepositoryProvider;

  private final Provider<ApiInterface> requestInterfaceProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  public GenresViewModel_Factory(Provider<MediaRepository> mediaRepositoryProvider,
      Provider<ApiInterface> requestInterfaceProvider,
      Provider<SettingsManager> settingsManagerProvider) {
    this.mediaRepositoryProvider = mediaRepositoryProvider;
    this.requestInterfaceProvider = requestInterfaceProvider;
    this.settingsManagerProvider = settingsManagerProvider;
  }

  @Override
  public GenresViewModel get() {
    return newInstance(mediaRepositoryProvider.get(), requestInterfaceProvider.get(), settingsManagerProvider.get());
  }

  public static GenresViewModel_Factory create(Provider<MediaRepository> mediaRepositoryProvider,
      Provider<ApiInterface> requestInterfaceProvider,
      Provider<SettingsManager> settingsManagerProvider) {
    return new GenresViewModel_Factory(mediaRepositoryProvider, requestInterfaceProvider, settingsManagerProvider);
  }

  public static GenresViewModel newInstance(MediaRepository mediaRepository,
      ApiInterface requestInterface, SettingsManager settingsManager) {
    return new GenresViewModel(mediaRepository, requestInterface, settingsManager);
  }
}
