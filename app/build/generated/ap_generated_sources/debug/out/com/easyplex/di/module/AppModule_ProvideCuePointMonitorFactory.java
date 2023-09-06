package com.easyplex.di.module;

import com.easyplex.ui.player.fsm.listener.CuePointMonitor;
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
public final class AppModule_ProvideCuePointMonitorFactory implements Factory<CuePointMonitor> {
  private final AppModule module;

  private final Provider<FsmPlayer> fsmPlayerProvider;

  public AppModule_ProvideCuePointMonitorFactory(AppModule module,
      Provider<FsmPlayer> fsmPlayerProvider) {
    this.module = module;
    this.fsmPlayerProvider = fsmPlayerProvider;
  }

  @Override
  public CuePointMonitor get() {
    return provideCuePointMonitor(module, fsmPlayerProvider.get());
  }

  public static AppModule_ProvideCuePointMonitorFactory create(AppModule module,
      Provider<FsmPlayer> fsmPlayerProvider) {
    return new AppModule_ProvideCuePointMonitorFactory(module, fsmPlayerProvider);
  }

  public static CuePointMonitor provideCuePointMonitor(AppModule instance, FsmPlayer fsmPlayer) {
    return Preconditions.checkNotNullFromProvides(instance.provideCuePointMonitor(fsmPlayer));
  }
}
