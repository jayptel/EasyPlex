package com.easyplex.ui.splash;

import android.content.pm.ApplicationInfo;
import androidx.lifecycle.ViewModelProvider;
import com.easyplex.data.repository.SettingsRepository;
import com.easyplex.ui.manager.AdsManager;
import com.easyplex.ui.manager.SettingsManager;
import com.easyplex.ui.manager.StatusManager;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Named;
import javax.inject.Provider;

@QualifierMetadata("javax.inject.Named")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SplashActivity_MembersInjector implements MembersInjector<SplashActivity> {
  private final Provider<SettingsRepository> settingsRepositoryProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  private final Provider<AdsManager> adsManagerProvider;

  private final Provider<StatusManager> statusManagerProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  private final Provider<ApplicationInfo> provideApplicationInfoProvider;

  private final Provider<String> packageNameProvider;

  private final Provider<Boolean> checkVpnProvider;

  private final Provider<FirebaseRemoteConfig> provideFirebaseRemoteConfigProvider;

  public SplashActivity_MembersInjector(Provider<SettingsRepository> settingsRepositoryProvider,
      Provider<SettingsManager> settingsManagerProvider, Provider<AdsManager> adsManagerProvider,
      Provider<StatusManager> statusManagerProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<ApplicationInfo> provideApplicationInfoProvider,
      Provider<String> packageNameProvider, Provider<Boolean> checkVpnProvider,
      Provider<FirebaseRemoteConfig> provideFirebaseRemoteConfigProvider) {
    this.settingsRepositoryProvider = settingsRepositoryProvider;
    this.settingsManagerProvider = settingsManagerProvider;
    this.adsManagerProvider = adsManagerProvider;
    this.statusManagerProvider = statusManagerProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.provideApplicationInfoProvider = provideApplicationInfoProvider;
    this.packageNameProvider = packageNameProvider;
    this.checkVpnProvider = checkVpnProvider;
    this.provideFirebaseRemoteConfigProvider = provideFirebaseRemoteConfigProvider;
  }

  public static MembersInjector<SplashActivity> create(
      Provider<SettingsRepository> settingsRepositoryProvider,
      Provider<SettingsManager> settingsManagerProvider, Provider<AdsManager> adsManagerProvider,
      Provider<StatusManager> statusManagerProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<ApplicationInfo> provideApplicationInfoProvider,
      Provider<String> packageNameProvider, Provider<Boolean> checkVpnProvider,
      Provider<FirebaseRemoteConfig> provideFirebaseRemoteConfigProvider) {
    return new SplashActivity_MembersInjector(settingsRepositoryProvider, settingsManagerProvider, adsManagerProvider, statusManagerProvider, viewModelFactoryProvider, provideApplicationInfoProvider, packageNameProvider, checkVpnProvider, provideFirebaseRemoteConfigProvider);
  }

  @Override
  public void injectMembers(SplashActivity instance) {
    injectSettingsRepository(instance, settingsRepositoryProvider.get());
    injectSettingsManager(instance, settingsManagerProvider.get());
    injectAdsManager(instance, adsManagerProvider.get());
    injectStatusManager(instance, statusManagerProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectProvideApplicationInfo(instance, provideApplicationInfoProvider.get());
    injectPackageName(instance, packageNameProvider.get());
    injectCheckVpn(instance, checkVpnProvider.get());
    injectProvideFirebaseRemoteConfig(instance, provideFirebaseRemoteConfigProvider.get());
  }

  @InjectedFieldSignature("com.easyplex.ui.splash.SplashActivity.settingsRepository")
  public static void injectSettingsRepository(SplashActivity instance,
      SettingsRepository settingsRepository) {
    instance.settingsRepository = settingsRepository;
  }

  @InjectedFieldSignature("com.easyplex.ui.splash.SplashActivity.settingsManager")
  public static void injectSettingsManager(SplashActivity instance,
      SettingsManager settingsManager) {
    instance.settingsManager = settingsManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.splash.SplashActivity.adsManager")
  public static void injectAdsManager(SplashActivity instance, AdsManager adsManager) {
    instance.adsManager = adsManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.splash.SplashActivity.statusManager")
  public static void injectStatusManager(SplashActivity instance, StatusManager statusManager) {
    instance.statusManager = statusManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.splash.SplashActivity.viewModelFactory")
  public static void injectViewModelFactory(SplashActivity instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }

  @InjectedFieldSignature("com.easyplex.ui.splash.SplashActivity.provideApplicationInfo")
  @Named("sniffer")
  public static void injectProvideApplicationInfo(SplashActivity instance,
      ApplicationInfo provideApplicationInfo) {
    instance.provideApplicationInfo = provideApplicationInfo;
  }

  @InjectedFieldSignature("com.easyplex.ui.splash.SplashActivity.packageName")
  @Named("package_name")
  public static void injectPackageName(SplashActivity instance, String packageName) {
    instance.packageName = packageName;
  }

  @InjectedFieldSignature("com.easyplex.ui.splash.SplashActivity.checkVpn")
  @Named("vpn")
  public static void injectCheckVpn(SplashActivity instance, boolean checkVpn) {
    instance.checkVpn = checkVpn;
  }

  @InjectedFieldSignature("com.easyplex.ui.splash.SplashActivity.provideFirebaseRemoteConfig")
  @Named("firebaseRemoteUrl")
  public static void injectProvideFirebaseRemoteConfig(SplashActivity instance,
      FirebaseRemoteConfig provideFirebaseRemoteConfig) {
    instance.provideFirebaseRemoteConfig = provideFirebaseRemoteConfig;
  }
}
