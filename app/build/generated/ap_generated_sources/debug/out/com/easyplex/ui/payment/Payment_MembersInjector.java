package com.easyplex.ui.payment;

import androidx.lifecycle.ViewModelProvider;
import com.easyplex.data.repository.AuthRepository;
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
public final class Payment_MembersInjector implements MembersInjector<Payment> {
  private final Provider<AuthRepository> authRepositoryProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public Payment_MembersInjector(Provider<AuthRepository> authRepositoryProvider,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.authRepositoryProvider = authRepositoryProvider;
    this.settingsManagerProvider = settingsManagerProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<Payment> create(Provider<AuthRepository> authRepositoryProvider,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new Payment_MembersInjector(authRepositoryProvider, settingsManagerProvider, viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(Payment instance) {
    injectAuthRepository(instance, authRepositoryProvider.get());
    injectSettingsManager(instance, settingsManagerProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("com.easyplex.ui.payment.Payment.authRepository")
  public static void injectAuthRepository(Payment instance, AuthRepository authRepository) {
    instance.authRepository = authRepository;
  }

  @InjectedFieldSignature("com.easyplex.ui.payment.Payment.settingsManager")
  public static void injectSettingsManager(Payment instance, SettingsManager settingsManager) {
    instance.settingsManager = settingsManager;
  }

  @InjectedFieldSignature("com.easyplex.ui.payment.Payment.viewModelFactory")
  public static void injectViewModelFactory(Payment instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
