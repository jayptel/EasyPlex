package com.easyplex.ui.seriedetails;

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
public final class SerieDetailsActivity_MembersInjector implements MembersInjector<SerieDetailsActivity> {
  private final Provider<Boolean> checkVpnProvider;

  private final Provider<ApplicationInfo> provideRootCheckProvider;

  private final Provider<ApplicationInfo> provideSnifferCheckProvider;

  private final Provider<MediaRepository> mediaRepositoryProvider;

  private final Provider<Boolean> settingReadyProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  private final Provider<TokenManager> tokenManagerProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  private final Provider<SharedPreferences> sharedPreferencesProvider;

  private final Provider<AuthManager> authManagerProvider;

  private final Provider<AuthRepository> authRepositoryProvider;

  private final Provider<String> cuepointUrlProvider;

  private final Provider<String> cuePointProvider;

  private final Provider<String> cuePointYProvider;

  private final Provider<String> cuePointNProvider;

  private final Provider<SharedPreferences.Editor> sharedPreferencesEditorProvider;

  private final Provider<MediaRepository> repositoryProvider;

  private final Provider<SettingsRepository> settingsRepositoryProvider;

  public SerieDetailsActivity_MembersInjector(Provider<Boolean> checkVpnProvider,
      Provider<ApplicationInfo> provideRootCheckProvider,
      Provider<ApplicationInfo> provideSnifferCheckProvider,
      Provider<MediaRepository> mediaRepositoryProvider, Provider<Boolean> settingReadyProvider,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<TokenManager> tokenManagerProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<SharedPreferences> sharedPreferencesProvider,
      Provider<AuthManager> authManagerProvider, Provider<AuthRepository> authRepositoryProvider,
      Provider<String> cuepointUrlProvider, Provider<String> cuePointProvider,
      Provider<String> cuePointYProvider, Provider<String> cuePointNProvider,
      Provider<SharedPreferences.Editor> sharedPreferencesEditorProvider,
      Provider<MediaRepository> repositoryProvider,
      Provider<SettingsRepository> settingsRepositoryProvider) {
    this.checkVpnProvider = checkVpnProvider;
    this.provideRootCheckProvider = provideRootCheckProvider;
    this.provideSnifferCheckProvider = provideSnifferCheckProvider;
    this.mediaRepositoryProvider = mediaRepositoryProvider;
    this.settingReadyProvider = settingReadyProvider;
    this.settingsManagerProvider = settingsManagerProvider;
    this.tokenManagerProvider = tokenManagerProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.sharedPreferencesProvider = sharedPreferencesProvider;
    this.authManagerProvider = authManagerProvider;
    this.authRepositoryProvider = authRepositoryProvider;
    this.cuepointUrlProvider = cuepointUrlProvider;
    this.cuePointProvider = cuePointProvider;
    this.cuePointYProvider = cuePointYProvider;
    this.cuePointNProvider = cuePointNProvider;
    this.sharedPreferencesEditorProvider = sharedPreferencesEditorProvider;
    this.repositoryProvider = repositoryProvider;
    this.settingsRepositoryProvider = settingsRepositoryProvider;
  }

  public static MembersInjector<SerieDetailsActivity> create(Provider<Boolean> checkVpnProvider,
      Provider<ApplicationInfo> provideRootCheckProvider,
      Provider<ApplicationInfo> provideSnifferCheckProvider,
      Provider<MediaRepository> mediaRepositoryProvider, Provider<Boolean> settingReadyProvider,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<TokenManager> tokenManagerProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<SharedPreferences> sharedPreferencesProvider,
      Provider<AuthManager> authManagerProvider, Provider<AuthRepository> authRepositoryProvider,
      Provider<String> cuepointUrlProvider, Provider<String> cuePointProvider,
      Provider<String> cuePointYProvider, Provider<String> cuePointNProvider,
      Provider<SharedPreferences.Editor> sharedPreferencesEditorProvider,
      Provider<MediaRepository> repositoryProvider,
      Provider<SettingsRepository> settingsRepositoryProvider) {
    return new SerieDetailsActivity_MembersInjector(checkVpnProvider, provideRootCheckProvider, provideSnifferCheckProvider, mediaRepositoryProvider, settingReadyProvider, settingsManagerProvider, tokenManagerProvider, viewModelFactoryProvider, sharedPreferencesProvider, authManagerProvider, authRepositoryProvider, cuepointUrlProvider, cuePointProvider, cuePointYProvider, cuePointNProvider, sharedPreferencesEditorProvider, repositoryProvider, settingsRepositoryProvider);
  }

