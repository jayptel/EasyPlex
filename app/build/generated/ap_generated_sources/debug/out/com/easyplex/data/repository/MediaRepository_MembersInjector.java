package com.easyplex.data.repository;

import com.easyplex.data.remote.ApiInterface;
import com.easyplex.easyplexsupportedhosts.Utils.Fsm;
import com.easyplex.ui.manager.SettingsManager;
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
public final class MediaRepository_MembersInjector implements MembersInjector<MediaRepository> {
  private final Provider<ApiInterface> requestImdbApiProvider;

  private final Provider<ApiInterface> requestOpenSubsProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  private final Provider<ApiInterface> requestAppApiProvider;

  private final Provider<com.easyplex.easyplexsupportedhosts.ApiInterface> utilscProvider;

  private final Provider<String> cuePointProvider;

  private final Provider<String> cuepointUrlProvider;

  private final Provider<ApiInterface> requestStatusApiProvider;

  private final Provider<ApiInterface> adplayingProvider;

  private final Provider<Fsm> fsmProvider;

  private final Provider<ApiInterface> requestAuthProvider;

  public MediaRepository_MembersInjector(Provider<ApiInterface> requestImdbApiProvider,
      Provider<ApiInterface> requestOpenSubsProvider,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<ApiInterface> requestAppApiProvider,
      Provider<com.easyplex.easyplexsupportedhosts.ApiInterface> utilscProvider,
      Provider<String> cuePointProvider, Provider<String> cuepointUrlProvider,
      Provider<ApiInterface> requestStatusApiProvider, Provider<ApiInterface> adplayingProvider,
      Provider<Fsm> fsmProvider, Provider<ApiInterface> requestAuthProvider) {
    this.requestImdbApiProvider = requestImdbApiProvider;
    this.requestOpenSubsProvider = requestOpenSubsProvider;
    this.settingsManagerProvider = settingsManagerProvider;
    this.requestAppApiProvider = requestAppApiProvider;
    this.utilscProvider = utilscProvider;
    this.cuePointProvider = cuePointProvider;
    this.cuepointUrlProvider = cuepointUrlProvider;
    this.requestStatusApiProvider = requestStatusApiProvider;
    this.adplayingProvider = adplayingProvider;
    this.fsmProvider = fsmProvider;
    this.requestAuthProvider = requestAuthProvider;
  }

  public static MembersInjector<MediaRepository> create(
      Provider<ApiInterface> requestImdbApiProvider, Provider<ApiInterface> requestOpenSubsProvider,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<ApiInterface> requestAppApiProvider,
      Provider<com.easyplex.easyplexsupportedhosts.ApiInterface> utilscProvider,
      Provider<String> cuePointProvider, Provider<String> cuepointUrlProvider,
      Provider<ApiInterface> requestStatusApiProvider, Provider<ApiInterface> adplayingProvider,
      Provider<Fsm> fsmProvider, Provider<ApiInterface> requestAuthProvider) {
    return new MediaRepository_MembersInjector(requestImdbApiProvider, requestOpenSubsProvider, settingsManagerProvider, requestAppApiProvider, utilscProvider, cuePointProvider, cuepointUrlProvider, requestStatusApiProvider, adplayingProvider, fsmProvider, requestAuthProvider);
  }

  @Override
  public void injectMembers(MediaRepository instance) {
    injectRequestImdbApi(instance, requestImdbApiProvider.get());
    injectRequestOpenSubs(instance, requestOpenSubsProvider.get());
    injectSettingsManager(instance, settingsManagerProvider.get());
    injectRequestAppApi(instance, requestAppApiProvider.get());
    injectUtilsc(instance, utilscProvider.get());
    injectCuePoint(instance, cuePointProvider.get());
    injectCuepointUrl(instance, cuepointUrlProvider.get());
    injectRequestStatusApi(instance, requestStatusApiProvider.get());
    injectAdplaying(instance, adplayingProvider.get());
    injectFsm(instance, fsmProvider.get());
    injectRequestAuth(instance, requestAuthProvider.get());
  }

  @InjectedFieldSignature("com.easyplex.data.repository.MediaRepository.requestImdbApi")
  @Named("imdb")
  public static void injectRequestImdbApi(MediaRepository instance, ApiInterface requestImdbApi) {
    instance.requestImdbApi = requestImdbApi;
  }

  @InjectedFieldSignature("com.easyplex.data.repository.MediaRepository.requestOpenSubs")
  @Named("opensubs")
  public static void injectRequestOpenSubs(MediaRepository instance, ApiInterface requestOpenSubs) {
    instance.requestOpenSubs = requestOpenSubs;
  }

  @InjectedFieldSignature("com.easyplex.data.repository.MediaRepository.settingsManager")
  public static void injectSettingsManager(MediaRepository instance,
      SettingsManager settingsManager) {
    instance.settingsManager = settingsManager;
  }

  @InjectedFieldSignature("com.easyplex.data.repository.MediaRepository.requestAppApi")
  @Named("callback")
  public static void injectRequestAppApi(MediaRepository instance, ApiInterface requestAppApi) {
    instance.requestAppApi = requestAppApi;
  }

  @InjectedFieldSignature("com.easyplex.data.repository.MediaRepository.utilsc")
  public static void injectUtilsc(MediaRepository instance,
      com.easyplex.easyplexsupportedhosts.ApiInterface utilsc) {
    instance.utilsc = utilsc;
  }

  @InjectedFieldSignature("com.easyplex.data.repository.MediaRepository.cuePoint")
  @Named("cuepoint")
  public static void injectCuePoint(MediaRepository instance, String cuePoint) {
    instance.cuePoint = cuePoint;
  }

  @InjectedFieldSignature("com.easyplex.data.repository.MediaRepository.cuepointUrl")
  @Named("cuepointUrl")
  public static void injectCuepointUrl(MediaRepository instance, String cuepointUrl) {
    instance.cuepointUrl = cuepointUrl;
  }

  @InjectedFieldSignature("com.easyplex.data.repository.MediaRepository.requestStatusApi")
  @Named("cuePointPlayer")
  public static void injectRequestStatusApi(MediaRepository instance,
      ApiInterface requestStatusApi) {
    instance.requestStatusApi = requestStatusApi;
  }

  @InjectedFieldSignature("com.easyplex.data.repository.MediaRepository.adplaying")
  @Named("adplaying")
  public static void injectAdplaying(MediaRepository instance, ApiInterface adplaying) {
    instance.adplaying = adplaying;
  }

  @InjectedFieldSignature("com.easyplex.data.repository.MediaRepository.fsm")
  @Named("loading")
  public static void injectFsm(MediaRepository instance, Fsm fsm) {
    instance.fsm = fsm;
  }

  @InjectedFieldSignature("com.easyplex.data.repository.MediaRepository.requestAuth")
  @Named("Auth")
  public static void injectRequestAuth(MediaRepository instance, ApiInterface requestAuth) {
    instance.requestAuth = requestAuth;
  }
}
