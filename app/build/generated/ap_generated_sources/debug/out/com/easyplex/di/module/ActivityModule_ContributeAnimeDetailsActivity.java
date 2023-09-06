package com.easyplex.di.module;

import com.easyplex.ui.animes.AnimeDetailsActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      ActivityModule_ContributeAnimeDetailsActivity.AnimeDetailsActivitySubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityModule_ContributeAnimeDetailsActivity {
  private ActivityModule_ContributeAnimeDetailsActivity() {}

  @Binds
  @IntoMap
  @ClassKey(AnimeDetailsActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      AnimeDetailsActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface AnimeDetailsActivitySubcomponent extends AndroidInjector<AnimeDetailsActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<AnimeDetailsActivity> {}
  }
}
