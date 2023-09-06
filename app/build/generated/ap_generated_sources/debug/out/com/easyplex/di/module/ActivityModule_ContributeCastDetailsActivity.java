package com.easyplex.di.module;

import com.easyplex.ui.casts.CastDetailsActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents = ActivityModule_ContributeCastDetailsActivity.CastDetailsActivitySubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityModule_ContributeCastDetailsActivity {
  private ActivityModule_ContributeCastDetailsActivity() {}

  @Binds
  @IntoMap
  @ClassKey(CastDetailsActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      CastDetailsActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface CastDetailsActivitySubcomponent extends AndroidInjector<CastDetailsActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<CastDetailsActivity> {}
  }
}
