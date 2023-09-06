package com.easyplex.di.module;

import com.easyplex.ui.player.fsm.concrete.factory.StateFactory;
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
public final class AppModule_ProvideStateFactoryFactory implements Factory<StateFactory> {
  private final AppModule module;

  public AppModule_ProvideStateFactoryFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public StateFactory get() {
    return provideStateFactory(module);
  }

  public static AppModule_ProvideStateFactoryFactory create(AppModule module) {
    return new AppModule_ProvideStateFactoryFactory(module);
  }

  public static StateFactory provideStateFactory(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideStateFactory());
  }
}
