package com.easyplex.di.module;

import com.easyplex.ui.payment.PaymentDetails;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(subcomponents = ActivityModule_ContributePaymentDetails.PaymentDetailsSubcomponent.class)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityModule_ContributePaymentDetails {
  private ActivityModule_ContributePaymentDetails() {}

  @Binds
  @IntoMap
  @ClassKey(PaymentDetails.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      PaymentDetailsSubcomponent.Factory builder);

  @Subcomponent
  public interface PaymentDetailsSubcomponent extends AndroidInjector<PaymentDetails> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<PaymentDetails> {}
  }
}
