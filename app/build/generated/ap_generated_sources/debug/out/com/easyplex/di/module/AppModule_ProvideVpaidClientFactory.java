package com.easyplex.di.module;

import com.easyplex.ui.player.interfaces.VpaidClient;
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
public final class AppModule_ProvideVpaidClientFactory implements Factory<VpaidClient> {
  private final AppModule module;

  public AppModule_ProvideVpaidClientFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public VpaidClient get() {
    return provideVpaidClient(module);
  }

  public static AppModule_ProvideVpaidClientFactory create(AppModule module) {
    return new AppModule_ProvideVpaidClientFactory(module);
  }

  public static VpaidClient provideVpaidClient(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideVpaidClient());
  }
}
