package com.easyplex.di.module;

import com.easyplex.ui.library.NetworksFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeNetworksFragment.NetworksFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class FragmentBuildersModule_ContributeNetworksFragment {
  private FragmentBuildersModule_ContributeNetworksFragment() {}

  @Binds
  @IntoMap
  @ClassKey(NetworksFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      NetworksFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface NetworksFragmentSubcomponent extends AndroidInjector<NetworksFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<NetworksFragment> {}
  }
}
