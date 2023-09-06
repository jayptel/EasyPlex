package com.easyplex.di.module;

import com.easyplex.ui.notifications.NotificationManager;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents = ActivityModule_ContributeNotificationManager.NotificationManagerSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityModule_ContributeNotificationManager {
  private ActivityModule_ContributeNotificationManager() {}

  @Binds
  @IntoMap
  @ClassKey(NotificationManager.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      NotificationManagerSubcomponent.Factory builder);

  @Subcomponent
  public interface NotificationManagerSubcomponent extends AndroidInjector<NotificationManager> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<NotificationManager> {}
  }
}
