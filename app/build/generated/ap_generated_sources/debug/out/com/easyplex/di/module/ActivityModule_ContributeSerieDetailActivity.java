package com.easyplex.di.module;

import com.easyplex.ui.seriedetails.SerieDetailsActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      ActivityModule_ContributeSerieDetailActivity.SerieDetailsActivitySubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityModule_ContributeSerieDetailActivity {
  private ActivityModule_ContributeSerieDetailActivity() {}

  @Binds
  @IntoMap
  @ClassKey(SerieDetailsActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SerieDetailsActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface SerieDetailsActivitySubcomponent extends AndroidInjector<SerieDetailsActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SerieDetailsActivity> {}
  }
}
