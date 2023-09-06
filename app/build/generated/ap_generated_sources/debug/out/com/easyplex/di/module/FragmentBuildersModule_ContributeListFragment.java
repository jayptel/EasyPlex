package com.easyplex.di.module;

import com.easyplex.ui.mylist.ListFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents = FragmentBuildersModule_ContributeListFragment.ListFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class FragmentBuildersModule_ContributeListFragment {
  private FragmentBuildersModule_ContributeListFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ListFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ListFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface ListFragmentSubcomponent extends AndroidInjector<ListFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ListFragment> {}
  }
}
