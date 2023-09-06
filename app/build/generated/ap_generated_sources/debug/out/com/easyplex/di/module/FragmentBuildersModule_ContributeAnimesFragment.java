package com.easyplex.di.module;

import com.easyplex.ui.library.AnimesFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents = FragmentBuildersModule_ContributeAnimesFragment.AnimesFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class FragmentBuildersModule_ContributeAnimesFragment {
  private FragmentBuildersModule_ContributeAnimesFragment() {}

  @Binds
  @IntoMap
  @ClassKey(AnimesFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      AnimesFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface AnimesFragmentSubcomponent extends AndroidInjector<AnimesFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<AnimesFragment> {}
  }
}
