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
public final class UserViewModel_Factory implements Factory<UserViewModel> {
  private final Provider<AuthRepository> authRepositoryProvider;

  private final Provider<MediaRepository> mediaRepositoryProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  public UserViewModel_Factory(Provider<AuthRepository> authRepositoryProvider,
      Provider<MediaRepository> mediaRepositoryProvider,
      Provider<SettingsManager> settingsManagerProvider) {
    this.authRepositoryProvider = authRepositoryProvider;
    this.mediaRepositoryProvider = mediaRepositoryProvider;
    this.settingsManagerProvider = settingsManagerProvider;
  }

  @Override
  public UserViewModel get() {
    return newInstance(authRepositoryProvider.get(), mediaRepositoryProvider.get(), settingsManagerProvider.get());
  }

  public static UserViewModel_Factory create(Provider<AuthRepository> authRepositoryProvider,
      Provider<MediaRepository> mediaRepositoryProvider,
      Provider<SettingsManager> settingsManagerProvider) {
    return new UserViewModel_Factory(authRepositoryProvider, mediaRepositoryProvider, settingsManagerProvider);
  }

  public static UserViewModel newInstance(AuthRepository authRepository,
      MediaRepository mediaRepository, SettingsManager settingsManager) {
    return new UserViewModel(authRepository, mediaRepository, settingsManager);
  }
}
