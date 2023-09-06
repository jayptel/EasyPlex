package com.easyplex.di.module;

import com.easyplex.ui.payment.Payment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(subcomponents = ActivityModule_ContributePayment.PaymentSubcomponent.class)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityModule_ContributePayment {
  private ActivityModule_ContributePayment() {}

  @Binds
  @IntoMap
  @ClassKey(Payment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      PaymentSubcomponent.Factory builder);

  @Subcomponent
  public interface PaymentSubcomponent extends AndroidInjector<Payment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<Payment> {}
  }
}
