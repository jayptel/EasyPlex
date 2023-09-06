package com.easyplex.di.module;

import android.app.Application;
import com.easyplex.data.local.EasyPlexDatabase;
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
public final class AppModule_ProvideDbFactory implements Factory<EasyPlexDatabase> {
  private final AppModule module;

  private final Provider<Application> appProvider;

  public AppModule_ProvideDbFactory(AppModule module, Provider<Application> appProvider) {
    this.module = module;
    this.appProvider = appProvider;
  }

  @Override
  public EasyPlexDatabase get() {
    return provideDb(module, appProvider.get());
  }

  public static AppModule_ProvideDbFactory create(AppModule module,
      Provider<Application> appProvider) {
    return new AppModule_ProvideDbFactory(module, appProvider);
  }

  public static EasyPlexDatabase provideDb(AppModule instance, Application app) {
    return Preconditions.checkNotNullFromProvides(instance.provideDb(app));
  }
}
