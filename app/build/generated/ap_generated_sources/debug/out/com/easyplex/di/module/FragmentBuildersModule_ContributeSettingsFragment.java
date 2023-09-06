package com.easyplex.di.module;

import com.easyplex.ui.settings.SettingsActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeSettingsFragment.SettingsActivitySubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class FragmentBuildersModule_ContributeSettingsFragment {
  private FragmentBuildersModule_ContributeSettingsFragment() {}

  @Binds
  @IntoMap
  @ClassKey(SettingsActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SettingsActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface SettingsActivitySubcomponent extends AndroidInjector<SettingsActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SettingsActivity> {}
  }
}
