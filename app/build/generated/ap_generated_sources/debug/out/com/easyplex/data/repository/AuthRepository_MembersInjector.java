package com.easyplex.data.repository;

import com.easyplex.data.remote.ApiInterface;
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
public final class AuthRepository_MembersInjector implements MembersInjector<AuthRepository> {
  private final Provider<ApiInterface> requestAuthProvider;

  private final Provider<TokenManager> tokenManagerProvider;

  public AuthRepository_MembersInjector(Provider<ApiInterface> requestAuthProvider,
      Provider<TokenManager> tokenManagerProvider) {
    this.requestAuthProvider = requestAuthProvider;
    this.tokenManagerProvider = tokenManagerProvider;
  }

  public static MembersInjector<AuthRepository> create(Provider<ApiInterface> requestAuthProvider,
      Provider<TokenManager> tokenManagerProvider) {
    return new AuthRepository_MembersInjector(requestAuthProvider, tokenManagerProvider);
  }

  @Override
  public void injectMembers(AuthRepository instance) {
    injectRequestAuth(instance, requestAuthProvider.get());
    injectTokenManager(instance, tokenManagerProvider.get());
  }

  @InjectedFieldSignature("com.easyplex.data.repository.AuthRepository.requestAuth")
  @Named("Auth")
  public static void injectRequestAuth(AuthRepository instance, ApiInterface requestAuth) {
    instance.requestAuth = requestAuth;
  }

  @InjectedFieldSignature("com.easyplex.data.repository.AuthRepository.tokenManager")
  public static void injectTokenManager(AuthRepository instance, TokenManager tokenManager) {
    instance.tokenManager = tokenManager;
  }
}
