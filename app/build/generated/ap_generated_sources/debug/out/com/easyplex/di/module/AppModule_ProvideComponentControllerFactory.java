package com.easyplex.di.module;

import com.easyplex.ui.player.controller.PlayerAdLogicController;
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
public final class AppModule_ProvideComponentControllerFactory implements Factory<PlayerAdLogicController> {
  private final AppModule module;

  public AppModule_ProvideComponentControllerFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public PlayerAdLogicController get() {
    return provideComponentController(module);
  }

  public static AppModule_ProvideComponentControllerFactory create(AppModule module) {
    return new AppModule_ProvideComponentControllerFactory(module);
  }

  public static PlayerAdLogicController provideComponentController(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideComponentController());
  }
}
