package com.easyplex.ui.viewmodels;

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
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
  private final Provider<MediaRepository> mediaRepositoryProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  public HomeViewModel_Factory(Provider<MediaRepository> mediaRepositoryProvider,
      Provider<SettingsManager> settingsManagerProvider) {
    this.mediaRepositoryProvider = mediaRepositoryProvider;
    this.settingsManagerProvider = settingsManagerProvider;
  }

  @Override
  public HomeViewModel get() {
    return newInstance(mediaRepositoryProvider.get(), settingsManagerProvider.get());
  }

  public static HomeViewModel_Factory create(Provider<MediaRepository> mediaRepositoryProvider,
      Provider<SettingsManager> settingsManagerProvider) {
    return new HomeViewModel_Factory(mediaRepositoryProvider, settingsManagerProvider);
  }

  public static HomeViewModel newInstance(MediaRepository mediaRepository,
      SettingsManager settingsManager) {
    return new HomeViewModel(mediaRepository, settingsManager);
  }
}
