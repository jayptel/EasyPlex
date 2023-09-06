package com.easyplex.di.module;

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
public final class AppModule_ProvideCuePointWFactory implements Factory<String> {
  private final AppModule module;

  public AppModule_ProvideCuePointWFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return provideCuePointW(module);
  }

  public static AppModule_ProvideCuePointWFactory create(AppModule module) {
    return new AppModule_ProvideCuePointWFactory(module);
  }

  public static String provideCuePointW(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideCuePointW());
  }
}
