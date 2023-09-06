package com.easyplex.di.module;

import com.easyplex.ui.downloadmanager.ui.main.FinishedDownloadsFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeFinishedDownloadsFragment
          .FinishedDownloadsFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class FragmentBuildersModule_ContributeFinishedDownloadsFragment {
  private FragmentBuildersModule_ContributeFinishedDownloadsFragment() {}

  @Binds
  @IntoMap
  @ClassKey(FinishedDownloadsFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      FinishedDownloadsFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface FinishedDownloadsFragmentSubcomponent
      extends AndroidInjector<FinishedDownloadsFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<FinishedDownloadsFragment> {}
  }
}
