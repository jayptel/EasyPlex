package com.easyplex.di.module;

import com.easyplex.ui.users.ProfilesAdapter;
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
public final class AppModule_ProfilesAdapterProvideFactory implements Factory<ProfilesAdapter> {
  private final AppModule module;

  public AppModule_ProfilesAdapterProvideFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public ProfilesAdapter get() {
    return profilesAdapterProvide(module);
  }

  public static AppModule_ProfilesAdapterProvideFactory create(AppModule module) {
    return new AppModule_ProfilesAdapterProvideFactory(module);
  }

  public static ProfilesAdapter profilesAdapterProvide(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.profilesAdapterProvide());
  }
}
