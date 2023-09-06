package com.easyplex.di.module;

import com.easyplex.ui.streaming.StreamingFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents = FragmentBuildersModule_ContributeLiveFragment.StreamingFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class FragmentBuildersModule_ContributeLiveFragment {
  private FragmentBuildersModule_ContributeLiveFragment() {}

  @Binds
  @IntoMap
  @ClassKey(StreamingFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      StreamingFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface StreamingFragmentSubcomponent extends AndroidInjector<StreamingFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<StreamingFragment> {}
  }
}
