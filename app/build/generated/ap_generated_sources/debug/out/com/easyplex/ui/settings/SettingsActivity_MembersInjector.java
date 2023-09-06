package com.easyplex.ui.settings;

import android.content.SharedPreferences;
import androidx.lifecycle.ViewModelProvider;
import com.easyplex.data.repository.AuthRepository;
import com.easyplex.data.repository.SettingsRepository;
import com.easyplex.ui.manager.AdsManager;
import com.easyplex.ui.manager.AuthManager;
import com.easyplex.ui.manager.SettingsManager;
import com.easyplex.ui.manager.TokenManager;
import dagger.MembersInjector;
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
public final class SettingsActivity_MembersInjector implements MembersInjector<SettingsActivity> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  private final Provider<AuthRepository> authRepositoryProvider;

  private final Provider<SharedPreferences.Editor> sharedPreferencesEditorProvider;

  private final Provider<SharedPreferences> sharedPreferencesProvider;

  private final Provider<TokenManager> tokenManagerProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  private final Provider<AdsManager> adsManagerProvider;

  private final Provider<AuthManager> authManagerProvider;

  private final Provider<SettingsRepository> settingsRepositoryProvider;

  public SettingsActivity_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<AuthRepository> authRepositoryProvider,
      Provider<SharedPreferences.Editor> sharedPreferencesEditorProvider,
      Provider<SharedPreferences> sharedPreferencesProvider,
      Provider<TokenManager> tokenManagerProvider,
      Provider<SettingsManager> settingsManagerProvider, Provider<AdsManager> adsManagerProvider,
      Provider<AuthManager> authManagerProvider,
      Provider<SettingsRepository> settingsRepositoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.authRepositoryProvider = authRepositoryProvider;
    this.sharedPreferencesEditorProvider = sharedPreferencesEditorProvider;
    this.sharedPreferencesProvider = sharedPreferencesProvider;
    this.tokenManagerProvider = tokenManagerProvider;
    this.settingsManagerProvider = settingsManagerProvider;
    this.adsManagerProvider = adsManagerProvider;
    this.authManagerProvider = authManagerProvider;
    this.settingsRepositoryProvider = settingsRepositoryProvider;
  }

  public static MembersInjector<SettingsActivity> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<AuthRepository> authRepositoryProvider,
      Provider<SharedPreferences.Editor> sharedPreferencesEditorProvider,
      Provider<SharedPreferences> sharedPreferencesProvider,
      Provider<TokenManager> tokenManagerProvider,
      Provider<SettingsManager> settingsManagerProvider, Provider<AdsManager> adsManagerProvider,
      Provider<AuthManager> authManagerProvider,
      Provider<SettingsRepository> settingsRepositoryProvider) {
    return new SettingsActivity_MembersInjector(viewModelFactoryProvider, authRepositoryProvider, sharedPreferencesEditorProvider, sharedPreferencesProvider, tokenManagerProvider, settingsManagerProvider, adsManagerProvider, authManagerProvider, settingsRepositoryProvider);
  }

  @Override
  public void injectMembers(SettingsActivity instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectAuthRepository(instance, authRepositoryProvider.get());
    injectSharedPreferencesEditor(instance, sharedPreferencesEditorProvider.get());
    injectSharedPreferences(instance, sharedPreferencesProvider.get());
    injectTokenManager(instance, tokenManagerProvider.get());
    injectSettingsManager(instance, settingsManagerProvider.get());
    injectAdsManager(instance, adsManagerProvider.get());
    injectAuthManager(instance, authManagerProvider.get());
    injectSettingsRepository(instance, settingsRepositoryProvider.get());
  }

  @InjectedFieldSignature("com.easyplex.ui.settings.SettingsActivity.viewModelFactory")
  public static void injectViewModelFactory(SettingsActivity instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }

  @InjectedFieldSignature("com.easyplex.ui.settings.SettingsActivity.authRepository")
  public static void injectAuthRepository(SettingsActivity instance,
      AuthRepository authRepository) {
    instance.authRepository = authRepository;
  }

  @InjectedFieldSignature("com.easyplex.ui.settings.SettingsActivity.sharedPreferencesEditor")
  public static void injectSharedPreferencesEditor(SettingsActivity instance,
      SharedPreferences.Editor sharedPreferencesEditor) {
    instance.sharedPreferencesEditor = sharedPreferencesEditor;
  }

  @InjectedFieldSignature("com.easyplex.ui.settings.SettingsActivity.sharedPreferences")
  public static void injectSharedPreferences(SettingsActivity instance,
      SharedPreferences sharedPreferences) {
    instance.sharedPreferences = sharedPreferences;
  }

  @InjectedFieldSignature("com.easyplex.ui.settings.SettingsActivity.tokenManager")
  public static void injectTokenManager(SettingsActivity instance, TokenManager tokenManager) {
    instance.tokenManager = tokenManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.settings.SettingsActivity.settingsManager")
  public static void injectSettingsManager(SettingsActivity instance,
      SettingsManager settingsManager) {
    instance.settingsManager = settingsManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.settings.SettingsActivity.adsManager")
  public static void injectAdsManager(SettingsActivity instance, AdsManager adsManager) {
    instance.adsManager = adsManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.settings.SettingsActivity.authManager")
  public static void injectAuthManager(SettingsActivity instance, AuthManager authManager) {
    instance.authManager = authManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.settings.SettingsActivity.settingsRepository")
  public static void injectSettingsRepository(SettingsActivity instance,
      SettingsRepository settingsRepository) {
    instance.settingsRepository = settingsRepository;
  }
}
