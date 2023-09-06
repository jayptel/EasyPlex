package com.easyplex.di.module;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import androidx.annotation.Nullable;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class AppModule_ProvideRootFactory implements Factory<ApplicationInfo> {
  private final AppModule module;

  private final Provider<Application> applicationProvider;

  public AppModule_ProvideRootFactory(AppModule module, Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  @Nullable
  public ApplicationInfo get() {
    return provideRoot(module, applicationProvider.get());
  }

  public static AppModule_ProvideRootFactory create(AppModule module,
      Provider<Application> applicationProvider) {
    return new AppModule_ProvideRootFactory(module, applicationProvider);
  }

  @Nullable
  public static ApplicationInfo provideRoot(AppModule instance, Application application) {
    return instance.provideRoot(application);
  }
}
