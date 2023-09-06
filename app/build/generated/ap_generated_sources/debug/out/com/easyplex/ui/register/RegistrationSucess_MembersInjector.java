package com.easyplex.ui.register;

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
public final class RegistrationSucess_MembersInjector implements MembersInjector<RegistrationSucess> {
  private final Provider<SettingsManager> settingsManagerProvider;

  public RegistrationSucess_MembersInjector(Provider<SettingsManager> settingsManagerProvider) {
    this.settingsManagerProvider = settingsManagerProvider;
  }

  public static MembersInjector<RegistrationSucess> create(
      Provider<SettingsManager> settingsManagerProvider) {
    return new RegistrationSucess_MembersInjector(settingsManagerProvider);
  }

  @Override
  public void injectMembers(RegistrationSucess instance) {
    injectSettingsManager(instance, settingsManagerProvider.get());
  }

  @InjectedFieldSignature("com.easyplex.ui.register.RegistrationSucess.settingsManager")
  public static void injectSettingsManager(RegistrationSucess instance,
      SettingsManager settingsManager) {
    instance.settingsManager = settingsManager;
  }
}
