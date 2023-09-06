package com.easyplex.di.module;

import com.easyplex.ui.upcoming.UpcomingTitlesActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      ActivityModule_ContributeUpcomingTitlesActivity.UpcomingTitlesActivitySubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityModule_ContributeUpcomingTitlesActivity {
  private ActivityModule_ContributeUpcomingTitlesActivity() {}

  @Binds
  @IntoMap
  @ClassKey(UpcomingTitlesActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      UpcomingTitlesActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface UpcomingTitlesActivitySubcomponent
      extends AndroidInjector<UpcomingTitlesActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<UpcomingTitlesActivity> {}
  }
}
