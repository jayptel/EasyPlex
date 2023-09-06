package com.easyplex.di.module;

import com.easyplex.ui.player.bindings.PlayerController;
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
public final class AppModule_ProvidePlayerControllerFactory implements Factory<PlayerController> {
  private final AppModule module;

  public AppModule_ProvidePlayerControllerFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public PlayerController get() {
    return providePlayerController(module);
  }

  public static AppModule_ProvidePlayerControllerFactory create(AppModule module) {
    return new AppModule_ProvidePlayerControllerFactory(module);
  }

  public static PlayerController providePlayerController(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providePlayerController());
  }
}
