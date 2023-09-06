package com.easyplex.di.module;

import com.easyplex.ui.player.fsm.concrete.factory.StateFactory;
import com.easyplex.ui.player.fsm.state_machine.FsmPlayer;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class AppModule_ProvideFsmPlayerFactory implements Factory<FsmPlayer> {
  private final AppModule module;

  private final Provider<StateFactory> factoryProvider;

  public AppModule_ProvideFsmPlayerFactory(AppModule module,
      Provider<StateFactory> factoryProvider) {
    this.module = module;
    this.factoryProvider = factoryProvider;
  }

  @Override
  public FsmPlayer get() {
    return provideFsmPlayer(module, factoryProvider.get());
  }

  public static AppModule_ProvideFsmPlayerFactory create(AppModule module,
      Provider<StateFactory> factoryProvider) {
    return new AppModule_ProvideFsmPlayerFactory(module, factoryProvider);
  }

  public static FsmPlayer provideFsmPlayer(AppModule instance, StateFactory factory) {
    return Preconditions.checkNotNullFromProvides(instance.provideFsmPlayer(factory));
  }
}
