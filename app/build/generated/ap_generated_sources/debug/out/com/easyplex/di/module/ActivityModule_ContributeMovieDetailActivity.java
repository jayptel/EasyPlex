package com.easyplex.di.module;

import com.easyplex.ui.moviedetails.MovieDetailsActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      ActivityModule_ContributeMovieDetailActivity.MovieDetailsActivitySubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityModule_ContributeMovieDetailActivity {
  private ActivityModule_ContributeMovieDetailActivity() {}

  @Binds
  @IntoMap
  @ClassKey(MovieDetailsActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MovieDetailsActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface MovieDetailsActivitySubcomponent extends AndroidInjector<MovieDetailsActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MovieDetailsActivity> {}
  }
}
