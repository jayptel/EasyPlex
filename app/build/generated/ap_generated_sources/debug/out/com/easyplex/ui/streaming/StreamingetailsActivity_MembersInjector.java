package com.easyplex.ui.streaming;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import androidx.lifecycle.ViewModelProvider;
import com.easyplex.data.repository.AuthRepository;
import com.easyplex.data.repository.MediaRepository;
import com.easyplex.data.repository.SettingsRepository;
import com.easyplex.ui.manager.AuthManager;
import com.easyplex.ui.manager.SettingsManager;
import com.easyplex.ui.manager.TokenManager;
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
public final class StreamingetailsActivity_MembersInjector implements MembersInjector<StreamingetailsActivity> {
  private final Provider<Boolean> checkVpnProvider;

  private final Provider<ApplicationInfo> provideSnifferCheckProvider;

  private final Provider<ApplicationInfo> provideRootCheckProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  private final Provider<SharedPreferences> sharedPreferencesProvider;

  private final Provider<Boolean> settingReadyProvider;

  private final Provider<SharedPreferences.Editor> sharedPreferencesEditorProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  private final Provider<SettingsRepository> settingsRepositoryProvider;

  private final Provider<AuthRepository> authRepositoryProvider;

  private final Provider<MediaRepository> mediaRepositoryProvider;

  private final Provider<String> cuePointProvider;

  private final Provider<String> cuepointUrlProvider;

  private final Provider<AuthManager> authManagerProvider;

  private final Provider<String> cuePointYProvider;

  private final Provider<String> cuePointNProvider;

  private final Provider<String> cuePointWProvider;

  private final Provider<String> cuePointZProvider;

  private final Provider<TokenManager> tokenManagerProvider;

  public StreamingetailsActivity_MembersInjector(Provider<Boolean> checkVpnProvider,
      Provider<ApplicationInfo> provideSnifferCheckProvider,
      Provider<ApplicationInfo> provideRootCheckProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<SharedPreferences> sharedPreferencesProvider, Provider<Boolean> settingReadyProvider,
      Provider<SharedPreferences.Editor> sharedPreferencesEditorProvider,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<SettingsRepository> settingsRepositoryProvider,
      Provider<AuthRepository> authRepositoryProvider,
      Provider<MediaRepository> mediaRepositoryProvider, Provider<String> cuePointProvider,
      Provider<String> cuepointUrlProvider, Provider<AuthManager> authManagerProvider,
      Provider<String> cuePointYProvider, Provider<String> cuePointNProvider,
      Provider<String> cuePointWProvider, Provider<String> cuePointZProvider,
      Provider<TokenManager> tokenManagerProvider) {
    this.checkVpnProvider = checkVpnProvider;
    this.provideSnifferCheckProvider = provideSnifferCheckProvider;
    this.provideRootCheckProvider = provideRootCheckProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.sharedPreferencesProvider = sharedPreferencesProvider;
    this.settingReadyProvider = settingReadyProvider;
    this.sharedPreferencesEditorProvider = sharedPreferencesEditorProvider;
    this.settingsManagerProvider = settingsManagerProvider;
    this.settingsRepositoryProvider = settingsRepositoryProvider;
    this.authRepositoryProvider = authRepositoryProvider;
    this.mediaRepositoryProvider = mediaRepositoryProvider;
    this.cuePointProvider = cuePointProvider;
    this.cuepointUrlProvider = cuepointUrlProvider;
    this.authManagerProvider = authManagerProvider;
    this.cuePointYProvider = cuePointYProvider;
    this.cuePointNProvider = cuePointNProvider;
    this.cuePointWProvider = cuePointWProvider;
    this.cuePointZProvider = cuePointZProvider;
    this.tokenManagerProvider = tokenManagerProvider;
  }

