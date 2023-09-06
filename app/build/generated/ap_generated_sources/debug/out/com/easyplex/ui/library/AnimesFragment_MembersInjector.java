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
public final class AnimesFragment_MembersInjector implements MembersInjector<AnimesFragment> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public AnimesFragment_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<AnimesFragment> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new AnimesFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(AnimesFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("com.easyplex.ui.library.AnimesFragment.viewModelFactory")
  public static void injectViewModelFactory(AnimesFragment instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
