package com.easyplex.di.component;

import android.app.Application;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import androidx.lifecycle.ViewModel;
import com.easyplex.EasyPlexApp;
import com.easyplex.EasyPlexApp_MembersInjector;
import com.easyplex.data.local.EasyPlexDatabase;
import com.easyplex.data.local.dao.AnimesDao;
import com.easyplex.data.local.dao.DownloadDao;
import com.easyplex.data.local.dao.HistoryDao;
import com.easyplex.data.local.dao.MoviesDao;
import com.easyplex.data.local.dao.ResumeDao;
import com.easyplex.data.local.dao.SeriesDao;
import com.easyplex.data.local.dao.StreamListDao;
import com.easyplex.data.model.ads.AdRetriever;
import com.easyplex.data.model.ads.CuePointsRetriever;
import com.easyplex.data.remote.ApiInterface;
import com.easyplex.data.repository.AnimeRepository;
import com.easyplex.data.repository.AnimeRepository_Factory;
import com.easyplex.data.repository.AuthRepository;
import com.easyplex.data.repository.AuthRepository_Factory;
import com.easyplex.data.repository.AuthRepository_MembersInjector;
import com.easyplex.data.repository.MediaRepository;
import com.easyplex.data.repository.MediaRepository_Factory;
import com.easyplex.data.repository.SettingsRepository;
import com.easyplex.data.repository.SettingsRepository_Factory;
import com.easyplex.data.repository.SettingsRepository_MembersInjector;
import com.easyplex.di.module.ActivityModule_ContributeAnimeDetailsActivity;
import com.easyplex.di.module.ActivityModule_ContributeCastDetailsActivity;
import com.easyplex.di.module.ActivityModule_ContributeEasyPlexMainPlayer;
import com.easyplex.di.module.ActivityModule_ContributeEditProfileActivity;
import com.easyplex.di.module.ActivityModule_ContributeEmbedActivity;
import com.easyplex.di.module.ActivityModule_ContributeEpisodeDetailsActivity;
import com.easyplex.di.module.ActivityModule_ContributeLoginActivity;
import com.easyplex.di.module.ActivityModule_ContributeMainActivity;
import com.easyplex.di.module.ActivityModule_ContributeMainActivityDown;
import com.easyplex.di.module.ActivityModule_ContributeMovieDetailActivity;
import com.easyplex.di.module.ActivityModule_ContributeNotificationManager;
import com.easyplex.di.module.ActivityModule_ContributePasswordForget;
import com.easyplex.di.module.ActivityModule_ContributePayment;
import com.easyplex.di.module.ActivityModule_ContributePaymentDetails;
import com.easyplex.di.module.ActivityModule_ContributePaymentPaypal;
import com.easyplex.di.module.ActivityModule_ContributePaymentStripe;
import com.easyplex.di.module.ActivityModule_ContributePhoneAuthActivity;
import com.easyplex.di.module.ActivityModule_ContributeRegisterActivity;
import com.easyplex.di.module.ActivityModule_ContributeRegistrationSucess;
import com.easyplex.di.module.ActivityModule_ContributeSerieDetailActivity;
import com.easyplex.di.module.ActivityModule_ContributeSplashActivity;
import com.easyplex.di.module.ActivityModule_ContributeStreamingetailsActivity;
import com.easyplex.di.module.ActivityModule_ContributeTrailerPreviewActivity;
import com.easyplex.di.module.ActivityModule_ContributeUpcomingTitlesActivity;
import com.easyplex.di.module.ActivityModule_ContributeUserProfiles;
import com.easyplex.di.module.AppModule;
import com.easyplex.di.module.AppModule_AppControllerProvideFactory;
import com.easyplex.di.module.AppModule_CheckVpnFactory;
import com.easyplex.di.module.AppModule_MainAdapterProvideFactory;
import com.easyplex.di.module.AppModule_MainPlayerFactory;
import com.easyplex.di.module.AppModule_PackNameFactory;
import com.easyplex.di.module.AppModule_PlayerLoadingFactory;
import com.easyplex.di.module.AppModule_ProfilesAdapterProvideFactory;
import com.easyplex.di.module.AppModule_ProvideAdInterfaceNoPrerollFactory;
import com.easyplex.di.module.AppModule_ProvideAdPlayingFactory;
import com.easyplex.di.module.AppModule_ProvideAdPlayingMonitorFactory;
import com.easyplex.di.module.AppModule_ProvideAdRetrieverFactory;
import com.easyplex.di.module.AppModule_ProvideAdsManagerFactory;
import com.easyplex.di.module.AppModule_ProvideAnimesDaoFactory;
import com.easyplex.di.module.AppModule_ProvideApplicationInfoFactory;
import com.easyplex.di.module.AppModule_ProvideAuthManagerFactory;
import com.easyplex.di.module.AppModule_ProvideCallbackFactory;
import com.easyplex.di.module.AppModule_ProvideComponentControllerFactory;
import com.easyplex.di.module.AppModule_ProvideControllerFactory;
import com.easyplex.di.module.AppModule_ProvideCuePointCallBackAdFactory;
import com.easyplex.di.module.AppModule_ProvideCuePointFactory;
import com.easyplex.di.module.AppModule_ProvideCuePointMonitorFactory;
import com.easyplex.di.module.AppModule_ProvideCuePointNFactory;
import com.easyplex.di.module.AppModule_ProvideCuePointUrlFactory;
import com.easyplex.di.module.AppModule_ProvideCuePointWFactory;
import com.easyplex.di.module.AppModule_ProvideCuePointYFactory;
import com.easyplex.di.module.AppModule_ProvideCuePointZFactory;
import com.easyplex.di.module.AppModule_ProvideCuePointsRetrieverFactory;
import com.easyplex.di.module.AppModule_ProvideDbFactory;
import com.easyplex.di.module.AppModule_ProvideFavMoviesDaoFactory;
import com.easyplex.di.module.AppModule_ProvideFirebaseRemoteConfigFactory;
import com.easyplex.di.module.AppModule_ProvideFsmPlayerFactory;
import com.easyplex.di.module.AppModule_ProvideHistoryDaoFactory;
import com.easyplex.di.module.AppModule_ProvideMenuHandlerFactory;
import com.easyplex.di.module.AppModule_ProvideMoviesServiceFactory;
import com.easyplex.di.module.AppModule_ProvideMoviesServiceImdbFactory;
import com.easyplex.di.module.AppModule_ProvideMoviesServiceOpenSubsFactory;
import com.easyplex.di.module.AppModule_ProvidePlaybackSettingMenuFactory;
import com.easyplex.di.module.AppModule_ProvidePlayerControllerFactory;
import com.easyplex.di.module.AppModule_ProvideProgressDaoFactory;
import com.easyplex.di.module.AppModule_ProvideReadyFactory;
import com.easyplex.di.module.AppModule_ProvideResumeDaoFactory;
import com.easyplex.di.module.AppModule_ProvideRootFactory;
import com.easyplex.di.module.AppModule_ProvideSeriesDaoFactory;
import com.easyplex.di.module.AppModule_ProvideServiceAuthFactory;
import com.easyplex.di.module.AppModule_ProvideServiceStatusFactory;
import com.easyplex.di.module.AppModule_ProvideSettingsManagerFactory;
import com.easyplex.di.module.AppModule_ProvideSharedPreferencesFactory;
import com.easyplex.di.module.AppModule_ProvideStateFactoryFactory;
import com.easyplex.di.module.AppModule_ProvideStatusManagerFactory;
import com.easyplex.di.module.AppModule_ProvideStreamyDaoFactory;
import com.easyplex.di.module.AppModule_ProvideTokenManagerFactory;
import com.easyplex.di.module.AppModule_ProvideUtilsCFactory;
import com.easyplex.di.module.AppModule_ProvideVpaidClientFactory;
import com.easyplex.di.module.AppModule_ProvideadplayingNFactory;
import com.easyplex.di.module.AppModule_ProvideadplayingWFactory;
import com.easyplex.di.module.AppModule_ProvideadplayingYFactory;
import com.easyplex.di.module.AppModule_ProvideadplayingZFactory;
import com.easyplex.di.module.AppModule_ProvidesSharedPreferencesEditorFactory;
import com.easyplex.di.module.AppModule_ShadowEnableFactory;
import com.easyplex.di.module.FragmentBuildersModule_ContributeAnimesFragment;
import com.easyplex.di.module.FragmentBuildersModule_ContributeAnimesListFragment;
import com.easyplex.di.module.FragmentBuildersModule_ContributeDiscoverFragment;
import com.easyplex.di.module.FragmentBuildersModule_ContributeDownloadsFragment;
import com.easyplex.di.module.FragmentBuildersModule_ContributeEpisodesFragment;
import com.easyplex.di.module.FragmentBuildersModule_ContributeFinishedDownloadsFragment;
import com.easyplex.di.module.FragmentBuildersModule_ContributeHomeFragment;
import com.easyplex.di.module.FragmentBuildersModule_ContributeLibraryFragment;
import com.easyplex.di.module.FragmentBuildersModule_ContributeLibraryStyleFragment;
import com.easyplex.di.module.FragmentBuildersModule_ContributeListFragment;
import com.easyplex.di.module.FragmentBuildersModule_ContributeLiveFragment;
import com.easyplex.di.module.FragmentBuildersModule_ContributeMoviesFragment;
import com.easyplex.di.module.FragmentBuildersModule_ContributeMyListMoviesFragment;
import com.easyplex.di.module.FragmentBuildersModule_ContributeNetworksFragment;
import com.easyplex.di.module.FragmentBuildersModule_ContributeNetworksFragment2;
import com.easyplex.di.module.FragmentBuildersModule_ContributeQueuedDownloadsFragment;
import com.easyplex.di.module.FragmentBuildersModule_ContributeSeriesFragment;
import com.easyplex.di.module.FragmentBuildersModule_ContributeSeriesListFragment;
import com.easyplex.di.module.FragmentBuildersModule_ContributeSettingsFragment;
import com.easyplex.di.module.FragmentBuildersModule_ContributeStreamingListFragment;
import com.easyplex.di.module.FragmentBuildersModule_ContributeUpcomingFragment;
import com.easyplex.easyplexsupportedhosts.Utils.Fsm;
import com.easyplex.ui.animes.AnimeDetailsActivity;
import com.easyplex.ui.animes.AnimeDetailsActivity_MembersInjector;
import com.easyplex.ui.animes.EpisodesFragment;
import com.easyplex.ui.animes.EpisodesFragment_MembersInjector;
import com.easyplex.ui.base.BaseActivity;
import com.easyplex.ui.base.BaseActivity_MembersInjector;
import com.easyplex.ui.casts.CastDetailsActivity;
import com.easyplex.ui.casts.CastDetailsActivity_MembersInjector;
import com.easyplex.ui.downloadmanager.ui.main.DownloadManagerFragment;
import com.easyplex.ui.downloadmanager.ui.main.DownloadsFragment;
import com.easyplex.ui.downloadmanager.ui.main.DownloadsFragment_MembersInjector;
import com.easyplex.ui.downloadmanager.ui.main.FinishedDownloadsFragment;
import com.easyplex.ui.downloadmanager.ui.main.QueuedDownloadsFragment;
import com.easyplex.ui.home.HomeFragment;
import com.easyplex.ui.home.HomeFragment_MembersInjector;
import com.easyplex.ui.home.adapters.MainAdapter;
import com.easyplex.ui.library.AnimesFragment;
import com.easyplex.ui.library.AnimesFragment_MembersInjector;
import com.easyplex.ui.library.LibraryFragment;
import com.easyplex.ui.library.LibraryFragment_MembersInjector;
import com.easyplex.ui.library.LibraryStyleFragment;
import com.easyplex.ui.library.LibraryStyleFragment_MembersInjector;
import com.easyplex.ui.library.MoviesFragment;
import com.easyplex.ui.library.MoviesFragment_MembersInjector;
import com.easyplex.ui.library.NetworksFragment;
import com.easyplex.ui.library.NetworksFragment2;
import com.easyplex.ui.library.NetworksFragment2_MembersInjector;
import com.easyplex.ui.library.NetworksFragment_MembersInjector;
import com.easyplex.ui.library.SeriesFragment;
import com.easyplex.ui.library.SeriesFragment_MembersInjector;
import com.easyplex.ui.login.LoginActivity;
import com.easyplex.ui.login.LoginActivity_MembersInjector;
import com.easyplex.ui.login.PasswordForget;
import com.easyplex.ui.login.PasswordForget_MembersInjector;
import com.easyplex.ui.manager.AdsManager;
import com.easyplex.ui.manager.AuthManager;
import com.easyplex.ui.manager.SettingsManager;
import com.easyplex.ui.manager.StatusManager;
import com.easyplex.ui.manager.TokenManager;
import com.easyplex.ui.moviedetails.MovieDetailsActivity;
import com.easyplex.ui.moviedetails.MovieDetailsActivity_MembersInjector;
import com.easyplex.ui.mylist.AnimesListFragment;
import com.easyplex.ui.mylist.AnimesListFragment_MembersInjector;
import com.easyplex.ui.mylist.ListFragment;
import com.easyplex.ui.mylist.ListFragment_MembersInjector;
import com.easyplex.ui.mylist.MoviesListFragment;
import com.easyplex.ui.mylist.MoviesListFragment_MembersInjector;
import com.easyplex.ui.mylist.SeriesListFragment;
import com.easyplex.ui.mylist.SeriesListFragment_MembersInjector;
import com.easyplex.ui.mylist.StreamingListFragment;
import com.easyplex.ui.mylist.StreamingListFragment_MembersInjector;
import com.easyplex.ui.notifications.NotificationManager;
import com.easyplex.ui.notifications.NotificationManager_MembersInjector;
import com.easyplex.ui.payment.Payment;
import com.easyplex.ui.payment.PaymentDetails;
import com.easyplex.ui.payment.PaymentDetails_MembersInjector;
import com.easyplex.ui.payment.PaymentPaypal;
import com.easyplex.ui.payment.PaymentPaypal_MembersInjector;
import com.easyplex.ui.payment.PaymentStripe;
import com.easyplex.ui.payment.PaymentStripe_MembersInjector;
import com.easyplex.ui.payment.Payment_MembersInjector;
import com.easyplex.ui.player.activities.EasyPlexMainPlayer;
import com.easyplex.ui.player.activities.EasyPlexMainPlayer_MembersInjector;
import com.easyplex.ui.player.activities.EasyPlexPlayerActivity_MembersInjector;
import com.easyplex.ui.player.activities.EmbedActivity;
import com.easyplex.ui.player.activities.EmbedActivity_MembersInjector;
import com.easyplex.ui.player.bindings.PlayerController;
import com.easyplex.ui.player.controller.PlayerAdLogicController;
import com.easyplex.ui.player.controller.PlayerUIController;
import com.easyplex.ui.player.fsm.callback.AdInterface;
import com.easyplex.ui.player.fsm.concrete.factory.StateFactory;
import com.easyplex.ui.player.fsm.listener.AdPlayingMonitor;
import com.easyplex.ui.player.fsm.listener.CuePointMonitor;
import com.easyplex.ui.player.fsm.state_machine.FsmPlayer;
import com.easyplex.ui.player.interfaces.VpaidClient;
import com.easyplex.ui.player.utilities.PlaybackSettingMenu;
import com.easyplex.ui.profile.EditProfileActivity;
import com.easyplex.ui.profile.EditProfileActivity_MembersInjector;
import com.easyplex.ui.register.RegisterActivity;
import com.easyplex.ui.register.RegisterActivity_MembersInjector;
import com.easyplex.ui.register.RegistrationSucess;
import com.easyplex.ui.register.RegistrationSucess_MembersInjector;
import com.easyplex.ui.search.DiscoverFragment;
import com.easyplex.ui.search.DiscoverFragment_MembersInjector;
import com.easyplex.ui.seriedetails.EpisodeDetailsActivity;
import com.easyplex.ui.seriedetails.EpisodeDetailsActivity_MembersInjector;
import com.easyplex.ui.seriedetails.SerieDetailsActivity;
import com.easyplex.ui.seriedetails.SerieDetailsActivity_MembersInjector;
import com.easyplex.ui.settings.SettingsActivity;
import com.easyplex.ui.settings.SettingsActivity_MembersInjector;
import com.easyplex.ui.splash.SplashActivity;
import com.easyplex.ui.splash.SplashActivity_MembersInjector;
import com.easyplex.ui.streaming.StreamingFragment;
import com.easyplex.ui.streaming.StreamingFragment_MembersInjector;
import com.easyplex.ui.streaming.StreamingetailsActivity;
import com.easyplex.ui.streaming.StreamingetailsActivity_MembersInjector;
import com.easyplex.ui.trailer.TrailerPreviewActivity;
import com.easyplex.ui.trailer.TrailerPreviewActivity_MembersInjector;
import com.easyplex.ui.upcoming.UpComingFragment;
import com.easyplex.ui.upcoming.UpComingFragment_MembersInjector;
import com.easyplex.ui.upcoming.UpcomingTitlesActivity;
import com.easyplex.ui.upcoming.UpcomingTitlesActivity_MembersInjector;
import com.easyplex.ui.users.MenuHandler;
import com.easyplex.ui.users.PhoneAuthActivity;
import com.easyplex.ui.users.PhoneAuthActivity_MembersInjector;
import com.easyplex.ui.users.ProfilesAdapter;
import com.easyplex.ui.users.UserProfiles;
import com.easyplex.ui.users.UserProfiles_MembersInjector;
import com.easyplex.ui.viewmodels.AnimeViewModel;
import com.easyplex.ui.viewmodels.AnimeViewModel_Factory;
import com.easyplex.ui.viewmodels.CastersViewModel;
import com.easyplex.ui.viewmodels.CastersViewModel_Factory;
import com.easyplex.ui.viewmodels.GenresViewModel;
import com.easyplex.ui.viewmodels.GenresViewModel_Factory;
import com.easyplex.ui.viewmodels.HomeViewModel;
import com.easyplex.ui.viewmodels.HomeViewModel_Factory;
import com.easyplex.ui.viewmodels.LoginViewModel;
import com.easyplex.ui.viewmodels.LoginViewModel_Factory;
import com.easyplex.ui.viewmodels.MovieDetailViewModel;
import com.easyplex.ui.viewmodels.MovieDetailViewModel_Factory;
import com.easyplex.ui.viewmodels.MoviesListViewModel;
import com.easyplex.ui.viewmodels.MoviesListViewModel_Factory;
import com.easyplex.ui.viewmodels.MoviesListViewModel_MembersInjector;
import com.easyplex.ui.viewmodels.NetworksViewModel;
import com.easyplex.ui.viewmodels.NetworksViewModel_Factory;
import com.easyplex.ui.viewmodels.PlayerViewModel;
import com.easyplex.ui.viewmodels.PlayerViewModel_Factory;
import com.easyplex.ui.viewmodels.RegisterViewModel;
import com.easyplex.ui.viewmodels.RegisterViewModel_Factory;
import com.easyplex.ui.viewmodels.SearchViewModel;
import com.easyplex.ui.viewmodels.SearchViewModel_Factory;
import com.easyplex.ui.viewmodels.SerieDetailViewModel;
import com.easyplex.ui.viewmodels.SerieDetailViewModel_Factory;
import com.easyplex.ui.viewmodels.SettingsViewModel;
import com.easyplex.ui.viewmodels.SettingsViewModel_Factory;
import com.easyplex.ui.viewmodels.StreamingDetailViewModel;
import com.easyplex.ui.viewmodels.StreamingDetailViewModel_Factory;
import com.easyplex.ui.viewmodels.StreamingGenresViewModel;
import com.easyplex.ui.viewmodels.StreamingGenresViewModel_Factory;
import com.easyplex.ui.viewmodels.UpcomingViewModel;
import com.easyplex.ui.viewmodels.UpcomingViewModel_Factory;
import com.easyplex.ui.viewmodels.UserViewModel;
import com.easyplex.ui.viewmodels.UserViewModel_Factory;
import com.easyplex.util.AppController;
import com.easyplex.viewmodel.MoviesViewModelFactory;
import com.easyplex.viewmodel.MoviesViewModelFactory_Factory;
import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.MapProviderFactory;
import dagger.internal.Preconditions;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerAppComponent {
  private DaggerAppComponent() {
  }

  public static AppComponent.Builder builder() {
    return new Builder();
  }

  private static final class Builder implements AppComponent.Builder {
    private Application application;

    @Override
    public Builder application(Application application) {
      this.application = Preconditions.checkNotNull(application);
      return this;
    }

    @Override
    public AppComponent build() {
      Preconditions.checkBuilderRequirement(application, Application.class);
      return new AppComponentImpl(new AppModule(), application);
    }
  }

  private static final class PhoneAuthActivitySubcomponentFactory implements ActivityModule_ContributePhoneAuthActivity.PhoneAuthActivitySubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private PhoneAuthActivitySubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityModule_ContributePhoneAuthActivity.PhoneAuthActivitySubcomponent create(
        PhoneAuthActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new PhoneAuthActivitySubcomponentImpl(appComponentImpl, arg0);
    }
  }

  private static final class UserProfilesSubcomponentFactory implements ActivityModule_ContributeUserProfiles.UserProfilesSubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private UserProfilesSubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityModule_ContributeUserProfiles.UserProfilesSubcomponent create(
        UserProfiles arg0) {
      Preconditions.checkNotNull(arg0);
      return new UserProfilesSubcomponentImpl(appComponentImpl, arg0);
    }
  }

  private static final class BaseActivitySubcomponentFactory implements ActivityModule_ContributeMainActivity.BaseActivitySubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private BaseActivitySubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityModule_ContributeMainActivity.BaseActivitySubcomponent create(
        BaseActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new BaseActivitySubcomponentImpl(appComponentImpl, arg0);
    }
  }

  private static final class DownloadManagerFragmentSubcomponentFactory implements ActivityModule_ContributeMainActivityDown.DownloadManagerFragmentSubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private DownloadManagerFragmentSubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityModule_ContributeMainActivityDown.DownloadManagerFragmentSubcomponent create(
        DownloadManagerFragment arg0) {
      Preconditions.checkNotNull(arg0);
      return new DownloadManagerFragmentSubcomponentImpl(appComponentImpl, arg0);
    }
  }

  private static final class PaymentSubcomponentFactory implements ActivityModule_ContributePayment.PaymentSubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private PaymentSubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityModule_ContributePayment.PaymentSubcomponent create(Payment arg0) {
      Preconditions.checkNotNull(arg0);
      return new PaymentSubcomponentImpl(appComponentImpl, arg0);
    }
  }

  private static final class PaymentPaypalSubcomponentFactory implements ActivityModule_ContributePaymentPaypal.PaymentPaypalSubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private PaymentPaypalSubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityModule_ContributePaymentPaypal.PaymentPaypalSubcomponent create(
        PaymentPaypal arg0) {
      Preconditions.checkNotNull(arg0);
      return new PaymentPaypalSubcomponentImpl(appComponentImpl, arg0);
    }
  }

  private static final class PaymentStripeSubcomponentFactory implements ActivityModule_ContributePaymentStripe.PaymentStripeSubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private PaymentStripeSubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityModule_ContributePaymentStripe.PaymentStripeSubcomponent create(
        PaymentStripe arg0) {
      Preconditions.checkNotNull(arg0);
      return new PaymentStripeSubcomponentImpl(appComponentImpl, arg0);
    }
  }

  private static final class NotificationManagerSubcomponentFactory implements ActivityModule_ContributeNotificationManager.NotificationManagerSubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private NotificationManagerSubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityModule_ContributeNotificationManager.NotificationManagerSubcomponent create(
        NotificationManager arg0) {
      Preconditions.checkNotNull(arg0);
      return new NotificationManagerSubcomponentImpl(appComponentImpl, arg0);
    }
  }

  private static final class PaymentDetailsSubcomponentFactory implements ActivityModule_ContributePaymentDetails.PaymentDetailsSubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private PaymentDetailsSubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityModule_ContributePaymentDetails.PaymentDetailsSubcomponent create(
        PaymentDetails arg0) {
      Preconditions.checkNotNull(arg0);
      return new PaymentDetailsSubcomponentImpl(appComponentImpl, arg0);
    }
  }

  private static final class RegistrationSucessSubcomponentFactory implements ActivityModule_ContributeRegistrationSucess.RegistrationSucessSubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private RegistrationSucessSubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityModule_ContributeRegistrationSucess.RegistrationSucessSubcomponent create(
        RegistrationSucess arg0) {
      Preconditions.checkNotNull(arg0);
      return new RegistrationSucessSubcomponentImpl(appComponentImpl, arg0);
    }
  }

  private static final class EditProfileActivitySubcomponentFactory implements ActivityModule_ContributeEditProfileActivity.EditProfileActivitySubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private EditProfileActivitySubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityModule_ContributeEditProfileActivity.EditProfileActivitySubcomponent create(
        EditProfileActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new EditProfileActivitySubcomponentImpl(appComponentImpl, arg0);
    }
  }

  private static final class MovieDetailsActivitySubcomponentFactory implements ActivityModule_ContributeMovieDetailActivity.MovieDetailsActivitySubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private MovieDetailsActivitySubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityModule_ContributeMovieDetailActivity.MovieDetailsActivitySubcomponent create(
        MovieDetailsActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new MovieDetailsActivitySubcomponentImpl(appComponentImpl, arg0);
    }
  }

  private static final class SerieDetailsActivitySubcomponentFactory implements ActivityModule_ContributeSerieDetailActivity.SerieDetailsActivitySubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private SerieDetailsActivitySubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityModule_ContributeSerieDetailActivity.SerieDetailsActivitySubcomponent create(
        SerieDetailsActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new SerieDetailsActivitySubcomponentImpl(appComponentImpl, arg0);
    }
  }

  private static final class LoginActivitySubcomponentFactory implements ActivityModule_ContributeLoginActivity.LoginActivitySubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private LoginActivitySubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityModule_ContributeLoginActivity.LoginActivitySubcomponent create(
        LoginActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new LoginActivitySubcomponentImpl(appComponentImpl, arg0);
    }
  }

  private static final class RegisterActivitySubcomponentFactory implements ActivityModule_ContributeRegisterActivity.RegisterActivitySubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private RegisterActivitySubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityModule_ContributeRegisterActivity.RegisterActivitySubcomponent create(
        RegisterActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new RegisterActivitySubcomponentImpl(appComponentImpl, arg0);
    }
  }

  private static final class TrailerPreviewActivitySubcomponentFactory implements ActivityModule_ContributeTrailerPreviewActivity.TrailerPreviewActivitySubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private TrailerPreviewActivitySubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityModule_ContributeTrailerPreviewActivity.TrailerPreviewActivitySubcomponent create(
        TrailerPreviewActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new TrailerPreviewActivitySubcomponentImpl(appComponentImpl, arg0);
    }
  }

  private static final class UpcomingTitlesActivitySubcomponentFactory implements ActivityModule_ContributeUpcomingTitlesActivity.UpcomingTitlesActivitySubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private UpcomingTitlesActivitySubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityModule_ContributeUpcomingTitlesActivity.UpcomingTitlesActivitySubcomponent create(
        UpcomingTitlesActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new UpcomingTitlesActivitySubcomponentImpl(appComponentImpl, arg0);
    }
  }

  private static final class AnimeDetailsActivitySubcomponentFactory implements ActivityModule_ContributeAnimeDetailsActivity.AnimeDetailsActivitySubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private AnimeDetailsActivitySubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityModule_ContributeAnimeDetailsActivity.AnimeDetailsActivitySubcomponent create(
        AnimeDetailsActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new AnimeDetailsActivitySubcomponentImpl(appComponentImpl, arg0);
    }
  }

  private static final class SplashActivitySubcomponentFactory implements ActivityModule_ContributeSplashActivity.SplashActivitySubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private SplashActivitySubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityModule_ContributeSplashActivity.SplashActivitySubcomponent create(
        SplashActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new SplashActivitySubcomponentImpl(appComponentImpl, arg0);
    }
  }

  private static final class EmbedActivitySubcomponentFactory implements ActivityModule_ContributeEmbedActivity.EmbedActivitySubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private EmbedActivitySubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityModule_ContributeEmbedActivity.EmbedActivitySubcomponent create(
        EmbedActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new EmbedActivitySubcomponentImpl(appComponentImpl, arg0);
    }
  }

  private static final class EasyPlexMainPlayerSubcomponentFactory implements ActivityModule_ContributeEasyPlexMainPlayer.EasyPlexMainPlayerSubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private EasyPlexMainPlayerSubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityModule_ContributeEasyPlexMainPlayer.EasyPlexMainPlayerSubcomponent create(
        EasyPlexMainPlayer arg0) {
      Preconditions.checkNotNull(arg0);
      return new EasyPlexMainPlayerSubcomponentImpl(appComponentImpl, arg0);
    }
  }

  private static final class PasswordForgetSubcomponentFactory implements ActivityModule_ContributePasswordForget.PasswordForgetSubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private PasswordForgetSubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityModule_ContributePasswordForget.PasswordForgetSubcomponent create(
        PasswordForget arg0) {
      Preconditions.checkNotNull(arg0);
      return new PasswordForgetSubcomponentImpl(appComponentImpl, arg0);
    }
  }

  private static final class CastDetailsActivitySubcomponentFactory implements ActivityModule_ContributeCastDetailsActivity.CastDetailsActivitySubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private CastDetailsActivitySubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityModule_ContributeCastDetailsActivity.CastDetailsActivitySubcomponent create(
        CastDetailsActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new CastDetailsActivitySubcomponentImpl(appComponentImpl, arg0);
    }
  }

  private static final class StreamingetailsActivitySubcomponentFactory implements ActivityModule_ContributeStreamingetailsActivity.StreamingetailsActivitySubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private StreamingetailsActivitySubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityModule_ContributeStreamingetailsActivity.StreamingetailsActivitySubcomponent create(
        StreamingetailsActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new StreamingetailsActivitySubcomponentImpl(appComponentImpl, arg0);
    }
  }

  private static final class EpisodeDetailsActivitySubcomponentFactory implements ActivityModule_ContributeEpisodeDetailsActivity.EpisodeDetailsActivitySubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private EpisodeDetailsActivitySubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ActivityModule_ContributeEpisodeDetailsActivity.EpisodeDetailsActivitySubcomponent create(
        EpisodeDetailsActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new EpisodeDetailsActivitySubcomponentImpl(appComponentImpl, arg0);
    }
  }

  private static final class EpisodesFragmentSubcomponentFactory implements FragmentBuildersModule_ContributeEpisodesFragment.EpisodesFragmentSubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private EpisodesFragmentSubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public FragmentBuildersModule_ContributeEpisodesFragment.EpisodesFragmentSubcomponent create(
        EpisodesFragment arg0) {
      Preconditions.checkNotNull(arg0);
      return new EpisodesFragmentSubcomponentImpl(appComponentImpl, arg0);
    }
  }

  private static final class FinishedDownloadsFragmentSubcomponentFactory implements FragmentBuildersModule_ContributeFinishedDownloadsFragment.FinishedDownloadsFragmentSubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private FinishedDownloadsFragmentSubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public FragmentBuildersModule_ContributeFinishedDownloadsFragment.FinishedDownloadsFragmentSubcomponent create(
        FinishedDownloadsFragment arg0) {
      Preconditions.checkNotNull(arg0);
      return new FinishedDownloadsFragmentSubcomponentImpl(appComponentImpl, arg0);
    }
  }

  private static final class QueuedDownloadsFragmentSubcomponentFactory implements FragmentBuildersModule_ContributeQueuedDownloadsFragment.QueuedDownloadsFragmentSubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private QueuedDownloadsFragmentSubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public FragmentBuildersModule_ContributeQueuedDownloadsFragment.QueuedDownloadsFragmentSubcomponent create(
        QueuedDownloadsFragment arg0) {
      Preconditions.checkNotNull(arg0);
      return new QueuedDownloadsFragmentSubcomponentImpl(appComponentImpl, arg0);
    }
  }

  private static final class DownloadsFragmentSubcomponentFactory implements FragmentBuildersModule_ContributeDownloadsFragment.DownloadsFragmentSubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private DownloadsFragmentSubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public FragmentBuildersModule_ContributeDownloadsFragment.DownloadsFragmentSubcomponent create(
        DownloadsFragment arg0) {
      Preconditions.checkNotNull(arg0);
      return new DownloadsFragmentSubcomponentImpl(appComponentImpl, arg0);
    }
  }

  private static final class HomeFragmentSubcomponentFactory implements FragmentBuildersModule_ContributeHomeFragment.HomeFragmentSubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private HomeFragmentSubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public FragmentBuildersModule_ContributeHomeFragment.HomeFragmentSubcomponent create(
        HomeFragment arg0) {
      Preconditions.checkNotNull(arg0);
      return new HomeFragmentSubcomponentImpl(appComponentImpl, arg0);
    }
  }

  private static final class UpComingFragmentSubcomponentFactory implements FragmentBuildersModule_ContributeUpcomingFragment.UpComingFragmentSubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private UpComingFragmentSubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public FragmentBuildersModule_ContributeUpcomingFragment.UpComingFragmentSubcomponent create(
        UpComingFragment arg0) {
      Preconditions.checkNotNull(arg0);
      return new UpComingFragmentSubcomponentImpl(appComponentImpl, arg0);
    }
  }

  private static final class DiscoverFragmentSubcomponentFactory implements FragmentBuildersModule_ContributeDiscoverFragment.DiscoverFragmentSubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private DiscoverFragmentSubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public FragmentBuildersModule_ContributeDiscoverFragment.DiscoverFragmentSubcomponent create(
        DiscoverFragment arg0) {
      Preconditions.checkNotNull(arg0);
      return new DiscoverFragmentSubcomponentImpl(appComponentImpl, arg0);
    }
  }

  private static final class MoviesFragmentSubcomponentFactory implements FragmentBuildersModule_ContributeMoviesFragment.MoviesFragmentSubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private MoviesFragmentSubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public FragmentBuildersModule_ContributeMoviesFragment.MoviesFragmentSubcomponent create(
        MoviesFragment arg0) {
      Preconditions.checkNotNull(arg0);
      return new MoviesFragmentSubcomponentImpl(appComponentImpl, arg0);
    }
  }

  private static final class LibraryStyleFragmentSubcomponentFactory implements FragmentBuildersModule_ContributeLibraryStyleFragment.LibraryStyleFragmentSubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private LibraryStyleFragmentSubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public FragmentBuildersModule_ContributeLibraryStyleFragment.LibraryStyleFragmentSubcomponent create(
        LibraryStyleFragment arg0) {
      Preconditions.checkNotNull(arg0);
      return new LibraryStyleFragmentSubcomponentImpl(appComponentImpl, arg0);
    }
  }

  private static final class SeriesFragmentSubcomponentFactory implements FragmentBuildersModule_ContributeSeriesFragment.SeriesFragmentSubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private SeriesFragmentSubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public FragmentBuildersModule_ContributeSeriesFragment.SeriesFragmentSubcomponent create(
        SeriesFragment arg0) {
      Preconditions.checkNotNull(arg0);
      return new SeriesFragmentSubcomponentImpl(appComponentImpl, arg0);
    }
  }

  private static final class LibraryFragmentSubcomponentFactory implements FragmentBuildersModule_ContributeLibraryFragment.LibraryFragmentSubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private LibraryFragmentSubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public FragmentBuildersModule_ContributeLibraryFragment.LibraryFragmentSubcomponent create(
        LibraryFragment arg0) {
      Preconditions.checkNotNull(arg0);
      return new LibraryFragmentSubcomponentImpl(appComponentImpl, arg0);
    }
  }

  private static final class MoviesListFragmentSubcomponentFactory implements FragmentBuildersModule_ContributeMyListMoviesFragment.MoviesListFragmentSubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private MoviesListFragmentSubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public FragmentBuildersModule_ContributeMyListMoviesFragment.MoviesListFragmentSubcomponent create(
        MoviesListFragment arg0) {
      Preconditions.checkNotNull(arg0);
      return new MoviesListFragmentSubcomponentImpl(appComponentImpl, arg0);
    }
  }

  private static final class AnimesFragmentSubcomponentFactory implements FragmentBuildersModule_ContributeAnimesFragment.AnimesFragmentSubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private AnimesFragmentSubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public FragmentBuildersModule_ContributeAnimesFragment.AnimesFragmentSubcomponent create(
        AnimesFragment arg0) {
      Preconditions.checkNotNull(arg0);
      return new AnimesFragmentSubcomponentImpl(appComponentImpl, arg0);
    }
  }

  private static final class StreamingFragmentSubcomponentFactory implements FragmentBuildersModule_ContributeLiveFragment.StreamingFragmentSubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private StreamingFragmentSubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public FragmentBuildersModule_ContributeLiveFragment.StreamingFragmentSubcomponent create(
        StreamingFragment arg0) {
      Preconditions.checkNotNull(arg0);
      return new StreamingFragmentSubcomponentImpl(appComponentImpl, arg0);
    }
  }

  private static final class SettingsActivitySubcomponentFactory implements FragmentBuildersModule_ContributeSettingsFragment.SettingsActivitySubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private SettingsActivitySubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public FragmentBuildersModule_ContributeSettingsFragment.SettingsActivitySubcomponent create(
        SettingsActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new SettingsActivitySubcomponentImpl(appComponentImpl, arg0);
    }
  }

  private static final class ListFragmentSubcomponentFactory implements FragmentBuildersModule_ContributeListFragment.ListFragmentSubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private ListFragmentSubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public FragmentBuildersModule_ContributeListFragment.ListFragmentSubcomponent create(
        ListFragment arg0) {
      Preconditions.checkNotNull(arg0);
      return new ListFragmentSubcomponentImpl(appComponentImpl, arg0);
    }
  }

  private static final class SeriesListFragmentSubcomponentFactory implements FragmentBuildersModule_ContributeSeriesListFragment.SeriesListFragmentSubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private SeriesListFragmentSubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public FragmentBuildersModule_ContributeSeriesListFragment.SeriesListFragmentSubcomponent create(
        SeriesListFragment arg0) {
      Preconditions.checkNotNull(arg0);
      return new SeriesListFragmentSubcomponentImpl(appComponentImpl, arg0);
    }
  }

  private static final class AnimesListFragmentSubcomponentFactory implements FragmentBuildersModule_ContributeAnimesListFragment.AnimesListFragmentSubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private AnimesListFragmentSubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public FragmentBuildersModule_ContributeAnimesListFragment.AnimesListFragmentSubcomponent create(
        AnimesListFragment arg0) {
      Preconditions.checkNotNull(arg0);
      return new AnimesListFragmentSubcomponentImpl(appComponentImpl, arg0);
    }
  }

  private static final class NetworksFragmentSubcomponentFactory implements FragmentBuildersModule_ContributeNetworksFragment.NetworksFragmentSubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private NetworksFragmentSubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public FragmentBuildersModule_ContributeNetworksFragment.NetworksFragmentSubcomponent create(
        NetworksFragment arg0) {
      Preconditions.checkNotNull(arg0);
      return new NetworksFragmentSubcomponentImpl(appComponentImpl, arg0);
    }
  }

  private static final class NetworksFragment2SubcomponentFactory implements FragmentBuildersModule_ContributeNetworksFragment2.NetworksFragment2Subcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private NetworksFragment2SubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public FragmentBuildersModule_ContributeNetworksFragment2.NetworksFragment2Subcomponent create(
        NetworksFragment2 arg0) {
      Preconditions.checkNotNull(arg0);
      return new NetworksFragment2SubcomponentImpl(appComponentImpl, arg0);
    }
  }

  private static final class StreamingListFragmentSubcomponentFactory implements FragmentBuildersModule_ContributeStreamingListFragment.StreamingListFragmentSubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private StreamingListFragmentSubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public FragmentBuildersModule_ContributeStreamingListFragment.StreamingListFragmentSubcomponent create(
        StreamingListFragment arg0) {
      Preconditions.checkNotNull(arg0);
      return new StreamingListFragmentSubcomponentImpl(appComponentImpl, arg0);
    }
  }

  private static final class PhoneAuthActivitySubcomponentImpl implements ActivityModule_ContributePhoneAuthActivity.PhoneAuthActivitySubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final PhoneAuthActivitySubcomponentImpl phoneAuthActivitySubcomponentImpl = this;

    private PhoneAuthActivitySubcomponentImpl(AppComponentImpl appComponentImpl,
        PhoneAuthActivity arg0Param) {
      this.appComponentImpl = appComponentImpl;


    }

    private AuthRepository authRepository() {
      return injectAuthRepository(AuthRepository_Factory.newInstance(appComponentImpl.provideMoviesServiceProvider.get(), appComponentImpl.provideTokenManagerProvider.get(), appComponentImpl.provideMoviesServiceProvider.get()));
    }

    @Override
    public void inject(PhoneAuthActivity arg0) {
      injectPhoneAuthActivity(arg0);
    }

    @CanIgnoreReturnValue
    private AuthRepository injectAuthRepository(AuthRepository instance) {
      AuthRepository_MembersInjector.injectRequestAuth(instance, appComponentImpl.provideServiceAuthProvider.get());
      AuthRepository_MembersInjector.injectTokenManager(instance, appComponentImpl.provideTokenManagerProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private PhoneAuthActivity injectPhoneAuthActivity(PhoneAuthActivity instance) {
      PhoneAuthActivity_MembersInjector.injectAuthRepository(instance, authRepository());
      PhoneAuthActivity_MembersInjector.injectAuthManager(instance, appComponentImpl.provideAuthManagerProvider.get());
      PhoneAuthActivity_MembersInjector.injectTokenManager(instance, appComponentImpl.provideTokenManagerProvider.get());
      return instance;
    }
  }

  private static final class UserProfilesSubcomponentImpl implements ActivityModule_ContributeUserProfiles.UserProfilesSubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final UserProfilesSubcomponentImpl userProfilesSubcomponentImpl = this;

    private UserProfilesSubcomponentImpl(AppComponentImpl appComponentImpl,
        UserProfiles arg0Param) {
      this.appComponentImpl = appComponentImpl;


    }

    private AuthRepository authRepository() {
      return injectAuthRepository(AuthRepository_Factory.newInstance(appComponentImpl.provideMoviesServiceProvider.get(), appComponentImpl.provideTokenManagerProvider.get(), appComponentImpl.provideMoviesServiceProvider.get()));
    }

    @Override
    public void inject(UserProfiles arg0) {
      injectUserProfiles(arg0);
    }

    @CanIgnoreReturnValue
    private AuthRepository injectAuthRepository(AuthRepository instance) {
      AuthRepository_MembersInjector.injectRequestAuth(instance, appComponentImpl.provideServiceAuthProvider.get());
      AuthRepository_MembersInjector.injectTokenManager(instance, appComponentImpl.provideTokenManagerProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private UserProfiles injectUserProfiles(UserProfiles instance) {
      UserProfiles_MembersInjector.injectAuthRepository(instance, authRepository());
      UserProfiles_MembersInjector.injectViewModelFactory(instance, appComponentImpl.moviesViewModelFactoryProvider.get());
      UserProfiles_MembersInjector.injectAuthManager(instance, appComponentImpl.provideAuthManagerProvider.get());
      UserProfiles_MembersInjector.injectTokenManager(instance, appComponentImpl.provideTokenManagerProvider.get());
      UserProfiles_MembersInjector.injectMenuHandler(instance, appComponentImpl.provideMenuHandlerProvider.get());
      UserProfiles_MembersInjector.injectProfilesAdapter(instance, appComponentImpl.profilesAdapterProvideProvider.get());
      return instance;
    }
  }

  private static final class BaseActivitySubcomponentImpl implements ActivityModule_ContributeMainActivity.BaseActivitySubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final BaseActivitySubcomponentImpl baseActivitySubcomponentImpl = this;

    private BaseActivitySubcomponentImpl(AppComponentImpl appComponentImpl,
        BaseActivity arg0Param) {
      this.appComponentImpl = appComponentImpl;


    }

    @Override
    public void inject(BaseActivity arg0) {
      injectBaseActivity(arg0);
    }

    @CanIgnoreReturnValue
    private BaseActivity injectBaseActivity(BaseActivity instance) {
      BaseActivity_MembersInjector.injectProvideSnifferCheck(instance, appComponentImpl.provideApplicationInfoProvider.get());
      BaseActivity_MembersInjector.injectProvideRootCheck(instance, appComponentImpl.provideRootProvider.get());
      BaseActivity_MembersInjector.injectCheckVpn(instance, appComponentImpl.checkVpnProvider.get());
      BaseActivity_MembersInjector.injectRepository(instance, appComponentImpl.mediaRepositoryProvider.get());
      BaseActivity_MembersInjector.injectTokenManager(instance, appComponentImpl.provideTokenManagerProvider.get());
      BaseActivity_MembersInjector.injectAuthRepository(instance, appComponentImpl.authRepository());
      BaseActivity_MembersInjector.injectSettingReady(instance, appComponentImpl.provideReadyProvider.get());
      BaseActivity_MembersInjector.injectAuthManager(instance, appComponentImpl.provideAuthManagerProvider.get());
      BaseActivity_MembersInjector.injectSettingsManager(instance, appComponentImpl.provideSettingsManagerProvider.get());
      BaseActivity_MembersInjector.injectAdsManager(instance, appComponentImpl.provideAdsManagerProvider.get());
      BaseActivity_MembersInjector.injectStatusManager(instance, appComponentImpl.provideStatusManagerProvider.get());
      BaseActivity_MembersInjector.injectSharedPreferences(instance, appComponentImpl.provideSharedPreferencesProvider.get());
      BaseActivity_MembersInjector.injectEditor(instance, appComponentImpl.providesSharedPreferencesEditorProvider.get());
      BaseActivity_MembersInjector.injectViewModelFactory(instance, appComponentImpl.moviesViewModelFactoryProvider.get());
      return instance;
    }
  }

  private static final class DownloadManagerFragmentSubcomponentImpl implements ActivityModule_ContributeMainActivityDown.DownloadManagerFragmentSubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final DownloadManagerFragmentSubcomponentImpl downloadManagerFragmentSubcomponentImpl = this;

    private DownloadManagerFragmentSubcomponentImpl(AppComponentImpl appComponentImpl,
        DownloadManagerFragment arg0Param) {
      this.appComponentImpl = appComponentImpl;


    }

    @Override
    public void inject(DownloadManagerFragment arg0) {
    }
  }

  private static final class PaymentSubcomponentImpl implements ActivityModule_ContributePayment.PaymentSubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final PaymentSubcomponentImpl paymentSubcomponentImpl = this;

    private PaymentSubcomponentImpl(AppComponentImpl appComponentImpl, Payment arg0Param) {
      this.appComponentImpl = appComponentImpl;


    }

    @Override
    public void inject(Payment arg0) {
      injectPayment(arg0);
    }

    @CanIgnoreReturnValue
    private Payment injectPayment(Payment instance) {
      Payment_MembersInjector.injectAuthRepository(instance, appComponentImpl.authRepository());
      Payment_MembersInjector.injectSettingsManager(instance, appComponentImpl.provideSettingsManagerProvider.get());
      Payment_MembersInjector.injectViewModelFactory(instance, appComponentImpl.moviesViewModelFactoryProvider.get());
      return instance;
    }
  }

  private static final class PaymentPaypalSubcomponentImpl implements ActivityModule_ContributePaymentPaypal.PaymentPaypalSubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final PaymentPaypalSubcomponentImpl paymentPaypalSubcomponentImpl = this;

    private PaymentPaypalSubcomponentImpl(AppComponentImpl appComponentImpl,
        PaymentPaypal arg0Param) {
      this.appComponentImpl = appComponentImpl;


    }

    @Override
    public void inject(PaymentPaypal arg0) {
      injectPaymentPaypal(arg0);
    }

    @CanIgnoreReturnValue
    private PaymentPaypal injectPaymentPaypal(PaymentPaypal instance) {
      PaymentPaypal_MembersInjector.injectSettingsManager(instance, appComponentImpl.provideSettingsManagerProvider.get());
      PaymentPaypal_MembersInjector.injectViewModelFactory(instance, appComponentImpl.moviesViewModelFactoryProvider.get());
      return instance;
    }
  }

  private static final class PaymentStripeSubcomponentImpl implements ActivityModule_ContributePaymentStripe.PaymentStripeSubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final PaymentStripeSubcomponentImpl paymentStripeSubcomponentImpl = this;

    private PaymentStripeSubcomponentImpl(AppComponentImpl appComponentImpl,
        PaymentStripe arg0Param) {
      this.appComponentImpl = appComponentImpl;


    }

    @Override
    public void inject(PaymentStripe arg0) {
      injectPaymentStripe(arg0);
    }

    @CanIgnoreReturnValue
    private PaymentStripe injectPaymentStripe(PaymentStripe instance) {
      PaymentStripe_MembersInjector.injectSettingsManager(instance, appComponentImpl.provideSettingsManagerProvider.get());
      PaymentStripe_MembersInjector.injectViewModelFactory(instance, appComponentImpl.moviesViewModelFactoryProvider.get());
      return instance;
    }
  }

  private static final class NotificationManagerSubcomponentImpl implements ActivityModule_ContributeNotificationManager.NotificationManagerSubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final NotificationManagerSubcomponentImpl notificationManagerSubcomponentImpl = this;

    private NotificationManagerSubcomponentImpl(AppComponentImpl appComponentImpl,
        NotificationManager arg0Param) {
      this.appComponentImpl = appComponentImpl;


    }

    @Override
    public void inject(NotificationManager arg0) {
      injectNotificationManager(arg0);
    }

    @CanIgnoreReturnValue
    private NotificationManager injectNotificationManager(NotificationManager instance) {
      NotificationManager_MembersInjector.injectSettingsManager(instance, appComponentImpl.provideSettingsManagerProvider.get());
      NotificationManager_MembersInjector.injectAnimeRepository(instance, appComponentImpl.animeRepositoryProvider.get());
      return instance;
    }
  }

  private static final class PaymentDetailsSubcomponentImpl implements ActivityModule_ContributePaymentDetails.PaymentDetailsSubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final PaymentDetailsSubcomponentImpl paymentDetailsSubcomponentImpl = this;

    private PaymentDetailsSubcomponentImpl(AppComponentImpl appComponentImpl,
        PaymentDetails arg0Param) {
      this.appComponentImpl = appComponentImpl;


    }

    @Override
    public void inject(PaymentDetails arg0) {
      injectPaymentDetails(arg0);
    }

    @CanIgnoreReturnValue
    private PaymentDetails injectPaymentDetails(PaymentDetails instance) {
      PaymentDetails_MembersInjector.injectViewModelFactory(instance, appComponentImpl.moviesViewModelFactoryProvider.get());
      return instance;
    }
  }

  private static final class RegistrationSucessSubcomponentImpl implements ActivityModule_ContributeRegistrationSucess.RegistrationSucessSubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final RegistrationSucessSubcomponentImpl registrationSucessSubcomponentImpl = this;

    private RegistrationSucessSubcomponentImpl(AppComponentImpl appComponentImpl,
        RegistrationSucess arg0Param) {
      this.appComponentImpl = appComponentImpl;


    }

    @Override
    public void inject(RegistrationSucess arg0) {
      injectRegistrationSucess(arg0);
    }

    @CanIgnoreReturnValue
    private RegistrationSucess injectRegistrationSucess(RegistrationSucess instance) {
      RegistrationSucess_MembersInjector.injectSettingsManager(instance, appComponentImpl.provideSettingsManagerProvider.get());
      return instance;
    }
  }

  private static final class EditProfileActivitySubcomponentImpl implements ActivityModule_ContributeEditProfileActivity.EditProfileActivitySubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final EditProfileActivitySubcomponentImpl editProfileActivitySubcomponentImpl = this;

    private EditProfileActivitySubcomponentImpl(AppComponentImpl appComponentImpl,
        EditProfileActivity arg0Param) {
      this.appComponentImpl = appComponentImpl;


    }

    @Override
    public void inject(EditProfileActivity arg0) {
      injectEditProfileActivity(arg0);
    }

    @CanIgnoreReturnValue
    private EditProfileActivity injectEditProfileActivity(EditProfileActivity instance) {
      EditProfileActivity_MembersInjector.injectViewModelFactory(instance, appComponentImpl.moviesViewModelFactoryProvider.get());
      EditProfileActivity_MembersInjector.injectSettingsManager(instance, appComponentImpl.provideSettingsManagerProvider.get());
      EditProfileActivity_MembersInjector.injectAuthRepository(instance, appComponentImpl.authRepository());
      EditProfileActivity_MembersInjector.injectAuthManager(instance, appComponentImpl.provideAuthManagerProvider.get());
      return instance;
    }
  }

  private static final class MovieDetailsActivitySubcomponentImpl implements ActivityModule_ContributeMovieDetailActivity.MovieDetailsActivitySubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final MovieDetailsActivitySubcomponentImpl movieDetailsActivitySubcomponentImpl = this;

    private MovieDetailsActivitySubcomponentImpl(AppComponentImpl appComponentImpl,
        MovieDetailsActivity arg0Param) {
      this.appComponentImpl = appComponentImpl;


    }

    @Override
    public void inject(MovieDetailsActivity arg0) {
      injectMovieDetailsActivity(arg0);
    }

    @CanIgnoreReturnValue
    private MovieDetailsActivity injectMovieDetailsActivity(MovieDetailsActivity instance) {
      MovieDetailsActivity_MembersInjector.injectViewModelFactory(instance, appComponentImpl.moviesViewModelFactoryProvider.get());
      MovieDetailsActivity_MembersInjector.injectSharedPreferences(instance, appComponentImpl.provideSharedPreferencesProvider.get());
      MovieDetailsActivity_MembersInjector.injectSharedPreferencesEditor(instance, appComponentImpl.providesSharedPreferencesEditorProvider.get());
      MovieDetailsActivity_MembersInjector.injectSettingsManager(instance, appComponentImpl.provideSettingsManagerProvider.get());
      MovieDetailsActivity_MembersInjector.injectSettingsRepository(instance, appComponentImpl.settingsRepository());
      MovieDetailsActivity_MembersInjector.injectAuthRepository(instance, appComponentImpl.authRepository());
      MovieDetailsActivity_MembersInjector.injectMediaRepository(instance, appComponentImpl.mediaRepositoryProvider.get());
      MovieDetailsActivity_MembersInjector.injectSettingReady(instance, appComponentImpl.provideReadyProvider.get());
      MovieDetailsActivity_MembersInjector.injectCuePoint(instance, appComponentImpl.provideCuePointProvider.get());
      MovieDetailsActivity_MembersInjector.injectCuepointUrl(instance, appComponentImpl.provideCuePointUrlProvider.get());
      MovieDetailsActivity_MembersInjector.injectAuthManager(instance, appComponentImpl.provideAuthManagerProvider.get());
      MovieDetailsActivity_MembersInjector.injectCuePointY(instance, appComponentImpl.provideCuePointYProvider.get());
      MovieDetailsActivity_MembersInjector.injectCuePointN(instance, appComponentImpl.provideCuePointNProvider.get());
      MovieDetailsActivity_MembersInjector.injectCuePointW(instance, appComponentImpl.provideCuePointWProvider.get());
      MovieDetailsActivity_MembersInjector.injectCuePointZ(instance, appComponentImpl.provideCuePointZProvider.get());
      MovieDetailsActivity_MembersInjector.injectCheckVpn(instance, appComponentImpl.checkVpnProvider.get());
      MovieDetailsActivity_MembersInjector.injectProvideSnifferCheck(instance, appComponentImpl.provideApplicationInfoProvider.get());
      MovieDetailsActivity_MembersInjector.injectProvideRootCheck(instance, appComponentImpl.provideRootProvider.get());
      MovieDetailsActivity_MembersInjector.injectTokenManager(instance, appComponentImpl.provideTokenManagerProvider.get());
      return instance;
    }
  }

  private static final class SerieDetailsActivitySubcomponentImpl implements ActivityModule_ContributeSerieDetailActivity.SerieDetailsActivitySubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final SerieDetailsActivitySubcomponentImpl serieDetailsActivitySubcomponentImpl = this;

    private SerieDetailsActivitySubcomponentImpl(AppComponentImpl appComponentImpl,
        SerieDetailsActivity arg0Param) {
      this.appComponentImpl = appComponentImpl;


    }

    @Override
    public void inject(SerieDetailsActivity arg0) {
      injectSerieDetailsActivity(arg0);
    }

    @CanIgnoreReturnValue
    private SerieDetailsActivity injectSerieDetailsActivity(SerieDetailsActivity instance) {
      SerieDetailsActivity_MembersInjector.injectCheckVpn(instance, appComponentImpl.checkVpnProvider.get());
      SerieDetailsActivity_MembersInjector.injectProvideRootCheck(instance, appComponentImpl.provideRootProvider.get());
      SerieDetailsActivity_MembersInjector.injectProvideSnifferCheck(instance, appComponentImpl.provideApplicationInfoProvider.get());
      SerieDetailsActivity_MembersInjector.injectMediaRepository(instance, appComponentImpl.mediaRepositoryProvider.get());
      SerieDetailsActivity_MembersInjector.injectSettingReady(instance, appComponentImpl.provideReadyProvider.get());
      SerieDetailsActivity_MembersInjector.injectSettingsManager(instance, appComponentImpl.provideSettingsManagerProvider.get());
      SerieDetailsActivity_MembersInjector.injectTokenManager(instance, appComponentImpl.provideTokenManagerProvider.get());
      SerieDetailsActivity_MembersInjector.injectViewModelFactory(instance, appComponentImpl.moviesViewModelFactoryProvider.get());
      SerieDetailsActivity_MembersInjector.injectSharedPreferences(instance, appComponentImpl.provideSharedPreferencesProvider.get());
      SerieDetailsActivity_MembersInjector.injectAuthManager(instance, appComponentImpl.provideAuthManagerProvider.get());
      SerieDetailsActivity_MembersInjector.injectAuthRepository(instance, appComponentImpl.authRepository());
      SerieDetailsActivity_MembersInjector.injectCuepointUrl(instance, appComponentImpl.provideCuePointUrlProvider.get());
      SerieDetailsActivity_MembersInjector.injectCuePoint(instance, appComponentImpl.provideCuePointProvider.get());
      SerieDetailsActivity_MembersInjector.injectCuePointY(instance, appComponentImpl.provideCuePointYProvider.get());
      SerieDetailsActivity_MembersInjector.injectCuePointN(instance, appComponentImpl.provideCuePointNProvider.get());
      SerieDetailsActivity_MembersInjector.injectSharedPreferencesEditor(instance, appComponentImpl.providesSharedPreferencesEditorProvider.get());
      SerieDetailsActivity_MembersInjector.injectRepository(instance, appComponentImpl.mediaRepositoryProvider.get());
      SerieDetailsActivity_MembersInjector.injectSettingsRepository(instance, appComponentImpl.settingsRepository());
      return instance;
    }
  }

  private static final class LoginActivitySubcomponentImpl implements ActivityModule_ContributeLoginActivity.LoginActivitySubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final LoginActivitySubcomponentImpl loginActivitySubcomponentImpl = this;

    private LoginActivitySubcomponentImpl(AppComponentImpl appComponentImpl,
        LoginActivity arg0Param) {
      this.appComponentImpl = appComponentImpl;


    }

    @Override
    public void inject(LoginActivity arg0) {
      injectLoginActivity(arg0);
    }

    @CanIgnoreReturnValue
    private LoginActivity injectLoginActivity(LoginActivity instance) {
      LoginActivity_MembersInjector.injectSharedPreferences(instance, appComponentImpl.provideSharedPreferencesProvider.get());
      LoginActivity_MembersInjector.injectSharedPreferencesEditor(instance, appComponentImpl.providesSharedPreferencesEditorProvider.get());
      LoginActivity_MembersInjector.injectTokenManager(instance, appComponentImpl.provideTokenManagerProvider.get());
      LoginActivity_MembersInjector.injectSettingsManager(instance, appComponentImpl.provideSettingsManagerProvider.get());
      LoginActivity_MembersInjector.injectAuthRepository(instance, appComponentImpl.authRepository());
      LoginActivity_MembersInjector.injectViewModelFactory(instance, appComponentImpl.moviesViewModelFactoryProvider.get());
      return instance;
    }
  }

  private static final class RegisterActivitySubcomponentImpl implements ActivityModule_ContributeRegisterActivity.RegisterActivitySubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final RegisterActivitySubcomponentImpl registerActivitySubcomponentImpl = this;

    private RegisterActivitySubcomponentImpl(AppComponentImpl appComponentImpl,
        RegisterActivity arg0Param) {
      this.appComponentImpl = appComponentImpl;


    }

    @Override
    public void inject(RegisterActivity arg0) {
      injectRegisterActivity(arg0);
    }

    @CanIgnoreReturnValue
    private RegisterActivity injectRegisterActivity(RegisterActivity instance) {
      RegisterActivity_MembersInjector.injectSharedPreferencesEditor(instance, appComponentImpl.providesSharedPreferencesEditorProvider.get());
      RegisterActivity_MembersInjector.injectTokenManager(instance, appComponentImpl.provideTokenManagerProvider.get());
      RegisterActivity_MembersInjector.injectSettingsManager(instance, appComponentImpl.provideSettingsManagerProvider.get());
      RegisterActivity_MembersInjector.injectAuthRepository(instance, appComponentImpl.authRepository());
      RegisterActivity_MembersInjector.injectViewModelFactory(instance, appComponentImpl.moviesViewModelFactoryProvider.get());
      return instance;
    }
  }

  private static final class TrailerPreviewActivitySubcomponentImpl implements ActivityModule_ContributeTrailerPreviewActivity.TrailerPreviewActivitySubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final TrailerPreviewActivitySubcomponentImpl trailerPreviewActivitySubcomponentImpl = this;

    private TrailerPreviewActivitySubcomponentImpl(AppComponentImpl appComponentImpl,
        TrailerPreviewActivity arg0Param) {
      this.appComponentImpl = appComponentImpl;


    }

    @Override
    public void inject(TrailerPreviewActivity arg0) {
      injectTrailerPreviewActivity(arg0);
    }

    @CanIgnoreReturnValue
    private TrailerPreviewActivity injectTrailerPreviewActivity(TrailerPreviewActivity instance) {
      TrailerPreviewActivity_MembersInjector.injectAndroidInjector(instance, appComponentImpl.dispatchingAndroidInjectorOfObject());
      TrailerPreviewActivity_MembersInjector.injectSettingsManager(instance, appComponentImpl.provideSettingsManagerProvider.get());
      TrailerPreviewActivity_MembersInjector.injectViewModelFactory(instance, appComponentImpl.moviesViewModelFactoryProvider.get());
      return instance;
    }
  }

  private static final class UpcomingTitlesActivitySubcomponentImpl implements ActivityModule_ContributeUpcomingTitlesActivity.UpcomingTitlesActivitySubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final UpcomingTitlesActivitySubcomponentImpl upcomingTitlesActivitySubcomponentImpl = this;

    private UpcomingTitlesActivitySubcomponentImpl(AppComponentImpl appComponentImpl,
        UpcomingTitlesActivity arg0Param) {
      this.appComponentImpl = appComponentImpl;


    }

    @Override
    public void inject(UpcomingTitlesActivity arg0) {
      injectUpcomingTitlesActivity(arg0);
    }

    @CanIgnoreReturnValue
    private UpcomingTitlesActivity injectUpcomingTitlesActivity(UpcomingTitlesActivity instance) {
      UpcomingTitlesActivity_MembersInjector.injectAndroidInjector(instance, appComponentImpl.dispatchingAndroidInjectorOfObject());
      UpcomingTitlesActivity_MembersInjector.injectSettingsManager(instance, appComponentImpl.provideSettingsManagerProvider.get());
      UpcomingTitlesActivity_MembersInjector.injectViewModelFactory(instance, appComponentImpl.moviesViewModelFactoryProvider.get());
      return instance;
    }
  }

  private static final class AnimeDetailsActivitySubcomponentImpl implements ActivityModule_ContributeAnimeDetailsActivity.AnimeDetailsActivitySubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final AnimeDetailsActivitySubcomponentImpl animeDetailsActivitySubcomponentImpl = this;

    private AnimeDetailsActivitySubcomponentImpl(AppComponentImpl appComponentImpl,
        AnimeDetailsActivity arg0Param) {
      this.appComponentImpl = appComponentImpl;


    }

    @Override
    public void inject(AnimeDetailsActivity arg0) {
      injectAnimeDetailsActivity(arg0);
    }

    @CanIgnoreReturnValue
    private AnimeDetailsActivity injectAnimeDetailsActivity(AnimeDetailsActivity instance) {
      AnimeDetailsActivity_MembersInjector.injectViewModelFactory(instance, appComponentImpl.moviesViewModelFactoryProvider.get());
      AnimeDetailsActivity_MembersInjector.injectAuthRepository(instance, appComponentImpl.authRepository());
      AnimeDetailsActivity_MembersInjector.injectSharedPreferencesEditor(instance, appComponentImpl.providesSharedPreferencesEditorProvider.get());
      AnimeDetailsActivity_MembersInjector.injectSettingReady(instance, appComponentImpl.provideReadyProvider.get());
      AnimeDetailsActivity_MembersInjector.injectSharedPreferences(instance, appComponentImpl.provideSharedPreferencesProvider.get());
      AnimeDetailsActivity_MembersInjector.injectTokenManager(instance, appComponentImpl.provideTokenManagerProvider.get());
      AnimeDetailsActivity_MembersInjector.injectSettingsManager(instance, appComponentImpl.provideSettingsManagerProvider.get());
      AnimeDetailsActivity_MembersInjector.injectAuthManager(instance, appComponentImpl.provideAuthManagerProvider.get());
      AnimeDetailsActivity_MembersInjector.injectMediaRepository(instance, appComponentImpl.mediaRepositoryProvider.get());
      AnimeDetailsActivity_MembersInjector.injectCheckVpn(instance, appComponentImpl.checkVpnProvider.get());
      AnimeDetailsActivity_MembersInjector.injectProvideSnifferCheck(instance, appComponentImpl.provideApplicationInfoProvider.get());
      AnimeDetailsActivity_MembersInjector.injectProvideRootCheck(instance, appComponentImpl.provideRootProvider.get());
      return instance;
    }
  }

  private static final class SplashActivitySubcomponentImpl implements ActivityModule_ContributeSplashActivity.SplashActivitySubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final SplashActivitySubcomponentImpl splashActivitySubcomponentImpl = this;

    private SplashActivitySubcomponentImpl(AppComponentImpl appComponentImpl,
        SplashActivity arg0Param) {
      this.appComponentImpl = appComponentImpl;


    }

    @Override
    public void inject(SplashActivity arg0) {
      injectSplashActivity(arg0);
    }

    @CanIgnoreReturnValue
    private SplashActivity injectSplashActivity(SplashActivity instance) {
      SplashActivity_MembersInjector.injectSettingsRepository(instance, appComponentImpl.settingsRepository());
      SplashActivity_MembersInjector.injectSettingsManager(instance, appComponentImpl.provideSettingsManagerProvider.get());
      SplashActivity_MembersInjector.injectAdsManager(instance, appComponentImpl.provideAdsManagerProvider.get());
      SplashActivity_MembersInjector.injectStatusManager(instance, appComponentImpl.provideStatusManagerProvider.get());
      SplashActivity_MembersInjector.injectViewModelFactory(instance, appComponentImpl.moviesViewModelFactoryProvider.get());
      SplashActivity_MembersInjector.injectProvideApplicationInfo(instance, appComponentImpl.provideApplicationInfoProvider.get());
      SplashActivity_MembersInjector.injectPackageName(instance, appComponentImpl.packNameProvider.get());
      SplashActivity_MembersInjector.injectCheckVpn(instance, appComponentImpl.checkVpnProvider.get());
      SplashActivity_MembersInjector.injectProvideFirebaseRemoteConfig(instance, appComponentImpl.provideFirebaseRemoteConfigProvider.get());
      return instance;
    }
  }

  private static final class EmbedActivitySubcomponentImpl implements ActivityModule_ContributeEmbedActivity.EmbedActivitySubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final EmbedActivitySubcomponentImpl embedActivitySubcomponentImpl = this;

    private EmbedActivitySubcomponentImpl(AppComponentImpl appComponentImpl,
        EmbedActivity arg0Param) {
      this.appComponentImpl = appComponentImpl;


    }

    @Override
    public void inject(EmbedActivity arg0) {
      injectEmbedActivity(arg0);
    }

    @CanIgnoreReturnValue
    private EmbedActivity injectEmbedActivity(EmbedActivity instance) {
      EmbedActivity_MembersInjector.injectSettingsManager(instance, appComponentImpl.provideSettingsManagerProvider.get());
      return instance;
    }
  }

  private static final class EasyPlexMainPlayerSubcomponentImpl implements ActivityModule_ContributeEasyPlexMainPlayer.EasyPlexMainPlayerSubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final EasyPlexMainPlayerSubcomponentImpl easyPlexMainPlayerSubcomponentImpl = this;

    private EasyPlexMainPlayerSubcomponentImpl(AppComponentImpl appComponentImpl,
        EasyPlexMainPlayer arg0Param) {
      this.appComponentImpl = appComponentImpl;


    }

    @Override
    public void inject(EasyPlexMainPlayer arg0) {
      injectEasyPlexMainPlayer(arg0);
    }

    @CanIgnoreReturnValue
    private EasyPlexMainPlayer injectEasyPlexMainPlayer(EasyPlexMainPlayer instance) {
      EasyPlexPlayerActivity_MembersInjector.injectViewModelFactory(instance, appComponentImpl.moviesViewModelFactoryProvider.get());
      EasyPlexPlayerActivity_MembersInjector.injectPlayerReady(instance, appComponentImpl.mainPlayerProvider.get());
      EasyPlexPlayerActivity_MembersInjector.injectSettingReady(instance, appComponentImpl.provideReadyProvider.get());
      EasyPlexPlayerActivity_MembersInjector.injectSharedPreferences(instance, appComponentImpl.provideSharedPreferencesProvider.get());
      EasyPlexPlayerActivity_MembersInjector.injectAuthManager(instance, appComponentImpl.provideAuthManagerProvider.get());
      EasyPlexPlayerActivity_MembersInjector.injectAdsManager(instance, appComponentImpl.provideAdsManagerProvider.get());
      EasyPlexPlayerActivity_MembersInjector.injectSettingsManager(instance, appComponentImpl.provideSettingsManagerProvider.get());
      EasyPlexPlayerActivity_MembersInjector.injectCuepointUrl(instance, appComponentImpl.provideCuePointUrlProvider.get());
      EasyPlexPlayerActivity_MembersInjector.injectCuePoint(instance, appComponentImpl.provideCuePointProvider.get());
      EasyPlexPlayerActivity_MembersInjector.injectCuePointY(instance, appComponentImpl.provideCuePointYProvider.get());
      EasyPlexPlayerActivity_MembersInjector.injectCuePointN(instance, appComponentImpl.provideCuePointNProvider.get());
      EasyPlexMainPlayer_MembersInjector.injectFsmPlayer(instance, appComponentImpl.provideFsmPlayerProvider.get());
      EasyPlexMainPlayer_MembersInjector.injectPlayerUIController(instance, appComponentImpl.provideControllerProvider.get());
      EasyPlexMainPlayer_MembersInjector.injectAdPlayingMonitor(instance, appComponentImpl.provideAdPlayingMonitorProvider.get());
      EasyPlexMainPlayer_MembersInjector.injectCuePointMonitor(instance, appComponentImpl.provideCuePointMonitorProvider.get());
      EasyPlexMainPlayer_MembersInjector.injectAdRetriever(instance, appComponentImpl.provideAdRetrieverProvider.get());
      EasyPlexMainPlayer_MembersInjector.injectCuePointsRetriever(instance, appComponentImpl.provideCuePointsRetrieverProvider.get());
      EasyPlexMainPlayer_MembersInjector.injectAdInterface(instance, appComponentImpl.provideAdInterfaceNoPrerollProvider.get());
      EasyPlexMainPlayer_MembersInjector.injectPlayerComponentController(instance, appComponentImpl.provideComponentControllerProvider.get());
      EasyPlexMainPlayer_MembersInjector.injectVpaidClient(instance, appComponentImpl.provideVpaidClientProvider.get());
      EasyPlexMainPlayer_MembersInjector.injectPlaybackSettingMenu(instance, appComponentImpl.providePlaybackSettingMenuProvider.get());
      EasyPlexMainPlayer_MembersInjector.injectAppSettingsManager(instance, appComponentImpl.provideSettingsManagerProvider.get());
      EasyPlexMainPlayer_MembersInjector.injectStatusManager(instance, appComponentImpl.provideStatusManagerProvider.get());
      EasyPlexMainPlayer_MembersInjector.injectTokenManager(instance, appComponentImpl.provideTokenManagerProvider.get());
      EasyPlexMainPlayer_MembersInjector.injectSharedPreferencesEditor(instance, appComponentImpl.providesSharedPreferencesEditorProvider.get());
      EasyPlexMainPlayer_MembersInjector.injectPlayerController(instance, appComponentImpl.providePlayerControllerProvider.get());
      EasyPlexMainPlayer_MembersInjector.injectRepository(instance, appComponentImpl.mediaRepositoryProvider.get());
      EasyPlexMainPlayer_MembersInjector.injectAnimeRepository(instance, appComponentImpl.animeRepositoryProvider.get());
      return instance;
    }
  }

  private static final class PasswordForgetSubcomponentImpl implements ActivityModule_ContributePasswordForget.PasswordForgetSubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final PasswordForgetSubcomponentImpl passwordForgetSubcomponentImpl = this;

    private PasswordForgetSubcomponentImpl(AppComponentImpl appComponentImpl,
        PasswordForget arg0Param) {
      this.appComponentImpl = appComponentImpl;


    }

    @Override
    public void inject(PasswordForget arg0) {
      injectPasswordForget(arg0);
    }

    @CanIgnoreReturnValue
    private PasswordForget injectPasswordForget(PasswordForget instance) {
      PasswordForget_MembersInjector.injectAndroidInjector(instance, appComponentImpl.dispatchingAndroidInjectorOfObject());
      PasswordForget_MembersInjector.injectSharedPreferencesEditor(instance, appComponentImpl.providesSharedPreferencesEditorProvider.get());
      PasswordForget_MembersInjector.injectTokenManager(instance, appComponentImpl.provideTokenManagerProvider.get());
      PasswordForget_MembersInjector.injectSettingsManager(instance, appComponentImpl.provideSettingsManagerProvider.get());
      PasswordForget_MembersInjector.injectViewModelFactory(instance, appComponentImpl.moviesViewModelFactoryProvider.get());
      return instance;
    }
  }

  private static final class CastDetailsActivitySubcomponentImpl implements ActivityModule_ContributeCastDetailsActivity.CastDetailsActivitySubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final CastDetailsActivitySubcomponentImpl castDetailsActivitySubcomponentImpl = this;

    private CastDetailsActivitySubcomponentImpl(AppComponentImpl appComponentImpl,
        CastDetailsActivity arg0Param) {
      this.appComponentImpl = appComponentImpl;


    }

    @Override
    public void inject(CastDetailsActivity arg0) {
      injectCastDetailsActivity(arg0);
    }

    @CanIgnoreReturnValue
    private CastDetailsActivity injectCastDetailsActivity(CastDetailsActivity instance) {
      CastDetailsActivity_MembersInjector.injectViewModelFactory(instance, appComponentImpl.moviesViewModelFactoryProvider.get());
      CastDetailsActivity_MembersInjector.injectSharedPreferences(instance, appComponentImpl.provideSharedPreferencesProvider.get());
      CastDetailsActivity_MembersInjector.injectSharedPreferencesEditor(instance, appComponentImpl.providesSharedPreferencesEditorProvider.get());
      CastDetailsActivity_MembersInjector.injectSettingsManager(instance, appComponentImpl.provideSettingsManagerProvider.get());
      CastDetailsActivity_MembersInjector.injectSettingsRepository(instance, appComponentImpl.settingsRepository());
      CastDetailsActivity_MembersInjector.injectAuthRepository(instance, appComponentImpl.authRepository());
      CastDetailsActivity_MembersInjector.injectMediaRepository(instance, appComponentImpl.mediaRepositoryProvider.get());
      CastDetailsActivity_MembersInjector.injectSettingReady(instance, appComponentImpl.provideReadyProvider.get());
      CastDetailsActivity_MembersInjector.injectCuePoint(instance, appComponentImpl.provideCuePointProvider.get());
      CastDetailsActivity_MembersInjector.injectCuepointUrl(instance, appComponentImpl.provideCuePointUrlProvider.get());
      CastDetailsActivity_MembersInjector.injectAuthManager(instance, appComponentImpl.provideAuthManagerProvider.get());
      CastDetailsActivity_MembersInjector.injectCuePointY(instance, appComponentImpl.provideCuePointYProvider.get());
      CastDetailsActivity_MembersInjector.injectCuePointN(instance, appComponentImpl.provideCuePointNProvider.get());
      CastDetailsActivity_MembersInjector.injectCuePointW(instance, appComponentImpl.provideCuePointWProvider.get());
      CastDetailsActivity_MembersInjector.injectCuePointZ(instance, appComponentImpl.provideCuePointZProvider.get());
      CastDetailsActivity_MembersInjector.injectTokenManager(instance, appComponentImpl.provideTokenManagerProvider.get());
      return instance;
    }
  }

  private static final class StreamingetailsActivitySubcomponentImpl implements ActivityModule_ContributeStreamingetailsActivity.StreamingetailsActivitySubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final StreamingetailsActivitySubcomponentImpl streamingetailsActivitySubcomponentImpl = this;

    private StreamingetailsActivitySubcomponentImpl(AppComponentImpl appComponentImpl,
        StreamingetailsActivity arg0Param) {
      this.appComponentImpl = appComponentImpl;


    }

    @Override
    public void inject(StreamingetailsActivity arg0) {
      injectStreamingetailsActivity(arg0);
    }

    @CanIgnoreReturnValue
    private StreamingetailsActivity injectStreamingetailsActivity(
        StreamingetailsActivity instance) {
      StreamingetailsActivity_MembersInjector.injectCheckVpn(instance, appComponentImpl.checkVpnProvider.get());
      StreamingetailsActivity_MembersInjector.injectProvideSnifferCheck(instance, appComponentImpl.provideApplicationInfoProvider.get());
      StreamingetailsActivity_MembersInjector.injectProvideRootCheck(instance, appComponentImpl.provideRootProvider.get());
      StreamingetailsActivity_MembersInjector.injectViewModelFactory(instance, appComponentImpl.moviesViewModelFactoryProvider.get());
      StreamingetailsActivity_MembersInjector.injectSharedPreferences(instance, appComponentImpl.provideSharedPreferencesProvider.get());
      StreamingetailsActivity_MembersInjector.injectSettingReady(instance, appComponentImpl.provideReadyProvider.get());
      StreamingetailsActivity_MembersInjector.injectSharedPreferencesEditor(instance, appComponentImpl.providesSharedPreferencesEditorProvider.get());
      StreamingetailsActivity_MembersInjector.injectSettingsManager(instance, appComponentImpl.provideSettingsManagerProvider.get());
      StreamingetailsActivity_MembersInjector.injectSettingsRepository(instance, appComponentImpl.settingsRepository());
      StreamingetailsActivity_MembersInjector.injectAuthRepository(instance, appComponentImpl.authRepository());
      StreamingetailsActivity_MembersInjector.injectMediaRepository(instance, appComponentImpl.mediaRepositoryProvider.get());
      StreamingetailsActivity_MembersInjector.injectCuePoint(instance, appComponentImpl.provideCuePointProvider.get());
      StreamingetailsActivity_MembersInjector.injectCuepointUrl(instance, appComponentImpl.provideCuePointUrlProvider.get());
      StreamingetailsActivity_MembersInjector.injectAuthManager(instance, appComponentImpl.provideAuthManagerProvider.get());
      StreamingetailsActivity_MembersInjector.injectCuePointY(instance, appComponentImpl.provideCuePointYProvider.get());
      StreamingetailsActivity_MembersInjector.injectCuePointN(instance, appComponentImpl.provideCuePointNProvider.get());
      StreamingetailsActivity_MembersInjector.injectCuePointW(instance, appComponentImpl.provideCuePointWProvider.get());
      StreamingetailsActivity_MembersInjector.injectCuePointZ(instance, appComponentImpl.provideCuePointZProvider.get());
      StreamingetailsActivity_MembersInjector.injectTokenManager(instance, appComponentImpl.provideTokenManagerProvider.get());
      return instance;
    }
  }

  private static final class EpisodeDetailsActivitySubcomponentImpl implements ActivityModule_ContributeEpisodeDetailsActivity.EpisodeDetailsActivitySubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final EpisodeDetailsActivitySubcomponentImpl episodeDetailsActivitySubcomponentImpl = this;

    private EpisodeDetailsActivitySubcomponentImpl(AppComponentImpl appComponentImpl,
        EpisodeDetailsActivity arg0Param) {
      this.appComponentImpl = appComponentImpl;


    }

    @Override
    public void inject(EpisodeDetailsActivity arg0) {
      injectEpisodeDetailsActivity(arg0);
    }

    @CanIgnoreReturnValue
    private EpisodeDetailsActivity injectEpisodeDetailsActivity(EpisodeDetailsActivity instance) {
      EpisodeDetailsActivity_MembersInjector.injectCheckVpn(instance, appComponentImpl.checkVpnProvider.get());
      EpisodeDetailsActivity_MembersInjector.injectProvideRootCheck(instance, appComponentImpl.provideRootProvider.get());
      EpisodeDetailsActivity_MembersInjector.injectProvideSnifferCheck(instance, appComponentImpl.provideApplicationInfoProvider.get());
      EpisodeDetailsActivity_MembersInjector.injectSettingsManager(instance, appComponentImpl.provideSettingsManagerProvider.get());
      EpisodeDetailsActivity_MembersInjector.injectAuthManager(instance, appComponentImpl.provideAuthManagerProvider.get());
      EpisodeDetailsActivity_MembersInjector.injectTokenManager(instance, appComponentImpl.provideTokenManagerProvider.get());
      EpisodeDetailsActivity_MembersInjector.injectMediaRepository(instance, appComponentImpl.mediaRepositoryProvider.get());
      return instance;
    }
  }

  private static final class EpisodesFragmentSubcomponentImpl implements FragmentBuildersModule_ContributeEpisodesFragment.EpisodesFragmentSubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final EpisodesFragmentSubcomponentImpl episodesFragmentSubcomponentImpl = this;

    private EpisodesFragmentSubcomponentImpl(AppComponentImpl appComponentImpl,
        EpisodesFragment arg0Param) {
      this.appComponentImpl = appComponentImpl;


    }

    @Override
    public void inject(EpisodesFragment arg0) {
      injectEpisodesFragment(arg0);
    }

    @CanIgnoreReturnValue
    private EpisodesFragment injectEpisodesFragment(EpisodesFragment instance) {
      EpisodesFragment_MembersInjector.injectViewModelFactory(instance, appComponentImpl.moviesViewModelFactoryProvider.get());
      EpisodesFragment_MembersInjector.injectTokenManager(instance, appComponentImpl.provideTokenManagerProvider.get());
      EpisodesFragment_MembersInjector.injectMediaRepository(instance, appComponentImpl.mediaRepositoryProvider.get());
      EpisodesFragment_MembersInjector.injectSharedPreferences(instance, appComponentImpl.provideSharedPreferencesProvider.get());
      EpisodesFragment_MembersInjector.injectAuthManager(instance, appComponentImpl.provideAuthManagerProvider.get());
      EpisodesFragment_MembersInjector.injectSettingsManager(instance, appComponentImpl.provideSettingsManagerProvider.get());
      return instance;
    }
  }

  private static final class FinishedDownloadsFragmentSubcomponentImpl implements FragmentBuildersModule_ContributeFinishedDownloadsFragment.FinishedDownloadsFragmentSubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final FinishedDownloadsFragmentSubcomponentImpl finishedDownloadsFragmentSubcomponentImpl = this;

    private FinishedDownloadsFragmentSubcomponentImpl(AppComponentImpl appComponentImpl,
        FinishedDownloadsFragment arg0Param) {
      this.appComponentImpl = appComponentImpl;


    }

    @Override
    public void inject(FinishedDownloadsFragment arg0) {
      injectFinishedDownloadsFragment(arg0);
    }

    @CanIgnoreReturnValue
    private FinishedDownloadsFragment injectFinishedDownloadsFragment(
        FinishedDownloadsFragment instance) {
      DownloadsFragment_MembersInjector.injectMediaRepository(instance, appComponentImpl.mediaRepositoryProvider.get());
      DownloadsFragment_MembersInjector.injectSettingsManager(instance, appComponentImpl.provideSettingsManagerProvider.get());
      return instance;
    }
  }

  private static final class QueuedDownloadsFragmentSubcomponentImpl implements FragmentBuildersModule_ContributeQueuedDownloadsFragment.QueuedDownloadsFragmentSubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final QueuedDownloadsFragmentSubcomponentImpl queuedDownloadsFragmentSubcomponentImpl = this;

    private QueuedDownloadsFragmentSubcomponentImpl(AppComponentImpl appComponentImpl,
        QueuedDownloadsFragment arg0Param) {
      this.appComponentImpl = appComponentImpl;


    }

    @Override
    public void inject(QueuedDownloadsFragment arg0) {
      injectQueuedDownloadsFragment(arg0);
    }

    @CanIgnoreReturnValue
    private QueuedDownloadsFragment injectQueuedDownloadsFragment(
        QueuedDownloadsFragment instance) {
      DownloadsFragment_MembersInjector.injectMediaRepository(instance, appComponentImpl.mediaRepositoryProvider.get());
      DownloadsFragment_MembersInjector.injectSettingsManager(instance, appComponentImpl.provideSettingsManagerProvider.get());
      return instance;
    }
  }

  private static final class DownloadsFragmentSubcomponentImpl implements FragmentBuildersModule_ContributeDownloadsFragment.DownloadsFragmentSubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final DownloadsFragmentSubcomponentImpl downloadsFragmentSubcomponentImpl = this;

    private DownloadsFragmentSubcomponentImpl(AppComponentImpl appComponentImpl,
        DownloadsFragment arg0Param) {
      this.appComponentImpl = appComponentImpl;


    }

    @Override
    public void inject(DownloadsFragment arg0) {
      injectDownloadsFragment(arg0);
    }

    @CanIgnoreReturnValue
    private DownloadsFragment injectDownloadsFragment(DownloadsFragment instance) {
      DownloadsFragment_MembersInjector.injectMediaRepository(instance, appComponentImpl.mediaRepositoryProvider.get());
      DownloadsFragment_MembersInjector.injectSettingsManager(instance, appComponentImpl.provideSettingsManagerProvider.get());
      return instance;
    }
  }

  private static final class HomeFragmentSubcomponentImpl implements FragmentBuildersModule_ContributeHomeFragment.HomeFragmentSubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final HomeFragmentSubcomponentImpl homeFragmentSubcomponentImpl = this;

    private HomeFragmentSubcomponentImpl(AppComponentImpl appComponentImpl,
        HomeFragment arg0Param) {
      this.appComponentImpl = appComponentImpl;


    }

    @Override
    public void inject(HomeFragment arg0) {
      injectHomeFragment(arg0);
    }

    @CanIgnoreReturnValue
    private HomeFragment injectHomeFragment(HomeFragment instance) {
      HomeFragment_MembersInjector.injectMMainAdapter(instance, appComponentImpl.mainAdapterProvideProvider.get());
      HomeFragment_MembersInjector.injectAppController(instance, appComponentImpl.appControllerProvideProvider.get());
      HomeFragment_MembersInjector.injectShadowEnable(instance, appComponentImpl.shadowEnableProvider.get());
      HomeFragment_MembersInjector.injectViewModelFactory(instance, appComponentImpl.moviesViewModelFactoryProvider.get());
      HomeFragment_MembersInjector.injectPreferences(instance, appComponentImpl.provideSharedPreferencesProvider.get());
      HomeFragment_MembersInjector.injectMediaRepository(instance, appComponentImpl.mediaRepositoryProvider.get());
      HomeFragment_MembersInjector.injectAnimeRepository(instance, appComponentImpl.animeRepositoryProvider.get());
      HomeFragment_MembersInjector.injectMenuHandler(instance, appComponentImpl.provideMenuHandlerProvider.get());
      HomeFragment_MembersInjector.injectSettingsRepository(instance, appComponentImpl.settingsRepository());
      HomeFragment_MembersInjector.injectAuthRepository(instance, appComponentImpl.authRepository());
      HomeFragment_MembersInjector.injectSharedPreferencesEditor(instance, appComponentImpl.providesSharedPreferencesEditorProvider.get());
      HomeFragment_MembersInjector.injectSettingsManager(instance, appComponentImpl.provideSettingsManagerProvider.get());
      HomeFragment_MembersInjector.injectTokenManager(instance, appComponentImpl.provideTokenManagerProvider.get());
      HomeFragment_MembersInjector.injectAdsManager(instance, appComponentImpl.provideAdsManagerProvider.get());
      HomeFragment_MembersInjector.injectCuePoint(instance, appComponentImpl.provideCuePointProvider.get());
      HomeFragment_MembersInjector.injectCuepointUrl(instance, appComponentImpl.provideCuePointUrlProvider.get());
      HomeFragment_MembersInjector.injectAuthManager(instance, appComponentImpl.provideAuthManagerProvider.get());
      HomeFragment_MembersInjector.injectStatusManager(instance, appComponentImpl.provideStatusManagerProvider.get());
      HomeFragment_MembersInjector.injectCuePointY(instance, appComponentImpl.provideCuePointYProvider.get());
      HomeFragment_MembersInjector.injectCuePointN(instance, appComponentImpl.provideCuePointNProvider.get());
      HomeFragment_MembersInjector.injectCuePointW(instance, appComponentImpl.provideCuePointWProvider.get());
      HomeFragment_MembersInjector.injectCuePointZ(instance, appComponentImpl.provideCuePointZProvider.get());
      HomeFragment_MembersInjector.injectAdplayingY(instance, appComponentImpl.provideadplayingYProvider.get());
      HomeFragment_MembersInjector.injectAdplayingN(instance, appComponentImpl.provideadplayingNProvider.get());
      HomeFragment_MembersInjector.injectAdplayingW(instance, appComponentImpl.provideadplayingWProvider.get());
      HomeFragment_MembersInjector.injectAdplayingZ(instance, appComponentImpl.provideadplayingZProvider.get());
      return instance;
    }
  }

  private static final class UpComingFragmentSubcomponentImpl implements FragmentBuildersModule_ContributeUpcomingFragment.UpComingFragmentSubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final UpComingFragmentSubcomponentImpl upComingFragmentSubcomponentImpl = this;

    private UpComingFragmentSubcomponentImpl(AppComponentImpl appComponentImpl,
        UpComingFragment arg0Param) {
      this.appComponentImpl = appComponentImpl;


    }

    @Override
    public void inject(UpComingFragment arg0) {
      injectUpComingFragment(arg0);
    }

    @CanIgnoreReturnValue
    private UpComingFragment injectUpComingFragment(UpComingFragment instance) {
      UpComingFragment_MembersInjector.injectSettingsManager(instance, appComponentImpl.provideSettingsManagerProvider.get());
      UpComingFragment_MembersInjector.injectViewModelFactory(instance, appComponentImpl.moviesViewModelFactoryProvider.get());
      return instance;
    }
  }

  private static final class DiscoverFragmentSubcomponentImpl implements FragmentBuildersModule_ContributeDiscoverFragment.DiscoverFragmentSubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final DiscoverFragmentSubcomponentImpl discoverFragmentSubcomponentImpl = this;

    private DiscoverFragmentSubcomponentImpl(AppComponentImpl appComponentImpl,
        DiscoverFragment arg0Param) {
      this.appComponentImpl = appComponentImpl;


    }

    @Override
    public void inject(DiscoverFragment arg0) {
      injectDiscoverFragment(arg0);
    }

    @CanIgnoreReturnValue
    private DiscoverFragment injectDiscoverFragment(DiscoverFragment instance) {
      DiscoverFragment_MembersInjector.injectTokenManager(instance, appComponentImpl.provideTokenManagerProvider.get());
      DiscoverFragment_MembersInjector.injectPreferences(instance, appComponentImpl.provideSharedPreferencesProvider.get());
      DiscoverFragment_MembersInjector.injectAuthManager(instance, appComponentImpl.provideAuthManagerProvider.get());
      DiscoverFragment_MembersInjector.injectSettingsManager(instance, appComponentImpl.provideSettingsManagerProvider.get());
      DiscoverFragment_MembersInjector.injectMediaRepository(instance, appComponentImpl.mediaRepositoryProvider.get());
      DiscoverFragment_MembersInjector.injectAnimeRepository(instance, appComponentImpl.animeRepositoryProvider.get());
      DiscoverFragment_MembersInjector.injectViewModelFactory(instance, appComponentImpl.moviesViewModelFactoryProvider.get());
      return instance;
    }
  }

  private static final class MoviesFragmentSubcomponentImpl implements FragmentBuildersModule_ContributeMoviesFragment.MoviesFragmentSubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final MoviesFragmentSubcomponentImpl moviesFragmentSubcomponentImpl = this;

    private MoviesFragmentSubcomponentImpl(AppComponentImpl appComponentImpl,
        MoviesFragment arg0Param) {
      this.appComponentImpl = appComponentImpl;


    }

    @Override
    public void inject(MoviesFragment arg0) {
      injectMoviesFragment(arg0);
    }

    @CanIgnoreReturnValue
    private MoviesFragment injectMoviesFragment(MoviesFragment instance) {
      MoviesFragment_MembersInjector.injectViewModelFactory(instance, appComponentImpl.moviesViewModelFactoryProvider.get());
      return instance;
    }
  }

  private static final class LibraryStyleFragmentSubcomponentImpl implements FragmentBuildersModule_ContributeLibraryStyleFragment.LibraryStyleFragmentSubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final LibraryStyleFragmentSubcomponentImpl libraryStyleFragmentSubcomponentImpl = this;

    private LibraryStyleFragmentSubcomponentImpl(AppComponentImpl appComponentImpl,
        LibraryStyleFragment arg0Param) {
      this.appComponentImpl = appComponentImpl;


    }

    @Override
    public void inject(LibraryStyleFragment arg0) {
      injectLibraryStyleFragment(arg0);
    }

    @CanIgnoreReturnValue
    private LibraryStyleFragment injectLibraryStyleFragment(LibraryStyleFragment instance) {
      LibraryStyleFragment_MembersInjector.injectViewModelFactory(instance, appComponentImpl.moviesViewModelFactoryProvider.get());
      LibraryStyleFragment_MembersInjector.injectMediaRepository(instance, appComponentImpl.mediaRepositoryProvider.get());
      return instance;
    }
  }

  private static final class SeriesFragmentSubcomponentImpl implements FragmentBuildersModule_ContributeSeriesFragment.SeriesFragmentSubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final SeriesFragmentSubcomponentImpl seriesFragmentSubcomponentImpl = this;

    private SeriesFragmentSubcomponentImpl(AppComponentImpl appComponentImpl,
        SeriesFragment arg0Param) {
      this.appComponentImpl = appComponentImpl;


    }

    @Override
    public void inject(SeriesFragment arg0) {
      injectSeriesFragment(arg0);
    }

    @CanIgnoreReturnValue
    private SeriesFragment injectSeriesFragment(SeriesFragment instance) {
      SeriesFragment_MembersInjector.injectViewModelFactory(instance, appComponentImpl.moviesViewModelFactoryProvider.get());
      return instance;
    }
  }

  private static final class LibraryFragmentSubcomponentImpl implements FragmentBuildersModule_ContributeLibraryFragment.LibraryFragmentSubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final LibraryFragmentSubcomponentImpl libraryFragmentSubcomponentImpl = this;

    private LibraryFragmentSubcomponentImpl(AppComponentImpl appComponentImpl,
        LibraryFragment arg0Param) {
      this.appComponentImpl = appComponentImpl;


    }

    @Override
    public void inject(LibraryFragment arg0) {
      injectLibraryFragment(arg0);
    }

    @CanIgnoreReturnValue
    private LibraryFragment injectLibraryFragment(LibraryFragment instance) {
      LibraryFragment_MembersInjector.injectAuthRepository(instance, appComponentImpl.settingsRepository());
      LibraryFragment_MembersInjector.injectSettingsManager(instance, appComponentImpl.provideSettingsManagerProvider.get());
      return instance;
    }
  }

  private static final class MoviesListFragmentSubcomponentImpl implements FragmentBuildersModule_ContributeMyListMoviesFragment.MoviesListFragmentSubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final MoviesListFragmentSubcomponentImpl moviesListFragmentSubcomponentImpl = this;

    private MoviesListFragmentSubcomponentImpl(AppComponentImpl appComponentImpl,
        MoviesListFragment arg0Param) {
      this.appComponentImpl = appComponentImpl;


    }

    @Override
    public void inject(MoviesListFragment arg0) {
      injectMoviesListFragment(arg0);
    }

    @CanIgnoreReturnValue
    private MoviesListFragment injectMoviesListFragment(MoviesListFragment instance) {
      MoviesListFragment_MembersInjector.injectViewModelFactory(instance, appComponentImpl.moviesViewModelFactoryProvider.get());
      MoviesListFragment_MembersInjector.injectAuthRepository(instance, appComponentImpl.authRepository());
      MoviesListFragment_MembersInjector.injectMediaRepository(instance, appComponentImpl.mediaRepositoryProvider.get());
      MoviesListFragment_MembersInjector.injectSettingsManager(instance, appComponentImpl.provideSettingsManagerProvider.get());
      MoviesListFragment_MembersInjector.injectTokenManager(instance, appComponentImpl.provideTokenManagerProvider.get());
      MoviesListFragment_MembersInjector.injectMoviesListViewModel(instance, appComponentImpl.moviesListViewModel());
      return instance;
    }
  }

  private static final class AnimesFragmentSubcomponentImpl implements FragmentBuildersModule_ContributeAnimesFragment.AnimesFragmentSubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final AnimesFragmentSubcomponentImpl animesFragmentSubcomponentImpl = this;

    private AnimesFragmentSubcomponentImpl(AppComponentImpl appComponentImpl,
        AnimesFragment arg0Param) {
      this.appComponentImpl = appComponentImpl;


    }

    @Override
    public void inject(AnimesFragment arg0) {
      injectAnimesFragment(arg0);
    }

    @CanIgnoreReturnValue
    private AnimesFragment injectAnimesFragment(AnimesFragment instance) {
      AnimesFragment_MembersInjector.injectViewModelFactory(instance, appComponentImpl.moviesViewModelFactoryProvider.get());
      return instance;
    }
  }

  private static final class StreamingFragmentSubcomponentImpl implements FragmentBuildersModule_ContributeLiveFragment.StreamingFragmentSubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final StreamingFragmentSubcomponentImpl streamingFragmentSubcomponentImpl = this;

    private StreamingFragmentSubcomponentImpl(AppComponentImpl appComponentImpl,
        StreamingFragment arg0Param) {
      this.appComponentImpl = appComponentImpl;


    }

    @Override
    public void inject(StreamingFragment arg0) {
      injectStreamingFragment(arg0);
    }

    @CanIgnoreReturnValue
    private StreamingFragment injectStreamingFragment(StreamingFragment instance) {
      StreamingFragment_MembersInjector.injectViewModelFactory(instance, appComponentImpl.moviesViewModelFactoryProvider.get());
      StreamingFragment_MembersInjector.injectSettingsManager(instance, appComponentImpl.provideSettingsManagerProvider.get());
      StreamingFragment_MembersInjector.injectPreferences(instance, appComponentImpl.provideSharedPreferencesProvider.get());
      StreamingFragment_MembersInjector.injectAuthRepository(instance, appComponentImpl.settingsRepository());
      StreamingFragment_MembersInjector.injectMediaRepository(instance, appComponentImpl.mediaRepositoryProvider.get());
      StreamingFragment_MembersInjector.injectAuthManager(instance, appComponentImpl.provideAuthManagerProvider.get());
      StreamingFragment_MembersInjector.injectTokenManager(instance, appComponentImpl.provideTokenManagerProvider.get());
      return instance;
    }
  }

  private static final class SettingsActivitySubcomponentImpl implements FragmentBuildersModule_ContributeSettingsFragment.SettingsActivitySubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final SettingsActivitySubcomponentImpl settingsActivitySubcomponentImpl = this;

    private SettingsActivitySubcomponentImpl(AppComponentImpl appComponentImpl,
        SettingsActivity arg0Param) {
      this.appComponentImpl = appComponentImpl;


    }

    @Override
    public void inject(SettingsActivity arg0) {
      injectSettingsActivity(arg0);
    }

    @CanIgnoreReturnValue
    private SettingsActivity injectSettingsActivity(SettingsActivity instance) {
      SettingsActivity_MembersInjector.injectViewModelFactory(instance, appComponentImpl.moviesViewModelFactoryProvider.get());
      SettingsActivity_MembersInjector.injectAuthRepository(instance, appComponentImpl.authRepository());
      SettingsActivity_MembersInjector.injectSharedPreferencesEditor(instance, appComponentImpl.providesSharedPreferencesEditorProvider.get());
      SettingsActivity_MembersInjector.injectSharedPreferences(instance, appComponentImpl.provideSharedPreferencesProvider.get());
      SettingsActivity_MembersInjector.injectTokenManager(instance, appComponentImpl.provideTokenManagerProvider.get());
      SettingsActivity_MembersInjector.injectSettingsManager(instance, appComponentImpl.provideSettingsManagerProvider.get());
      SettingsActivity_MembersInjector.injectAdsManager(instance, appComponentImpl.provideAdsManagerProvider.get());
      SettingsActivity_MembersInjector.injectAuthManager(instance, appComponentImpl.provideAuthManagerProvider.get());
      SettingsActivity_MembersInjector.injectSettingsRepository(instance, appComponentImpl.settingsRepository());
      return instance;
    }
  }

  private static final class ListFragmentSubcomponentImpl implements FragmentBuildersModule_ContributeListFragment.ListFragmentSubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final ListFragmentSubcomponentImpl listFragmentSubcomponentImpl = this;

    private ListFragmentSubcomponentImpl(AppComponentImpl appComponentImpl,
        ListFragment arg0Param) {
      this.appComponentImpl = appComponentImpl;


    }

    @Override
    public void inject(ListFragment arg0) {
      injectListFragment(arg0);
    }

    @CanIgnoreReturnValue
    private ListFragment injectListFragment(ListFragment instance) {
      ListFragment_MembersInjector.injectAuthRepository(instance, appComponentImpl.settingsRepository());
      ListFragment_MembersInjector.injectSettingsManager(instance, appComponentImpl.provideSettingsManagerProvider.get());
      return instance;
    }
  }

  private static final class SeriesListFragmentSubcomponentImpl implements FragmentBuildersModule_ContributeSeriesListFragment.SeriesListFragmentSubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final SeriesListFragmentSubcomponentImpl seriesListFragmentSubcomponentImpl = this;

    private SeriesListFragmentSubcomponentImpl(AppComponentImpl appComponentImpl,
        SeriesListFragment arg0Param) {
      this.appComponentImpl = appComponentImpl;


    }

    @Override
    public void inject(SeriesListFragment arg0) {
      injectSeriesListFragment(arg0);
    }

    @CanIgnoreReturnValue
    private SeriesListFragment injectSeriesListFragment(SeriesListFragment instance) {
      SeriesListFragment_MembersInjector.injectViewModelFactory(instance, appComponentImpl.moviesViewModelFactoryProvider.get());
      SeriesListFragment_MembersInjector.injectMediaRepository(instance, appComponentImpl.mediaRepositoryProvider.get());
      SeriesListFragment_MembersInjector.injectAuthRepository(instance, appComponentImpl.authRepository());
      SeriesListFragment_MembersInjector.injectTokenManager(instance, appComponentImpl.provideTokenManagerProvider.get());
      SeriesListFragment_MembersInjector.injectSettingsManager(instance, appComponentImpl.provideSettingsManagerProvider.get());
      return instance;
    }
  }

  private static final class AnimesListFragmentSubcomponentImpl implements FragmentBuildersModule_ContributeAnimesListFragment.AnimesListFragmentSubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final AnimesListFragmentSubcomponentImpl animesListFragmentSubcomponentImpl = this;

    private AnimesListFragmentSubcomponentImpl(AppComponentImpl appComponentImpl,
        AnimesListFragment arg0Param) {
      this.appComponentImpl = appComponentImpl;


    }

    @Override
    public void inject(AnimesListFragment arg0) {
      injectAnimesListFragment(arg0);
    }

    @CanIgnoreReturnValue
    private AnimesListFragment injectAnimesListFragment(AnimesListFragment instance) {
      AnimesListFragment_MembersInjector.injectViewModelFactory(instance, appComponentImpl.moviesViewModelFactoryProvider.get());
      AnimesListFragment_MembersInjector.injectAnimeRepository(instance, appComponentImpl.animeRepositoryProvider.get());
      AnimesListFragment_MembersInjector.injectAuthRepository(instance, appComponentImpl.authRepository());
      AnimesListFragment_MembersInjector.injectMediaRepository(instance, appComponentImpl.mediaRepositoryProvider.get());
      AnimesListFragment_MembersInjector.injectSettingsManager(instance, appComponentImpl.provideSettingsManagerProvider.get());
      AnimesListFragment_MembersInjector.injectTokenManager(instance, appComponentImpl.provideTokenManagerProvider.get());
      return instance;
    }
  }

  private static final class NetworksFragmentSubcomponentImpl implements FragmentBuildersModule_ContributeNetworksFragment.NetworksFragmentSubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final NetworksFragmentSubcomponentImpl networksFragmentSubcomponentImpl = this;

    private NetworksFragmentSubcomponentImpl(AppComponentImpl appComponentImpl,
        NetworksFragment arg0Param) {
      this.appComponentImpl = appComponentImpl;


    }

    @Override
    public void inject(NetworksFragment arg0) {
      injectNetworksFragment(arg0);
    }

    @CanIgnoreReturnValue
    private NetworksFragment injectNetworksFragment(NetworksFragment instance) {
      NetworksFragment_MembersInjector.injectViewModelFactory(instance, appComponentImpl.moviesViewModelFactoryProvider.get());
      return instance;
    }
  }

  private static final class NetworksFragment2SubcomponentImpl implements FragmentBuildersModule_ContributeNetworksFragment2.NetworksFragment2Subcomponent {
    private final AppComponentImpl appComponentImpl;

    private final NetworksFragment2SubcomponentImpl networksFragment2SubcomponentImpl = this;

    private NetworksFragment2SubcomponentImpl(AppComponentImpl appComponentImpl,
        NetworksFragment2 arg0Param) {
      this.appComponentImpl = appComponentImpl;


    }

    @Override
    public void inject(NetworksFragment2 arg0) {
      injectNetworksFragment2(arg0);
    }

    @CanIgnoreReturnValue
    private NetworksFragment2 injectNetworksFragment2(NetworksFragment2 instance) {
      NetworksFragment2_MembersInjector.injectViewModelFactory(instance, appComponentImpl.moviesViewModelFactoryProvider.get());
      NetworksFragment2_MembersInjector.injectMediaRepository(instance, appComponentImpl.mediaRepositoryProvider.get());
      return instance;
    }
  }

  private static final class StreamingListFragmentSubcomponentImpl implements FragmentBuildersModule_ContributeStreamingListFragment.StreamingListFragmentSubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final StreamingListFragmentSubcomponentImpl streamingListFragmentSubcomponentImpl = this;

    private StreamingListFragmentSubcomponentImpl(AppComponentImpl appComponentImpl,
        StreamingListFragment arg0Param) {
      this.appComponentImpl = appComponentImpl;


    }

    @Override
    public void inject(StreamingListFragment arg0) {
      injectStreamingListFragment(arg0);
    }

    @CanIgnoreReturnValue
    private StreamingListFragment injectStreamingListFragment(StreamingListFragment instance) {
      StreamingListFragment_MembersInjector.injectViewModelFactory(instance, appComponentImpl.moviesViewModelFactoryProvider.get());
      StreamingListFragment_MembersInjector.injectMediaRepository(instance, appComponentImpl.mediaRepositoryProvider.get());
      StreamingListFragment_MembersInjector.injectSettingsManager(instance, appComponentImpl.provideSettingsManagerProvider.get());
      StreamingListFragment_MembersInjector.injectAuthRepository(instance, appComponentImpl.authRepository());
      StreamingListFragment_MembersInjector.injectTokenManager(instance, appComponentImpl.provideTokenManagerProvider.get());
      return instance;
    }
  }

  private static final class AppComponentImpl implements AppComponent {
    private final AppComponentImpl appComponentImpl = this;

    private Provider<Application> applicationProvider;

    private Provider<SharedPreferences> provideSharedPreferencesProvider;

    private Provider<ActivityModule_ContributePhoneAuthActivity.PhoneAuthActivitySubcomponent.Factory> phoneAuthActivitySubcomponentFactoryProvider;

    private Provider<ActivityModule_ContributeUserProfiles.UserProfilesSubcomponent.Factory> userProfilesSubcomponentFactoryProvider;

    private Provider<ActivityModule_ContributeMainActivity.BaseActivitySubcomponent.Factory> baseActivitySubcomponentFactoryProvider;

    private Provider<ActivityModule_ContributeMainActivityDown.DownloadManagerFragmentSubcomponent.Factory> downloadManagerFragmentSubcomponentFactoryProvider;

    private Provider<ActivityModule_ContributePayment.PaymentSubcomponent.Factory> paymentSubcomponentFactoryProvider;

    private Provider<ActivityModule_ContributePaymentPaypal.PaymentPaypalSubcomponent.Factory> paymentPaypalSubcomponentFactoryProvider;

    private Provider<ActivityModule_ContributePaymentStripe.PaymentStripeSubcomponent.Factory> paymentStripeSubcomponentFactoryProvider;

    private Provider<ActivityModule_ContributeNotificationManager.NotificationManagerSubcomponent.Factory> notificationManagerSubcomponentFactoryProvider;

    private Provider<ActivityModule_ContributePaymentDetails.PaymentDetailsSubcomponent.Factory> paymentDetailsSubcomponentFactoryProvider;

    private Provider<ActivityModule_ContributeRegistrationSucess.RegistrationSucessSubcomponent.Factory> registrationSucessSubcomponentFactoryProvider;

    private Provider<ActivityModule_ContributeEditProfileActivity.EditProfileActivitySubcomponent.Factory> editProfileActivitySubcomponentFactoryProvider;

    private Provider<ActivityModule_ContributeMovieDetailActivity.MovieDetailsActivitySubcomponent.Factory> movieDetailsActivitySubcomponentFactoryProvider;

    private Provider<ActivityModule_ContributeSerieDetailActivity.SerieDetailsActivitySubcomponent.Factory> serieDetailsActivitySubcomponentFactoryProvider;

    private Provider<ActivityModule_ContributeLoginActivity.LoginActivitySubcomponent.Factory> loginActivitySubcomponentFactoryProvider;

    private Provider<ActivityModule_ContributeRegisterActivity.RegisterActivitySubcomponent.Factory> registerActivitySubcomponentFactoryProvider;

    private Provider<ActivityModule_ContributeTrailerPreviewActivity.TrailerPreviewActivitySubcomponent.Factory> trailerPreviewActivitySubcomponentFactoryProvider;

    private Provider<ActivityModule_ContributeUpcomingTitlesActivity.UpcomingTitlesActivitySubcomponent.Factory> upcomingTitlesActivitySubcomponentFactoryProvider;

    private Provider<ActivityModule_ContributeAnimeDetailsActivity.AnimeDetailsActivitySubcomponent.Factory> animeDetailsActivitySubcomponentFactoryProvider;

    private Provider<ActivityModule_ContributeSplashActivity.SplashActivitySubcomponent.Factory> splashActivitySubcomponentFactoryProvider;

    private Provider<ActivityModule_ContributeEmbedActivity.EmbedActivitySubcomponent.Factory> embedActivitySubcomponentFactoryProvider;

    private Provider<ActivityModule_ContributeEasyPlexMainPlayer.EasyPlexMainPlayerSubcomponent.Factory> easyPlexMainPlayerSubcomponentFactoryProvider;

    private Provider<ActivityModule_ContributePasswordForget.PasswordForgetSubcomponent.Factory> passwordForgetSubcomponentFactoryProvider;

    private Provider<ActivityModule_ContributeCastDetailsActivity.CastDetailsActivitySubcomponent.Factory> castDetailsActivitySubcomponentFactoryProvider;

    private Provider<ActivityModule_ContributeStreamingetailsActivity.StreamingetailsActivitySubcomponent.Factory> streamingetailsActivitySubcomponentFactoryProvider;

    private Provider<ActivityModule_ContributeEpisodeDetailsActivity.EpisodeDetailsActivitySubcomponent.Factory> episodeDetailsActivitySubcomponentFactoryProvider;

    private Provider<FragmentBuildersModule_ContributeEpisodesFragment.EpisodesFragmentSubcomponent.Factory> episodesFragmentSubcomponentFactoryProvider;

    private Provider<FragmentBuildersModule_ContributeFinishedDownloadsFragment.FinishedDownloadsFragmentSubcomponent.Factory> finishedDownloadsFragmentSubcomponentFactoryProvider;

    private Provider<FragmentBuildersModule_ContributeQueuedDownloadsFragment.QueuedDownloadsFragmentSubcomponent.Factory> queuedDownloadsFragmentSubcomponentFactoryProvider;

    private Provider<FragmentBuildersModule_ContributeDownloadsFragment.DownloadsFragmentSubcomponent.Factory> downloadsFragmentSubcomponentFactoryProvider;

    private Provider<FragmentBuildersModule_ContributeHomeFragment.HomeFragmentSubcomponent.Factory> homeFragmentSubcomponentFactoryProvider;

    private Provider<FragmentBuildersModule_ContributeUpcomingFragment.UpComingFragmentSubcomponent.Factory> upComingFragmentSubcomponentFactoryProvider;

    private Provider<FragmentBuildersModule_ContributeDiscoverFragment.DiscoverFragmentSubcomponent.Factory> discoverFragmentSubcomponentFactoryProvider;

    private Provider<FragmentBuildersModule_ContributeMoviesFragment.MoviesFragmentSubcomponent.Factory> moviesFragmentSubcomponentFactoryProvider;

    private Provider<FragmentBuildersModule_ContributeLibraryStyleFragment.LibraryStyleFragmentSubcomponent.Factory> libraryStyleFragmentSubcomponentFactoryProvider;

    private Provider<FragmentBuildersModule_ContributeSeriesFragment.SeriesFragmentSubcomponent.Factory> seriesFragmentSubcomponentFactoryProvider;

    private Provider<FragmentBuildersModule_ContributeLibraryFragment.LibraryFragmentSubcomponent.Factory> libraryFragmentSubcomponentFactoryProvider;

    private Provider<FragmentBuildersModule_ContributeMyListMoviesFragment.MoviesListFragmentSubcomponent.Factory> moviesListFragmentSubcomponentFactoryProvider;

    private Provider<FragmentBuildersModule_ContributeAnimesFragment.AnimesFragmentSubcomponent.Factory> animesFragmentSubcomponentFactoryProvider;

    private Provider<FragmentBuildersModule_ContributeLiveFragment.StreamingFragmentSubcomponent.Factory> streamingFragmentSubcomponentFactoryProvider;

    private Provider<FragmentBuildersModule_ContributeSettingsFragment.SettingsActivitySubcomponent.Factory> settingsActivitySubcomponentFactoryProvider;

    private Provider<FragmentBuildersModule_ContributeListFragment.ListFragmentSubcomponent.Factory> listFragmentSubcomponentFactoryProvider;

    private Provider<FragmentBuildersModule_ContributeSeriesListFragment.SeriesListFragmentSubcomponent.Factory> seriesListFragmentSubcomponentFactoryProvider;

    private Provider<FragmentBuildersModule_ContributeAnimesListFragment.AnimesListFragmentSubcomponent.Factory> animesListFragmentSubcomponentFactoryProvider;

    private Provider<FragmentBuildersModule_ContributeNetworksFragment.NetworksFragmentSubcomponent.Factory> networksFragmentSubcomponentFactoryProvider;

    private Provider<FragmentBuildersModule_ContributeNetworksFragment2.NetworksFragment2Subcomponent.Factory> networksFragment2SubcomponentFactoryProvider;

    private Provider<FragmentBuildersModule_ContributeStreamingListFragment.StreamingListFragmentSubcomponent.Factory> streamingListFragmentSubcomponentFactoryProvider;

    private Provider<SettingsManager> provideSettingsManagerProvider;

    private Provider<ApiInterface> provideMoviesServiceProvider;

    private Provider<TokenManager> provideTokenManagerProvider;

    private Provider<ApiInterface> provideServiceAuthProvider;

    private Provider<AuthManager> provideAuthManagerProvider;

    private Provider<AuthRepository> authRepositoryProvider;

    private Provider<EasyPlexDatabase> provideDbProvider;

    private Provider<MoviesDao> provideFavMoviesDaoProvider;

    private Provider<DownloadDao> provideProgressDaoProvider;

    private Provider<HistoryDao> provideHistoryDaoProvider;

    private Provider<StreamListDao> provideStreamyDaoProvider;

    private Provider<ResumeDao> provideResumeDaoProvider;

    private Provider<SeriesDao> provideSeriesDaoProvider;

    private Provider<AnimesDao> provideAnimesDaoProvider;

    private Provider<com.easyplex.easyplexsupportedhosts.ApiInterface> provideUtilsCProvider;

    private Provider<ApiInterface> provideMoviesServiceImdbProvider;

    private Provider<ApiInterface> provideMoviesServiceOpenSubsProvider;

    private Provider<ApiInterface> provideCallbackProvider;

    private Provider<String> provideCuePointProvider;

    private Provider<String> provideCuePointUrlProvider;

    private Provider<ApiInterface> provideCuePointCallBackAdProvider;

    private Provider<ApiInterface> provideAdPlayingProvider;

    private Provider<Fsm> playerLoadingProvider;

    private Provider<MediaRepository> mediaRepositoryProvider;

    private Provider<UserViewModel> userViewModelProvider;

    private Provider<HomeViewModel> homeViewModelProvider;

    private Provider<ApiInterface> provideServiceStatusProvider;

    private Provider<UpcomingViewModel> upcomingViewModelProvider;

    private Provider<MovieDetailViewModel> movieDetailViewModelProvider;

    private Provider<SerieDetailViewModel> serieDetailViewModelProvider;

    private Provider<SearchViewModel> searchViewModelProvider;

    private Provider<LoginViewModel> loginViewModelProvider;

    private Provider<RegisterViewModel> registerViewModelProvider;

    private Provider<GenresViewModel> genresViewModelProvider;

    private Provider<SettingsRepository> settingsRepositoryProvider;

    private Provider<SettingsViewModel> settingsViewModelProvider;

    private Provider<MoviesListViewModel> moviesListViewModelProvider;

    private Provider<AnimeRepository> animeRepositoryProvider;

    private Provider<AnimeViewModel> animeViewModelProvider;

    private Provider<StreamingDetailViewModel> streamingDetailViewModelProvider;

    private Provider<StreamingGenresViewModel> streamingGenresViewModelProvider;

    private Provider<PlayerViewModel> playerViewModelProvider;

    private Provider<CastersViewModel> castersViewModelProvider;

    private Provider<NetworksViewModel> networksViewModelProvider;

    private Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> mapOfClassOfAndProviderOfViewModelProvider;

    private Provider<MoviesViewModelFactory> moviesViewModelFactoryProvider;

    private Provider<MenuHandler> provideMenuHandlerProvider;

    private Provider<ProfilesAdapter> profilesAdapterProvideProvider;

    private Provider<ApplicationInfo> provideApplicationInfoProvider;

    private Provider<ApplicationInfo> provideRootProvider;

    private Provider<Boolean> checkVpnProvider;

    private Provider<Boolean> provideReadyProvider;

    private Provider<AdsManager> provideAdsManagerProvider;

    private Provider<StatusManager> provideStatusManagerProvider;

    private Provider<SharedPreferences.Editor> providesSharedPreferencesEditorProvider;

    private Provider<String> provideCuePointYProvider;

    private Provider<String> provideCuePointNProvider;

    private Provider<String> provideCuePointWProvider;

    private Provider<String> provideCuePointZProvider;

    private Provider<String> packNameProvider;

    private Provider<FirebaseRemoteConfig> provideFirebaseRemoteConfigProvider;

    private Provider<String> mainPlayerProvider;

    private Provider<StateFactory> provideStateFactoryProvider;

    private Provider<FsmPlayer> provideFsmPlayerProvider;

    private Provider<PlayerUIController> provideControllerProvider;

    private Provider<AdPlayingMonitor> provideAdPlayingMonitorProvider;

    private Provider<CuePointMonitor> provideCuePointMonitorProvider;

    private Provider<AdRetriever> provideAdRetrieverProvider;

    private Provider<CuePointsRetriever> provideCuePointsRetrieverProvider;

    private Provider<AdInterface> provideAdInterfaceNoPrerollProvider;

    private Provider<PlayerAdLogicController> provideComponentControllerProvider;

    private Provider<VpaidClient> provideVpaidClientProvider;

    private Provider<PlaybackSettingMenu> providePlaybackSettingMenuProvider;

    private Provider<PlayerController> providePlayerControllerProvider;

    private Provider<AppController> appControllerProvideProvider;

    private Provider<MainAdapter> mainAdapterProvideProvider;

    private Provider<Boolean> shadowEnableProvider;

    private Provider<String> provideadplayingYProvider;

    private Provider<String> provideadplayingNProvider;

    private Provider<String> provideadplayingWProvider;

    private Provider<String> provideadplayingZProvider;

    private AppComponentImpl(AppModule appModuleParam, Application applicationParam) {

      initialize(appModuleParam, applicationParam);
      initialize2(appModuleParam, applicationParam);

    }

    private Map<Class<?>, Provider<dagger.android.AndroidInjector.Factory<?>>> mapOfClassOfAndProviderOfAndroidInjectorFactoryOf(
        ) {
      return ImmutableMap.<Class<?>, Provider<dagger.android.AndroidInjector.Factory<?>>>builderWithExpectedSize(46).put(PhoneAuthActivity.class, ((Provider) phoneAuthActivitySubcomponentFactoryProvider)).put(UserProfiles.class, ((Provider) userProfilesSubcomponentFactoryProvider)).put(BaseActivity.class, ((Provider) baseActivitySubcomponentFactoryProvider)).put(DownloadManagerFragment.class, ((Provider) downloadManagerFragmentSubcomponentFactoryProvider)).put(Payment.class, ((Provider) paymentSubcomponentFactoryProvider)).put(PaymentPaypal.class, ((Provider) paymentPaypalSubcomponentFactoryProvider)).put(PaymentStripe.class, ((Provider) paymentStripeSubcomponentFactoryProvider)).put(NotificationManager.class, ((Provider) notificationManagerSubcomponentFactoryProvider)).put(PaymentDetails.class, ((Provider) paymentDetailsSubcomponentFactoryProvider)).put(RegistrationSucess.class, ((Provider) registrationSucessSubcomponentFactoryProvider)).put(EditProfileActivity.class, ((Provider) editProfileActivitySubcomponentFactoryProvider)).put(MovieDetailsActivity.class, ((Provider) movieDetailsActivitySubcomponentFactoryProvider)).put(SerieDetailsActivity.class, ((Provider) serieDetailsActivitySubcomponentFactoryProvider)).put(LoginActivity.class, ((Provider) loginActivitySubcomponentFactoryProvider)).put(RegisterActivity.class, ((Provider) registerActivitySubcomponentFactoryProvider)).put(TrailerPreviewActivity.class, ((Provider) trailerPreviewActivitySubcomponentFactoryProvider)).put(UpcomingTitlesActivity.class, ((Provider) upcomingTitlesActivitySubcomponentFactoryProvider)).put(AnimeDetailsActivity.class, ((Provider) animeDetailsActivitySubcomponentFactoryProvider)).put(SplashActivity.class, ((Provider) splashActivitySubcomponentFactoryProvider)).put(EmbedActivity.class, ((Provider) embedActivitySubcomponentFactoryProvider)).put(EasyPlexMainPlayer.class, ((Provider) easyPlexMainPlayerSubcomponentFactoryProvider)).put(PasswordForget.class, ((Provider) passwordForgetSubcomponentFactoryProvider)).put(CastDetailsActivity.class, ((Provider) castDetailsActivitySubcomponentFactoryProvider)).put(StreamingetailsActivity.class, ((Provider) streamingetailsActivitySubcomponentFactoryProvider)).put(EpisodeDetailsActivity.class, ((Provider) episodeDetailsActivitySubcomponentFactoryProvider)).put(EpisodesFragment.class, ((Provider) episodesFragmentSubcomponentFactoryProvider)).put(FinishedDownloadsFragment.class, ((Provider) finishedDownloadsFragmentSubcomponentFactoryProvider)).put(QueuedDownloadsFragment.class, ((Provider) queuedDownloadsFragmentSubcomponentFactoryProvider)).put(DownloadsFragment.class, ((Provider) downloadsFragmentSubcomponentFactoryProvider)).put(HomeFragment.class, ((Provider) homeFragmentSubcomponentFactoryProvider)).put(UpComingFragment.class, ((Provider) upComingFragmentSubcomponentFactoryProvider)).put(DiscoverFragment.class, ((Provider) discoverFragmentSubcomponentFactoryProvider)).put(MoviesFragment.class, ((Provider) moviesFragmentSubcomponentFactoryProvider)).put(LibraryStyleFragment.class, ((Provider) libraryStyleFragmentSubcomponentFactoryProvider)).put(SeriesFragment.class, ((Provider) seriesFragmentSubcomponentFactoryProvider)).put(LibraryFragment.class, ((Provider) libraryFragmentSubcomponentFactoryProvider)).put(MoviesListFragment.class, ((Provider) moviesListFragmentSubcomponentFactoryProvider)).put(AnimesFragment.class, ((Provider) animesFragmentSubcomponentFactoryProvider)).put(StreamingFragment.class, ((Provider) streamingFragmentSubcomponentFactoryProvider)).put(SettingsActivity.class, ((Provider) settingsActivitySubcomponentFactoryProvider)).put(ListFragment.class, ((Provider) listFragmentSubcomponentFactoryProvider)).put(SeriesListFragment.class, ((Provider) seriesListFragmentSubcomponentFactoryProvider)).put(AnimesListFragment.class, ((Provider) animesListFragmentSubcomponentFactoryProvider)).put(NetworksFragment.class, ((Provider) networksFragmentSubcomponentFactoryProvider)).put(NetworksFragment2.class, ((Provider) networksFragment2SubcomponentFactoryProvider)).put(StreamingListFragment.class, ((Provider) streamingListFragmentSubcomponentFactoryProvider)).build();
    }

    private DispatchingAndroidInjector<Object> dispatchingAndroidInjectorOfObject() {
      return DispatchingAndroidInjector_Factory.newInstance(mapOfClassOfAndProviderOfAndroidInjectorFactoryOf(), ImmutableMap.<String, Provider<dagger.android.AndroidInjector.Factory<?>>>of());
    }

    private AuthRepository authRepository() {
      return injectAuthRepository(AuthRepository_Factory.newInstance(provideMoviesServiceProvider.get(), provideTokenManagerProvider.get(), provideMoviesServiceProvider.get()));
    }

    private SettingsRepository settingsRepository() {
      return injectSettingsRepository(SettingsRepository_Factory.newInstance(provideMoviesServiceProvider.get()));
    }

    private MoviesListViewModel moviesListViewModel() {
      return injectMoviesListViewModel(MoviesListViewModel_Factory.newInstance(mediaRepositoryProvider.get(), provideAuthManagerProvider.get()));
    }

    @SuppressWarnings("unchecked")
    private void initialize(final AppModule appModuleParam, final Application applicationParam) {
      this.applicationProvider = InstanceFactory.create(applicationParam);
      this.provideSharedPreferencesProvider = DoubleCheck.provider(AppModule_ProvideSharedPreferencesFactory.create(appModuleParam, applicationProvider));
      this.phoneAuthActivitySubcomponentFactoryProvider = new Provider<ActivityModule_ContributePhoneAuthActivity.PhoneAuthActivitySubcomponent.Factory>() {
        @Override
        public ActivityModule_ContributePhoneAuthActivity.PhoneAuthActivitySubcomponent.Factory get(
            ) {
          return new PhoneAuthActivitySubcomponentFactory(appComponentImpl);
        }
      };
      this.userProfilesSubcomponentFactoryProvider = new Provider<ActivityModule_ContributeUserProfiles.UserProfilesSubcomponent.Factory>() {
        @Override
        public ActivityModule_ContributeUserProfiles.UserProfilesSubcomponent.Factory get() {
          return new UserProfilesSubcomponentFactory(appComponentImpl);
        }
      };
      this.baseActivitySubcomponentFactoryProvider = new Provider<ActivityModule_ContributeMainActivity.BaseActivitySubcomponent.Factory>() {
        @Override
        public ActivityModule_ContributeMainActivity.BaseActivitySubcomponent.Factory get() {
          return new BaseActivitySubcomponentFactory(appComponentImpl);
        }
      };
      this.downloadManagerFragmentSubcomponentFactoryProvider = new Provider<ActivityModule_ContributeMainActivityDown.DownloadManagerFragmentSubcomponent.Factory>() {
        @Override
        public ActivityModule_ContributeMainActivityDown.DownloadManagerFragmentSubcomponent.Factory get(
            ) {
          return new DownloadManagerFragmentSubcomponentFactory(appComponentImpl);
        }
      };
      this.paymentSubcomponentFactoryProvider = new Provider<ActivityModule_ContributePayment.PaymentSubcomponent.Factory>() {
        @Override
        public ActivityModule_ContributePayment.PaymentSubcomponent.Factory get() {
          return new PaymentSubcomponentFactory(appComponentImpl);
        }
      };
      this.paymentPaypalSubcomponentFactoryProvider = new Provider<ActivityModule_ContributePaymentPaypal.PaymentPaypalSubcomponent.Factory>() {
        @Override
        public ActivityModule_ContributePaymentPaypal.PaymentPaypalSubcomponent.Factory get() {
          return new PaymentPaypalSubcomponentFactory(appComponentImpl);
        }
      };
      this.paymentStripeSubcomponentFactoryProvider = new Provider<ActivityModule_ContributePaymentStripe.PaymentStripeSubcomponent.Factory>() {
        @Override
        public ActivityModule_ContributePaymentStripe.PaymentStripeSubcomponent.Factory get() {
          return new PaymentStripeSubcomponentFactory(appComponentImpl);
        }
      };
      this.notificationManagerSubcomponentFactoryProvider = new Provider<ActivityModule_ContributeNotificationManager.NotificationManagerSubcomponent.Factory>() {
        @Override
        public ActivityModule_ContributeNotificationManager.NotificationManagerSubcomponent.Factory get(
            ) {
          return new NotificationManagerSubcomponentFactory(appComponentImpl);
        }
      };
      this.paymentDetailsSubcomponentFactoryProvider = new Provider<ActivityModule_ContributePaymentDetails.PaymentDetailsSubcomponent.Factory>() {
        @Override
        public ActivityModule_ContributePaymentDetails.PaymentDetailsSubcomponent.Factory get() {
          return new PaymentDetailsSubcomponentFactory(appComponentImpl);
        }
      };
      this.registrationSucessSubcomponentFactoryProvider = new Provider<ActivityModule_ContributeRegistrationSucess.RegistrationSucessSubcomponent.Factory>() {
        @Override
        public ActivityModule_ContributeRegistrationSucess.RegistrationSucessSubcomponent.Factory get(
            ) {
          return new RegistrationSucessSubcomponentFactory(appComponentImpl);
        }
      };
      this.editProfileActivitySubcomponentFactoryProvider = new Provider<ActivityModule_ContributeEditProfileActivity.EditProfileActivitySubcomponent.Factory>() {
        @Override
        public ActivityModule_ContributeEditProfileActivity.EditProfileActivitySubcomponent.Factory get(
            ) {
          return new EditProfileActivitySubcomponentFactory(appComponentImpl);
        }
      };
      this.movieDetailsActivitySubcomponentFactoryProvider = new Provider<ActivityModule_ContributeMovieDetailActivity.MovieDetailsActivitySubcomponent.Factory>() {
        @Override
        public ActivityModule_ContributeMovieDetailActivity.MovieDetailsActivitySubcomponent.Factory get(
            ) {
          return new MovieDetailsActivitySubcomponentFactory(appComponentImpl);
        }
      };
      this.serieDetailsActivitySubcomponentFactoryProvider = new Provider<ActivityModule_ContributeSerieDetailActivity.SerieDetailsActivitySubcomponent.Factory>() {
        @Override
        public ActivityModule_ContributeSerieDetailActivity.SerieDetailsActivitySubcomponent.Factory get(
            ) {
          return new SerieDetailsActivitySubcomponentFactory(appComponentImpl);
        }
      };
      this.loginActivitySubcomponentFactoryProvider = new Provider<ActivityModule_ContributeLoginActivity.LoginActivitySubcomponent.Factory>() {
        @Override
        public ActivityModule_ContributeLoginActivity.LoginActivitySubcomponent.Factory get() {
          return new LoginActivitySubcomponentFactory(appComponentImpl);
        }
      };
      this.registerActivitySubcomponentFactoryProvider = new Provider<ActivityModule_ContributeRegisterActivity.RegisterActivitySubcomponent.Factory>() {
        @Override
        public ActivityModule_ContributeRegisterActivity.RegisterActivitySubcomponent.Factory get(
            ) {
          return new RegisterActivitySubcomponentFactory(appComponentImpl);
        }
      };
      this.trailerPreviewActivitySubcomponentFactoryProvider = new Provider<ActivityModule_ContributeTrailerPreviewActivity.TrailerPreviewActivitySubcomponent.Factory>() {
        @Override
        public ActivityModule_ContributeTrailerPreviewActivity.TrailerPreviewActivitySubcomponent.Factory get(
            ) {
          return new TrailerPreviewActivitySubcomponentFactory(appComponentImpl);
        }
      };
      this.upcomingTitlesActivitySubcomponentFactoryProvider = new Provider<ActivityModule_ContributeUpcomingTitlesActivity.UpcomingTitlesActivitySubcomponent.Factory>() {
        @Override
        public ActivityModule_ContributeUpcomingTitlesActivity.UpcomingTitlesActivitySubcomponent.Factory get(
            ) {
          return new UpcomingTitlesActivitySubcomponentFactory(appComponentImpl);
        }
      };
      this.animeDetailsActivitySubcomponentFactoryProvider = new Provider<ActivityModule_ContributeAnimeDetailsActivity.AnimeDetailsActivitySubcomponent.Factory>() {
        @Override
        public ActivityModule_ContributeAnimeDetailsActivity.AnimeDetailsActivitySubcomponent.Factory get(
            ) {
          return new AnimeDetailsActivitySubcomponentFactory(appComponentImpl);
        }
      };
      this.splashActivitySubcomponentFactoryProvider = new Provider<ActivityModule_ContributeSplashActivity.SplashActivitySubcomponent.Factory>() {
        @Override
        public ActivityModule_ContributeSplashActivity.SplashActivitySubcomponent.Factory get() {
          return new SplashActivitySubcomponentFactory(appComponentImpl);
        }
      };
      this.embedActivitySubcomponentFactoryProvider = new Provider<ActivityModule_ContributeEmbedActivity.EmbedActivitySubcomponent.Factory>() {
        @Override
        public ActivityModule_ContributeEmbedActivity.EmbedActivitySubcomponent.Factory get() {
          return new EmbedActivitySubcomponentFactory(appComponentImpl);
        }
      };
      this.easyPlexMainPlayerSubcomponentFactoryProvider = new Provider<ActivityModule_ContributeEasyPlexMainPlayer.EasyPlexMainPlayerSubcomponent.Factory>() {
        @Override
        public ActivityModule_ContributeEasyPlexMainPlayer.EasyPlexMainPlayerSubcomponent.Factory get(
            ) {
          return new EasyPlexMainPlayerSubcomponentFactory(appComponentImpl);
        }
      };
      this.passwordForgetSubcomponentFactoryProvider = new Provider<ActivityModule_ContributePasswordForget.PasswordForgetSubcomponent.Factory>() {
        @Override
        public ActivityModule_ContributePasswordForget.PasswordForgetSubcomponent.Factory get() {
          return new PasswordForgetSubcomponentFactory(appComponentImpl);
        }
      };
      this.castDetailsActivitySubcomponentFactoryProvider = new Provider<ActivityModule_ContributeCastDetailsActivity.CastDetailsActivitySubcomponent.Factory>() {
        @Override
        public ActivityModule_ContributeCastDetailsActivity.CastDetailsActivitySubcomponent.Factory get(
            ) {
          return new CastDetailsActivitySubcomponentFactory(appComponentImpl);
        }
      };
      this.streamingetailsActivitySubcomponentFactoryProvider = new Provider<ActivityModule_ContributeStreamingetailsActivity.StreamingetailsActivitySubcomponent.Factory>() {
        @Override
        public ActivityModule_ContributeStreamingetailsActivity.StreamingetailsActivitySubcomponent.Factory get(
            ) {
          return new StreamingetailsActivitySubcomponentFactory(appComponentImpl);
        }
      };
      this.episodeDetailsActivitySubcomponentFactoryProvider = new Provider<ActivityModule_ContributeEpisodeDetailsActivity.EpisodeDetailsActivitySubcomponent.Factory>() {
        @Override
        public ActivityModule_ContributeEpisodeDetailsActivity.EpisodeDetailsActivitySubcomponent.Factory get(
            ) {
          return new EpisodeDetailsActivitySubcomponentFactory(appComponentImpl);
        }
      };
      this.episodesFragmentSubcomponentFactoryProvider = new Provider<FragmentBuildersModule_ContributeEpisodesFragment.EpisodesFragmentSubcomponent.Factory>() {
        @Override
        public FragmentBuildersModule_ContributeEpisodesFragment.EpisodesFragmentSubcomponent.Factory get(
            ) {
          return new EpisodesFragmentSubcomponentFactory(appComponentImpl);
        }
      };
      this.finishedDownloadsFragmentSubcomponentFactoryProvider = new Provider<FragmentBuildersModule_ContributeFinishedDownloadsFragment.FinishedDownloadsFragmentSubcomponent.Factory>() {
        @Override
        public FragmentBuildersModule_ContributeFinishedDownloadsFragment.FinishedDownloadsFragmentSubcomponent.Factory get(
            ) {
          return new FinishedDownloadsFragmentSubcomponentFactory(appComponentImpl);
        }
      };
      this.queuedDownloadsFragmentSubcomponentFactoryProvider = new Provider<FragmentBuildersModule_ContributeQueuedDownloadsFragment.QueuedDownloadsFragmentSubcomponent.Factory>() {
        @Override
        public FragmentBuildersModule_ContributeQueuedDownloadsFragment.QueuedDownloadsFragmentSubcomponent.Factory get(
            ) {
          return new QueuedDownloadsFragmentSubcomponentFactory(appComponentImpl);
        }
      };
      this.downloadsFragmentSubcomponentFactoryProvider = new Provider<FragmentBuildersModule_ContributeDownloadsFragment.DownloadsFragmentSubcomponent.Factory>() {
        @Override
        public FragmentBuildersModule_ContributeDownloadsFragment.DownloadsFragmentSubcomponent.Factory get(
            ) {
          return new DownloadsFragmentSubcomponentFactory(appComponentImpl);
        }
      };
      this.homeFragmentSubcomponentFactoryProvider = new Provider<FragmentBuildersModule_ContributeHomeFragment.HomeFragmentSubcomponent.Factory>() {
        @Override
        public FragmentBuildersModule_ContributeHomeFragment.HomeFragmentSubcomponent.Factory get(
            ) {
          return new HomeFragmentSubcomponentFactory(appComponentImpl);
        }
      };
      this.upComingFragmentSubcomponentFactoryProvider = new Provider<FragmentBuildersModule_ContributeUpcomingFragment.UpComingFragmentSubcomponent.Factory>() {
        @Override
        public FragmentBuildersModule_ContributeUpcomingFragment.UpComingFragmentSubcomponent.Factory get(
            ) {
          return new UpComingFragmentSubcomponentFactory(appComponentImpl);
        }
      };
      this.discoverFragmentSubcomponentFactoryProvider = new Provider<FragmentBuildersModule_ContributeDiscoverFragment.DiscoverFragmentSubcomponent.Factory>() {
        @Override
        public FragmentBuildersModule_ContributeDiscoverFragment.DiscoverFragmentSubcomponent.Factory get(
            ) {
          return new DiscoverFragmentSubcomponentFactory(appComponentImpl);
        }
      };
      this.moviesFragmentSubcomponentFactoryProvider = new Provider<FragmentBuildersModule_ContributeMoviesFragment.MoviesFragmentSubcomponent.Factory>() {
        @Override
        public FragmentBuildersModule_ContributeMoviesFragment.MoviesFragmentSubcomponent.Factory get(
            ) {
          return new MoviesFragmentSubcomponentFactory(appComponentImpl);
        }
      };
      this.libraryStyleFragmentSubcomponentFactoryProvider = new Provider<FragmentBuildersModule_ContributeLibraryStyleFragment.LibraryStyleFragmentSubcomponent.Factory>() {
        @Override
        public FragmentBuildersModule_ContributeLibraryStyleFragment.LibraryStyleFragmentSubcomponent.Factory get(
            ) {
          return new LibraryStyleFragmentSubcomponentFactory(appComponentImpl);
        }
      };
      this.seriesFragmentSubcomponentFactoryProvider = new Provider<FragmentBuildersModule_ContributeSeriesFragment.SeriesFragmentSubcomponent.Factory>() {
        @Override
        public FragmentBuildersModule_ContributeSeriesFragment.SeriesFragmentSubcomponent.Factory get(
            ) {
          return new SeriesFragmentSubcomponentFactory(appComponentImpl);
        }
      };
      this.libraryFragmentSubcomponentFactoryProvider = new Provider<FragmentBuildersModule_ContributeLibraryFragment.LibraryFragmentSubcomponent.Factory>() {
        @Override
        public FragmentBuildersModule_ContributeLibraryFragment.LibraryFragmentSubcomponent.Factory get(
            ) {
          return new LibraryFragmentSubcomponentFactory(appComponentImpl);
        }
      };
      this.moviesListFragmentSubcomponentFactoryProvider = new Provider<FragmentBuildersModule_ContributeMyListMoviesFragment.MoviesListFragmentSubcomponent.Factory>() {
        @Override
        public FragmentBuildersModule_ContributeMyListMoviesFragment.MoviesListFragmentSubcomponent.Factory get(
            ) {
          return new MoviesListFragmentSubcomponentFactory(appComponentImpl);
        }
      };
      this.animesFragmentSubcomponentFactoryProvider = new Provider<FragmentBuildersModule_ContributeAnimesFragment.AnimesFragmentSubcomponent.Factory>() {
        @Override
        public FragmentBuildersModule_ContributeAnimesFragment.AnimesFragmentSubcomponent.Factory get(
            ) {
          return new AnimesFragmentSubcomponentFactory(appComponentImpl);
        }
      };
      this.streamingFragmentSubcomponentFactoryProvider = new Provider<FragmentBuildersModule_ContributeLiveFragment.StreamingFragmentSubcomponent.Factory>() {
        @Override
        public FragmentBuildersModule_ContributeLiveFragment.StreamingFragmentSubcomponent.Factory get(
            ) {
          return new StreamingFragmentSubcomponentFactory(appComponentImpl);
        }
      };
      this.settingsActivitySubcomponentFactoryProvider = new Provider<FragmentBuildersModule_ContributeSettingsFragment.SettingsActivitySubcomponent.Factory>() {
        @Override
        public FragmentBuildersModule_ContributeSettingsFragment.SettingsActivitySubcomponent.Factory get(
            ) {
          return new SettingsActivitySubcomponentFactory(appComponentImpl);
        }
      };
      this.listFragmentSubcomponentFactoryProvider = new Provider<FragmentBuildersModule_ContributeListFragment.ListFragmentSubcomponent.Factory>() {
        @Override
        public FragmentBuildersModule_ContributeListFragment.ListFragmentSubcomponent.Factory get(
            ) {
          return new ListFragmentSubcomponentFactory(appComponentImpl);
        }
      };
      this.seriesListFragmentSubcomponentFactoryProvider = new Provider<FragmentBuildersModule_ContributeSeriesListFragment.SeriesListFragmentSubcomponent.Factory>() {
        @Override
        public FragmentBuildersModule_ContributeSeriesListFragment.SeriesListFragmentSubcomponent.Factory get(
            ) {
          return new SeriesListFragmentSubcomponentFactory(appComponentImpl);
        }
      };
      this.animesListFragmentSubcomponentFactoryProvider = new Provider<FragmentBuildersModule_ContributeAnimesListFragment.AnimesListFragmentSubcomponent.Factory>() {
        @Override
        public FragmentBuildersModule_ContributeAnimesListFragment.AnimesListFragmentSubcomponent.Factory get(
            ) {
          return new AnimesListFragmentSubcomponentFactory(appComponentImpl);
        }
      };
      this.networksFragmentSubcomponentFactoryProvider = new Provider<FragmentBuildersModule_ContributeNetworksFragment.NetworksFragmentSubcomponent.Factory>() {
        @Override
        public FragmentBuildersModule_ContributeNetworksFragment.NetworksFragmentSubcomponent.Factory get(
            ) {
          return new NetworksFragmentSubcomponentFactory(appComponentImpl);
        }
      };
      this.networksFragment2SubcomponentFactoryProvider = new Provider<FragmentBuildersModule_ContributeNetworksFragment2.NetworksFragment2Subcomponent.Factory>() {
        @Override
        public FragmentBuildersModule_ContributeNetworksFragment2.NetworksFragment2Subcomponent.Factory get(
            ) {
          return new NetworksFragment2SubcomponentFactory(appComponentImpl);
        }
      };
      this.streamingListFragmentSubcomponentFactoryProvider = new Provider<FragmentBuildersModule_ContributeStreamingListFragment.StreamingListFragmentSubcomponent.Factory>() {
        @Override
        public FragmentBuildersModule_ContributeStreamingListFragment.StreamingListFragmentSubcomponent.Factory get(
            ) {
          return new StreamingListFragmentSubcomponentFactory(appComponentImpl);
        }
      };
      this.provideSettingsManagerProvider = DoubleCheck.provider(AppModule_ProvideSettingsManagerFactory.create(appModuleParam, applicationProvider));
      this.provideMoviesServiceProvider = DoubleCheck.provider(AppModule_ProvideMoviesServiceFactory.create(appModuleParam));
      this.provideTokenManagerProvider = DoubleCheck.provider(AppModule_ProvideTokenManagerFactory.create(appModuleParam, applicationProvider));
      this.provideServiceAuthProvider = DoubleCheck.provider(AppModule_ProvideServiceAuthFactory.create(appModuleParam, provideTokenManagerProvider));
      this.provideAuthManagerProvider = DoubleCheck.provider(AppModule_ProvideAuthManagerFactory.create(appModuleParam, applicationProvider));
      this.authRepositoryProvider = AuthRepository_Factory.create(provideMoviesServiceProvider, provideTokenManagerProvider, provideMoviesServiceProvider, provideServiceAuthProvider, provideTokenManagerProvider);
      this.provideDbProvider = DoubleCheck.provider(AppModule_ProvideDbFactory.create(appModuleParam, applicationProvider));
      this.provideFavMoviesDaoProvider = DoubleCheck.provider(AppModule_ProvideFavMoviesDaoFactory.create(appModuleParam, provideDbProvider));
      this.provideProgressDaoProvider = DoubleCheck.provider(AppModule_ProvideProgressDaoFactory.create(appModuleParam, provideDbProvider));
      this.provideHistoryDaoProvider = DoubleCheck.provider(AppModule_ProvideHistoryDaoFactory.create(appModuleParam, provideDbProvider));
      this.provideStreamyDaoProvider = DoubleCheck.provider(AppModule_ProvideStreamyDaoFactory.create(appModuleParam, provideDbProvider));
      this.provideResumeDaoProvider = DoubleCheck.provider(AppModule_ProvideResumeDaoFactory.create(appModuleParam, provideDbProvider));
      this.provideSeriesDaoProvider = DoubleCheck.provider(AppModule_ProvideSeriesDaoFactory.create(appModuleParam, provideDbProvider));
      this.provideAnimesDaoProvider = DoubleCheck.provider(AppModule_ProvideAnimesDaoFactory.create(appModuleParam, provideDbProvider));
      this.provideUtilsCProvider = DoubleCheck.provider(AppModule_ProvideUtilsCFactory.create(appModuleParam));
      this.provideMoviesServiceImdbProvider = DoubleCheck.provider(AppModule_ProvideMoviesServiceImdbFactory.create(appModuleParam));
      this.provideMoviesServiceOpenSubsProvider = DoubleCheck.provider(AppModule_ProvideMoviesServiceOpenSubsFactory.create(appModuleParam));
      this.provideCallbackProvider = DoubleCheck.provider(AppModule_ProvideCallbackFactory.create(appModuleParam));
      this.provideCuePointProvider = DoubleCheck.provider(AppModule_ProvideCuePointFactory.create(appModuleParam, applicationProvider));
      this.provideCuePointUrlProvider = DoubleCheck.provider(AppModule_ProvideCuePointUrlFactory.create(appModuleParam, applicationProvider));
      this.provideCuePointCallBackAdProvider = DoubleCheck.provider(AppModule_ProvideCuePointCallBackAdFactory.create(appModuleParam));
      this.provideAdPlayingProvider = DoubleCheck.provider(AppModule_ProvideAdPlayingFactory.create(appModuleParam));
      this.playerLoadingProvider = DoubleCheck.provider(AppModule_PlayerLoadingFactory.create(appModuleParam));
      this.mediaRepositoryProvider = DoubleCheck.provider(MediaRepository_Factory.create(provideFavMoviesDaoProvider, provideProgressDaoProvider, provideMoviesServiceProvider, provideMoviesServiceProvider, provideHistoryDaoProvider, provideStreamyDaoProvider, provideResumeDaoProvider, provideSeriesDaoProvider, provideAnimesDaoProvider, provideUtilsCProvider, provideMoviesServiceImdbProvider, provideMoviesServiceOpenSubsProvider, provideSettingsManagerProvider, provideCallbackProvider, provideUtilsCProvider, provideCuePointProvider, provideCuePointUrlProvider, provideCuePointCallBackAdProvider, provideAdPlayingProvider, playerLoadingProvider, provideServiceAuthProvider));
      this.userViewModelProvider = UserViewModel_Factory.create(authRepositoryProvider, mediaRepositoryProvider, provideSettingsManagerProvider);
      this.homeViewModelProvider = HomeViewModel_Factory.create(mediaRepositoryProvider, provideSettingsManagerProvider);
      this.provideServiceStatusProvider = DoubleCheck.provider(AppModule_ProvideServiceStatusFactory.create(appModuleParam));
      this.upcomingViewModelProvider = UpcomingViewModel_Factory.create(mediaRepositoryProvider, provideSettingsManagerProvider, provideServiceStatusProvider);
      this.movieDetailViewModelProvider = MovieDetailViewModel_Factory.create(mediaRepositoryProvider, provideSettingsManagerProvider, authRepositoryProvider);
      this.serieDetailViewModelProvider = SerieDetailViewModel_Factory.create(mediaRepositoryProvider, provideSettingsManagerProvider);
      this.searchViewModelProvider = SearchViewModel_Factory.create(mediaRepositoryProvider);
      this.loginViewModelProvider = LoginViewModel_Factory.create(authRepositoryProvider);
      this.registerViewModelProvider = RegisterViewModel_Factory.create(authRepositoryProvider);
      this.genresViewModelProvider = GenresViewModel_Factory.create(mediaRepositoryProvider, provideMoviesServiceProvider, provideSettingsManagerProvider);
      this.settingsRepositoryProvider = SettingsRepository_Factory.create(provideMoviesServiceProvider, provideMoviesServiceProvider, provideSettingsManagerProvider, provideServiceStatusProvider, provideMoviesServiceImdbProvider);
      this.settingsViewModelProvider = SettingsViewModel_Factory.create(settingsRepositoryProvider, mediaRepositoryProvider, provideSettingsManagerProvider);
      this.moviesListViewModelProvider = MoviesListViewModel_Factory.create(mediaRepositoryProvider, provideAuthManagerProvider, provideAuthManagerProvider);
      this.animeRepositoryProvider = DoubleCheck.provider(AnimeRepository_Factory.create(provideMoviesServiceProvider, provideFavMoviesDaoProvider, provideAnimesDaoProvider, provideMoviesServiceImdbProvider, provideSettingsManagerProvider, provideTokenManagerProvider));
      this.animeViewModelProvider = AnimeViewModel_Factory.create(animeRepositoryProvider, mediaRepositoryProvider, provideSettingsManagerProvider);
      this.streamingDetailViewModelProvider = StreamingDetailViewModel_Factory.create(mediaRepositoryProvider, provideSettingsManagerProvider);
      this.streamingGenresViewModelProvider = StreamingGenresViewModel_Factory.create(mediaRepositoryProvider);
      this.playerViewModelProvider = PlayerViewModel_Factory.create(mediaRepositoryProvider, animeRepositoryProvider);
      this.castersViewModelProvider = CastersViewModel_Factory.create(mediaRepositoryProvider, provideMoviesServiceProvider, provideSettingsManagerProvider);
      this.networksViewModelProvider = NetworksViewModel_Factory.create(mediaRepositoryProvider);
      this.mapOfClassOfAndProviderOfViewModelProvider = MapProviderFactory.<Class<? extends ViewModel>, ViewModel>builder(17).put(UserViewModel.class, ((Provider) userViewModelProvider)).put(HomeViewModel.class, ((Provider) homeViewModelProvider)).put(UpcomingViewModel.class, ((Provider) upcomingViewModelProvider)).put(MovieDetailViewModel.class, ((Provider) movieDetailViewModelProvider)).put(SerieDetailViewModel.class, ((Provider) serieDetailViewModelProvider)).put(SearchViewModel.class, ((Provider) searchViewModelProvider)).put(LoginViewModel.class, ((Provider) loginViewModelProvider)).put(RegisterViewModel.class, ((Provider) registerViewModelProvider)).put(GenresViewModel.class, ((Provider) genresViewModelProvider)).put(SettingsViewModel.class, ((Provider) settingsViewModelProvider)).put(MoviesListViewModel.class, ((Provider) moviesListViewModelProvider)).put(AnimeViewModel.class, ((Provider) animeViewModelProvider)).put(StreamingDetailViewModel.class, ((Provider) streamingDetailViewModelProvider)).put(StreamingGenresViewModel.class, ((Provider) streamingGenresViewModelProvider)).put(PlayerViewModel.class, ((Provider) playerViewModelProvider)).put(CastersViewModel.class, ((Provider) castersViewModelProvider)).put(NetworksViewModel.class, ((Provider) networksViewModelProvider)).build();
      this.moviesViewModelFactoryProvider = DoubleCheck.provider(MoviesViewModelFactory_Factory.create(mapOfClassOfAndProviderOfViewModelProvider));
      this.provideMenuHandlerProvider = DoubleCheck.provider(AppModule_ProvideMenuHandlerFactory.create(appModuleParam));
      this.profilesAdapterProvideProvider = DoubleCheck.provider(AppModule_ProfilesAdapterProvideFactory.create(appModuleParam));
      this.provideApplicationInfoProvider = DoubleCheck.provider(AppModule_ProvideApplicationInfoFactory.create(appModuleParam, applicationProvider));
      this.provideRootProvider = DoubleCheck.provider(AppModule_ProvideRootFactory.create(appModuleParam, applicationProvider));
      this.checkVpnProvider = DoubleCheck.provider(AppModule_CheckVpnFactory.create(appModuleParam));
      this.provideReadyProvider = DoubleCheck.provider(AppModule_ProvideReadyFactory.create(appModuleParam, applicationProvider));
    }

    @SuppressWarnings("unchecked")
    private void initialize2(final AppModule appModuleParam, final Application applicationParam) {
      this.provideAdsManagerProvider = DoubleCheck.provider(AppModule_ProvideAdsManagerFactory.create(appModuleParam, applicationProvider));
      this.provideStatusManagerProvider = DoubleCheck.provider(AppModule_ProvideStatusManagerFactory.create(appModuleParam, applicationProvider));
      this.providesSharedPreferencesEditorProvider = DoubleCheck.provider(AppModule_ProvidesSharedPreferencesEditorFactory.create(appModuleParam, applicationProvider));
      this.provideCuePointYProvider = DoubleCheck.provider(AppModule_ProvideCuePointYFactory.create(appModuleParam));
      this.provideCuePointNProvider = DoubleCheck.provider(AppModule_ProvideCuePointNFactory.create(appModuleParam));
      this.provideCuePointWProvider = DoubleCheck.provider(AppModule_ProvideCuePointWFactory.create(appModuleParam));
      this.provideCuePointZProvider = DoubleCheck.provider(AppModule_ProvideCuePointZFactory.create(appModuleParam));
      this.packNameProvider = DoubleCheck.provider(AppModule_PackNameFactory.create(appModuleParam, applicationProvider));
      this.provideFirebaseRemoteConfigProvider = DoubleCheck.provider(AppModule_ProvideFirebaseRemoteConfigFactory.create(appModuleParam));
      this.mainPlayerProvider = DoubleCheck.provider(AppModule_MainPlayerFactory.create(appModuleParam, applicationProvider));
      this.provideStateFactoryProvider = DoubleCheck.provider(AppModule_ProvideStateFactoryFactory.create(appModuleParam));
      this.provideFsmPlayerProvider = DoubleCheck.provider(AppModule_ProvideFsmPlayerFactory.create(appModuleParam, provideStateFactoryProvider));
      this.provideControllerProvider = DoubleCheck.provider(AppModule_ProvideControllerFactory.create(appModuleParam));
      this.provideAdPlayingMonitorProvider = DoubleCheck.provider(AppModule_ProvideAdPlayingMonitorFactory.create(appModuleParam, provideFsmPlayerProvider));
      this.provideCuePointMonitorProvider = DoubleCheck.provider(AppModule_ProvideCuePointMonitorFactory.create(appModuleParam, provideFsmPlayerProvider));
      this.provideAdRetrieverProvider = DoubleCheck.provider(AppModule_ProvideAdRetrieverFactory.create(appModuleParam));
      this.provideCuePointsRetrieverProvider = DoubleCheck.provider(AppModule_ProvideCuePointsRetrieverFactory.create(appModuleParam));
      this.provideAdInterfaceNoPrerollProvider = DoubleCheck.provider(AppModule_ProvideAdInterfaceNoPrerollFactory.create(appModuleParam));
      this.provideComponentControllerProvider = DoubleCheck.provider(AppModule_ProvideComponentControllerFactory.create(appModuleParam));
      this.provideVpaidClientProvider = DoubleCheck.provider(AppModule_ProvideVpaidClientFactory.create(appModuleParam));
      this.providePlaybackSettingMenuProvider = DoubleCheck.provider(AppModule_ProvidePlaybackSettingMenuFactory.create(appModuleParam));
      this.providePlayerControllerProvider = DoubleCheck.provider(AppModule_ProvidePlayerControllerFactory.create(appModuleParam));
      this.appControllerProvideProvider = DoubleCheck.provider(AppModule_AppControllerProvideFactory.create(appModuleParam));
      this.mainAdapterProvideProvider = DoubleCheck.provider(AppModule_MainAdapterProvideFactory.create(appModuleParam, provideSettingsManagerProvider, appControllerProvideProvider));
      this.shadowEnableProvider = DoubleCheck.provider(AppModule_ShadowEnableFactory.create(appModuleParam, applicationProvider));
      this.provideadplayingYProvider = DoubleCheck.provider(AppModule_ProvideadplayingYFactory.create(appModuleParam));
      this.provideadplayingNProvider = DoubleCheck.provider(AppModule_ProvideadplayingNFactory.create(appModuleParam));
      this.provideadplayingWProvider = DoubleCheck.provider(AppModule_ProvideadplayingWFactory.create(appModuleParam));
      this.provideadplayingZProvider = DoubleCheck.provider(AppModule_ProvideadplayingZFactory.create(appModuleParam));
    }

    @Override
    public void inject(EasyPlexApp app) {
      injectEasyPlexApp(app);
    }

    @CanIgnoreReturnValue
    private EasyPlexApp injectEasyPlexApp(EasyPlexApp instance) {
      EasyPlexApp_MembersInjector.injectSharedPreferences(instance, provideSharedPreferencesProvider.get());
      EasyPlexApp_MembersInjector.injectAndroidInjector(instance, dispatchingAndroidInjectorOfObject());
      EasyPlexApp_MembersInjector.injectSettingsManager(instance, provideSettingsManagerProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private AuthRepository injectAuthRepository(AuthRepository instance) {
      AuthRepository_MembersInjector.injectRequestAuth(instance, provideServiceAuthProvider.get());
      AuthRepository_MembersInjector.injectTokenManager(instance, provideTokenManagerProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private SettingsRepository injectSettingsRepository(SettingsRepository instance) {
      SettingsRepository_MembersInjector.injectApiInterface(instance, provideMoviesServiceProvider.get());
      SettingsRepository_MembersInjector.injectSettingsManager(instance, provideSettingsManagerProvider.get());
      SettingsRepository_MembersInjector.injectRequestStatusApi(instance, provideServiceStatusProvider.get());
      SettingsRepository_MembersInjector.injectRequestImdbApi(instance, provideMoviesServiceImdbProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private MoviesListViewModel injectMoviesListViewModel(MoviesListViewModel instance) {
      MoviesListViewModel_MembersInjector.injectAuthManager(instance, provideAuthManagerProvider.get());
      return instance;
    }
  }
}
