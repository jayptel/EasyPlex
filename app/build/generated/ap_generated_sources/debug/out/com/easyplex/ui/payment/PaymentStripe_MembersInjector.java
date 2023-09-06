package com.easyplex.ui.payment;

import androidx.lifecycle.ViewModelProvider;
import com.easyplex.ui.manager.SettingsManager;
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
public final class PaymentStripe_MembersInjector implements MembersInjector<PaymentStripe> {
  private final Provider<SettingsManager> settingsManagerProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public PaymentStripe_MembersInjector(Provider<SettingsManager> settingsManagerProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.settingsManagerProvider = settingsManagerProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<PaymentStripe> create(
      Provider<SettingsManager> settingsManagerProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new PaymentStripe_MembersInjector(settingsManagerProvider, viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(PaymentStripe instance) {
    injectSettingsManager(instance, settingsManagerProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("com.easyplex.ui.payment.PaymentStripe.settingsManager")
  public static void injectSettingsManager(PaymentStripe instance,
      SettingsManager settingsManager) {
    instance.settingsManager = settingsManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.payment.PaymentStripe.viewModelFactory")
  public static void injectViewModelFactory(PaymentStripe instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
