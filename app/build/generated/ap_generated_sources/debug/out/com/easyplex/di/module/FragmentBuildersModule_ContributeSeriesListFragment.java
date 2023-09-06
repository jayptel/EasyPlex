package com.easyplex.di.module;

import com.easyplex.ui.mylist.SeriesListFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeSeriesListFragment.SeriesListFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class FragmentBuildersModule_ContributeSeriesListFragment {
  private FragmentBuildersModule_ContributeSeriesListFragment() {}

  @Binds
  @IntoMap
  @ClassKey(SeriesListFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SeriesListFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface SeriesListFragmentSubcomponent extends AndroidInjector<SeriesListFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SeriesListFragment> {}
  }
}
