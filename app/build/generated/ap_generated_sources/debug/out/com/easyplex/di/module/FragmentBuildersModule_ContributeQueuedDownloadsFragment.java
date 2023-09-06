package com.easyplex.di.module;

import com.easyplex.ui.downloadmanager.ui.main.QueuedDownloadsFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeQueuedDownloadsFragment.QueuedDownloadsFragmentSubcomponent
          .class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class FragmentBuildersModule_ContributeQueuedDownloadsFragment {
  private FragmentBuildersModule_ContributeQueuedDownloadsFragment() {}

  @Binds
  @IntoMap
  @ClassKey(QueuedDownloadsFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      QueuedDownloadsFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface QueuedDownloadsFragmentSubcomponent
      extends AndroidInjector<QueuedDownloadsFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<QueuedDownloadsFragment> {}
  }
}
