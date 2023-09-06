package com.easyplex.di.module;

import com.easyplex.ui.base.BaseActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(subcomponents = ActivityModule_ContributeMainActivity.BaseActivitySubcomponent.class)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityModule_ContributeMainActivity {
  private ActivityModule_ContributeMainActivity() {}

  @Binds
  @IntoMap
  @ClassKey(BaseActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      BaseActivitySubcomponent.Factory builder);

  @Subcomponent(modules = FragmentBuildersModule.class)
  public interface BaseActivitySubcomponent extends AndroidInjector<BaseActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<BaseActivity> {}
  }
}
