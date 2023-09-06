package com.easyplex.di.module;

import android.app.Application;
import com.easyplex.ui.manager.AuthManager;
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
public final class AppModule_ProvideAuthManagerFactory implements Factory<AuthManager> {
  private final AppModule module;

  private final Provider<Application> applicationProvider;

  public AppModule_ProvideAuthManagerFactory(AppModule module,
      Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public AuthManager get() {
    return provideAuthManager(module, applicationProvider.get());
  }

  public static AppModule_ProvideAuthManagerFactory create(AppModule module,
      Provider<Application> applicationProvider) {
    return new AppModule_ProvideAuthManagerFactory(module, applicationProvider);
  }

  public static AuthManager provideAuthManager(AppModule instance, Application application) {
    return Preconditions.checkNotNullFromProvides(instance.provideAuthManager(application));
  }
}
