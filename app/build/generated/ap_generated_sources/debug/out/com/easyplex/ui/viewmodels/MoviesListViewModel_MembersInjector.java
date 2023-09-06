package com.easyplex.ui.viewmodels;

import com.easyplex.ui.manager.AuthManager;
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
public final class MoviesListViewModel_MembersInjector implements MembersInjector<MoviesListViewModel> {
  private final Provider<AuthManager> authManagerProvider;

  public MoviesListViewModel_MembersInjector(Provider<AuthManager> authManagerProvider) {
    this.authManagerProvider = authManagerProvider;
  }

  public static MembersInjector<MoviesListViewModel> create(
      Provider<AuthManager> authManagerProvider) {
    return new MoviesListViewModel_MembersInjector(authManagerProvider);
  }

  @Override
  public void injectMembers(MoviesListViewModel instance) {
    injectAuthManager(instance, authManagerProvider.get());
  }

  @InjectedFieldSignature("com.easyplex.ui.viewmodels.MoviesListViewModel.authManager")
  public static void injectAuthManager(MoviesListViewModel instance, AuthManager authManager) {
    instance.authManager = authManager;
  }
}
