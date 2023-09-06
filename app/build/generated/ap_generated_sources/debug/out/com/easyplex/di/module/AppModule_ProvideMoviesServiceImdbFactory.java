package com.easyplex.di.module;

import com.easyplex.data.remote.ApiInterface;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class AppModule_ProvideMoviesServiceImdbFactory implements Factory<ApiInterface> {
  private final AppModule module;

  public AppModule_ProvideMoviesServiceImdbFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public ApiInterface get() {
    return provideMoviesServiceImdb(module);
  }

  public static AppModule_ProvideMoviesServiceImdbFactory create(AppModule module) {
    return new AppModule_ProvideMoviesServiceImdbFactory(module);
  }

  public static ApiInterface provideMoviesServiceImdb(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideMoviesServiceImdb());
  }
}
