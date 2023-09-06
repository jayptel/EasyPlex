package com.easyplex.di.module;

import com.easyplex.ui.search.DiscoverFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeDiscoverFragment.DiscoverFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class FragmentBuildersModule_ContributeDiscoverFragment {
  private FragmentBuildersModule_ContributeDiscoverFragment() {}

  @Binds
  @IntoMap
  @ClassKey(DiscoverFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      DiscoverFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface DiscoverFragmentSubcomponent extends AndroidInjector<DiscoverFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<DiscoverFragment> {}
  }
}
