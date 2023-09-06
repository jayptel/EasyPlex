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
public final class UpcomingViewModel_Factory implements Factory<UpcomingViewModel> {
  private final Provider<MediaRepository> mediaRepositoryProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  private final Provider<ApiInterface> requestStatusApiProvider;

  public UpcomingViewModel_Factory(Provider<MediaRepository> mediaRepositoryProvider,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<ApiInterface> requestStatusApiProvider) {
    this.mediaRepositoryProvider = mediaRepositoryProvider;
    this.settingsManagerProvider = settingsManagerProvider;
    this.requestStatusApiProvider = requestStatusApiProvider;
  }

  @Override
  public UpcomingViewModel get() {
    UpcomingViewModel instance = newInstance(mediaRepositoryProvider.get(), settingsManagerProvider.get());
    UpcomingViewModel_MembersInjector.injectRequestStatusApi(instance, requestStatusApiProvider.get());
    return instance;
  }

  public static UpcomingViewModel_Factory create(Provider<MediaRepository> mediaRepositoryProvider,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<ApiInterface> requestStatusApiProvider) {
    return new UpcomingViewModel_Factory(mediaRepositoryProvider, settingsManagerProvider, requestStatusApiProvider);
  }

  public static UpcomingViewModel newInstance(MediaRepository mediaRepository,
      SettingsManager settingsManager) {
    return new UpcomingViewModel(mediaRepository, settingsManager);
  }
}
