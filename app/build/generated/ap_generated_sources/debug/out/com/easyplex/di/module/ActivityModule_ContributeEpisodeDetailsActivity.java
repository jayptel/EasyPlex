package com.easyplex.di.module;

import com.easyplex.ui.seriedetails.EpisodeDetailsActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      ActivityModule_ContributeEpisodeDetailsActivity.EpisodeDetailsActivitySubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityModule_ContributeEpisodeDetailsActivity {
  private ActivityModule_ContributeEpisodeDetailsActivity() {}

  @Binds
  @IntoMap
  @ClassKey(EpisodeDetailsActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      EpisodeDetailsActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface EpisodeDetailsActivitySubcomponent
      extends AndroidInjector<EpisodeDetailsActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<EpisodeDetailsActivity> {}
  }
}
