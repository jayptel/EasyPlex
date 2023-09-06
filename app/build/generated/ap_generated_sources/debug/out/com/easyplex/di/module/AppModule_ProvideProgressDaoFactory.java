package com.easyplex.di.module;

import com.easyplex.data.local.EasyPlexDatabase;
import com.easyplex.data.local.dao.DownloadDao;
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
public final class AppModule_ProvideProgressDaoFactory implements Factory<DownloadDao> {
  private final AppModule module;

  private final Provider<EasyPlexDatabase> dbProvider;

  public AppModule_ProvideProgressDaoFactory(AppModule module,
      Provider<EasyPlexDatabase> dbProvider) {
    this.module = module;
    this.dbProvider = dbProvider;
  }

  @Override
  public DownloadDao get() {
    return provideProgressDao(module, dbProvider.get());
  }

  public static AppModule_ProvideProgressDaoFactory create(AppModule module,
      Provider<EasyPlexDatabase> dbProvider) {
    return new AppModule_ProvideProgressDaoFactory(module, dbProvider);
  }

  public static DownloadDao provideProgressDao(AppModule instance, EasyPlexDatabase db) {
    return Preconditions.checkNotNullFromProvides(instance.provideProgressDao(db));
  }
}
