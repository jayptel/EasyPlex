package com.easyplex.data.repository;

import com.easyplex.data.local.dao.AnimesDao;
import com.easyplex.data.local.dao.DownloadDao;
import com.easyplex.data.local.dao.HistoryDao;
import com.easyplex.data.local.dao.MoviesDao;
import com.easyplex.data.local.dao.ResumeDao;
import com.easyplex.data.local.dao.SeriesDao;
import com.easyplex.data.local.dao.StreamListDao;
import com.easyplex.data.remote.ApiInterface;
import com.easyplex.easyplexsupportedhosts.Utils.Fsm;
import com.easyplex.ui.manager.SettingsManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class MediaRepository_Factory implements Factory<MediaRepository> {
  private final Provider<MoviesDao> moviesDaoProvider;

  private final Provider<DownloadDao> downloadDaoProvider;

  private final Provider<ApiInterface> requestMainApiProvider;

  private final Provider<ApiInterface> requestImdbApiProvider;

  private final Provider<HistoryDao> historyDaoProvider;

  private final Provider<StreamListDao> streamListDaoProvider;

  private final Provider<ResumeDao> resumeDaoProvider;

  private final Provider<SeriesDao> seriesDaoProvider;

  private final Provider<AnimesDao> animesDaoProvider;

  private final Provider<com.easyplex.easyplexsupportedhosts.ApiInterface> utilscProvider;

  private final Provider<ApiInterface> requestImdbApiProvider2;

  private final Provider<ApiInterface> requestOpenSubsProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  private final Provider<ApiInterface> requestAppApiProvider;

  private final Provider<com.easyplex.easyplexsupportedhosts.ApiInterface> utilscProvider2;

  private final Provider<String> cuePointProvider;

  private final Provider<String> cuepointUrlProvider;

  private final Provider<ApiInterface> requestStatusApiProvider;

  private final Provider<ApiInterface> adplayingProvider;

  private final Provider<Fsm> fsmProvider;

  private final Provider<ApiInterface> requestAuthProvider;

  public MediaRepository_Factory(Provider<MoviesDao> moviesDaoProvider,
      Provider<DownloadDao> downloadDaoProvider, Provider<ApiInterface> requestMainApiProvider,
      Provider<ApiInterface> requestImdbApiProvider, Provider<HistoryDao> historyDaoProvider,
      Provider<StreamListDao> streamListDaoProvider, Provider<ResumeDao> resumeDaoProvider,
      Provider<SeriesDao> seriesDaoProvider, Provider<AnimesDao> animesDaoProvider,
      Provider<com.easyplex.easyplexsupportedhosts.ApiInterface> utilscProvider,
      Provider<ApiInterface> requestImdbApiProvider2,
      Provider<ApiInterface> requestOpenSubsProvider,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<ApiInterface> requestAppApiProvider,
      Provider<com.easyplex.easyplexsupportedhosts.ApiInterface> utilscProvider2,
      Provider<String> cuePointProvider, Provider<String> cuepointUrlProvider,
      Provider<ApiInterface> requestStatusApiProvider, Provider<ApiInterface> adplayingProvider,
      Provider<Fsm> fsmProvider, Provider<ApiInterface> requestAuthProvider) {
    this.moviesDaoProvider = moviesDaoProvider;
    this.downloadDaoProvider = downloadDaoProvider;
    this.requestMainApiProvider = requestMainApiProvider;
    this.requestImdbApiProvider = requestImdbApiProvider;
    this.historyDaoProvider = historyDaoProvider;
    this.streamListDaoProvider = streamListDaoProvider;
    this.resumeDaoProvider = resumeDaoProvider;
    this.seriesDaoProvider = seriesDaoProvider;
    this.animesDaoProvider = animesDaoProvider;
    this.utilscProvider = utilscProvider;
    this.requestImdbApiProvider2 = requestImdbApiProvider2;
    this.requestOpenSubsProvider = requestOpenSubsProvider;
    this.settingsManagerProvider = settingsManagerProvider;
    this.requestAppApiProvider = requestAppApiProvider;
    this.utilscProvider2 = utilscProvider2;
    this.cuePointProvider = cuePointProvider;
    this.cuepointUrlProvider = cuepointUrlProvider;
    this.requestStatusApiProvider = requestStatusApiProvider;
    this.adplayingProvider = adplayingProvider;
    this.fsmProvider = fsmProvider;
    this.requestAuthProvider = requestAuthProvider;
  }

  @Override
  public MediaRepository get() {
    MediaRepository instance = newInstance(moviesDaoProvider.get(), downloadDaoProvider.get(), requestMainApiProvider.get(), requestImdbApiProvider.get(), historyDaoProvider.get(), streamListDaoProvider.get(), resumeDaoProvider.get(), seriesDaoProvider.get(), animesDaoProvider.get(), utilscProvider.get());
    MediaRepository_MembersInjector.injectRequestImdbApi(instance, requestImdbApiProvider2.get());
    MediaRepository_MembersInjector.injectRequestOpenSubs(instance, requestOpenSubsProvider.get());
    MediaRepository_MembersInjector.injectSettingsManager(instance, settingsManagerProvider.get());
    MediaRepository_MembersInjector.injectRequestAppApi(instance, requestAppApiProvider.get());
    MediaRepository_MembersInjector.injectUtilsc(instance, utilscProvider2.get());
    MediaRepository_MembersInjector.injectCuePoint(instance, cuePointProvider.get());
    MediaRepository_MembersInjector.injectCuepointUrl(instance, cuepointUrlProvider.get());
    MediaRepository_MembersInjector.injectRequestStatusApi(instance, requestStatusApiProvider.get());
    MediaRepository_MembersInjector.injectAdplaying(instance, adplayingProvider.get());
    MediaRepository_MembersInjector.injectFsm(instance, fsmProvider.get());
    MediaRepository_MembersInjector.injectRequestAuth(instance, requestAuthProvider.get());
    return instance;
  }

  public static MediaRepository_Factory create(Provider<MoviesDao> moviesDaoProvider,
      Provider<DownloadDao> downloadDaoProvider, Provider<ApiInterface> requestMainApiProvider,
      Provider<ApiInterface> requestImdbApiProvider, Provider<HistoryDao> historyDaoProvider,
      Provider<StreamListDao> streamListDaoProvider, Provider<ResumeDao> resumeDaoProvider,
      Provider<SeriesDao> seriesDaoProvider, Provider<AnimesDao> animesDaoProvider,
      Provider<com.easyplex.easyplexsupportedhosts.ApiInterface> utilscProvider,
      Provider<ApiInterface> requestImdbApiProvider2,
      Provider<ApiInterface> requestOpenSubsProvider,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<ApiInterface> requestAppApiProvider,
      Provider<com.easyplex.easyplexsupportedhosts.ApiInterface> utilscProvider2,
      Provider<String> cuePointProvider, Provider<String> cuepointUrlProvider,
      Provider<ApiInterface> requestStatusApiProvider, Provider<ApiInterface> adplayingProvider,
      Provider<Fsm> fsmProvider, Provider<ApiInterface> requestAuthProvider) {
    return new MediaRepository_Factory(moviesDaoProvider, downloadDaoProvider, requestMainApiProvider, requestImdbApiProvider, historyDaoProvider, streamListDaoProvider, resumeDaoProvider, seriesDaoProvider, animesDaoProvider, utilscProvider, requestImdbApiProvider2, requestOpenSubsProvider, settingsManagerProvider, requestAppApiProvider, utilscProvider2, cuePointProvider, cuepointUrlProvider, requestStatusApiProvider, adplayingProvider, fsmProvider, requestAuthProvider);
  }

  public static MediaRepository newInstance(MoviesDao moviesDao, DownloadDao downloadDao,
      ApiInterface requestMainApi, ApiInterface requestImdbApi, HistoryDao historyDao,
      StreamListDao streamListDao, ResumeDao resumeDao, SeriesDao seriesDao, AnimesDao animesDao,
      com.easyplex.easyplexsupportedhosts.ApiInterface utilsc) {
    return new MediaRepository(moviesDao, downloadDao, requestMainApi, requestImdbApi, historyDao, streamListDao, resumeDao, seriesDao, animesDao, utilsc);
  }
}
