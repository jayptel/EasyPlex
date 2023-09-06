package com.easyplex.ui.moviedetails;

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
public final class MovieDetailsActivity_MembersInjector implements MembersInjector<MovieDetailsActivity> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  private final Provider<SharedPreferences> sharedPreferencesProvider;

  private final Provider<SharedPreferences.Editor> sharedPreferencesEditorProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  private final Provider<SettingsRepository> settingsRepositoryProvider;

  private final Provider<AuthRepository> authRepositoryProvider;

  private final Provider<MediaRepository> mediaRepositoryProvider;

  private final Provider<Boolean> settingReadyProvider;

  private final Provider<String> cuePointProvider;

  private final Provider<String> cuepointUrlProvider;

  private final Provider<AuthManager> authManagerProvider;

  private final Provider<String> cuePointYProvider;

  private final Provider<String> cuePointNProvider;

  private final Provider<String> cuePointWProvider;

  private final Provider<String> cuePointZProvider;

  private final Provider<Boolean> checkVpnProvider;

  private final Provider<ApplicationInfo> provideSnifferCheckProvider;

  private final Provider<ApplicationInfo> provideRootCheckProvider;

  private final Provider<TokenManager> tokenManagerProvider;

  public MovieDetailsActivity_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<SharedPreferences> sharedPreferencesProvider,
      Provider<SharedPreferences.Editor> sharedPreferencesEditorProvider,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<SettingsRepository> settingsRepositoryProvider,
      Provider<AuthRepository> authRepositoryProvider,
      Provider<MediaRepository> mediaRepositoryProvider, Provider<Boolean> settingReadyProvider,
      Provider<String> cuePointProvider, Provider<String> cuepointUrlProvider,
      Provider<AuthManager> authManagerProvider, Provider<String> cuePointYProvider,
      Provider<String> cuePointNProvider, Provider<String> cuePointWProvider,
      Provider<String> cuePointZProvider, Provider<Boolean> checkVpnProvider,
      Provider<ApplicationInfo> provideSnifferCheckProvider,
      Provider<ApplicationInfo> provideRootCheckProvider,
      Provider<TokenManager> tokenManagerProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.sharedPreferencesProvider = sharedPreferencesProvider;
    this.sharedPreferencesEditorProvider = sharedPreferencesEditorProvider;
    this.settingsManagerProvider = settingsManagerProvider;
    this.settingsRepositoryProvider = settingsRepositoryProvider;
    this.authRepositoryProvider = authRepositoryProvider;
    this.mediaRepositoryProvider = mediaRepositoryProvider;
    this.settingReadyProvider = settingReadyProvider;
    this.cuePointProvider = cuePointProvider;
    this.cuepointUrlProvider = cuepointUrlProvider;
    this.authManagerProvider = authManagerProvider;
    this.cuePointYProvider = cuePointYProvider;
    this.cuePointNProvider = cuePointNProvider;
    this.cuePointWProvider = cuePointWProvider;
    this.cuePointZProvider = cuePointZProvider;
    this.checkVpnProvider = checkVpnProvider;
    this.provideSnifferCheckProvider = provideSnifferCheckProvider;
    this.provideRootCheckProvider = provideRootCheckProvider;
    this.tokenManagerProvider = tokenManagerProvider;
  }

  public static MembersInjector<MovieDetailsActivity> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<SharedPreferences> sharedPreferencesProvider,
      Provider<SharedPreferences.Editor> sharedPreferencesEditorProvider,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<SettingsRepository> settingsRepositoryProvider,
      Provider<AuthRepository> authRepositoryProvider,
      Provider<MediaRepository> mediaRepositoryProvider, Provider<Boolean> settingReadyProvider,
      Provider<String> cuePointProvider, Provider<String> cuepointUrlProvider,
      Provider<AuthManager> authManagerProvider, Provider<String> cuePointYProvider,
      Provider<String> cuePointNProvider, Provider<String> cuePointWProvider,
      Provider<String> cuePointZProvider, Provider<Boolean> checkVpnProvider,
      Provider<ApplicationInfo> provideSnifferCheckProvider,
      Provider<ApplicationInfo> provideRootCheckProvider,
      Provider<TokenManager> tokenManagerProvider) {
    return new MovieDetailsActivity_MembersInjector(viewModelFactoryProvider, sharedPreferencesProvider, sharedPreferencesEditorProvider, settingsManagerProvider, settingsRepositoryProvider, authRepositoryProvider, mediaRepositoryProvider, settingReadyProvider, cuePointProvider, cuepointUrlProvider, authManagerProvider, cuePointYProvider, cuePointNProvider, cuePointWProvider, cuePointZProvider, checkVpnProvider, provideSnifferCheckProvider, provideRootCheckProvider, tokenManagerProvider);
  }

  @Override
  public void injectMembers(MovieDetailsActivity instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectSharedPreferences(instance, sharedPreferencesProvider.get());
    injectSharedPreferencesEditor(instance, sharedPreferencesEditorProvider.get());
    injectSettingsManager(instance, settingsManagerProvider.get());
    injectSettingsRepository(instance, settingsRepositoryProvider.get());
    injectAuthRepository(instance, authRepositoryProvider.get());
    injectMediaRepository(instance, mediaRepositoryProvider.get());
    injectSettingReady(instance, settingReadyProvider.get());
    injectCuePoint(instance, cuePointProvider.get());
    injectCuepointUrl(instance, cuepointUrlProvider.get());
    injectAuthManager(instance, authManagerProvider.get());
    injectCuePointY(instance, cuePointYProvider.get());
    injectCuePointN(instance, cuePointNProvider.get());
    injectCuePointW(instance, cuePointWProvider.get());
    injectCuePointZ(instance, cuePointZProvider.get());
    injectCheckVpn(instance, checkVpnProvider.get());
    injectProvideSnifferCheck(instance, provideSnifferCheckProvider.get());
    injectProvideRootCheck(instance, provideRootCheckProvider.get());
    injectTokenManager(instance, tokenManagerProvider.get());
  }

  @InjectedFieldSignature("com.easyplex.ui.moviedetails.MovieDetailsActivity.viewModelFactory")
  public static void injectViewModelFactory(MovieDetailsActivity instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }

  @InjectedFieldSignature("com.easyplex.ui.moviedetails.MovieDetailsActivity.sharedPreferences")
  public static void injectSharedPreferences(MovieDetailsActivity instance,
      SharedPreferences sharedPreferences) {
    instance.sharedPreferences = sharedPreferences;
  }

  @InjectedFieldSignature("com.easyplex.ui.moviedetails.MovieDetailsActivity.sharedPreferencesEditor")
  public static void injectSharedPreferencesEditor(MovieDetailsActivity instance,
      SharedPreferences.Editor sharedPreferencesEditor) {
    instance.sharedPreferencesEditor = sharedPreferencesEditor;
  }

  @InjectedFieldSignature("com.easyplex.ui.moviedetails.MovieDetailsActivity.settingsManager")
  public static void injectSettingsManager(MovieDetailsActivity instance,
      SettingsManager settingsManager) {
    instance.settingsManager = settingsManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.moviedetails.MovieDetailsActivity.settingsRepository")
  public static void injectSettingsRepository(MovieDetailsActivity instance,
      SettingsRepository settingsRepository) {
    instance.settingsRepository = settingsRepository;
  }

  @InjectedFieldSignature("com.easyplex.ui.moviedetails.MovieDetailsActivity.authRepository")
  public static void injectAuthRepository(MovieDetailsActivity instance,
      AuthRepository authRepository) {
    instance.authRepository = authRepository;
  }

  @InjectedFieldSignature("com.easyplex.ui.moviedetails.MovieDetailsActivity.mediaRepository")
  public static void injectMediaRepository(MovieDetailsActivity instance,
      MediaRepository mediaRepository) {
    instance.mediaRepository = mediaRepository;
  }

  @InjectedFieldSignature("com.easyplex.ui.moviedetails.MovieDetailsActivity.settingReady")
  @Named("ready")
  public static void injectSettingReady(MovieDetailsActivity instance, boolean settingReady) {
    instance.settingReady = settingReady;
  }

  @InjectedFieldSignature("com.easyplex.ui.moviedetails.MovieDetailsActivity.cuePoint")
  @Named("cuepoint")
  public static void injectCuePoint(MovieDetailsActivity instance, String cuePoint) {
    instance.cuePoint = cuePoint;
  }

  @InjectedFieldSignature("com.easyplex.ui.moviedetails.MovieDetailsActivity.cuepointUrl")
  @Named("cuepointUrl")
  public static void injectCuepointUrl(MovieDetailsActivity instance, String cuepointUrl) {
    instance.cuepointUrl = cuepointUrl;
  }

  @InjectedFieldSignature("com.easyplex.ui.moviedetails.MovieDetailsActivity.authManager")
  public static void injectAuthManager(MovieDetailsActivity instance, AuthManager authManager) {
    instance.authManager = authManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.moviedetails.MovieDetailsActivity.cuePointY")
  @Named("cuepointY")
  public static void injectCuePointY(MovieDetailsActivity instance, String cuePointY) {
    instance.cuePointY = cuePointY;
  }

  @InjectedFieldSignature("com.easyplex.ui.moviedetails.MovieDetailsActivity.cuePointN")
  @Named("cuepointN")
  public static void injectCuePointN(MovieDetailsActivity instance, String cuePointN) {
    instance.cuePointN = cuePointN;
  }

  @InjectedFieldSignature("com.easyplex.ui.moviedetails.MovieDetailsActivity.cuePointW")
  @Named("cuepointW")
  public static void injectCuePointW(MovieDetailsActivity instance, String cuePointW) {
    instance.cuePointW = cuePointW;
  }

  @InjectedFieldSignature("com.easyplex.ui.moviedetails.MovieDetailsActivity.cuePointZ")
  @Named("cuepointZ")
  public static void injectCuePointZ(MovieDetailsActivity instance, String cuePointZ) {
    instance.cuePointZ = cuePointZ;
  }

  @InjectedFieldSignature("com.easyplex.ui.moviedetails.MovieDetailsActivity.checkVpn")
  @Named("vpn")
  public static void injectCheckVpn(MovieDetailsActivity instance, boolean checkVpn) {
    instance.checkVpn = checkVpn;
  }

  @InjectedFieldSignature("com.easyplex.ui.moviedetails.MovieDetailsActivity.provideSnifferCheck")
  @Named("sniffer")
  public static void injectProvideSnifferCheck(MovieDetailsActivity instance,
      ApplicationInfo provideSnifferCheck) {
    instance.provideSnifferCheck = provideSnifferCheck;
  }

  @InjectedFieldSignature("com.easyplex.ui.moviedetails.MovieDetailsActivity.provideRootCheck")
  @Named("root")
  public static void injectProvideRootCheck(MovieDetailsActivity instance,
      ApplicationInfo provideRootCheck) {
    instance.provideRootCheck = provideRootCheck;
  }

  @InjectedFieldSignature("com.easyplex.ui.moviedetails.MovieDetailsActivity.tokenManager")
  public static void injectTokenManager(MovieDetailsActivity instance, TokenManager tokenManager) {
    instance.tokenManager = tokenManager;
  }
}
