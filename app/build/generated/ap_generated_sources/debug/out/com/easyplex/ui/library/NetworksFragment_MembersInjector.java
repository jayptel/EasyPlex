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
public final class NetworksFragment_MembersInjector implements MembersInjector<NetworksFragment> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public NetworksFragment_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<NetworksFragment> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new NetworksFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(NetworksFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("com.easyplex.ui.library.NetworksFragment.viewModelFactory")
  public static void injectViewModelFactory(NetworksFragment instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
