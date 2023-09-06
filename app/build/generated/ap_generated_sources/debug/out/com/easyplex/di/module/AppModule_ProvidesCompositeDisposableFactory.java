package com.easyplex.di.module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
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
public final class AppModule_ProvidesCompositeDisposableFactory implements Factory<CompositeDisposable> {
  private final AppModule module;

  public AppModule_ProvidesCompositeDisposableFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public CompositeDisposable get() {
    return providesCompositeDisposable(module);
  }

  public static AppModule_ProvidesCompositeDisposableFactory create(AppModule module) {
    return new AppModule_ProvidesCompositeDisposableFactory(module);
  }

  public static CompositeDisposable providesCompositeDisposable(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesCompositeDisposable());
  }
}
