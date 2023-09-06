package com.easyplex.di.module;

import com.easyplex.ui.streaming.StreamingetailsActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      ActivityModule_ContributeStreamingetailsActivity.StreamingetailsActivitySubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityModule_ContributeStreamingetailsActivity {
  private ActivityModule_ContributeStreamingetailsActivity() {}

  @Binds
  @IntoMap
  @ClassKey(StreamingetailsActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      StreamingetailsActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface StreamingetailsActivitySubcomponent
      extends AndroidInjector<StreamingetailsActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<StreamingetailsActivity> {}
  }
}
