package com.easyplex.di.module;

import com.easyplex.ui.payment.PaymentStripe;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(subcomponents = ActivityModule_ContributePaymentStripe.PaymentStripeSubcomponent.class)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityModule_ContributePaymentStripe {
  private ActivityModule_ContributePaymentStripe() {}

  @Binds
  @IntoMap
  @ClassKey(PaymentStripe.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      PaymentStripeSubcomponent.Factory builder);

  @Subcomponent
  public interface PaymentStripeSubcomponent extends AndroidInjector<PaymentStripe> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<PaymentStripe> {}
  }
}
