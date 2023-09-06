package com.easyplex.ui.player.activities;

import android.content.SharedPreferences;
import androidx.lifecycle.ViewModelProvider;
import com.easyplex.ui.manager.AdsManager;
import com.easyplex.ui.manager.AuthManager;
import com.easyplex.ui.manager.SettingsManager;
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
public final class EasyPlexPlayerActivity_MembersInjector implements MembersInjector<EasyPlexPlayerActivity> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  private final Provider<String> playerReadyProvider;

  private final Provider<Boolean> settingReadyProvider;

  private final Provider<SharedPreferences> sharedPreferencesProvider;

  private final Provider<AuthManager> authManagerProvider;

  private final Provider<AdsManager> adsManagerProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  private final Provider<String> cuepointUrlProvider;

  private final Provider<String> cuePointProvider;

  private final Provider<String> cuePointYProvider;

  private final Provider<String> cuePointNProvider;

  public EasyPlexPlayerActivity_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<String> playerReadyProvider, Provider<Boolean> settingReadyProvider,
      Provider<SharedPreferences> sharedPreferencesProvider,
      Provider<AuthManager> authManagerProvider, Provider<AdsManager> adsManagerProvider,
      Provider<SettingsManager> settingsManagerProvider, Provider<String> cuepointUrlProvider,
      Provider<String> cuePointProvider, Provider<String> cuePointYProvider,
      Provider<String> cuePointNProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.playerReadyProvider = playerReadyProvider;
    this.settingReadyProvider = settingReadyProvider;
    this.sharedPreferencesProvider = sharedPreferencesProvider;
    this.authManagerProvider = authManagerProvider;
    this.adsManagerProvider = adsManagerProvider;
    this.settingsManagerProvider = settingsManagerProvider;
    this.cuepointUrlProvider = cuepointUrlProvider;
    this.cuePointProvider = cuePointProvider;
    this.cuePointYProvider = cuePointYProvider;
    this.cuePointNProvider = cuePointNProvider;
  }

  public static MembersInjector<EasyPlexPlayerActivity> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<String> playerReadyProvider, Provider<Boolean> settingReadyProvider,
      Provider<SharedPreferences> sharedPreferencesProvider,
      Provider<AuthManager> authManagerProvider, Provider<AdsManager> adsManagerProvider,
      Provider<SettingsManager> settingsManagerProvider, Provider<String> cuepointUrlProvider,
      Provider<String> cuePointProvider, Provider<String> cuePointYProvider,
      Provider<String> cuePointNProvider) {
    return new EasyPlexPlayerActivity_MembersInjector(viewModelFactoryProvider, playerReadyProvider, settingReadyProvider, sharedPreferencesProvider, authManagerProvider, adsManagerProvider, settingsManagerProvider, cuepointUrlProvider, cuePointProvider, cuePointYProvider, cuePointNProvider);
  }

  @Override
  public void injectMembers(EasyPlexPlayerActivity instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectPlayerReady(instance, playerReadyProvider.get());
    injectSettingReady(instance, settingReadyProvider.get());
    injectSharedPreferences(instance, sharedPreferencesProvider.get());
    injectAuthManager(instance, authManagerProvider.get());
    injectAdsManager(instance, adsManagerProvider.get());
    injectSettingsManager(instance, settingsManagerProvider.get());
    injectCuepointUrl(instance, cuepointUrlProvider.get());
    injectCuePoint(instance, cuePointProvider.get());
    injectCuePointY(instance, cuePointYProvider.get());
    injectCuePointN(instance, cuePointNProvider.get());
  }

  @InjectedFieldSignature("com.easyplex.ui.player.activities.EasyPlexPlayerActivity.viewModelFactory")
  public static void injectViewModelFactory(EasyPlexPlayerActivity instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }

  @InjectedFieldSignature("com.easyplex.ui.player.activities.EasyPlexPlayerActivity.playerReady")
  @Named("mainplayer")
  public static void injectPlayerReady(EasyPlexPlayerActivity instance, String playerReady) {
    instance.playerReady = playerReady;
  }

  @InjectedFieldSignature("com.easyplex.ui.player.activities.EasyPlexPlayerActivity.settingReady")
  @Named("ready")
  public static void injectSettingReady(EasyPlexPlayerActivity instance, boolean settingReady) {
    instance.settingReady = settingReady;
  }

  @InjectedFieldSignature("com.easyplex.ui.player.activities.EasyPlexPlayerActivity.sharedPreferences")
  public static void injectSharedPreferences(EasyPlexPlayerActivity instance,
      SharedPreferences sharedPreferences) {
    instance.sharedPreferences = sharedPreferences;
  }

  @InjectedFieldSignature("com.easyplex.ui.player.activities.EasyPlexPlayerActivity.authManager")
  public static void injectAuthManager(EasyPlexPlayerActivity instance, AuthManager authManager) {
    instance.authManager = authManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.player.activities.EasyPlexPlayerActivity.adsManager")
  public static void injectAdsManager(EasyPlexPlayerActivity instance, AdsManager adsManager) {
    instance.adsManager = adsManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.player.activities.EasyPlexPlayerActivity.settingsManager")
  public static void injectSettingsManager(EasyPlexPlayerActivity instance,
      SettingsManager settingsManager) {
    instance.settingsManager = settingsManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.player.activities.EasyPlexPlayerActivity.cuepointUrl")
  @Named("cuepointUrl")
  public static void injectCuepointUrl(EasyPlexPlayerActivity instance, String cuepointUrl) {
    instance.cuepointUrl = cuepointUrl;
  }

  @InjectedFieldSignature("com.easyplex.ui.player.activities.EasyPlexPlayerActivity.cuePoint")
  @Named("cuepoint")
  public static void injectCuePoint(EasyPlexPlayerActivity instance, String cuePoint) {
    instance.cuePoint = cuePoint;
  }

  @InjectedFieldSignature("com.easyplex.ui.player.activities.EasyPlexPlayerActivity.cuePointY")
  @Named("cuepointY")
  public static void injectCuePointY(EasyPlexPlayerActivity instance, String cuePointY) {
    instance.cuePointY = cuePointY;
  }

  @InjectedFieldSignature("com.easyplex.ui.player.activities.EasyPlexPlayerActivity.cuePointN")
  @Named("cuepointN")
  public static void injectCuePointN(EasyPlexPlayerActivity instance, String cuePointN) {
    instance.cuePointN = cuePointN;
  }
}
