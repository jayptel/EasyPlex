package com.easyplex.ui.viewmodels;

import com.easyplex.data.repository.MediaRepository;
import com.easyplex.data.repository.SettingsRepository;
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
public final class SettingsViewModel_Factory implements Factory<SettingsViewModel> {
  private final Provider<SettingsRepository> settingsRepositoryProvider;

  private final Provider<MediaRepository> mediaRepositoryProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  public SettingsViewModel_Factory(Provider<SettingsRepository> settingsRepositoryProvider,
      Provider<MediaRepository> mediaRepositoryProvider,
      Provider<SettingsManager> settingsManagerProvider) {
    this.settingsRepositoryProvider = settingsRepositoryProvider;
    this.mediaRepositoryProvider = mediaRepositoryProvider;
    this.settingsManagerProvider = settingsManagerProvider;
  }

  @Override
  public SettingsViewModel get() {
    SettingsViewModel instance = newInstance(settingsRepositoryProvider.get(), mediaRepositoryProvider.get());
    SettingsViewModel_MembersInjector.injectSettingsManager(instance, settingsManagerProvider.get());
    return instance;
  }

  public static SettingsViewModel_Factory create(
      Provider<SettingsRepository> settingsRepositoryProvider,
      Provider<MediaRepository> mediaRepositoryProvider,
      Provider<SettingsManager> settingsManagerProvider) {
    return new SettingsViewModel_Factory(settingsRepositoryProvider, mediaRepositoryProvider, settingsManagerProvider);
  }

  public static SettingsViewModel newInstance(SettingsRepository settingsRepository,
      MediaRepository mediaRepository) {
    return new SettingsViewModel(settingsRepository, mediaRepository);
  }
}
