package com.easyplex.di.module;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
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
public final class AppModule_ProvideFirebaseRemoteConfigFactory implements Factory<FirebaseRemoteConfig> {
  private final AppModule module;

  public AppModule_ProvideFirebaseRemoteConfigFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public FirebaseRemoteConfig get() {
    return provideFirebaseRemoteConfig(module);
  }

  public static AppModule_ProvideFirebaseRemoteConfigFactory create(AppModule module) {
    return new AppModule_ProvideFirebaseRemoteConfigFactory(module);
  }

  public static FirebaseRemoteConfig provideFirebaseRemoteConfig(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideFirebaseRemoteConfig());
  }
}
