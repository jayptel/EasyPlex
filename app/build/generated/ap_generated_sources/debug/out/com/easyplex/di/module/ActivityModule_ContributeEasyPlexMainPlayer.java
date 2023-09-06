package com.easyplex.di.module;

import com.easyplex.ui.player.activities.EasyPlexMainPlayer;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents = ActivityModule_ContributeEasyPlexMainPlayer.EasyPlexMainPlayerSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityModule_ContributeEasyPlexMainPlayer {
  private ActivityModule_ContributeEasyPlexMainPlayer() {}

  @Binds
  @IntoMap
  @ClassKey(EasyPlexMainPlayer.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      EasyPlexMainPlayerSubcomponent.Factory builder);

  @Subcomponent
  public interface EasyPlexMainPlayerSubcomponent extends AndroidInjector<EasyPlexMainPlayer> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<EasyPlexMainPlayer> {}
  }
}
