package com.easyplex.ui.payment;

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
public final class PaymentDetails_MembersInjector implements MembersInjector<PaymentDetails> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public PaymentDetails_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<PaymentDetails> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new PaymentDetails_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(PaymentDetails instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("com.easyplex.ui.payment.PaymentDetails.viewModelFactory")
  public static void injectViewModelFactory(PaymentDetails instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
