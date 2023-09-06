package com.easyplex.ui.casts;

import android.content.SharedPreferences;
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
public final class CastDetailsActivity_MembersInjector implements MembersInjector<CastDetailsActivity> {
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

  private final Provider<TokenManager> tokenManagerProvider;

  public CastDetailsActivity_MembersInjector(
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
      Provider<String> cuePointZProvider, Provider<TokenManager> tokenManagerProvider) {
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
    this.tokenManagerProvider = tokenManagerProvider;
  }

  public static MembersInjector<CastDetailsActivity> create(
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
      Provider<String> cuePointZProvider, Provider<TokenManager> tokenManagerProvider) {
    return new CastDetailsActivity_MembersInjector(viewModelFactoryProvider, sharedPreferencesProvider, sharedPreferencesEditorProvider, settingsManagerProvider, settingsRepositoryProvider, authRepositoryProvider, mediaRepositoryProvider, settingReadyProvider, cuePointProvider, cuepointUrlProvider, authManagerProvider, cuePointYProvider, cuePointNProvider, cuePointWProvider, cuePointZProvider, tokenManagerProvider);
  }

  @Override
  public void injectMembers(CastDetailsActivity instance) {
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
    injectTokenManager(instance, tokenManagerProvider.get());
  }

  @InjectedFieldSignature("com.easyplex.ui.casts.CastDetailsActivity.viewModelFactory")
  public static void injectViewModelFactory(CastDetailsActivity instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }

  @InjectedFieldSignature("com.easyplex.ui.casts.CastDetailsActivity.sharedPreferences")
  public static void injectSharedPreferences(CastDetailsActivity instance,
      SharedPreferences sharedPreferences) {
    instance.sharedPreferences = sharedPreferences;
  }

  @InjectedFieldSignature("com.easyplex.ui.casts.CastDetailsActivity.sharedPreferencesEditor")
  public static void injectSharedPreferencesEditor(CastDetailsActivity instance,
      SharedPreferences.Editor sharedPreferencesEditor) {
    instance.sharedPreferencesEditor = sharedPreferencesEditor;
  }

  @InjectedFieldSignature("com.easyplex.ui.casts.CastDetailsActivity.settingsManager")
  public static void injectSettingsManager(CastDetailsActivity instance,
      SettingsManager settingsManager) {
    instance.settingsManager = settingsManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.casts.CastDetailsActivity.settingsRepository")
  public static void injectSettingsRepository(CastDetailsActivity instance,
      SettingsRepository settingsRepository) {
    instance.settingsRepository = settingsRepository;
  }

  @InjectedFieldSignature("com.easyplex.ui.casts.CastDetailsActivity.authRepository")
  public static void injectAuthRepository(CastDetailsActivity instance,
      AuthRepository authRepository) {
    instance.authRepository = authRepository;
  }

  @InjectedFieldSignature("com.easyplex.ui.casts.CastDetailsActivity.mediaRepository")
  public static void injectMediaRepository(CastDetailsActivity instance,
      MediaRepository mediaRepository) {
    instance.mediaRepository = mediaRepository;
  }

  @InjectedFieldSignature("com.easyplex.ui.casts.CastDetailsActivity.settingReady")
  @Named("ready")
  public static void injectSettingReady(CastDetailsActivity instance, boolean settingReady) {
    instance.settingReady = settingReady;
  }

  @InjectedFieldSignature("com.easyplex.ui.casts.CastDetailsActivity.cuePoint")
  @Named("cuepoint")
  public static void injectCuePoint(CastDetailsActivity instance, String cuePoint) {
    instance.cuePoint = cuePoint;
  }

  @InjectedFieldSignature("com.easyplex.ui.casts.CastDetailsActivity.cuepointUrl")
  @Named("cuepointUrl")
  public static void injectCuepointUrl(CastDetailsActivity instance, String cuepointUrl) {
    instance.cuepointUrl = cuepointUrl;
  }

  @InjectedFieldSignature("com.easyplex.ui.casts.CastDetailsActivity.authManager")
  public static void injectAuthManager(CastDetailsActivity instance, AuthManager authManager) {
    instance.authManager = authManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.casts.CastDetailsActivity.cuePointY")
  @Named("cuepointY")
  public static void injectCuePointY(CastDetailsActivity instance, String cuePointY) {
    instance.cuePointY = cuePointY;
  }

  @InjectedFieldSignature("com.easyplex.ui.casts.CastDetailsActivity.cuePointN")
  @Named("cuepointN")
  public static void injectCuePointN(CastDetailsActivity instance, String cuePointN) {
    instance.cuePointN = cuePointN;
  }

  @InjectedFieldSignature("com.easyplex.ui.casts.CastDetailsActivity.cuePointW")
  @Named("cuepointW")
  public static void injectCuePointW(CastDetailsActivity instance, String cuePointW) {
    instance.cuePointW = cuePointW;
  }

  @InjectedFieldSignature("com.easyplex.ui.casts.CastDetailsActivity.cuePointZ")
  @Named("cuepointZ")
  public static void injectCuePointZ(CastDetailsActivity instance, String cuePointZ) {
    instance.cuePointZ = cuePointZ;
  }

  @InjectedFieldSignature("com.easyplex.ui.casts.CastDetailsActivity.tokenManager")
  public static void injectTokenManager(CastDetailsActivity instance, TokenManager tokenManager) {
    instance.tokenManager = tokenManager;
  }
}
