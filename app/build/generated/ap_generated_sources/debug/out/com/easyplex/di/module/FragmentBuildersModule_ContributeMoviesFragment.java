package com.easyplex.di.module;

import com.easyplex.ui.library.MoviesFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents = FragmentBuildersModule_ContributeMoviesFragment.MoviesFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class FragmentBuildersModule_ContributeMoviesFragment {
  private FragmentBuildersModule_ContributeMoviesFragment() {}

  @Binds
  @IntoMap
  @ClassKey(MoviesFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MoviesFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface MoviesFragmentSubcomponent extends AndroidInjector<MoviesFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MoviesFragment> {}
  }
}
