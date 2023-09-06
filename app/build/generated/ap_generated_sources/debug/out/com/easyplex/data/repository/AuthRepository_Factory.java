package com.easyplex.data.repository;

import com.easyplex.data.remote.ApiInterface;
import com.easyplex.ui.manager.TokenManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class AuthRepository_Factory implements Factory<AuthRepository> {
  private final Provider<ApiInterface> requestLoginProvider;

  private final Provider<TokenManager> tokenManagerProvider;

  private final Provider<ApiInterface> requestMainApiProvider;

  private final Provider<ApiInterface> requestAuthProvider;

  private final Provider<TokenManager> tokenManagerProvider2;

  public AuthRepository_Factory(Provider<ApiInterface> requestLoginProvider,
      Provider<TokenManager> tokenManagerProvider, Provider<ApiInterface> requestMainApiProvider,
      Provider<ApiInterface> requestAuthProvider, Provider<TokenManager> tokenManagerProvider2) {
    this.requestLoginProvider = requestLoginProvider;
    this.tokenManagerProvider = tokenManagerProvider;
    this.requestMainApiProvider = requestMainApiProvider;
    this.requestAuthProvider = requestAuthProvider;
    this.tokenManagerProvider2 = tokenManagerProvider2;
  }

  @Override
  public AuthRepository get() {
    AuthRepository instance = newInstance(requestLoginProvider.get(), tokenManagerProvider.get(), requestMainApiProvider.get());
    AuthRepository_MembersInjector.injectRequestAuth(instance, requestAuthProvider.get());
    AuthRepository_MembersInjector.injectTokenManager(instance, tokenManagerProvider2.get());
    return instance;
  }

  public static AuthRepository_Factory create(Provider<ApiInterface> requestLoginProvider,
      Provider<TokenManager> tokenManagerProvider, Provider<ApiInterface> requestMainApiProvider,
      Provider<ApiInterface> requestAuthProvider, Provider<TokenManager> tokenManagerProvider2) {
    return new AuthRepository_Factory(requestLoginProvider, tokenManagerProvider, requestMainApiProvider, requestAuthProvider, tokenManagerProvider2);
  }

  public static AuthRepository newInstance(ApiInterface requestLogin, TokenManager tokenManager,
      ApiInterface requestMainApi) {
    return new AuthRepository(requestLogin, tokenManager, requestMainApi);
  }
}
