package com.easyplex.di.module;

import com.easyplex.ui.player.utilities.PlaybackSettingMenu;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvidePlaybackSettingMenuFactory implements Factory<PlaybackSettingMenu> {
  private final AppModule module;

  public AppModule_ProvidePlaybackSettingMenuFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public PlaybackSettingMenu get() {
    return providePlaybackSettingMenu(module);
  }

  public static AppModule_ProvidePlaybackSettingMenuFactory create(AppModule module) {
    return new AppModule_ProvidePlaybackSettingMenuFactory(module);
  }

  public static PlaybackSettingMenu providePlaybackSettingMenu(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providePlaybackSettingMenu());
  }
}
