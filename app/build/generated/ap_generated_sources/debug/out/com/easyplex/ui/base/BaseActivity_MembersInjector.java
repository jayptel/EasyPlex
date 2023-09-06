package com.easyplex.ui.base;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import androidx.lifecycle.ViewModelProvider;
import com.easyplex.data.repository.AuthRepository;
import com.easyplex.data.repository.MediaRepository;
import com.easyplex.ui.manager.AdsManager;
import com.easyplex.ui.manager.AuthManager;
import com.easyplex.ui.manager.SettingsManager;
import com.easyplex.ui.manager.StatusManager;
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
public final class BaseActivity_MembersInjector implements MembersInjector<BaseActivity> {
  private final Provider<ApplicationInfo> provideSnifferCheckProvider;

  private final Provider<ApplicationInfo> provideRootCheckProvider;

  private final Provider<Boolean> checkVpnProvider;

  private final Provider<MediaRepository> repositoryProvider;

  private final Provider<TokenManager> tokenManagerProvider;

  private final Provider<AuthRepository> authRepositoryProvider;

  private final Provider<Boolean> settingReadyProvider;

  private final Provider<AuthManager> authManagerProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  private final Provider<AdsManager> adsManagerProvider;

  private final Provider<StatusManager> statusManagerProvider;

  private final Provider<SharedPreferences> sharedPreferencesProvider;

