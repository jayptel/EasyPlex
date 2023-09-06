package com.easyplex.di.module;

import com.easyplex.ui.library.LibraryStyleFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeLibraryStyleFragment.LibraryStyleFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class FragmentBuildersModule_ContributeLibraryStyleFragment {
  private FragmentBuildersModule_ContributeLibraryStyleFragment() {}

  @Binds
  @IntoMap
  @ClassKey(LibraryStyleFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      LibraryStyleFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface LibraryStyleFragmentSubcomponent extends AndroidInjector<LibraryStyleFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<LibraryStyleFragment> {}
  }
}
