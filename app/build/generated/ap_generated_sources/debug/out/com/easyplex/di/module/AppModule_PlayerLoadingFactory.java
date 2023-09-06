package com.easyplex.di.module;

import com.easyplex.easyplexsupportedhosts.Utils.Fsm;
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
public final class AppModule_PlayerLoadingFactory implements Factory<Fsm> {
  private final AppModule module;

  public AppModule_PlayerLoadingFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public Fsm get() {
    return playerLoading(module);
  }

  public static AppModule_PlayerLoadingFactory create(AppModule module) {
    return new AppModule_PlayerLoadingFactory(module);
  }

  public static Fsm playerLoading(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.playerLoading());
  }
}
