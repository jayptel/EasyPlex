package com.easyplex.di.module;

import com.easyplex.ui.users.PhoneAuthActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents = ActivityModule_ContributePhoneAuthActivity.PhoneAuthActivitySubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityModule_ContributePhoneAuthActivity {
  private ActivityModule_ContributePhoneAuthActivity() {}

  @Binds
  @IntoMap
  @ClassKey(PhoneAuthActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      PhoneAuthActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface PhoneAuthActivitySubcomponent extends AndroidInjector<PhoneAuthActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<PhoneAuthActivity> {}
  }
}
