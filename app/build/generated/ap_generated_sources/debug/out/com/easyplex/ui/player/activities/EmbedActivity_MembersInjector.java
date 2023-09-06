package com.easyplex.ui.player.activities;

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
public final class EmbedActivity_MembersInjector implements MembersInjector<EmbedActivity> {
  private final Provider<SettingsManager> settingsManagerProvider;

  public EmbedActivity_MembersInjector(Provider<SettingsManager> settingsManagerProvider) {
    this.settingsManagerProvider = settingsManagerProvider;
  }

  public static MembersInjector<EmbedActivity> create(
      Provider<SettingsManager> settingsManagerProvider) {
    return new EmbedActivity_MembersInjector(settingsManagerProvider);
  }

  @Override
  public void injectMembers(EmbedActivity instance) {
    injectSettingsManager(instance, settingsManagerProvider.get());
  }

  @InjectedFieldSignature("com.easyplex.ui.player.activities.EmbedActivity.settingsManager")
  public static void injectSettingsManager(EmbedActivity instance,
      SettingsManager settingsManager) {
    instance.settingsManager = settingsManager;
  }
}
