package com.easyplex.di.module;

import com.easyplex.ui.player.activities.EmbedActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(subcomponents = ActivityModule_ContributeEmbedActivity.EmbedActivitySubcomponent.class)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityModule_ContributeEmbedActivity {
  private ActivityModule_ContributeEmbedActivity() {}

  @Binds
  @IntoMap
  @ClassKey(EmbedActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      EmbedActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface EmbedActivitySubcomponent extends AndroidInjector<EmbedActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<EmbedActivity> {}
  }
}
