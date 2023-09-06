package com.easyplex.di.module;

import com.easyplex.ui.mylist.StreamingListFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeStreamingListFragment.StreamingListFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class FragmentBuildersModule_ContributeStreamingListFragment {
  private FragmentBuildersModule_ContributeStreamingListFragment() {}

  @Binds
  @IntoMap
  @ClassKey(StreamingListFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      StreamingListFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface StreamingListFragmentSubcomponent
      extends AndroidInjector<StreamingListFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<StreamingListFragment> {}
  }
}
