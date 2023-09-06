package com.easyplex.di.module;

import com.easyplex.ui.profile.EditProfileActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents = ActivityModule_ContributeEditProfileActivity.EditProfileActivitySubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityModule_ContributeEditProfileActivity {
  private ActivityModule_ContributeEditProfileActivity() {}

  @Binds
  @IntoMap
  @ClassKey(EditProfileActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      EditProfileActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface EditProfileActivitySubcomponent extends AndroidInjector<EditProfileActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<EditProfileActivity> {}
  }
}
