package com.easyplex.ui.streaming;

import android.content.SharedPreferences;
import androidx.lifecycle.ViewModelProvider;
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
public final class StreamingFragment_MembersInjector implements MembersInjector<StreamingFragment> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  private final Provider<SharedPreferences> preferencesProvider;

  private final Provider<SettingsRepository> authRepositoryProvider;

  private final Provider<MediaRepository> mediaRepositoryProvider;

  private final Provider<AuthManager> authManagerProvider;

  private final Provider<TokenManager> tokenManagerProvider;

  public StreamingFragment_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<SharedPreferences> preferencesProvider,
      Provider<SettingsRepository> authRepositoryProvider,
      Provider<MediaRepository> mediaRepositoryProvider, Provider<AuthManager> authManagerProvider,
      Provider<TokenManager> tokenManagerProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.settingsManagerProvider = settingsManagerProvider;
    this.preferencesProvider = preferencesProvider;
    this.authRepositoryProvider = authRepositoryProvider;
    this.mediaRepositoryProvider = mediaRepositoryProvider;
    this.authManagerProvider = authManagerProvider;
    this.tokenManagerProvider = tokenManagerProvider;
  }

  public static MembersInjector<StreamingFragment> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<SharedPreferences> preferencesProvider,
      Provider<SettingsRepository> authRepositoryProvider,
      Provider<MediaRepository> mediaRepositoryProvider, Provider<AuthManager> authManagerProvider,
      Provider<TokenManager> tokenManagerProvider) {
    return new StreamingFragment_MembersInjector(viewModelFactoryProvider, settingsManagerProvider, preferencesProvider, authRepositoryProvider, mediaRepositoryProvider, authManagerProvider, tokenManagerProvider);
  }

  @Override
  public void injectMembers(StreamingFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectSettingsManager(instance, settingsManagerProvider.get());
    injectPreferences(instance, preferencesProvider.get());
    injectAuthRepository(instance, authRepositoryProvider.get());
    injectMediaRepository(instance, mediaRepositoryProvider.get());
    injectAuthManager(instance, authManagerProvider.get());
    injectTokenManager(instance, tokenManagerProvider.get());
  }

  @InjectedFieldSignature("com.easyplex.ui.streaming.StreamingFragment.viewModelFactory")
  public static void injectViewModelFactory(StreamingFragment instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }

  @InjectedFieldSignature("com.easyplex.ui.streaming.StreamingFragment.settingsManager")
  public static void injectSettingsManager(StreamingFragment instance,
      SettingsManager settingsManager) {
    instance.settingsManager = settingsManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.streaming.StreamingFragment.preferences")
  public static void injectPreferences(StreamingFragment instance, SharedPreferences preferences) {
    instance.preferences = preferences;
  }

  @InjectedFieldSignature("com.easyplex.ui.streaming.StreamingFragment.authRepository")
  public static void injectAuthRepository(StreamingFragment instance,
      SettingsRepository authRepository) {
    instance.authRepository = authRepository;
  }

  @InjectedFieldSignature("com.easyplex.ui.streaming.StreamingFragment.mediaRepository")
  public static void injectMediaRepository(StreamingFragment instance,
      MediaRepository mediaRepository) {
    instance.mediaRepository = mediaRepository;
  }

  @InjectedFieldSignature("com.easyplex.ui.streaming.StreamingFragment.authManager")
  public static void injectAuthManager(StreamingFragment instance, AuthManager authManager) {
    instance.authManager = authManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.streaming.StreamingFragment.tokenManager")
  public static void injectTokenManager(StreamingFragment instance, TokenManager tokenManager) {
    instance.tokenManager = tokenManager;
  }
}
