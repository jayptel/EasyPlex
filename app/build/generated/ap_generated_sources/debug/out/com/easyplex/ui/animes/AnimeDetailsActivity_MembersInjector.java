package com.easyplex.ui.animes;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import androidx.lifecycle.ViewModelProvider;
import com.easyplex.data.repository.AuthRepository;
import com.easyplex.data.repository.MediaRepository;
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
public final class AnimeDetailsActivity_MembersInjector implements MembersInjector<AnimeDetailsActivity> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  private final Provider<AuthRepository> authRepositoryProvider;

  private final Provider<SharedPreferences.Editor> sharedPreferencesEditorProvider;

  private final Provider<Boolean> settingReadyProvider;

  private final Provider<SharedPreferences> sharedPreferencesProvider;

  private final Provider<TokenManager> tokenManagerProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  private final Provider<AuthManager> authManagerProvider;

  private final Provider<MediaRepository> mediaRepositoryProvider;

  private final Provider<Boolean> checkVpnProvider;

  private final Provider<ApplicationInfo> provideSnifferCheckProvider;

  private final Provider<ApplicationInfo> provideRootCheckProvider;

  public AnimeDetailsActivity_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<AuthRepository> authRepositoryProvider,
      Provider<SharedPreferences.Editor> sharedPreferencesEditorProvider,
      Provider<Boolean> settingReadyProvider, Provider<SharedPreferences> sharedPreferencesProvider,
      Provider<TokenManager> tokenManagerProvider,
      Provider<SettingsManager> settingsManagerProvider, Provider<AuthManager> authManagerProvider,
      Provider<MediaRepository> mediaRepositoryProvider, Provider<Boolean> checkVpnProvider,
      Provider<ApplicationInfo> provideSnifferCheckProvider,
      Provider<ApplicationInfo> provideRootCheckProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.authRepositoryProvider = authRepositoryProvider;
    this.sharedPreferencesEditorProvider = sharedPreferencesEditorProvider;
    this.settingReadyProvider = settingReadyProvider;
    this.sharedPreferencesProvider = sharedPreferencesProvider;
    this.tokenManagerProvider = tokenManagerProvider;
    this.settingsManagerProvider = settingsManagerProvider;
    this.authManagerProvider = authManagerProvider;
    this.mediaRepositoryProvider = mediaRepositoryProvider;
    this.checkVpnProvider = checkVpnProvider;
    this.provideSnifferCheckProvider = provideSnifferCheckProvider;
    this.provideRootCheckProvider = provideRootCheckProvider;
  }

  public static MembersInjector<AnimeDetailsActivity> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<AuthRepository> authRepositoryProvider,
      Provider<SharedPreferences.Editor> sharedPreferencesEditorProvider,
      Provider<Boolean> settingReadyProvider, Provider<SharedPreferences> sharedPreferencesProvider,
      Provider<TokenManager> tokenManagerProvider,
      Provider<SettingsManager> settingsManagerProvider, Provider<AuthManager> authManagerProvider,
      Provider<MediaRepository> mediaRepositoryProvider, Provider<Boolean> checkVpnProvider,
      Provider<ApplicationInfo> provideSnifferCheckProvider,
      Provider<ApplicationInfo> provideRootCheckProvider) {
    return new AnimeDetailsActivity_MembersInjector(viewModelFactoryProvider, authRepositoryProvider, sharedPreferencesEditorProvider, settingReadyProvider, sharedPreferencesProvider, tokenManagerProvider, settingsManagerProvider, authManagerProvider, mediaRepositoryProvider, checkVpnProvider, provideSnifferCheckProvider, provideRootCheckProvider);
  }

  @Override
  public void injectMembers(AnimeDetailsActivity instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectAuthRepository(instance, authRepositoryProvider.get());
    injectSharedPreferencesEditor(instance, sharedPreferencesEditorProvider.get());
    injectSettingReady(instance, settingReadyProvider.get());
    injectSharedPreferences(instance, sharedPreferencesProvider.get());
    injectTokenManager(instance, tokenManagerProvider.get());
    injectSettingsManager(instance, settingsManagerProvider.get());
    injectAuthManager(instance, authManagerProvider.get());
    injectMediaRepository(instance, mediaRepositoryProvider.get());
    injectCheckVpn(instance, checkVpnProvider.get());
    injectProvideSnifferCheck(instance, provideSnifferCheckProvider.get());
    injectProvideRootCheck(instance, provideRootCheckProvider.get());
  }

  @InjectedFieldSignature("com.easyplex.ui.animes.AnimeDetailsActivity.viewModelFactory")
  public static void injectViewModelFactory(AnimeDetailsActivity instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }

  @InjectedFieldSignature("com.easyplex.ui.animes.AnimeDetailsActivity.authRepository")
  public static void injectAuthRepository(AnimeDetailsActivity instance,
      AuthRepository authRepository) {
    instance.authRepository = authRepository;
  }

  @InjectedFieldSignature("com.easyplex.ui.animes.AnimeDetailsActivity.sharedPreferencesEditor")
  public static void injectSharedPreferencesEditor(AnimeDetailsActivity instance,
      SharedPreferences.Editor sharedPreferencesEditor) {
    instance.sharedPreferencesEditor = sharedPreferencesEditor;
  }

  @InjectedFieldSignature("com.easyplex.ui.animes.AnimeDetailsActivity.settingReady")
  @Named("ready")
  public static void injectSettingReady(AnimeDetailsActivity instance, boolean settingReady) {
    instance.settingReady = settingReady;
  }

  @InjectedFieldSignature("com.easyplex.ui.animes.AnimeDetailsActivity.sharedPreferences")
  public static void injectSharedPreferences(AnimeDetailsActivity instance,
      SharedPreferences sharedPreferences) {
    instance.sharedPreferences = sharedPreferences;
  }

  @InjectedFieldSignature("com.easyplex.ui.animes.AnimeDetailsActivity.tokenManager")
  public static void injectTokenManager(AnimeDetailsActivity instance, TokenManager tokenManager) {
    instance.tokenManager = tokenManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.animes.AnimeDetailsActivity.settingsManager")
  public static void injectSettingsManager(AnimeDetailsActivity instance,
      SettingsManager settingsManager) {
    instance.settingsManager = settingsManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.animes.AnimeDetailsActivity.authManager")
  public static void injectAuthManager(AnimeDetailsActivity instance, AuthManager authManager) {
    instance.authManager = authManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.animes.AnimeDetailsActivity.mediaRepository")
  public static void injectMediaRepository(AnimeDetailsActivity instance,
      MediaRepository mediaRepository) {
    instance.mediaRepository = mediaRepository;
  }

  @InjectedFieldSignature("com.easyplex.ui.animes.AnimeDetailsActivity.checkVpn")
  @Named("vpn")
  public static void injectCheckVpn(AnimeDetailsActivity instance, boolean checkVpn) {
    instance.checkVpn = checkVpn;
  }

  @InjectedFieldSignature("com.easyplex.ui.animes.AnimeDetailsActivity.provideSnifferCheck")
  @Named("sniffer")
  public static void injectProvideSnifferCheck(AnimeDetailsActivity instance,
      ApplicationInfo provideSnifferCheck) {
    instance.provideSnifferCheck = provideSnifferCheck;
  }

  @InjectedFieldSignature("com.easyplex.ui.animes.AnimeDetailsActivity.provideRootCheck")
  @Named("root")
  public static void injectProvideRootCheck(AnimeDetailsActivity instance,
      ApplicationInfo provideRootCheck) {
    instance.provideRootCheck = provideRootCheck;
  }
}
