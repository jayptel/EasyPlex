package com.easyplex.ui.users;

import androidx.lifecycle.ViewModelProvider;
import com.easyplex.data.repository.AuthRepository;
import com.easyplex.ui.manager.AuthManager;
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
public final class UserProfiles_MembersInjector implements MembersInjector<UserProfiles> {
  private final Provider<AuthRepository> authRepositoryProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  private final Provider<AuthManager> authManagerProvider;

  private final Provider<TokenManager> tokenManagerProvider;

  private final Provider<MenuHandler> menuHandlerProvider;

  private final Provider<ProfilesAdapter> profilesAdapterProvider;

  public UserProfiles_MembersInjector(Provider<AuthRepository> authRepositoryProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<AuthManager> authManagerProvider, Provider<TokenManager> tokenManagerProvider,
      Provider<MenuHandler> menuHandlerProvider,
      Provider<ProfilesAdapter> profilesAdapterProvider) {
    this.authRepositoryProvider = authRepositoryProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.authManagerProvider = authManagerProvider;
    this.tokenManagerProvider = tokenManagerProvider;
    this.menuHandlerProvider = menuHandlerProvider;
    this.profilesAdapterProvider = profilesAdapterProvider;
  }

  public static MembersInjector<UserProfiles> create(
      Provider<AuthRepository> authRepositoryProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<AuthManager> authManagerProvider, Provider<TokenManager> tokenManagerProvider,
      Provider<MenuHandler> menuHandlerProvider,
      Provider<ProfilesAdapter> profilesAdapterProvider) {
    return new UserProfiles_MembersInjector(authRepositoryProvider, viewModelFactoryProvider, authManagerProvider, tokenManagerProvider, menuHandlerProvider, profilesAdapterProvider);
  }

  @Override
  public void injectMembers(UserProfiles instance) {
    injectAuthRepository(instance, authRepositoryProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectAuthManager(instance, authManagerProvider.get());
    injectTokenManager(instance, tokenManagerProvider.get());
    injectMenuHandler(instance, menuHandlerProvider.get());
    injectProfilesAdapter(instance, profilesAdapterProvider.get());
  }

  @InjectedFieldSignature("com.easyplex.ui.users.UserProfiles.authRepository")
  public static void injectAuthRepository(UserProfiles instance, AuthRepository authRepository) {
    instance.authRepository = authRepository;
  }

  @InjectedFieldSignature("com.easyplex.ui.users.UserProfiles.viewModelFactory")
  public static void injectViewModelFactory(UserProfiles instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }

  @InjectedFieldSignature("com.easyplex.ui.users.UserProfiles.authManager")
  public static void injectAuthManager(UserProfiles instance, AuthManager authManager) {
    instance.authManager = authManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.users.UserProfiles.tokenManager")
  public static void injectTokenManager(UserProfiles instance, TokenManager tokenManager) {
    instance.tokenManager = tokenManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.users.UserProfiles.menuHandler")
  public static void injectMenuHandler(UserProfiles instance, MenuHandler menuHandler) {
    instance.menuHandler = menuHandler;
  }

  @InjectedFieldSignature("com.easyplex.ui.users.UserProfiles.profilesAdapter")
  public static void injectProfilesAdapter(UserProfiles instance, ProfilesAdapter profilesAdapter) {
    instance.profilesAdapter = profilesAdapter;
  }
}
