package com.easyplex.di.module;

import com.easyplex.data.model.ads.AdMediaModel;
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
public final class AppModule_ProvideAdMediaModelFactory implements Factory<AdMediaModel> {
  private final AppModule module;

  public AppModule_ProvideAdMediaModelFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public AdMediaModel get() {
    return provideAdMediaModel(module);
  }

  public static AppModule_ProvideAdMediaModelFactory create(AppModule module) {
    return new AppModule_ProvideAdMediaModelFactory(module);
  }

  public static AdMediaModel provideAdMediaModel(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideAdMediaModel());
  }
}
