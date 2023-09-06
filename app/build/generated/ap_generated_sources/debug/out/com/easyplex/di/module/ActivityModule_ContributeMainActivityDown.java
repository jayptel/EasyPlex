package com.easyplex.di.module;

import com.easyplex.ui.downloadmanager.ui.main.DownloadManagerFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      ActivityModule_ContributeMainActivityDown.DownloadManagerFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityModule_ContributeMainActivityDown {
  private ActivityModule_ContributeMainActivityDown() {}

  @Binds
  @IntoMap
  @ClassKey(DownloadManagerFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      DownloadManagerFragmentSubcomponent.Factory builder);

  @Subcomponent(modules = FragmentBuildersModule.class)
  public interface DownloadManagerFragmentSubcomponent
      extends AndroidInjector<DownloadManagerFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<DownloadManagerFragment> {}
  }
}
