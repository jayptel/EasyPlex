package com.easyplex.di.module;

import com.easyplex.data.model.ads.AdRetriever;
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
public final class AppModule_ProvideAdRetrieverFactory implements Factory<AdRetriever> {
  private final AppModule module;

  public AppModule_ProvideAdRetrieverFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public AdRetriever get() {
    return provideAdRetriever(module);
  }

  public static AppModule_ProvideAdRetrieverFactory create(AppModule module) {
    return new AppModule_ProvideAdRetrieverFactory(module);
  }

  public static AdRetriever provideAdRetriever(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideAdRetriever());
  }
}
