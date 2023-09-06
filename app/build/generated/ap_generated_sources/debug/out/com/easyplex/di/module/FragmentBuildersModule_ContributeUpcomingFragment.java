package com.easyplex.di.module;

import com.easyplex.ui.upcoming.UpComingFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeUpcomingFragment.UpComingFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class FragmentBuildersModule_ContributeUpcomingFragment {
  private FragmentBuildersModule_ContributeUpcomingFragment() {}

  @Binds
  @IntoMap
  @ClassKey(UpComingFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      UpComingFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface UpComingFragmentSubcomponent extends AndroidInjector<UpComingFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<UpComingFragment> {}
  }
}
