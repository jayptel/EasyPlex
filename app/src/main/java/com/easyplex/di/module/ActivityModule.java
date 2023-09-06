package com.easyplex.di.module;

import com.easyplex.ui.animes.AnimeDetailsActivity;
import com.easyplex.ui.base.BaseActivity;
import com.easyplex.ui.casts.CastDetailsActivity;
import com.easyplex.ui.downloadmanager.ui.main.DownloadManagerFragment;
import com.easyplex.ui.login.LoginActivity;
import com.easyplex.ui.login.PasswordForget;
import com.easyplex.ui.moviedetails.MovieDetailsActivity;
import com.easyplex.ui.notifications.NotificationManager;
import com.easyplex.ui.payment.Payment;
import com.easyplex.ui.payment.PaymentDetails;
import com.easyplex.ui.payment.PaymentPaypal;
import com.easyplex.ui.payment.PaymentStripe;
import com.easyplex.ui.player.activities.EasyPlexMainPlayer;
import com.easyplex.ui.player.activities.EmbedActivity;
import com.easyplex.ui.profile.EditProfileActivity;
import com.easyplex.ui.register.RegisterActivity;
import com.easyplex.ui.register.RegistrationSucess;
import com.easyplex.ui.seriedetails.EpisodeDetailsActivity;
import com.easyplex.ui.seriedetails.SerieDetailsActivity;
import com.easyplex.ui.splash.SplashActivity;
import com.easyplex.ui.streaming.StreamingetailsActivity;
import com.easyplex.ui.trailer.TrailerPreviewActivity;
import com.easyplex.ui.upcoming.UpcomingTitlesActivity;
import com.easyplex.ui.users.PhoneAuthActivity;
import com.easyplex.ui.users.UserProfiles;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Binds all sub-components within the app. Add bindings for other sub-components here.
 * @ContributesAndroidInjector was introduced removing the need to:
 * a) Create separate components annotated with @Subcomponent (the need to define @Subcomponent classes.)
 * b) Write custom annotations like @PerActivity.
 *
 * @author Yobex.
 */
@Module
public abstract class ActivityModule {




    @ContributesAndroidInjector()
    abstract PhoneAuthActivity contributePhoneAuthActivity();

    @ContributesAndroidInjector()
    abstract UserProfiles contributeUserProfiles();

    @ContributesAndroidInjector(modules = FragmentBuildersModule.class)
    abstract BaseActivity contributeMainActivity();

    @ContributesAndroidInjector(modules = FragmentBuildersModule.class)
    abstract DownloadManagerFragment contributeMainActivityDown();

    @ContributesAndroidInjector()
    abstract Payment contributePayment();

    @ContributesAndroidInjector()
    abstract PaymentPaypal contributePaymentPaypal();

    @ContributesAndroidInjector()
    abstract PaymentStripe contributePaymentStripe();

    @ContributesAndroidInjector()
    abstract NotificationManager contributeNotificationManager();

    @ContributesAndroidInjector()
    abstract PaymentDetails contributePaymentDetails();

    @ContributesAndroidInjector()
    abstract RegistrationSucess contributeRegistrationSucess();

    @ContributesAndroidInjector()
    abstract EditProfileActivity contributeEditProfileActivity();

    @ContributesAndroidInjector()
    abstract MovieDetailsActivity contributeMovieDetailActivity();

    @ContributesAndroidInjector()
    abstract SerieDetailsActivity contributeSerieDetailActivity();

    @ContributesAndroidInjector()
    abstract LoginActivity contributeLoginActivity();

    @ContributesAndroidInjector()
    abstract RegisterActivity contributeRegisterActivity();

    @ContributesAndroidInjector()
    abstract TrailerPreviewActivity contributeTrailerPreviewActivity();

    @ContributesAndroidInjector()
    abstract UpcomingTitlesActivity contributeUpcomingTitlesActivity();

    @ContributesAndroidInjector()
    abstract AnimeDetailsActivity contributeAnimeDetailsActivity();

    @ContributesAndroidInjector()
    abstract SplashActivity contributeSplashActivity();

    @ContributesAndroidInjector()
    abstract EmbedActivity contributeEmbedActivity();

    @ContributesAndroidInjector()
    abstract EasyPlexMainPlayer contributeEasyPlexMainPlayer();

    @ContributesAndroidInjector()
    abstract PasswordForget contributePasswordForget();

    @ContributesAndroidInjector()
    abstract CastDetailsActivity contributeCastDetailsActivity();

    @ContributesAndroidInjector()
    abstract StreamingetailsActivity contributeStreamingetailsActivity();

    @ContributesAndroidInjector()
    abstract EpisodeDetailsActivity contributeEpisodeDetailsActivity();
}
