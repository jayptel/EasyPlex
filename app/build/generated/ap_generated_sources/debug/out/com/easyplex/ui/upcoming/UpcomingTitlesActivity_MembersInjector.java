package com.easyplex.ui.upcoming;

import androidx.lifecycle.ViewModelProvider;
import com.easyplex.ui.manager.SettingsManager;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
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
public final class UpcomingTitlesActivity_MembersInjector implements MembersInjector<UpcomingTitlesActivity> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public UpcomingTitlesActivity_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.settingsManagerProvider = settingsManagerProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<UpcomingTitlesActivity> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new UpcomingTitlesActivity_MembersInjector(androidInjectorProvider, settingsManagerProvider, viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(UpcomingTitlesActivity instance) {
    injectAndroidInjector(instance, androidInjectorProvider.get());
    injectSettingsManager(instance, settingsManagerProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("com.easyplex.ui.upcoming.UpcomingTitlesActivity.androidInjector")
  public static void injectAndroidInjector(UpcomingTitlesActivity instance,
      DispatchingAndroidInjector<Object> androidInjector) {
    instance.androidInjector = androidInjector;
  }

  @InjectedFieldSignature("com.easyplex.ui.upcoming.UpcomingTitlesActivity.settingsManager")
  public static void injectSettingsManager(UpcomingTitlesActivity instance,
      SettingsManager settingsManager) {
    instance.settingsManager = settingsManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.upcoming.UpcomingTitlesActivity.viewModelFactory")
  public static void injectViewModelFactory(UpcomingTitlesActivity instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
