package com.easyplex.di.module;

import com.easyplex.ui.player.fsm.listener.AdPlayingMonitor;
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
public final class AppModule_ProvideAdPlayingMonitorFactory implements Factory<AdPlayingMonitor> {
  private final AppModule module;

  private final Provider<FsmPlayer> playerProvider;

  public AppModule_ProvideAdPlayingMonitorFactory(AppModule module,
      Provider<FsmPlayer> playerProvider) {
    this.module = module;
    this.playerProvider = playerProvider;
  }

  @Override
  public AdPlayingMonitor get() {
    return provideAdPlayingMonitor(module, playerProvider.get());
  }

  public static AppModule_ProvideAdPlayingMonitorFactory create(AppModule module,
      Provider<FsmPlayer> playerProvider) {
    return new AppModule_ProvideAdPlayingMonitorFactory(module, playerProvider);
  }

  public static AdPlayingMonitor provideAdPlayingMonitor(AppModule instance, FsmPlayer player) {
    return Preconditions.checkNotNullFromProvides(instance.provideAdPlayingMonitor(player));
  }
}
