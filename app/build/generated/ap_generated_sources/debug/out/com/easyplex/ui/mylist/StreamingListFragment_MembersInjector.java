package com.easyplex.ui.mylist;

import androidx.lifecycle.ViewModelProvider;
import com.easyplex.data.repository.AuthRepository;
import com.easyplex.data.repository.MediaRepository;
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
public final class StreamingListFragment_MembersInjector implements MembersInjector<StreamingListFragment> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  private final Provider<MediaRepository> mediaRepositoryProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  private final Provider<AuthRepository> authRepositoryProvider;

  private final Provider<TokenManager> tokenManagerProvider;

  public StreamingListFragment_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<MediaRepository> mediaRepositoryProvider,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<AuthRepository> authRepositoryProvider,
      Provider<TokenManager> tokenManagerProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.mediaRepositoryProvider = mediaRepositoryProvider;
    this.settingsManagerProvider = settingsManagerProvider;
    this.authRepositoryProvider = authRepositoryProvider;
    this.tokenManagerProvider = tokenManagerProvider;
  }

  public static MembersInjector<StreamingListFragment> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<MediaRepository> mediaRepositoryProvider,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<AuthRepository> authRepositoryProvider,
      Provider<TokenManager> tokenManagerProvider) {
    return new StreamingListFragment_MembersInjector(viewModelFactoryProvider, mediaRepositoryProvider, settingsManagerProvider, authRepositoryProvider, tokenManagerProvider);
  }

  @Override
  public void injectMembers(StreamingListFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectMediaRepository(instance, mediaRepositoryProvider.get());
    injectSettingsManager(instance, settingsManagerProvider.get());
    injectAuthRepository(instance, authRepositoryProvider.get());
    injectTokenManager(instance, tokenManagerProvider.get());
  }

  @InjectedFieldSignature("com.easyplex.ui.mylist.StreamingListFragment.viewModelFactory")
  public static void injectViewModelFactory(StreamingListFragment instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }

  @InjectedFieldSignature("com.easyplex.ui.mylist.StreamingListFragment.mediaRepository")
  public static void injectMediaRepository(StreamingListFragment instance,
      MediaRepository mediaRepository) {
    instance.mediaRepository = mediaRepository;
  }

  @InjectedFieldSignature("com.easyplex.ui.mylist.StreamingListFragment.settingsManager")
  public static void injectSettingsManager(StreamingListFragment instance,
      SettingsManager settingsManager) {
    instance.settingsManager = settingsManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.mylist.StreamingListFragment.authRepository")
  public static void injectAuthRepository(StreamingListFragment instance,
      AuthRepository authRepository) {
    instance.authRepository = authRepository;
  }

  @InjectedFieldSignature("com.easyplex.ui.mylist.StreamingListFragment.tokenManager")
  public static void injectTokenManager(StreamingListFragment instance, TokenManager tokenManager) {
    instance.tokenManager = tokenManager;
  }
}
