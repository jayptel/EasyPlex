package com.easyplex.ui.player.bindings;

import android.content.SharedPreferences;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class PlayerController_MembersInjector implements MembersInjector<PlayerController> {
  private final Provider<SharedPreferences.Editor> sharedPreferencesEditorProvider;

  public PlayerController_MembersInjector(
      Provider<SharedPreferences.Editor> sharedPreferencesEditorProvider) {
    this.sharedPreferencesEditorProvider = sharedPreferencesEditorProvider;
  }

  public static MembersInjector<PlayerController> create(
      Provider<SharedPreferences.Editor> sharedPreferencesEditorProvider) {
    return new PlayerController_MembersInjector(sharedPreferencesEditorProvider);
  }

  @Override
  public void injectMembers(PlayerController instance) {
    injectSharedPreferencesEditor(instance, sharedPreferencesEditorProvider.get());
  }

  @InjectedFieldSignature("com.easyplex.ui.player.bindings.PlayerController.sharedPreferencesEditor")
  public static void injectSharedPreferencesEditor(PlayerController instance,
      SharedPreferences.Editor sharedPreferencesEditor) {
    instance.sharedPreferencesEditor = sharedPreferencesEditor;
  }
}
