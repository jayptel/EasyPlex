package com.easyplex.ui.upcoming;

import androidx.lifecycle.ViewModelProvider;
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
public final class UpComingFragment_MembersInjector implements MembersInjector<UpComingFragment> {
  private final Provider<SettingsManager> settingsManagerProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public UpComingFragment_MembersInjector(Provider<SettingsManager> settingsManagerProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.settingsManagerProvider = settingsManagerProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<UpComingFragment> create(
      Provider<SettingsManager> settingsManagerProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new UpComingFragment_MembersInjector(settingsManagerProvider, viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(UpComingFragment instance) {
    injectSettingsManager(instance, settingsManagerProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("com.easyplex.ui.upcoming.UpComingFragment.settingsManager")
  public static void injectSettingsManager(UpComingFragment instance,
      SettingsManager settingsManager) {
    instance.settingsManager = settingsManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.upcoming.UpComingFragment.viewModelFactory")
  public static void injectViewModelFactory(UpComingFragment instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
