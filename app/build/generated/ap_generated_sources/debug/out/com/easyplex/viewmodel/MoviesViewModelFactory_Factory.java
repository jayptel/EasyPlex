package com.easyplex.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.Map;
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
public final class MoviesViewModelFactory_Factory implements Factory<MoviesViewModelFactory> {
  private final Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> creatorsProvider;

  public MoviesViewModelFactory_Factory(
      Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> creatorsProvider) {
    this.creatorsProvider = creatorsProvider;
  }

  @Override
  public MoviesViewModelFactory get() {
    return newInstance(creatorsProvider.get());
  }

  public static MoviesViewModelFactory_Factory create(
      Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> creatorsProvider) {
    return new MoviesViewModelFactory_Factory(creatorsProvider);
  }

  public static MoviesViewModelFactory newInstance(
      Map<Class<? extends ViewModel>, Provider<ViewModel>> creators) {
    return new MoviesViewModelFactory(creators);
  }
}