  public static MembersInjector<StreamingetailsActivity> create(Provider<Boolean> checkVpnProvider,
      Provider<ApplicationInfo> provideSnifferCheckProvider,
      Provider<ApplicationInfo> provideRootCheckProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<SharedPreferences> sharedPreferencesProvider, Provider<Boolean> settingReadyProvider,
      Provider<SharedPreferences.Editor> sharedPreferencesEditorProvider,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<SettingsRepository> settingsRepositoryProvider,
      Provider<AuthRepository> authRepositoryProvider,
      Provider<MediaRepository> mediaRepositoryProvider, Provider<String> cuePointProvider,
      Provider<String> cuepointUrlProvider, Provider<AuthManager> authManagerProvider,
      Provider<String> cuePointYProvider, Provider<String> cuePointNProvider,
      Provider<String> cuePointWProvider, Provider<String> cuePointZProvider,
      Provider<TokenManager> tokenManagerProvider) {
    return new StreamingetailsActivity_MembersInjector(checkVpnProvider, provideSnifferCheckProvider, provideRootCheckProvider, viewModelFactoryProvider, sharedPreferencesProvider, settingReadyProvider, sharedPreferencesEditorProvider, settingsManagerProvider, settingsRepositoryProvider, authRepositoryProvider, mediaRepositoryProvider, cuePointProvider, cuepointUrlProvider, authManagerProvider, cuePointYProvider, cuePointNProvider, cuePointWProvider, cuePointZProvider, tokenManagerProvider);
  }

