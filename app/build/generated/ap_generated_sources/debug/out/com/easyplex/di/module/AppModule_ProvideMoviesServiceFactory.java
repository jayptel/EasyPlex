package com.easyplex.di.module;

import com.easyplex.data.remote.ApiInterface;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class AppModule_ProvideMoviesServiceFactory implements Factory<ApiInterface> {
  private final AppModule module;

  public AppModule_ProvideMoviesServiceFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public ApiInterface get() {
    return provideMoviesService(module);
  }

  public static AppModule_ProvideMoviesServiceFactory create(AppModule module) {
    return new AppModule_ProvideMoviesServiceFactory(module);
  }

  public static ApiInterface provideMoviesService(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideMoviesService());
  }
}
