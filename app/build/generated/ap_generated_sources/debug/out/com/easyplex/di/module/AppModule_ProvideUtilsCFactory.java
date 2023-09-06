package com.easyplex.di.module;

import com.easyplex.easyplexsupportedhosts.ApiInterface;
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
public final class AppModule_ProvideUtilsCFactory implements Factory<ApiInterface> {
  private final AppModule module;

  public AppModule_ProvideUtilsCFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public ApiInterface get() {
    return provideUtilsC(module);
  }

  public static AppModule_ProvideUtilsCFactory create(AppModule module) {
    return new AppModule_ProvideUtilsCFactory(module);
  }

  public static ApiInterface provideUtilsC(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideUtilsC());
  }
}
