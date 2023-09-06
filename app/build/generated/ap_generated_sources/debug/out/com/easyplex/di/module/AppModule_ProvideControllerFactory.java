package com.easyplex.di.module;

import com.easyplex.ui.player.controller.PlayerUIController;
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
public final class AppModule_ProvideControllerFactory implements Factory<PlayerUIController> {
  private final AppModule module;

  public AppModule_ProvideControllerFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public PlayerUIController get() {
    return provideController(module);
  }

  public static AppModule_ProvideControllerFactory create(AppModule module) {
    return new AppModule_ProvideControllerFactory(module);
  }

  public static PlayerUIController provideController(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideController());
  }
}
