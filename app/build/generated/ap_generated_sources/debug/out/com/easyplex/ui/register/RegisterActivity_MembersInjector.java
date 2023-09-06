package com.easyplex.ui.register;

import android.content.SharedPreferences;
import androidx.lifecycle.ViewModelProvider;
import com.easyplex.data.repository.AuthRepository;
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
public final class RegisterActivity_MembersInjector implements MembersInjector<RegisterActivity> {
  private final Provider<SharedPreferences.Editor> sharedPreferencesEditorProvider;

  private final Provider<TokenManager> tokenManagerProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  private final Provider<AuthRepository> authRepositoryProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public RegisterActivity_MembersInjector(
      Provider<SharedPreferences.Editor> sharedPreferencesEditorProvider,
      Provider<TokenManager> tokenManagerProvider,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<AuthRepository> authRepositoryProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.sharedPreferencesEditorProvider = sharedPreferencesEditorProvider;
    this.tokenManagerProvider = tokenManagerProvider;
    this.settingsManagerProvider = settingsManagerProvider;
    this.authRepositoryProvider = authRepositoryProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<RegisterActivity> create(
      Provider<SharedPreferences.Editor> sharedPreferencesEditorProvider,
      Provider<TokenManager> tokenManagerProvider,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<AuthRepository> authRepositoryProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new RegisterActivity_MembersInjector(sharedPreferencesEditorProvider, tokenManagerProvider, settingsManagerProvider, authRepositoryProvider, viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(RegisterActivity instance) {
    injectSharedPreferencesEditor(instance, sharedPreferencesEditorProvider.get());
    injectTokenManager(instance, tokenManagerProvider.get());
    injectSettingsManager(instance, settingsManagerProvider.get());
    injectAuthRepository(instance, authRepositoryProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("com.easyplex.ui.register.RegisterActivity.sharedPreferencesEditor")
  public static void injectSharedPreferencesEditor(RegisterActivity instance,
      SharedPreferences.Editor sharedPreferencesEditor) {
    instance.sharedPreferencesEditor = sharedPreferencesEditor;
  }

  @InjectedFieldSignature("com.easyplex.ui.register.RegisterActivity.tokenManager")
  public static void injectTokenManager(RegisterActivity instance, TokenManager tokenManager) {
    instance.tokenManager = tokenManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.register.RegisterActivity.settingsManager")
  public static void injectSettingsManager(RegisterActivity instance,
      SettingsManager settingsManager) {
    instance.settingsManager = settingsManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.register.RegisterActivity.authRepository")
  public static void injectAuthRepository(RegisterActivity instance,
      AuthRepository authRepository) {
    instance.authRepository = authRepository;
  }

  @InjectedFieldSignature("com.easyplex.ui.register.RegisterActivity.viewModelFactory")
  public static void injectViewModelFactory(RegisterActivity instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
