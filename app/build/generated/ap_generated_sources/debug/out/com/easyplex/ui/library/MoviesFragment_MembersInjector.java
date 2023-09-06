package com.easyplex.ui.library;

import androidx.lifecycle.ViewModelProvider;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class MoviesFragment_MembersInjector implements MembersInjector<MoviesFragment> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public MoviesFragment_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<MoviesFragment> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new MoviesFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(MoviesFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("com.easyplex.ui.library.MoviesFragment.viewModelFactory")
  public static void injectViewModelFactory(MoviesFragment instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
