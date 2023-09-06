package com.easyplex.di.module;

import com.easyplex.ui.library.LibraryFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents = FragmentBuildersModule_ContributeLibraryFragment.LibraryFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class FragmentBuildersModule_ContributeLibraryFragment {
  private FragmentBuildersModule_ContributeLibraryFragment() {}

  @Binds
  @IntoMap
  @ClassKey(LibraryFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      LibraryFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface LibraryFragmentSubcomponent extends AndroidInjector<LibraryFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<LibraryFragment> {}
  }
}
