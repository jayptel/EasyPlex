package com.easyplex.ui.viewmodels;

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
public final class SettingsViewModel_MembersInjector implements MembersInjector<SettingsViewModel> {
  private final Provider<SettingsManager> settingsManagerProvider;

  public SettingsViewModel_MembersInjector(Provider<SettingsManager> settingsManagerProvider) {
    this.settingsManagerProvider = settingsManagerProvider;
  }

  public static MembersInjector<SettingsViewModel> create(
      Provider<SettingsManager> settingsManagerProvider) {
    return new SettingsViewModel_MembersInjector(settingsManagerProvider);
  }

  @Override
  public void injectMembers(SettingsViewModel instance) {
    injectSettingsManager(instance, settingsManagerProvider.get());
  }

  @InjectedFieldSignature("com.easyplex.ui.viewmodels.SettingsViewModel.settingsManager")
  public static void injectSettingsManager(SettingsViewModel instance,
      SettingsManager settingsManager) {
    instance.settingsManager = settingsManager;
  }
}