  private final Provider<SharedPreferences.Editor> editorProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public BaseActivity_MembersInjector(Provider<ApplicationInfo> provideSnifferCheckProvider,
      Provider<ApplicationInfo> provideRootCheckProvider, Provider<Boolean> checkVpnProvider,
      Provider<MediaRepository> repositoryProvider, Provider<TokenManager> tokenManagerProvider,
      Provider<AuthRepository> authRepositoryProvider, Provider<Boolean> settingReadyProvider,
      Provider<AuthManager> authManagerProvider, Provider<SettingsManager> settingsManagerProvider,
      Provider<AdsManager> adsManagerProvider, Provider<StatusManager> statusManagerProvider,
      Provider<SharedPreferences> sharedPreferencesProvider,
      Provider<SharedPreferences.Editor> editorProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.provideSnifferCheckProvider = provideSnifferCheckProvider;
    this.provideRootCheckProvider = provideRootCheckProvider;
    this.checkVpnProvider = checkVpnProvider;
    this.repositoryProvider = repositoryProvider;
    this.tokenManagerProvider = tokenManagerProvider;
    this.authRepositoryProvider = authRepositoryProvider;
    this.settingReadyProvider = settingReadyProvider;
    this.authManagerProvider = authManagerProvider;
    this.settingsManagerProvider = settingsManagerProvider;
    this.adsManagerProvider = adsManagerProvider;
    this.statusManagerProvider = statusManagerProvider;
    this.sharedPreferencesProvider = sharedPreferencesProvider;
    this.editorProvider = editorProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<BaseActivity> create(
      Provider<ApplicationInfo> provideSnifferCheckProvider,
      Provider<ApplicationInfo> provideRootCheckProvider, Provider<Boolean> checkVpnProvider,
      Provider<MediaRepository> repositoryProvider, Provider<TokenManager> tokenManagerProvider,
      Provider<AuthRepository> authRepositoryProvider, Provider<Boolean> settingReadyProvider,
      Provider<AuthManager> authManagerProvider, Provider<SettingsManager> settingsManagerProvider,
      Provider<AdsManager> adsManagerProvider, Provider<StatusManager> statusManagerProvider,
      Provider<SharedPreferences> sharedPreferencesProvider,
      Provider<SharedPreferences.Editor> editorProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new BaseActivity_MembersInjector(provideSnifferCheckProvider, provideRootCheckProvider, checkVpnProvider, repositoryProvider, tokenManagerProvider, authRepositoryProvider, settingReadyProvider, authManagerProvider, settingsManagerProvider, adsManagerProvider, statusManagerProvider, sharedPreferencesProvider, editorProvider, viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(BaseActivity instance) {
    injectProvideSnifferCheck(instance, provideSnifferCheckProvider.get());
    injectProvideRootCheck(instance, provideRootCheckProvider.get());
    injectCheckVpn(instance, checkVpnProvider.get());
    injectRepository(instance, repositoryProvider.get());
    injectTokenManager(instance, tokenManagerProvider.get());
    injectAuthRepository(instance, authRepositoryProvider.get());
    injectSettingReady(instance, settingReadyProvider.get());
    injectAuthManager(instance, authManagerProvider.get());
    injectSettingsManager(instance, settingsManagerProvider.get());
    injectAdsManager(instance, adsManagerProvider.get());
    injectStatusManager(instance, statusManagerProvider.get());
    injectSharedPreferences(instance, sharedPreferencesProvider.get());
    injectEditor(instance, editorProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("com.easyplex.ui.base.BaseActivity.provideSnifferCheck")
  @Named("sniffer")
  public static void injectProvideSnifferCheck(BaseActivity instance,
      ApplicationInfo provideSnifferCheck) {
    instance.provideSnifferCheck = provideSnifferCheck;
  }

  @InjectedFieldSignature("com.easyplex.ui.base.BaseActivity.provideRootCheck")
  @Named("root")
  public static void injectProvideRootCheck(BaseActivity instance,
      ApplicationInfo provideRootCheck) {
    instance.provideRootCheck = provideRootCheck;
  }

  @InjectedFieldSignature("com.easyplex.ui.base.BaseActivity.checkVpn")
  @Named("vpn")
  public static void injectCheckVpn(BaseActivity instance, boolean checkVpn) {
    instance.checkVpn = checkVpn;
  }

  @InjectedFieldSignature("com.easyplex.ui.base.BaseActivity.repository")
  public static void injectRepository(BaseActivity instance, MediaRepository repository) {
    instance.repository = repository;
  }

  @InjectedFieldSignature("com.easyplex.ui.base.BaseActivity.tokenManager")
  public static void injectTokenManager(BaseActivity instance, TokenManager tokenManager) {
    instance.tokenManager = tokenManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.base.BaseActivity.authRepository")
  public static void injectAuthRepository(BaseActivity instance, AuthRepository authRepository) {
    instance.authRepository = authRepository;
  }

  @InjectedFieldSignature("com.easyplex.ui.base.BaseActivity.settingReady")
  @Named("ready")
  public static void injectSettingReady(BaseActivity instance, boolean settingReady) {
    instance.settingReady = settingReady;
  }

  @InjectedFieldSignature("com.easyplex.ui.base.BaseActivity.authManager")
  public static void injectAuthManager(BaseActivity instance, AuthManager authManager) {
    instance.authManager = authManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.base.BaseActivity.settingsManager")
  public static void injectSettingsManager(BaseActivity instance, SettingsManager settingsManager) {
    instance.settingsManager = settingsManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.base.BaseActivity.adsManager")
  public static void injectAdsManager(BaseActivity instance, AdsManager adsManager) {
    instance.adsManager = adsManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.base.BaseActivity.statusManager")
  public static void injectStatusManager(BaseActivity instance, StatusManager statusManager) {
    instance.statusManager = statusManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.base.BaseActivity.sharedPreferences")
  public static void injectSharedPreferences(BaseActivity instance,
      SharedPreferences sharedPreferences) {
    instance.sharedPreferences = sharedPreferences;
  }

  @InjectedFieldSignature("com.easyplex.ui.base.BaseActivity.editor")
  public static void injectEditor(BaseActivity instance, SharedPreferences.Editor editor) {
    instance.editor = editor;
  }

  @InjectedFieldSignature("com.easyplex.ui.base.BaseActivity.viewModelFactory")
  public static void injectViewModelFactory(BaseActivity instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
