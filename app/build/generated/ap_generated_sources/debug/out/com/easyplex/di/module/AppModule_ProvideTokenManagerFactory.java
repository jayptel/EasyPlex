package com.easyplex.di.module;

import android.app.Application;
import com.easyplex.ui.manager.TokenManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class AppModule_ProvideTokenManagerFactory implements Factory<TokenManager> {
  private final AppModule module;

  private final Provider<Application> applicationProvider;

  public AppModule_ProvideTokenManagerFactory(AppModule module,
      Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public TokenManager get() {
    return provideTokenManager(module, applicationProvider.get());
  }

  public static AppModule_ProvideTokenManagerFactory create(AppModule module,
      Provider<Application> applicationProvider) {
    return new AppModule_ProvideTokenManagerFactory(module, applicationProvider);
  }

  public static TokenManager provideTokenManager(AppModule instance, Application application) {
    return Preconditions.checkNotNullFromProvides(instance.provideTokenManager(application));
  }
}
