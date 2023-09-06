package com.easyplex.ui.downloadmanager.ui.main;

import com.easyplex.data.repository.MediaRepository;
import com.easyplex.ui.manager.SettingsManager;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class DownloadsFragment_MembersInjector implements MembersInjector<DownloadsFragment> {
  private final Provider<MediaRepository> mediaRepositoryProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  public DownloadsFragment_MembersInjector(Provider<MediaRepository> mediaRepositoryProvider,
      Provider<SettingsManager> settingsManagerProvider) {
    this.mediaRepositoryProvider = mediaRepositoryProvider;
    this.settingsManagerProvider = settingsManagerProvider;
  }

  public static MembersInjector<DownloadsFragment> create(
      Provider<MediaRepository> mediaRepositoryProvider,
      Provider<SettingsManager> settingsManagerProvider) {
    return new DownloadsFragment_MembersInjector(mediaRepositoryProvider, settingsManagerProvider);
  }

  @Override
  public void injectMembers(DownloadsFragment instance) {
    injectMediaRepository(instance, mediaRepositoryProvider.get());
    injectSettingsManager(instance, settingsManagerProvider.get());
  }

  @InjectedFieldSignature("com.easyplex.ui.downloadmanager.ui.main.DownloadsFragment.mediaRepository")
  public static void injectMediaRepository(DownloadsFragment instance,
      MediaRepository mediaRepository) {
    instance.mediaRepository = mediaRepository;
  }

  @InjectedFieldSignature("com.easyplex.ui.downloadmanager.ui.main.DownloadsFragment.settingsManager")
  public static void injectSettingsManager(DownloadsFragment instance,
      SettingsManager settingsManager) {
    instance.settingsManager = settingsManager;
  }
}
