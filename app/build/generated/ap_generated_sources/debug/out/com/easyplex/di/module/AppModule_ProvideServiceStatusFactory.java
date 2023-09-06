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
public final class AppModule_ProvideServiceStatusFactory implements Factory<ApiInterface> {
  private final AppModule module;

  public AppModule_ProvideServiceStatusFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public ApiInterface get() {
    return provideServiceStatus(module);
  }

  public static AppModule_ProvideServiceStatusFactory create(AppModule module) {
    return new AppModule_ProvideServiceStatusFactory(module);
  }

  public static ApiInterface provideServiceStatus(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideServiceStatus());
  }
}
