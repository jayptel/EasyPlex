package com.easyplex.di.module;

import com.easyplex.data.model.ads.CuePointsRetriever;
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
public final class AppModule_ProvideCuePointsRetrieverFactory implements Factory<CuePointsRetriever> {
  private final AppModule module;

  public AppModule_ProvideCuePointsRetrieverFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public CuePointsRetriever get() {
    return provideCuePointsRetriever(module);
  }

  public static AppModule_ProvideCuePointsRetrieverFactory create(AppModule module) {
    return new AppModule_ProvideCuePointsRetrieverFactory(module);
  }

  public static CuePointsRetriever provideCuePointsRetriever(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideCuePointsRetriever());
  }
}
