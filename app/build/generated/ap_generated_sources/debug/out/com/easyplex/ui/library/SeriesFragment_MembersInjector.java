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
public final class SeriesFragment_MembersInjector implements MembersInjector<SeriesFragment> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public SeriesFragment_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<SeriesFragment> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new SeriesFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(SeriesFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("com.easyplex.ui.library.SeriesFragment.viewModelFactory")
  public static void injectViewModelFactory(SeriesFragment instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
