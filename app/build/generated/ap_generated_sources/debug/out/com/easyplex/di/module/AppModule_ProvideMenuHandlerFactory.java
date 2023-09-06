package com.easyplex.di.module;

import com.easyplex.ui.users.MenuHandler;
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
public final class AppModule_ProvideMenuHandlerFactory implements Factory<MenuHandler> {
  private final AppModule module;

  public AppModule_ProvideMenuHandlerFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public MenuHandler get() {
    return provideMenuHandler(module);
  }

  public static AppModule_ProvideMenuHandlerFactory create(AppModule module) {
    return new AppModule_ProvideMenuHandlerFactory(module);
  }

  public static MenuHandler provideMenuHandler(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideMenuHandler());
  }
}
