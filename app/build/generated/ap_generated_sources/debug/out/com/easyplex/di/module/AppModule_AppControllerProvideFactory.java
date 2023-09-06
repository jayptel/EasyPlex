package com.easyplex.di.module;

import com.easyplex.util.AppController;
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
public final class AppModule_AppControllerProvideFactory implements Factory<AppController> {
  private final AppModule module;

  public AppModule_AppControllerProvideFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public AppController get() {
    return appControllerProvide(module);
  }

  public static AppModule_AppControllerProvideFactory create(AppModule module) {
    return new AppModule_AppControllerProvideFactory(module);
  }

  public static AppController appControllerProvide(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.appControllerProvide());
  }
}
