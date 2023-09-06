package com.easyplex.di.module;

import com.easyplex.ui.library.NetworksFragment2;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeNetworksFragment2.NetworksFragment2Subcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class FragmentBuildersModule_ContributeNetworksFragment2 {
  private FragmentBuildersModule_ContributeNetworksFragment2() {}

  @Binds
  @IntoMap
  @ClassKey(NetworksFragment2.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      NetworksFragment2Subcomponent.Factory builder);

  @Subcomponent
  public interface NetworksFragment2Subcomponent extends AndroidInjector<NetworksFragment2> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<NetworksFragment2> {}
  }
}
