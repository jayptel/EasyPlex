package com.easyplex.di.module;

import com.easyplex.ui.mylist.MoviesListFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeMyListMoviesFragment.MoviesListFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class FragmentBuildersModule_ContributeMyListMoviesFragment {
  private FragmentBuildersModule_ContributeMyListMoviesFragment() {}

  @Binds
  @IntoMap
  @ClassKey(MoviesListFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MoviesListFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface MoviesListFragmentSubcomponent extends AndroidInjector<MoviesListFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MoviesListFragment> {}
  }
}
