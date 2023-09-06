package com.easyplex.di.module;

import com.easyplex.ui.player.fsm.callback.AdInterface;
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
public final class AppModule_ProvideAdInterfaceNoPrerollFactory implements Factory<AdInterface> {
  private final AppModule module;

  public AppModule_ProvideAdInterfaceNoPrerollFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public AdInterface get() {
    return provideAdInterfaceNoPreroll(module);
  }

  public static AppModule_ProvideAdInterfaceNoPrerollFactory create(AppModule module) {
    return new AppModule_ProvideAdInterfaceNoPrerollFactory(module);
  }

  public static AdInterface provideAdInterfaceNoPreroll(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideAdInterfaceNoPreroll());
  }
}
