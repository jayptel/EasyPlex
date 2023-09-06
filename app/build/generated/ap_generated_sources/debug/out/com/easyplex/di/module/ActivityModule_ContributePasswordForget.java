package com.easyplex.di.module;

import com.easyplex.ui.login.PasswordForget;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(subcomponents = ActivityModule_ContributePasswordForget.PasswordForgetSubcomponent.class)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityModule_ContributePasswordForget {
  private ActivityModule_ContributePasswordForget() {}

  @Binds
  @IntoMap
  @ClassKey(PasswordForget.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      PasswordForgetSubcomponent.Factory builder);

  @Subcomponent
  public interface PasswordForgetSubcomponent extends AndroidInjector<PasswordForget> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<PasswordForget> {}
  }
}
