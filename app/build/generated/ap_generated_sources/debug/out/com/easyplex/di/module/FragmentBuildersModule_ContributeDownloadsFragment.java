package com.easyplex.di.module;

import com.easyplex.ui.downloadmanager.ui.main.DownloadsFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeDownloadsFragment.DownloadsFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class FragmentBuildersModule_ContributeDownloadsFragment {
  private FragmentBuildersModule_ContributeDownloadsFragment() {}

  @Binds
  @IntoMap
  @ClassKey(DownloadsFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      DownloadsFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface DownloadsFragmentSubcomponent extends AndroidInjector<DownloadsFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<DownloadsFragment> {}
  }
}
