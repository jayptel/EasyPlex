package com.easyplex.di.module;

import com.easyplex.ui.library.SeriesFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents = FragmentBuildersModule_ContributeSeriesFragment.SeriesFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class FragmentBuildersModule_ContributeSeriesFragment {
  private FragmentBuildersModule_ContributeSeriesFragment() {}

  @Binds
  @IntoMap
  @ClassKey(SeriesFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SeriesFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface SeriesFragmentSubcomponent extends AndroidInjector<SeriesFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SeriesFragment> {}
  }
}
