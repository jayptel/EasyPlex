package com.easyplex.ui.notifications;

import com.easyplex.data.repository.AnimeRepository;
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
public final class NotificationManager_MembersInjector implements MembersInjector<NotificationManager> {
  private final Provider<SettingsManager> settingsManagerProvider;

  private final Provider<AnimeRepository> animeRepositoryProvider;

  public NotificationManager_MembersInjector(Provider<SettingsManager> settingsManagerProvider,
      Provider<AnimeRepository> animeRepositoryProvider) {
    this.settingsManagerProvider = settingsManagerProvider;
    this.animeRepositoryProvider = animeRepositoryProvider;
  }

  public static MembersInjector<NotificationManager> create(
      Provider<SettingsManager> settingsManagerProvider,
      Provider<AnimeRepository> animeRepositoryProvider) {
    return new NotificationManager_MembersInjector(settingsManagerProvider, animeRepositoryProvider);
  }

  @Override
  public void injectMembers(NotificationManager instance) {
    injectSettingsManager(instance, settingsManagerProvider.get());
    injectAnimeRepository(instance, animeRepositoryProvider.get());
  }

  @InjectedFieldSignature("com.easyplex.ui.notifications.NotificationManager.settingsManager")
  public static void injectSettingsManager(NotificationManager instance,
      SettingsManager settingsManager) {
    instance.settingsManager = settingsManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.notifications.NotificationManager.animeRepository")
  public static void injectAnimeRepository(NotificationManager instance,
      AnimeRepository animeRepository) {
    instance.animeRepository = animeRepository;
  }
}
