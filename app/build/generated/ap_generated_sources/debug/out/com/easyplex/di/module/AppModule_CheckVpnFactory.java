package com.easyplex.di.module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class AppModule_CheckVpnFactory implements Factory<Boolean> {
  private final AppModule module;

  public AppModule_CheckVpnFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public Boolean get() {
    return checkVpn(module);
  }

  public static AppModule_CheckVpnFactory create(AppModule module) {
    return new AppModule_CheckVpnFactory(module);
  }

  public static boolean checkVpn(AppModule instance) {
    return instance.checkVpn();
  }
}