  @Override
  public void injectMembers(StreamingetailsActivity instance) {
    injectCheckVpn(instance, checkVpnProvider.get());
    injectProvideSnifferCheck(instance, provideSnifferCheckProvider.get());
    injectProvideRootCheck(instance, provideRootCheckProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectSharedPreferences(instance, sharedPreferencesProvider.get());
    injectSettingReady(instance, settingReadyProvider.get());
    injectSharedPreferencesEditor(instance, sharedPreferencesEditorProvider.get());
    injectSettingsManager(instance, settingsManagerProvider.get());
    injectSettingsRepository(instance, settingsRepositoryProvider.get());
    injectAuthRepository(instance, authRepositoryProvider.get());
    injectMediaRepository(instance, mediaRepositoryProvider.get());
    injectCuePoint(instance, cuePointProvider.get());
    injectCuepointUrl(instance, cuepointUrlProvider.get());
    injectAuthManager(instance, authManagerProvider.get());
    injectCuePointY(instance, cuePointYProvider.get());
    injectCuePointN(instance, cuePointNProvider.get());
    injectCuePointW(instance, cuePointWProvider.get());
    injectCuePointZ(instance, cuePointZProvider.get());
    injectTokenManager(instance, tokenManagerProvider.get());
  }

  @InjectedFieldSignature("com.easyplex.ui.streaming.StreamingetailsActivity.checkVpn")
  @Named("vpn")
  public static void injectCheckVpn(StreamingetailsActivity instance, boolean checkVpn) {
    instance.checkVpn = checkVpn;
  }

  @InjectedFieldSignature("com.easyplex.ui.streaming.StreamingetailsActivity.provideSnifferCheck")
  @Named("sniffer")
  public static void injectProvideSnifferCheck(StreamingetailsActivity instance,
      ApplicationInfo provideSnifferCheck) {
    instance.provideSnifferCheck = provideSnifferCheck;
  }

  @InjectedFieldSignature("com.easyplex.ui.streaming.StreamingetailsActivity.provideRootCheck")
  @Named("root")
  public static void injectProvideRootCheck(StreamingetailsActivity instance,
      ApplicationInfo provideRootCheck) {
    instance.provideRootCheck = provideRootCheck;
  }

  @InjectedFieldSignature("com.easyplex.ui.streaming.StreamingetailsActivity.viewModelFactory")
  public static void injectViewModelFactory(StreamingetailsActivity instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }

  @InjectedFieldSignature("com.easyplex.ui.streaming.StreamingetailsActivity.sharedPreferences")
  public static void injectSharedPreferences(StreamingetailsActivity instance,
      SharedPreferences sharedPreferences) {
    instance.sharedPreferences = sharedPreferences;
  }

  @InjectedFieldSignature("com.easyplex.ui.streaming.StreamingetailsActivity.settingReady")
  @Named("ready")
  public static void injectSettingReady(StreamingetailsActivity instance, boolean settingReady) {
    instance.settingReady = settingReady;
  }

  @InjectedFieldSignature("com.easyplex.ui.streaming.StreamingetailsActivity.sharedPreferencesEditor")
  public static void injectSharedPreferencesEditor(StreamingetailsActivity instance,
      SharedPreferences.Editor sharedPreferencesEditor) {
    instance.sharedPreferencesEditor = sharedPreferencesEditor;
  }

  @InjectedFieldSignature("com.easyplex.ui.streaming.StreamingetailsActivity.settingsManager")
  public static void injectSettingsManager(StreamingetailsActivity instance,
      SettingsManager settingsManager) {
    instance.settingsManager = settingsManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.streaming.StreamingetailsActivity.settingsRepository")
  public static void injectSettingsRepository(StreamingetailsActivity instance,
      SettingsRepository settingsRepository) {
    instance.settingsRepository = settingsRepository;
  }

  @InjectedFieldSignature("com.easyplex.ui.streaming.StreamingetailsActivity.authRepository")
  public static void injectAuthRepository(StreamingetailsActivity instance,
      AuthRepository authRepository) {
    instance.authRepository = authRepository;
  }

  @InjectedFieldSignature("com.easyplex.ui.streaming.StreamingetailsActivity.mediaRepository")
  public static void injectMediaRepository(StreamingetailsActivity instance,
      MediaRepository mediaRepository) {
    instance.mediaRepository = mediaRepository;
  }

  @InjectedFieldSignature("com.easyplex.ui.streaming.StreamingetailsActivity.cuePoint")
  @Named("cuepoint")
  public static void injectCuePoint(StreamingetailsActivity instance, String cuePoint) {
    instance.cuePoint = cuePoint;
  }

  @InjectedFieldSignature("com.easyplex.ui.streaming.StreamingetailsActivity.cuepointUrl")
  @Named("cuepointUrl")
  public static void injectCuepointUrl(StreamingetailsActivity instance, String cuepointUrl) {
    instance.cuepointUrl = cuepointUrl;
  }

  @InjectedFieldSignature("com.easyplex.ui.streaming.StreamingetailsActivity.authManager")
  public static void injectAuthManager(StreamingetailsActivity instance, AuthManager authManager) {
    instance.authManager = authManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.streaming.StreamingetailsActivity.cuePointY")
  @Named("cuepointY")
  public static void injectCuePointY(StreamingetailsActivity instance, String cuePointY) {
    instance.cuePointY = cuePointY;
  }

  @InjectedFieldSignature("com.easyplex.ui.streaming.StreamingetailsActivity.cuePointN")
  @Named("cuepointN")
  public static void injectCuePointN(StreamingetailsActivity instance, String cuePointN) {
    instance.cuePointN = cuePointN;
  }

  @InjectedFieldSignature("com.easyplex.ui.streaming.StreamingetailsActivity.cuePointW")
  @Named("cuepointW")
  public static void injectCuePointW(StreamingetailsActivity instance, String cuePointW) {
    instance.cuePointW = cuePointW;
  }

  @InjectedFieldSignature("com.easyplex.ui.streaming.StreamingetailsActivity.cuePointZ")
  @Named("cuepointZ")
  public static void injectCuePointZ(StreamingetailsActivity instance, String cuePointZ) {
    instance.cuePointZ = cuePointZ;
  }

  @InjectedFieldSignature("com.easyplex.ui.streaming.StreamingetailsActivity.tokenManager")
  public static void injectTokenManager(StreamingetailsActivity instance,
      TokenManager tokenManager) {
    instance.tokenManager = tokenManager;
  }
}
