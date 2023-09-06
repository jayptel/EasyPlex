package com.easyplex.di.module;

import com.easyplex.ui.users.UserProfiles;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(subcomponents = ActivityModule_ContributeUserProfiles.UserProfilesSubcomponent.class)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityModule_ContributeUserProfiles {
  private ActivityModule_ContributeUserProfiles() {}

  @Binds
  @IntoMap
  @ClassKey(UserProfiles.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      UserProfilesSubcomponent.Factory builder);

  @Subcomponent
  public interface UserProfilesSubcomponent extends AndroidInjector<UserProfiles> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<UserProfiles> {}
  }
}
