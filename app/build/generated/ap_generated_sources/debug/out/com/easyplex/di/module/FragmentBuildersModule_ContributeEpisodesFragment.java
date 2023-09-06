package com.easyplex.di.module;

import com.easyplex.ui.animes.EpisodesFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeEpisodesFragment.EpisodesFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class FragmentBuildersModule_ContributeEpisodesFragment {
  private FragmentBuildersModule_ContributeEpisodesFragment() {}

  @Binds
  @IntoMap
  @ClassKey(EpisodesFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      EpisodesFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface EpisodesFragmentSubcomponent extends AndroidInjector<EpisodesFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<EpisodesFragment> {}
  }
}
