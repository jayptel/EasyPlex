package com.easyplex.di.module;

import com.easyplex.data.remote.ApiInterface;
import com.easyplex.ui.manager.TokenManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class AppModule_ProvideServiceAuthFactory implements Factory<ApiInterface> {
  private final AppModule module;

  private final Provider<TokenManager> tokenManagerProvider;

  public AppModule_ProvideServiceAuthFactory(AppModule module,
      Provider<TokenManager> tokenManagerProvider) {
    this.module = module;
    this.tokenManagerProvider = tokenManagerProvider;
  }

  @Override
  public ApiInterface get() {
    return provideServiceAuth(module, tokenManagerProvider.get());
  }

  public static AppModule_ProvideServiceAuthFactory create(AppModule module,
      Provider<TokenManager> tokenManagerProvider) {
    return new AppModule_ProvideServiceAuthFactory(module, tokenManagerProvider);
  }

  public static ApiInterface provideServiceAuth(AppModule instance, TokenManager tokenManager) {
    return Preconditions.checkNotNullFromProvides(instance.provideServiceAuth(tokenManager));
  }
}
