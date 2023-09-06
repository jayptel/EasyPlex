package com.easyplex.ui.moviedetails.adapters;

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
public final class CastAdapter_MembersInjector implements MembersInjector<CastAdapter> {
  private final Provider<SettingsManager> settingsManagerProvider;

  public CastAdapter_MembersInjector(Provider<SettingsManager> settingsManagerProvider) {
    this.settingsManagerProvider = settingsManagerProvider;
  }

  public static MembersInjector<CastAdapter> create(
      Provider<SettingsManager> settingsManagerProvider) {
    return new CastAdapter_MembersInjector(settingsManagerProvider);
  }

  @Override
  public void injectMembers(CastAdapter instance) {
    injectSettingsManager(instance, settingsManagerProvider.get());
  }

  @InjectedFieldSignature("com.easyplex.ui.moviedetails.adapters.CastAdapter.settingsManager")
  public static void injectSettingsManager(CastAdapter instance, SettingsManager settingsManager) {
    instance.settingsManager = settingsManager;
  }
}