  @Override
  public void injectMembers(SerieDetailsActivity instance) {
    injectCheckVpn(instance, checkVpnProvider.get());
    injectProvideRootCheck(instance, provideRootCheckProvider.get());
    injectProvideSnifferCheck(instance, provideSnifferCheckProvider.get());
    injectMediaRepository(instance, mediaRepositoryProvider.get());
    injectSettingReady(instance, settingReadyProvider.get());
    injectSettingsManager(instance, settingsManagerProvider.get());
    injectTokenManager(instance, tokenManagerProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectSharedPreferences(instance, sharedPreferencesProvider.get());
    injectAuthManager(instance, authManagerProvider.get());
    injectAuthRepository(instance, authRepositoryProvider.get());
    injectCuepointUrl(instance, cuepointUrlProvider.get());
    injectCuePoint(instance, cuePointProvider.get());
    injectCuePointY(instance, cuePointYProvider.get());
    injectCuePointN(instance, cuePointNProvider.get());
    injectSharedPreferencesEditor(instance, sharedPreferencesEditorProvider.get());
    injectRepository(instance, repositoryProvider.get());
    injectSettingsRepository(instance, settingsRepositoryProvider.get());
  }

  @InjectedFieldSignature("com.easyplex.ui.seriedetails.SerieDetailsActivity.checkVpn")
  @Named("vpn")
  public static void injectCheckVpn(SerieDetailsActivity instance, boolean checkVpn) {
    instance.checkVpn = checkVpn;
  }

  @InjectedFieldSignature("com.easyplex.ui.seriedetails.SerieDetailsActivity.provideRootCheck")
  @Named("root")
  public static void injectProvideRootCheck(SerieDetailsActivity instance,
      ApplicationInfo provideRootCheck) {
    instance.provideRootCheck = provideRootCheck;
  }

  @InjectedFieldSignature("com.easyplex.ui.seriedetails.SerieDetailsActivity.provideSnifferCheck")
  @Named("sniffer")
  public static void injectProvideSnifferCheck(SerieDetailsActivity instance,
      ApplicationInfo provideSnifferCheck) {
    instance.provideSnifferCheck = provideSnifferCheck;
  }

  @InjectedFieldSignature("com.easyplex.ui.seriedetails.SerieDetailsActivity.mediaRepository")
  public static void injectMediaRepository(SerieDetailsActivity instance,
      MediaRepository mediaRepository) {
    instance.mediaRepository = mediaRepository;
  }

  @InjectedFieldSignature("com.easyplex.ui.seriedetails.SerieDetailsActivity.settingReady")
  @Named("ready")
  public static void injectSettingReady(SerieDetailsActivity instance, boolean settingReady) {
    instance.settingReady = settingReady;
  }

  @InjectedFieldSignature("com.easyplex.ui.seriedetails.SerieDetailsActivity.settingsManager")
  public static void injectSettingsManager(SerieDetailsActivity instance,
      SettingsManager settingsManager) {
    instance.settingsManager = settingsManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.seriedetails.SerieDetailsActivity.tokenManager")
  public static void injectTokenManager(SerieDetailsActivity instance, TokenManager tokenManager) {
    instance.tokenManager = tokenManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.seriedetails.SerieDetailsActivity.viewModelFactory")
  public static void injectViewModelFactory(SerieDetailsActivity instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }

  @InjectedFieldSignature("com.easyplex.ui.seriedetails.SerieDetailsActivity.sharedPreferences")
  public static void injectSharedPreferences(SerieDetailsActivity instance,
      SharedPreferences sharedPreferences) {
    instance.sharedPreferences = sharedPreferences;
  }

  @InjectedFieldSignature("com.easyplex.ui.seriedetails.SerieDetailsActivity.authManager")
  public static void injectAuthManager(SerieDetailsActivity instance, AuthManager authManager) {
    instance.authManager = authManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.seriedetails.SerieDetailsActivity.authRepository")
  public static void injectAuthRepository(SerieDetailsActivity instance,
      AuthRepository authRepository) {
    instance.authRepository = authRepository;
  }

  @InjectedFieldSignature("com.easyplex.ui.seriedetails.SerieDetailsActivity.cuepointUrl")
  @Named("cuepointUrl")
  public static void injectCuepointUrl(SerieDetailsActivity instance, String cuepointUrl) {
    instance.cuepointUrl = cuepointUrl;
  }

  @InjectedFieldSignature("com.easyplex.ui.seriedetails.SerieDetailsActivity.cuePoint")
  @Named("cuepoint")
  public static void injectCuePoint(SerieDetailsActivity instance, String cuePoint) {
    instance.cuePoint = cuePoint;
  }

  @InjectedFieldSignature("com.easyplex.ui.seriedetails.SerieDetailsActivity.cuePointY")
  @Named("cuepointY")
  public static void injectCuePointY(SerieDetailsActivity instance, String cuePointY) {
    instance.cuePointY = cuePointY;
  }

  @InjectedFieldSignature("com.easyplex.ui.seriedetails.SerieDetailsActivity.cuePointN")
  @Named("cuepointN")
  public static void injectCuePointN(SerieDetailsActivity instance, String cuePointN) {
    instance.cuePointN = cuePointN;
  }

  @InjectedFieldSignature("com.easyplex.ui.seriedetails.SerieDetailsActivity.sharedPreferencesEditor")
  public static void injectSharedPreferencesEditor(SerieDetailsActivity instance,
      SharedPreferences.Editor sharedPreferencesEditor) {
    instance.sharedPreferencesEditor = sharedPreferencesEditor;
  }

  @InjectedFieldSignature("com.easyplex.ui.seriedetails.SerieDetailsActivity.repository")
  public static void injectRepository(SerieDetailsActivity instance, MediaRepository repository) {
    instance.repository = repository;
  }

  @InjectedFieldSignature("com.easyplex.ui.seriedetails.SerieDetailsActivity.settingsRepository")
  public static void injectSettingsRepository(SerieDetailsActivity instance,
      SettingsRepository settingsRepository) {
    instance.settingsRepository = settingsRepository;
  }
}
