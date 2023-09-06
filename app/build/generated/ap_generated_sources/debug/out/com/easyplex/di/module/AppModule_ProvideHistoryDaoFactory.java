package com.easyplex.di.module;

import com.easyplex.data.local.EasyPlexDatabase;
import com.easyplex.data.local.dao.HistoryDao;
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
public final class AppModule_ProvideHistoryDaoFactory implements Factory<HistoryDao> {
  private final AppModule module;

  private final Provider<EasyPlexDatabase> dbProvider;

  public AppModule_ProvideHistoryDaoFactory(AppModule module,
      Provider<EasyPlexDatabase> dbProvider) {
    this.module = module;
    this.dbProvider = dbProvider;
  }

  @Override
  public HistoryDao get() {
    return provideHistoryDao(module, dbProvider.get());
  }

  public static AppModule_ProvideHistoryDaoFactory create(AppModule module,
      Provider<EasyPlexDatabase> dbProvider) {
    return new AppModule_ProvideHistoryDaoFactory(module, dbProvider);
  }

  public static HistoryDao provideHistoryDao(AppModule instance, EasyPlexDatabase db) {
    return Preconditions.checkNotNullFromProvides(instance.provideHistoryDao(db));
  }
}
