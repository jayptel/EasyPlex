package com.easyplex.di.module;

import com.easyplex.ui.player.fsm.state_machine.Fsm;
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
public final class AppModule_PlayerAdLogicControllerApiFactory implements Factory<Fsm> {
  private final AppModule module;

  public AppModule_PlayerAdLogicControllerApiFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public Fsm get() {
    return playerAdLogicControllerApi(module);
  }

  public static AppModule_PlayerAdLogicControllerApiFactory create(AppModule module) {
    return new AppModule_PlayerAdLogicControllerApiFactory(module);
  }

  public static Fsm playerAdLogicControllerApi(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.playerAdLogicControllerApi());
  }
}
