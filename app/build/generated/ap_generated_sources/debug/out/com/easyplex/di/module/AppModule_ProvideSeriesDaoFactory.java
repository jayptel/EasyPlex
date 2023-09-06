package com.easyplex.di.module;

import com.easyplex.data.local.EasyPlexDatabase;
import com.easyplex.data.local.dao.SeriesDao;
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
public final class AppModule_ProvideSeriesDaoFactory implements Factory<SeriesDao> {
  private final AppModule module;

  private final Provider<EasyPlexDatabase> dbProvider;

  public AppModule_ProvideSeriesDaoFactory(AppModule module,
      Provider<EasyPlexDatabase> dbProvider) {
    this.module = module;
    this.dbProvider = dbProvider;
  }

  @Override
  public SeriesDao get() {
    return provideSeriesDao(module, dbProvider.get());
  }

  public static AppModule_ProvideSeriesDaoFactory create(AppModule module,
      Provider<EasyPlexDatabase> dbProvider) {
    return new AppModule_ProvideSeriesDaoFactory(module, dbProvider);
  }

  public static SeriesDao provideSeriesDao(AppModule instance, EasyPlexDatabase db) {
    return Preconditions.checkNotNullFromProvides(instance.provideSeriesDao(db));
  }
}
