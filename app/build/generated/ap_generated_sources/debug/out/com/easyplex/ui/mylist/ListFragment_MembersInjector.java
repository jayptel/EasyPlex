package com.easyplex.ui.mylist;

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
public final class ListFragment_MembersInjector implements MembersInjector<ListFragment> {
  private final Provider<SettingsRepository> authRepositoryProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  public ListFragment_MembersInjector(Provider<SettingsRepository> authRepositoryProvider,
      Provider<SettingsManager> settingsManagerProvider) {
    this.authRepositoryProvider = authRepositoryProvider;
    this.settingsManagerProvider = settingsManagerProvider;
  }

  public static MembersInjector<ListFragment> create(
      Provider<SettingsRepository> authRepositoryProvider,
      Provider<SettingsManager> settingsManagerProvider) {
    return new ListFragment_MembersInjector(authRepositoryProvider, settingsManagerProvider);
  }

  @Override
  public void injectMembers(ListFragment instance) {
    injectAuthRepository(instance, authRepositoryProvider.get());
    injectSettingsManager(instance, settingsManagerProvider.get());
  }

  @InjectedFieldSignature("com.easyplex.ui.mylist.ListFragment.authRepository")
  public static void injectAuthRepository(ListFragment instance,
      SettingsRepository authRepository) {
    instance.authRepository = authRepository;
  }

  @InjectedFieldSignature("com.easyplex.ui.mylist.ListFragment.settingsManager")
  public static void injectSettingsManager(ListFragment instance, SettingsManager settingsManager) {
    instance.settingsManager = settingsManager;
  }
}
