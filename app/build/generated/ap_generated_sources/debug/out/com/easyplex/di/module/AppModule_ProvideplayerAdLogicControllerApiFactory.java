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
public final class AppModule_ProvideplayerAdLogicControllerApiFactory implements Factory<ApiInterface> {
  private final AppModule module;

  public AppModule_ProvideplayerAdLogicControllerApiFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public ApiInterface get() {
    return provideplayerAdLogicControllerApi(module);
  }

  public static AppModule_ProvideplayerAdLogicControllerApiFactory create(AppModule module) {
    return new AppModule_ProvideplayerAdLogicControllerApiFactory(module);
  }

  public static ApiInterface provideplayerAdLogicControllerApi(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideplayerAdLogicControllerApi());
  }
}
