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
public final class AppModule_ProvideServiceAppFactory implements Factory<ApiInterface> {
  private final AppModule module;

  public AppModule_ProvideServiceAppFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public ApiInterface get() {
    return provideServiceApp(module);
  }

  public static AppModule_ProvideServiceAppFactory create(AppModule module) {
    return new AppModule_ProvideServiceAppFactory(module);
  }

  public static ApiInterface provideServiceApp(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideServiceApp());
  }
}
