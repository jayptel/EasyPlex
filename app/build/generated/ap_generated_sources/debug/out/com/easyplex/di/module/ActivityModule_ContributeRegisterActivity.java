package com.easyplex.di.module;

import com.easyplex.ui.register.RegisterActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents = ActivityModule_ContributeRegisterActivity.RegisterActivitySubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityModule_ContributeRegisterActivity {
  private ActivityModule_ContributeRegisterActivity() {}

  @Binds
  @IntoMap
  @ClassKey(RegisterActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      RegisterActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface RegisterActivitySubcomponent extends AndroidInjector<RegisterActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<RegisterActivity> {}
  }
}
