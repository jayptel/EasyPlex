package com.easyplex.ui.viewmodels;

import com.easyplex.data.remote.ApiInterface;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Named;
import javax.inject.Provider;

@QualifierMetadata("javax.inject.Named")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UpcomingViewModel_MembersInjector implements MembersInjector<UpcomingViewModel> {
  private final Provider<ApiInterface> requestStatusApiProvider;

  public UpcomingViewModel_MembersInjector(Provider<ApiInterface> requestStatusApiProvider) {
    this.requestStatusApiProvider = requestStatusApiProvider;
  }

  public static MembersInjector<UpcomingViewModel> create(
      Provider<ApiInterface> requestStatusApiProvider) {
    return new UpcomingViewModel_MembersInjector(requestStatusApiProvider);
  }

  @Override
  public void injectMembers(UpcomingViewModel instance) {
    injectRequestStatusApi(instance, requestStatusApiProvider.get());
  }

  @InjectedFieldSignature("com.easyplex.ui.viewmodels.UpcomingViewModel.requestStatusApi")
  @Named("status")
  public static void injectRequestStatusApi(UpcomingViewModel instance,
      ApiInterface requestStatusApi) {
    instance.requestStatusApi = requestStatusApi;
  }
}
