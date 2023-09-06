package com.easyplex.ui.animes;

import com.easyplex.data.repository.SettingsRepository;
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
public final class SerieMoreDetailFragment_MembersInjector implements MembersInjector<SerieMoreDetailFragment> {
  private final Provider<SettingsRepository> authRepositoryProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  public SerieMoreDetailFragment_MembersInjector(
      Provider<SettingsRepository> authRepositoryProvider,
      Provider<SettingsManager> settingsManagerProvider) {
    this.authRepositoryProvider = authRepositoryProvider;
    this.settingsManagerProvider = settingsManagerProvider;
  }

  public static MembersInjector<SerieMoreDetailFragment> create(
      Provider<SettingsRepository> authRepositoryProvider,
      Provider<SettingsManager> settingsManagerProvider) {
    return new SerieMoreDetailFragment_MembersInjector(authRepositoryProvider, settingsManagerProvider);
  }

  @Override
  public void injectMembers(SerieMoreDetailFragment instance) {
    injectAuthRepository(instance, authRepositoryProvider.get());
    injectSettingsManager(instance, settingsManagerProvider.get());
  }

  @InjectedFieldSignature("com.easyplex.ui.animes.SerieMoreDetailFragment.authRepository")
  public static void injectAuthRepository(SerieMoreDetailFragment instance,
      SettingsRepository authRepository) {
    instance.authRepository = authRepository;
  }

  @InjectedFieldSignature("com.easyplex.ui.animes.SerieMoreDetailFragment.settingsManager")
  public static void injectSettingsManager(SerieMoreDetailFragment instance,
      SettingsManager settingsManager) {
    instance.settingsManager = settingsManager;
  }
}
