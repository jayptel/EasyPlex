package com.easyplex.ui.trailer;

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
public final class TrailerPreviewActivity_MembersInjector implements MembersInjector<TrailerPreviewActivity> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public TrailerPreviewActivity_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.settingsManagerProvider = settingsManagerProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<TrailerPreviewActivity> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new TrailerPreviewActivity_MembersInjector(androidInjectorProvider, settingsManagerProvider, viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(TrailerPreviewActivity instance) {
    injectAndroidInjector(instance, androidInjectorProvider.get());
    injectSettingsManager(instance, settingsManagerProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("com.easyplex.ui.trailer.TrailerPreviewActivity.androidInjector")
  public static void injectAndroidInjector(TrailerPreviewActivity instance,
      DispatchingAndroidInjector<Object> androidInjector) {
    instance.androidInjector = androidInjector;
  }

  @InjectedFieldSignature("com.easyplex.ui.trailer.TrailerPreviewActivity.settingsManager")
  public static void injectSettingsManager(TrailerPreviewActivity instance,
      SettingsManager settingsManager) {
    instance.settingsManager = settingsManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.trailer.TrailerPreviewActivity.viewModelFactory")
  public static void injectViewModelFactory(TrailerPreviewActivity instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
