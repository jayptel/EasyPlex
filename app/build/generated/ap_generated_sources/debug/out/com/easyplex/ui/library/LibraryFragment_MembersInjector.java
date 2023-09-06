package com.easyplex.ui.library;

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
public final class LibraryFragment_MembersInjector implements MembersInjector<LibraryFragment> {
  private final Provider<SettingsRepository> authRepositoryProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  public LibraryFragment_MembersInjector(Provider<SettingsRepository> authRepositoryProvider,
      Provider<SettingsManager> settingsManagerProvider) {
    this.authRepositoryProvider = authRepositoryProvider;
    this.settingsManagerProvider = settingsManagerProvider;
  }

  public static MembersInjector<LibraryFragment> create(
      Provider<SettingsRepository> authRepositoryProvider,
      Provider<SettingsManager> settingsManagerProvider) {
    return new LibraryFragment_MembersInjector(authRepositoryProvider, settingsManagerProvider);
  }

  @Override
  public void injectMembers(LibraryFragment instance) {
    injectAuthRepository(instance, authRepositoryProvider.get());
    injectSettingsManager(instance, settingsManagerProvider.get());
  }

  @InjectedFieldSignature("com.easyplex.ui.library.LibraryFragment.authRepository")
  public static void injectAuthRepository(LibraryFragment instance,
      SettingsRepository authRepository) {
    instance.authRepository = authRepository;
  }

  @InjectedFieldSignature("com.easyplex.ui.library.LibraryFragment.settingsManager")
  public static void injectSettingsManager(LibraryFragment instance,
      SettingsManager settingsManager) {
    instance.settingsManager = settingsManager;
  }
}
