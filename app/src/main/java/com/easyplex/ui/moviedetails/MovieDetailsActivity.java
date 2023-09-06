package com.easyplex.ui.moviedetails;

import static android.view.View.GONE;
import static android.view.ViewGroup.LayoutParams.MATCH_PARENT;
import static com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions.withCrossFade;
import static com.easyplex.util.Constants.ARG_MOVIE;
import static com.easyplex.util.Constants.DEFAULT_WEBVIEW_ADS_RUNNING;
import static com.easyplex.util.Constants.PLAYER_HEADER;
import static com.easyplex.util.Constants.PLAYER_USER_AGENT;
import static com.easyplex.util.Constants.SERVER_BASE_URL;
import static com.easyplex.util.Constants.WEBVIEW;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.appnext.base.Appnext;
import com.appodeal.ads.Appodeal;
import com.appodeal.ads.RewardedVideoCallbacks;
import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.easyplex.easyplexsupportedhosts.EasyPlexSupportedHosts;
import com.easyplex.easyplexsupportedhosts.Model.EasyPlexSupportedHostsModel;
import com.easyplex.R;
import com.easyplex.data.local.entity.Download;
import com.easyplex.data.local.entity.History;
import com.easyplex.data.local.entity.Media;
import com.easyplex.data.model.MovieResponse;
import com.easyplex.data.model.auth.Rating;
import com.easyplex.data.model.comments.Comment;
import com.easyplex.data.model.genres.Genre;
import com.easyplex.data.model.media.StatusFav;
import com.easyplex.data.model.stream.MediaStream;
import com.easyplex.data.repository.AuthRepository;
import com.easyplex.data.repository.MediaRepository;
import com.easyplex.data.repository.SettingsRepository;
import com.easyplex.databinding.ItemMovieDetailBinding;
import com.easyplex.ui.base.BaseActivity;
import com.easyplex.ui.comments.CommentsAdapter;
import com.easyplex.ui.login.LoginActivity;
import com.easyplex.ui.manager.AuthManager;
import com.easyplex.ui.manager.SettingsManager;
import com.easyplex.ui.manager.TokenManager;
import com.easyplex.ui.moviedetails.adapters.CastAdapter;
import com.easyplex.ui.moviedetails.adapters.DownloadsListAdapter;
import com.easyplex.ui.moviedetails.adapters.RelatedsAdapter;
import com.easyplex.ui.player.activities.EmbedActivity;
import com.easyplex.ui.player.cast.GoogleServicesHelper;
import com.easyplex.ui.player.cast.queue.ui.QueueListViewActivity;
import com.easyplex.ui.player.cast.settings.CastPreference;
import com.easyplex.ui.player.fsm.state_machine.FsmPlayerApi;
import com.easyplex.ui.settings.SettingsActivity;
import com.easyplex.ui.viewmodels.LoginViewModel;
import com.easyplex.ui.viewmodels.MovieDetailViewModel;
import com.easyplex.util.Constants;
import com.easyplex.util.DialogHelper;
import com.easyplex.util.GlideApp;
import com.easyplex.util.NetworkUtils;
import com.easyplex.util.SpacingItemDecoration;
import com.easyplex.util.Tools;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.cast.framework.CastButtonFactory;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.CastState;
import com.google.android.gms.cast.framework.CastStateListener;
import com.google.android.gms.cast.framework.IntroductoryOverlay;
import com.google.android.gms.cast.framework.SessionManagerListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.vungle.warren.AdConfig;
import com.vungle.warren.LoadAdCallback;
import com.vungle.warren.PlayAdCallback;
import com.vungle.warren.Vungle;
import com.vungle.warren.error.VungleException;
import com.xw.repo.BubbleSeekBar;

import org.jetbrains.annotations.NotNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.android.AndroidInjection;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import timber.log.Timber;

/**
 * EasyPlex - Movies - Live Streaming - TV Series, Anime
 *
 * @author @Y0bEX
 * @package  EasyPlex - Movies - Live Streaming - TV Series, Anime
 * @copyright Copyright (c) 2022 Y0bEX,
 * @license http://codecanyon.net/wiki/support/legal-terms/licensing-terms/
 * @profile https://codecanyon.net/user/yobex
 * @link yobexd@gmail.com
 * @skype yobexd@gmail.com
 **/



public class MovieDetailsActivity extends AppCompatActivity {


    com.appnext.core.webview.AppnextWebView appnextWebView;
    com.appnext.ads.interstitial.Interstitial interstitialAppNext;
    com.ironsource.environment.ContextProvider contextProvider;
    Uri appLinkData;
    private boolean shareLinkLaunched = false;
    private MaxInterstitialAd maxInterstitialAd;
    private boolean internal = false;
    private boolean isMovieFav = false;
    private LoginViewModel loginViewModel;
    private CountDownTimer mCountDownTimer;
    private boolean webViewLauched = false;
    ItemMovieDetailBinding binding;

    @Inject ViewModelProvider.Factory viewModelFactory;
    private MovieDetailViewModel movieDetailViewModel;

    @Inject
    SharedPreferences sharedPreferences;

    @Inject
    SharedPreferences.Editor sharedPreferencesEditor;

    @Inject
    SettingsManager settingsManager;

    @Inject
    SettingsRepository settingsRepository;

    @Inject
    AuthRepository authRepository;

    @Inject
    MediaRepository mediaRepository;


    @Inject
    @Named("ready")
    boolean settingReady;


    @Inject
    @Named("cuepoint")
    String cuePoint;


    @Inject
    @Named("cuepointUrl")
    String cuepointUrl;

    @Inject
    AuthManager authManager;


    @Inject
    @Named("cuepointY")
    String cuePointY;

    @Inject
    @Named("cuepointN")
    String cuePointN;


    @Inject
    @Named("cuepointW")
    String cuePointW;


    @Inject
    @Named("cuepointZ")
    String cuePointZ;

    @Inject
    @Named("vpn")
    boolean checkVpn;

    @Inject
    @Named("sniffer")
    @Nullable
    ApplicationInfo provideSnifferCheck;


    @Inject
    @Named("root")
    @Nullable
    ApplicationInfo provideRootCheck;

    @Inject
    TokenManager tokenManager;

    private CastAdapter mCastAdapter;
    private RelatedsAdapter mRelatedsAdapter;
    private CommentsAdapter commentsAdapter;
    private boolean mMovie;
    boolean isLoading;
    private RewardedAd rewardedAd;
    private Media media;
    private String mediaGenre;
    private Download download;
    private History history;
    private CastContext mCastContext;
    private final SessionManagerListener<CastSession> mSessionManagerListener = new MySessionManagerListener();
    private CastSession mCastSession;
    private MenuItem mediaRouteMenuItem;
    private MenuItem mQueueMenuItem;
    private IntroductoryOverlay mIntroductoryOverlay;
    private CastStateListener mCastStateListener;
    private MaxRewardedAd maxRewardedAd;
    private RewardedVideo mAppNextAdsVideoRewarded;

    private class MySessionManagerListener implements SessionManagerListener<CastSession> {

        @Override
        public void onSessionEnded(@NotNull CastSession session, int error) {

            if (session == mCastSession) {
                mCastSession = null;
            }
            invalidateOptionsMenu();
        }

        @Override
        public void onSessionResumed(@NotNull CastSession session, boolean wasSuspended) {
            mCastSession = session;
            invalidateOptionsMenu();
        }

        @Override
        public void onSessionStarted(@NotNull CastSession session, @NotNull String sessionId) {
            mCastSession = session;
            invalidateOptionsMenu();
        }

        @Override
        public void onSessionStarting(@NotNull CastSession session) {

            //
        }

        @Override
        public void onSessionStartFailed(@NotNull CastSession session, int error) {

            Tools.ToastHelper(getApplicationContext(),getString(R.string.unable_cast));
        }

        @Override
        public void onSessionEnding(@NotNull CastSession session) {

            //
        }

        @Override
        public void onSessionResuming(@NotNull CastSession session, @NotNull String sessionId) {

            //
        }

        @Override
        public void onSessionResumeFailed(@NotNull CastSession session, int error) {

            //
        }

        @Override
        public void onSessionSuspended(@NotNull CastSession session, int reason) {

            //
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);

        Tools.setSystemBarTransparent(this);
        Tools.hideSystemPlayerUi(this,true,0);

        binding = DataBindingUtil.setContentView(this, R.layout.item_movie_detail);


        mRelatedsAdapter = new RelatedsAdapter();


        if (settingsManager.getSettings().getVpn() == 1 && checkVpn) {

            binding.backbutton.performClick();

            Tools.ToastHelper(getApplicationContext(),getString(R.string.vpn_message));

        }

        onInitRewards();

        if (GoogleServicesHelper.available(this)) {

            mCastStateListener = newState -> {
                if (newState != CastState.NO_DEVICES_AVAILABLE) {
                    showIntroductoryOverlay();
                }
            };
            mCastContext = CastContext.getSharedInstance(this);


        }

        Intent intent = getIntent();

        media = intent.getParcelableExtra(ARG_MOVIE);

        // ViewModel to cache, retrieve data for MovieDetailsActivity
        movieDetailViewModel = new ViewModelProvider(this, viewModelFactory).get(MovieDetailViewModel.class);

        loginViewModel = new ViewModelProvider(this, viewModelFactory).get(LoginViewModel.class);


        mMovie = false;
        binding.progressBar.setVisibility(View.VISIBLE);
        binding.itemDetailContainer.setVisibility(GONE);
        binding.PlayButtonIcon.setVisibility(GONE);
        binding.serieName.setVisibility(GONE);


        Intent appLinkIntent = getIntent();
        appLinkData = appLinkIntent.getData();


        if (appLinkData !=null) {

            movieDetailViewModel.getMovieDetails(appLinkData.getLastPathSegment());
            movieDetailViewModel.getRelatedsMovies(Integer.parseInt(appLinkData.getLastPathSegment()));
            movieDetailViewModel.getMovieComments(Integer.parseInt(appLinkData.getLastPathSegment()));

            shareLinkLaunched = true;

        }else if (media.getId() !=null) {

            movieDetailViewModel.getMovieDetails(media.getId());
            movieDetailViewModel.getRelatedsMovies(Integer.parseInt(media.getId()));
            movieDetailViewModel.getMovieComments(Integer.parseInt(media.getId()));

        }


        initMovieDetails();



        if (settingsManager.getSettings().getAdUnitIdRewarded() != null) {

            loadRewardedAd();

        }

        if (settingsManager.getSettings().getEnableComments() !=1){

            binding.floatingCommentIcon.setVisibility(GONE);
            binding.commentsize.setVisibility(GONE);
        }




    }


    private void onInitRewards() {

        // Initialize the AppNext Ads SDK.
        Appnext.init(this);


        Appodeal.initialize(this, settingsManager.getSettings().getAdUnitIdAppodealRewarded(),
                Appodeal.INTERSTITIAL | Appodeal.BANNER | Appodeal.REWARDED_VIDEO, list -> {
        });

        IronSource.init(this, settingsManager.getSettings().getIronsourceAppKey(), IronSource.AD_UNIT.REWARDED_VIDEO,IronSource.AD_UNIT.INTERSTITIAL,IronSource.AD_UNIT.BANNER);


        if (settingsManager.getSettings().getApplovinInterstitialUnitid() !=null && !settingsManager.getSettings().getApplovinInterstitialUnitid().isEmpty()) {

            maxInterstitialAd = new MaxInterstitialAd(settingsManager.getSettings().getApplovinInterstitialUnitid(), this );
            maxInterstitialAd.loadAd();
        }

        String defaultRewardedNetworkAds = settingsManager.getSettings().getDefaultRewardedNetworkAds();

        if (getString(R.string.applovin).equals(defaultRewardedNetworkAds)) {

            maxRewardedAd = MaxRewardedAd.getInstance( settingsManager.getSettings().getApplovinRewardUnitid(), this);
            maxRewardedAd.loadAd();

        }else  if (getString(R.string.appnext).equals(defaultRewardedNetworkAds)) {

            mAppNextAdsVideoRewarded = new RewardedVideo(this, settingsManager.getSettings().getAppnextPlacementid());
            mAppNextAdsVideoRewarded.loadAd();


        }else  if (getString(R.string.vungle).equals(defaultRewardedNetworkAds)) {

            Vungle.loadAd(settingsManager.getSettings().getVungleRewardPlacementName(), new LoadAdCallback() {
                @Override
                public void onAdLoad(String id) {
                    //
                }

                @Override
                public void onError(String id, VungleException e) {

                    //
                }
            });

        }else  if (getString(R.string.ironsource).equals(defaultRewardedNetworkAds)) {

            IronSource.loadRewardedVideo();

        }

    }



    private void onLoadUnityInterstetial() {


        UnityAds.load(settingsManager.getSettings().getUnityInterstitialPlacementId(), new IUnityAdsLoadListener() {
            @Override
            public void onUnityAdsAdLoaded(String placementId) {

                Tools.onLoadUnityInterstetial(MovieDetailsActivity.this,settingsManager.getSettings().getUnityadsInterstitial()
                        ,settingsManager.getSettings().getUnityShow(),settingsManager);

            }

            @Override
            public void onUnityAdsFailedToLoad(String placementId, UnityAds.UnityAdsLoadError error, String message) {


                //
            }
        });



    }


    private void initMovieDetails() {

        if (authManager.getUserInfo().getPremuim() != 1 ) {
            onLoadUnityInterstetial();
        }


        movieDetailViewModel.getMovieDetails(media.getId());
        movieDetailViewModel.movieDetailMutableLiveData.observe(this, movieDetail -> {

            download = new Download(movieDetail.getId(),movieDetail.getTmdbId(),movieDetail.getBackdropPath(),movieDetail.getTitle(),"");

            for (Genre genre : movieDetail.getGenres()) {
                mediaGenre = genre.getName();
            }

            onLoadImage(movieDetail.getPosterPath());onLoadTitle(movieDetail.getTitle());
            try {
                onLoadDate(movieDetail.getReleaseDate());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            onLoadSynopsis(movieDetail.getOverview());onLoadGenres(movieDetail.getGenres());
            if(!settingReady)finishAffinity();
            onLoadBackButton();
            onLoadRelatedsMovies();
            onLoadCast(movieDetail);
            onLoadRating(movieDetail.getVoteAverage());
            onLoadViews(movieDetail.getViews());
            onLoadPogressResume(movieDetail.getId());
            binding.review.setOnClickListener(v -> onSentReview(movieDetail));
            onLoadUsersReviews(movieDetail.getVoteAverage());
            binding.floatingCommentIcon.setOnClickListener(v -> {

                if (tokenManager.getToken().getAccessToken() != null) {

                    onLoadMovieComments(movieDetail.getId());
                }else {


                    final Snackbar snackbar = Snackbar.make(binding.constraintLayout, "", Snackbar.LENGTH_LONG);
                    //inflate view
                    @SuppressLint("InflateParams") View customView = getLayoutInflater().inflate(R.layout.snackbar_login, null);

                    snackbar.getView().setBackgroundColor(Color.TRANSPARENT);
                    Snackbar.SnackbarLayout snackBarView = (Snackbar.SnackbarLayout) snackbar.getView();
                    snackBarView.setPadding(0, 0, 0, 0);
                    (customView.findViewById(R.id.tv_undo)).setOnClickListener(v1 -> {
                        snackbar.dismiss();
                        startActivity(new Intent(MovieDetailsActivity.this, LoginActivity.class));
                        finish();
                    });

                    snackBarView.addView(customView, 0);
                    snackbar.show();
                }

            });


            if (settingsManager.getSettings().getEnableComments() ==1){

                mediaRepository.getComments(Integer.parseInt(movieDetail.getId()),settingsManager.getSettings().getApiKey())
                        .subscribeOn(Schedulers.newThread())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(new Observer<>() {
                            @Override
                            public void onSubscribe(@NotNull Disposable d) {

                                //

                            }

                            @SuppressLint("NotifyDataSetChanged")
                            @Override
                            public void onNext(@NotNull MovieResponse movieResponse) {

                                if (!movieResponse.getComments().isEmpty()){

                                    binding.commentsize.setText(getString(R.string.comment_size_views)+Tools.getViewFormat(movieResponse.getComments().size()));

                                }else {

                                    binding.commentsizeLinear.setVisibility(GONE);
                                }


                            }

                            @Override
                            public void onError(@NotNull Throwable e) {

                                //

                            }

                            @Override
                            public void onComplete() {

                                //

                            }
                        });

            }else {


                binding.commentsizeLinear.setVisibility(GONE);
            }


            if (authManager.getUserInfo().getPremuim() != 1 ) {

                Tools.onLoadNetworksInter(settingsManager,MovieDetailsActivity.this,maxInterstitialAd);
                Tools.onloadBanners(settingsManager,MovieDetailsActivity.this,binding, null,null, null);


            } else {

                binding.bannerContainer.setVisibility(GONE);
                binding.adViewContainer.setVisibility(GONE);
                binding.appodealBannerView.setVisibility(GONE);

            }

            
            if (movieDetail.getPremuim() == 1) {

                binding.moviePremuim.setVisibility(View.VISIBLE);


            }else {

                binding.moviePremuim.setVisibility(View.GONE);
            }


            binding.itemDetailContainer.getViewTreeObserver().addOnScrollChangedListener(() -> {
                int scrollY =  binding.itemDetailContainer.getScrollY();
                int color = Color.parseColor("#E6070707"); // ideally a global variable
                if (scrollY < 256) {
                    int alpha = (scrollY << 24) | (-1 >>> 8) ;
                    color &= (alpha);

                    binding.serieName.setText("");
                    binding.serieName.setVisibility(View.GONE);


                }else {

                    binding.serieName.setText(movieDetail.getTitle());
                    binding.serieName.setVisibility(View.VISIBLE);

                }
                binding.toolbar.setBackgroundColor(color);

            });



            onLoadToolbar();


            if (settingsManager.getSettings().getEnableDownload() == 0) {

                binding.downloadMovieImage.setImageResource(R.drawable.ic_notavailable);

            }

            binding.downloadMovie.setOnClickListener((View v) -> {

                if (settingsManager.getSettings().getEnableDownload() == 0) {

                DialogHelper.showNoDownloadAvailable(this,getString(R.string.download_disabled));

                }else {

                    onDownloadMovie(movieDetail);
                }

            });

            binding.report.setOnClickListener(v -> onLoadReport(movieDetail.getTitle(),movieDetail.getPosterPath()));

            binding.ButtonPlayTrailer.setOnClickListener(v -> {

                if (movieDetail.getPreviewPath() == null) {
                    Tools.ToastHelper(getApplicationContext(),getString(R.string.trailer_not_found));
                    return;
                }
                onLoadTrailer(movieDetail.getPreviewPath(), movieDetail.getTitle(), movieDetail.getBackdropPath(), movieDetail.getTrailerUrl());
            });

            binding.favoriteIcon.setOnClickListener(view -> {

                if (settingsManager.getSettings().getFavoriteonline() == 1 && tokenManager.getToken().getAccessToken() !=null) {

                    if (isMovieFav) {

                        authRepository.getDeleteMovieOnline(movieDetail.getId())
                                .subscribeOn(Schedulers.io())
                                .observeOn(AndroidSchedulers.mainThread())
                                .subscribe(new Observer<>() {
                                    @Override
                                    public void onSubscribe(@NotNull Disposable d) {

                                        //

                                    }

                                    @Override
                                    public void onNext(@NotNull StatusFav statusFav) {

                                        Tools.ToastHelper(getApplicationContext(),getString(R.string.remove_watch_list));

                                    }

                                    @Override
                                    public void onError(@NotNull Throwable e) {

                                        //
                                    }

                                    @Override
                                    public void onComplete() {

                                        //

                                    }
                                });


                        isMovieFav = false;

                        binding.favoriteImage.setImageResource(R.drawable.add_from_queue);


                    }else {

                        authRepository.getAddMovieOnline(movieDetail.getId())
                                .subscribeOn(Schedulers.io())
                                .observeOn(AndroidSchedulers.mainThread())
                                .subscribe(new Observer<>() {
                                    @Override
                                    public void onSubscribe(@NotNull Disposable d) {

                                        //

                                    }

                                    @Override
                                    public void onNext(@NotNull StatusFav statusFav) {

                                        Tools.ToastHelper(getApplicationContext(),"Added " + movieDetail.getTitle() + " To Watchlist");

                                    }

                                    @Override
                                    public void onError(@NotNull Throwable e) {

                                        //


                                    }

                                    @Override
                                    public void onComplete() {

                                        //

                                    }
                                });

                        isMovieFav = true;

                        binding.favoriteImage.setImageResource(R.drawable.ic_in_favorite);
                    }


                }else  {

                    onFavoriteClick(movieDetail);
                }


            });


            binding.shareIcon.setOnClickListener(v -> Tools.onShareMedia(this,movieDetail,settingsManager,"movie"));


            checkMediaFavorite(movieDetail);


            if (mediaRepository.hasHistory(Integer.parseInt(movieDetail.getId()))) {

                binding.resumePlay.setVisibility(View.VISIBLE);


                binding.resumePlay.setOnClickListener(v -> binding.PlayButtonIcon.performClick());


            } else {

                binding.resumePlay.setVisibility(GONE);


            }


            binding.PlayButtonIcon.setOnClickListener(v -> {

                if (settingsManager.getSettings().getVpn() ==1 && checkVpn) {

                    binding.backbutton.performClick();

                    Tools.ToastHelper(getApplicationContext(),getString(R.string.vpn_message));


                }else if (movieDetail.getVideos() !=null && !movieDetail.getVideos().isEmpty()) {


                    if (movieDetail.getPremuim() == 1 && authManager.getUserInfo().getPremuim() == 1 && tokenManager.getToken() != null) {

                        onLoadStream(movieDetail);

                    } else  if (settingsManager.getSettings().getEnableWebview() == 1) {


                        final Dialog dialog = new Dialog(this);
                        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                        dialog.setContentView(R.layout.episode_webview);
                        dialog.setCancelable(false);
                        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

                        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
                        lp.copyFrom(dialog.getWindow().getAttributes());

                        lp.gravity = Gravity.BOTTOM;
                        lp.width = MATCH_PARENT;
                        lp.height = MATCH_PARENT;


                        mCountDownTimer = new CountDownTimer(DEFAULT_WEBVIEW_ADS_RUNNING, 1000) {
                            @SuppressLint({"SetTextI18n", "SetJavaScriptEnabled"})
                            @Override
                            public void onTick(long millisUntilFinished) {

                                if (!webViewLauched) {

                                    WebView webView = dialog.findViewById(R.id.webViewVideoBeforeAds);
                                    webView.getSettings().setJavaScriptEnabled(true);
                                    webView.setWebViewClient(new WebViewClient());
                                    WebSettings webSettings = webView.getSettings();
                                    webSettings.setSupportMultipleWindows(false);
                                    webSettings.setJavaScriptCanOpenWindowsAutomatically(false);

                                    if (settingsManager.getSettings().getWebviewLink() !=null && !settingsManager.getSettings().getWebviewLink().isEmpty()) {

                                        webView.loadUrl(settingsManager.getSettings().getWebviewLink());

                                    }else {

                                        webView.loadUrl(SERVER_BASE_URL+"webview");
                                    }

                                    webViewLauched = true;
                                }

                            }

                            @Override
                            public void onFinish() {

                                dialog.dismiss();
                                onLoadStream(movieDetail);
                                webViewLauched = false;
                                if (mCountDownTimer != null) {
                                    mCountDownTimer.cancel();
                                    mCountDownTimer = null;
                                }
                            }

                        }.start();

                        dialog.show();
                        dialog.getWindow().setAttributes(lp);


                    } else   if (settingsManager.getSettings().getWachAdsToUnlock() == 1 && movieDetail.getPremuim() != 1 && authManager.getUserInfo().getPremuim() == 0) {

                        onLoadSubscribeDialog(movieDetail,true);

                    } else if (settingsManager.getSettings().getWachAdsToUnlock() == 0 && movieDetail.getPremuim() == 0) {


                        onLoadStream(movieDetail);


                    } else if (authManager.getUserInfo().getPremuim() == 1 && movieDetail.getPremuim() == 0) {


                        onLoadStream(movieDetail);

                    } else {

                        DialogHelper.showPremuimWarning(this);

                    }

                }else {

                    DialogHelper.showNoStreamAvailable(this);

                }


            });


            mMovie = true;
            checkAllDataLoaded();


        });

    }

    private void onLoadUsersReviews(float voteAverage) {
        binding.userReview.setText(String.valueOf(voteAverage));
    }

    private void onSentReview(Media movieDetail) {


        if (tokenManager.getToken().getAccessToken() == null) {

            Toast.makeText(this, getText(R.string.review_require_login), Toast.LENGTH_SHORT).show();
            return;
        }

        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_review);
        dialog.setCancelable(true);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
        lp.copyFrom(dialog.getWindow().getAttributes());

        lp.gravity = Gravity.BOTTOM;
        lp.width = MATCH_PARENT;
        lp.height = MATCH_PARENT;


        TextView reviewMovieName = dialog.findViewById(R.id.movietitle);


        TextView userRating = dialog.findViewById(R.id.userRating);


        BubbleSeekBar storySeekbar = dialog.findViewById(R.id.storySeekbar);

        BubbleSeekBar caractersSeekbar = dialog.findViewById(R.id.caractersSeekbar);

        BubbleSeekBar mottionsdesginSeekbar = dialog.findViewById(R.id.mottionsdesginSeekbar);

        BubbleSeekBar musicSeekbar = dialog.findViewById(R.id.musicSeekbar);

        mottionsdesginSeekbar.setVisibility(GONE);

        reviewMovieName.setText(movieDetail.getTitle());



        storySeekbar.setOnProgressChangedListener(new BubbleSeekBar.OnProgressChangedListener() {
            @Override
            public void onProgressChanged(BubbleSeekBar bubbleSeekBar, int progress, float progressFloat, boolean fromUser) {

                userRating.setText(Tools.getAvg(storySeekbar.getProgressFloat(),
                        caractersSeekbar.getProgressFloat()
                        ,mottionsdesginSeekbar.getProgressFloat()
                        ,musicSeekbar.getProgressFloat(),true)+getString(R.string.byteen));



            }

            @Override
            public void getProgressOnActionUp(BubbleSeekBar bubbleSeekBar, int progress, float progressFloat) {

                //

            }

            @Override
            public void getProgressOnFinally(BubbleSeekBar bubbleSeekBar, int progress, float progressFloat, boolean fromUser) {

                //
            }
        });


        caractersSeekbar.setOnProgressChangedListener(new BubbleSeekBar.OnProgressChangedListener() {
            @Override
            public void onProgressChanged(BubbleSeekBar bubbleSeekBar, int progress, float progressFloat, boolean fromUser) {

                userRating.setText(Tools.getAvg(storySeekbar.getProgressFloat(),
                        caractersSeekbar.getProgressFloat()
                        ,mottionsdesginSeekbar.getProgressFloat()
                        ,musicSeekbar.getProgressFloat(),true)+"/10");

            }

            @Override
            public void getProgressOnActionUp(BubbleSeekBar bubbleSeekBar, int progress, float progressFloat) {
                //
            }

            @Override
            public void getProgressOnFinally(BubbleSeekBar bubbleSeekBar, int progress, float progressFloat, boolean fromUser) {
                //
            }
        });


        mottionsdesginSeekbar.setOnProgressChangedListener(new BubbleSeekBar.OnProgressChangedListener() {
            @Override
            public void onProgressChanged(BubbleSeekBar bubbleSeekBar, int progress, float progressFloat, boolean fromUser) {

                userRating.setText(Tools.getAvg(storySeekbar.getProgressFloat(),
                        caractersSeekbar.getProgressFloat()
                        ,mottionsdesginSeekbar.getProgressFloat()
                        ,musicSeekbar.getProgressFloat(),true)+"/10");

            }

            @Override
            public void getProgressOnActionUp(BubbleSeekBar bubbleSeekBar, int progress, float progressFloat) {
                //
            }

            @Override
            public void getProgressOnFinally(BubbleSeekBar bubbleSeekBar, int progress, float progressFloat, boolean fromUser) {
                //
            }
        });


        musicSeekbar.setOnProgressChangedListener(new BubbleSeekBar.OnProgressChangedListener() {
            @Override
            public void onProgressChanged(BubbleSeekBar bubbleSeekBar, int progress, float progressFloat, boolean fromUser) {

                userRating.setText(Tools.getAvg(storySeekbar.getProgressFloat(),
                        caractersSeekbar.getProgressFloat()
                        ,mottionsdesginSeekbar.getProgressFloat()
                        ,musicSeekbar.getProgressFloat(),true)+"/10");

            }

            @Override
            public void getProgressOnActionUp(BubbleSeekBar bubbleSeekBar, int progress, float progressFloat) {
                //
            }

            @Override
            public void getProgressOnFinally(BubbleSeekBar bubbleSeekBar, int progress, float progressFloat, boolean fromUser) {
                //
            }
        });


        Button sendReport = dialog.findViewById(R.id.view_report);

        dialog.findViewById(R.id.bt_close).setOnClickListener(v -> dialog.dismiss());


        sendReport.setOnClickListener(v -> {


            if (movieDetail.getVoteAverage() !=0){

                double newUserRating = Math.round(media.getVoteAverage() + Tools.getAvg(storySeekbar.getProgressFloat(),
                        caractersSeekbar.getProgressFloat()
                        ,mottionsdesginSeekbar.getProgressFloat()
                        ,musicSeekbar.getProgressFloat(),true)) /2;


                if (tokenManager.getToken().getAccessToken() !=null) {

                    authRepository.addRating(media.getId(),newUserRating, "movie")
                            .subscribeOn(Schedulers.newThread())
                            .observeOn(AndroidSchedulers.mainThread())
                            .subscribe(new Observer<>() {
                                @Override
                                public void onSubscribe(@NotNull Disposable d) {

                                    //

                                }

                                @SuppressLint("NotifyDataSetChanged")
                                @Override
                                public void onNext(@NotNull Rating rating) {

                                    dialog.dismiss();

                                    Toast.makeText(MovieDetailsActivity.this, R.string.review_sent, Toast.LENGTH_SHORT).show();

                                    movieDetailViewModel.getMovieDetails(movieDetail.getId());
                                    initMovieDetails();
                                }

                                @Override
                                public void onError(@NotNull Throwable e) {

                                    Toast.makeText(MovieDetailsActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                                }

                                @Override
                                public void onComplete() {

                                    //

                                }
                            });

                }else {

                    Tools.ToastHelper(MovieDetailsActivity.this,getString(R.string.review_require_login));
                }

            }  else {

                double newUserRating = Math.round(Tools.getAvg(storySeekbar.getProgressFloat(),
                        caractersSeekbar.getProgressFloat()
                        ,mottionsdesginSeekbar.getProgressFloat()
                        ,musicSeekbar.getProgressFloat(),true)) /2;


                if (tokenManager.getToken().getAccessToken() !=null) {

                    authRepository.addRating(movieDetail.getId(),newUserRating, "movie")
                            .subscribeOn(Schedulers.newThread())
                            .observeOn(AndroidSchedulers.mainThread())
                            .subscribe(new Observer<>() {
                                @Override
                                public void onSubscribe(@NotNull Disposable d) {

                                    //

                                }

                                @SuppressLint("NotifyDataSetChanged")
                                @Override
                                public void onNext(@NotNull Rating rating) {

                                    dialog.dismiss();

                                    Toast.makeText(MovieDetailsActivity.this, R.string.rating_sent, Toast.LENGTH_SHORT).show();

                                    movieDetailViewModel.getMovieDetails(movieDetail.getId());
                                    initMovieDetails();
                                }

                                @Override
                                public void onError(@NotNull Throwable e) {

                                    Toast.makeText(MovieDetailsActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                                }

                                @Override
                                public void onComplete() {

                                    //

                                }
                            });

                }else {

                    Tools.ToastHelper(MovieDetailsActivity.this,getString(R.string.review_require_login));
                }
            }




        });

        dialog.show();
        dialog.getWindow().setAttributes(lp);

        dialog.findViewById(R.id.bt_close).setOnClickListener(y -> {

        dialog.dismiss();
        });

        dialog.show();
        dialog.getWindow().setAttributes(lp);

    }


    private void checkMediaFavorite(Media movieDetail) {

        if (settingsManager.getSettings().getFavoriteonline() == 1 && tokenManager.getToken().getAccessToken() !=null) {

            loginViewModel.isMovieFavoriteOnline(movieDetail.getId());
            loginViewModel.isMovieFavoriteOnlineMutableLiveData.observe(this, favAddOnline -> {

            if (favAddOnline.getStatus() == 1) {

             isMovieFav = true;

            binding.favoriteImage.setImageResource(R.drawable.ic_in_favorite);

             } else {

             isMovieFav = false;

             binding.favoriteImage.setImageResource(R.drawable.add_from_queue);

            }});

        }else {

           if (mediaRepository.isMovieFavorite(Integer.parseInt(movieDetail.getId()))) {


                binding.favoriteImage.setImageResource(R.drawable.ic_in_favorite);

            } else {

                binding.favoriteImage.setImageResource(R.drawable.add_from_queue);
            }
        }
    }

    @SuppressLint("SetTextI18n")
    private void onLoadViews(String views) {

        binding.viewMovieViews.setText(getString(R.string.views)+Tools.getViewFormat(Integer.parseInt(views)));

    }



    @Override
    protected void onResume() {

        Tools.onCheckFlagSecure(settingsManager.getSettings().getFlagSecure(),this);

        if (GoogleServicesHelper.available(this)) {
            mCastContext.addCastStateListener(mCastStateListener);
            mCastContext.getSessionManager().addSessionManagerListener(
                    mSessionManagerListener, CastSession.class);
            if (mCastSession == null) {
                mCastSession = Objects.requireNonNull(CastContext.getSharedInstance()).getSessionManager()
                        .getCurrentCastSession();
            }
        }

        if (mQueueMenuItem != null) {
            mQueueMenuItem.setVisible(
                    (mCastSession != null) && mCastSession.isConnected());
        }


        if (settingsManager.getSettings().getVpn() ==1 && checkVpn){

            binding.backbutton.performClick();

            Tools.ToastHelper(getApplicationContext(),getString(R.string.vpn_message));

        }

        if (provideSnifferCheck != null) {
            Tools.ToastHelper(getApplicationContext(),getString(R.string.sniffer_message));

            finishAffinity();
        }

        if (settingsManager.getSettings().getRootDetection() == 1 &&  provideRootCheck != null) {
            Tools.ToastHelper(getApplicationContext(),getString(R.string.root_warning));

            finishAffinity();
        }


        if (appLinkData !=null) {

            onLoadPogressResume(appLinkData.getLastPathSegment());

        }else {

            onLoadPogressResume(media.getId());
        }

        super.onResume();
        IronSource.onResume(this);
    }


    @Override
    protected void onPause() {

        if (GoogleServicesHelper.available(this)) {

            mCastContext.removeCastStateListener(mCastStateListener);
            mCastContext.getSessionManager().removeSessionManagerListener(
                    mSessionManagerListener, CastSession.class);
        }

        super.onPause();
        IronSource.onPause(this);
    }

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        super.onCreateOptionsMenu(menu);


        getMenuInflater().inflate(R.menu.menu, menu);
        mediaRouteMenuItem = CastButtonFactory.setUpMediaRouteButton(this, menu,
                R.id.media_route_menu_item);
        mQueueMenuItem = menu.findItem(R.id.action_show_queue);
        showIntroductoryOverlay();
        return true;
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.findItem(R.id.action_show_queue).setVisible(
                (mCastSession != null) && mCastSession.isConnected());
        menu.findItem(R.id.action_settings).setVisible(
                (mCastSession != null) && mCastSession.isConnected());
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;
        if (item.getItemId() == R.id.action_settings) {
            intent = new Intent(MovieDetailsActivity.this, CastPreference.class);
            startActivity(intent);
        } else if (item.getItemId() == R.id.action_show_queue) {
            intent = new Intent(MovieDetailsActivity.this, QueueListViewActivity.class);
            startActivity(intent);
        }
        return true;
    }

    @Override
    public boolean dispatchKeyEvent(@NonNull KeyEvent event) {

        if (mCastContext !=null) {
            return mCastContext.onDispatchVolumeKeyEventBeforeJellyBean(event)
                    || super.dispatchKeyEvent(event);
        }else {

            return false;
        }
    }



    private void loadRewardedAd() {

        if (rewardedAd == null) {
            isLoading = true;
            AdRequest adRequest = new AdRequest.Builder().build();
            RewardedAd.load(
                    this,
                    settingsManager.getSettings().getAdUnitIdRewarded(),
                    adRequest,
                    new RewardedAdLoadCallback() {
                        @Override
                        public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {

                            rewardedAd = null;

                            MovieDetailsActivity.this.isLoading = false;

                        }

                        @Override
                        public void onAdLoaded(@NonNull RewardedAd rewardedAd) {

                            MovieDetailsActivity.this.isLoading = false;
                            MovieDetailsActivity.this.rewardedAd = rewardedAd;
                        }
                    });
        }

    }


    @SuppressLint("SetTextI18n")
    private void onLoadPogressResume(String tmdbId) {

        binding.resumeProgressCheck.setVisibility(View.VISIBLE);

        if (settingsManager.getSettings().getResumeOffline() == 1) {

            mediaRepository.hasResume(Integer.parseInt(tmdbId)).observe(this, resumeInfo -> {

                if (resumeInfo !=null){

                    binding.resumeProgressCheck.setVisibility(GONE);

                    if (resumeInfo.getResumePosition() !=null &&

                            authManager.getUserInfo().getId() !=null && authManager.getUserInfo().getId() == resumeInfo.getUserResumeId() && resumeInfo.getDeviceId().equals(Tools.id(this))) {


                        double d = resumeInfo.getResumePosition();

                        double moveProgress = d * 100 / resumeInfo.getMovieDuration();

                        binding.epResumeTitle.setText(media.getTitle());

                        binding.timeRemaning.setText(Tools.getProgressTime((resumeInfo.getMovieDuration() - resumeInfo.getResumePosition()), true));

                        binding.resumeProgressBar.setProgress((int) moveProgress);

                    }else {

                        binding.resumeProgressBar.setProgress(0);
                        binding.resumeProgressBar.setVisibility(GONE);

                    }


                    if (resumeInfo.getResumePosition() !=null && authManager.getUserInfo().getId() == resumeInfo.getUserResumeId()) {


                        binding.resumeProgressBar.setVisibility(View.VISIBLE);
                        binding.timeRemaning.setVisibility(View.VISIBLE);
                        binding.resumeLinear.setVisibility(View.VISIBLE);

                    }else {

                        binding.resumeProgressBar.setVisibility(GONE);
                        binding.timeRemaning.setVisibility(GONE);
                        binding.resumeLinear.setVisibility(GONE);
                    }

                }else {


                    binding.resumeProgressBar.setVisibility(GONE);
                    binding.timeRemaning.setVisibility(GONE);
                    binding.resumeLinear.setVisibility(GONE);
                    binding.resumeProgressCheck.setVisibility(GONE);
                }

            });


        }else {


            binding.resumeProgressCheck.setVisibility(View.VISIBLE);
            movieDetailViewModel.getResumeMovie(tmdbId);
            movieDetailViewModel.resumeMutableLiveData.observe(this, resume -> {


                if (resume !=null  && resume.getResumePosition() !=null &&

                        authManager.getUserInfo().getId() !=null && authManager.getUserInfo().getId() == resume.getUserResumeId() && resume.getDeviceId().equals(Tools.id(this))) {

                    binding.resumeProgressCheck.setVisibility(GONE);
                    double d = resume.getResumePosition();
                    double moveProgress = d * 100 / resume.getMovieDuration();
                    binding.epResumeTitle.setText(media.getTitle());

                    binding.timeRemaning.setText(Tools.getProgressTime((resume.getMovieDuration() - resume.getResumePosition()), true));
                    binding.resumeProgressBar.setProgress((int) moveProgress);

                }else {

                    binding.resumeProgressBar.setProgress(0);
                    binding.resumeProgressBar.setVisibility(GONE);
                    binding.resumeProgressCheck.setVisibility(GONE);

                }


                assert resume != null;
                if (resume.getResumePosition() !=null && authManager.getUserInfo().getId() == resume.getUserResumeId()) {


                    binding.resumeProgressBar.setVisibility(View.VISIBLE);
                    binding.timeRemaning.setVisibility(View.VISIBLE);
                    binding.resumeLinear.setVisibility(View.VISIBLE);

                }else {

                    binding.resumeProgressBar.setVisibility(GONE);
                    binding.timeRemaning.setVisibility(GONE);
                    binding.resumeLinear.setVisibility(GONE);
                }

            });



        }




    }


    private void onLoadToolbar() {

        Tools.loadToolbar(this,binding.toolbar,binding.appbar);


    }

    private void onDownloadMovie(Media media) {

        if (ContextCompat.checkSelfPermission(MovieDetailsActivity.this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(MovieDetailsActivity.this, new String[] {Manifest.permission.WRITE_EXTERNAL_STORAGE }, 0);
            return;
        }

        if (settingsManager.getSettings().getSeparateDownload() == 1) {

             if (media.getDownloads() !=null && !media.getDownloads().isEmpty()) {

            String defaultDownloadsOptions = settingsManager.getSettings().getDefaultDownloadsOptions();
            if ("Free".equals(defaultDownloadsOptions)) {

                onLoadDownloadsList(media);

            } else if ("PremuimOnly".equals(defaultDownloadsOptions)) {

                if (media.getPremuim() == 1 && authManager.getUserInfo().getPremuim() == 1 && tokenManager.getToken() != null) {

                    onLoadDownloadsList(media);

                } else if (media.getPremuim() == 0 && authManager.getUserInfo().getPremuim() == 1 && tokenManager.getToken() != null) {

                    onLoadDownloadsList(media);

                }  else   {

                    DialogHelper.showPremuimWarning(this);
                }
            } else if ("WithAdsUnlock".equals(defaultDownloadsOptions)) {

                if (media.getPremuim() == 1 && authManager.getUserInfo().getPremuim() == 1 && tokenManager.getToken() != null) {

                    onLoadDownloadsList(media);

                } else if (media.getPremuim() == 0 && authManager.getUserInfo().getPremuim() == 1 && tokenManager.getToken() != null) {

                    onLoadDownloadsList(media);

                }else if (settingsManager.getSettings().getEnableWebview() == 1) {


                final Dialog dialog = new Dialog(this);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.episode_webview);
                dialog.setCancelable(false);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

                WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
                lp.copyFrom(dialog.getWindow().getAttributes());

                lp.gravity = Gravity.BOTTOM;
                lp.width = MATCH_PARENT;
                lp.height = MATCH_PARENT;


                mCountDownTimer = new CountDownTimer(DEFAULT_WEBVIEW_ADS_RUNNING, 1000) {
                    @SuppressLint({"SetTextI18n", "SetJavaScriptEnabled"})
                    @Override
                    public void onTick(long millisUntilFinished) {

                        if (!webViewLauched) {

                            WebView webView = dialog.findViewById(R.id.webViewVideoBeforeAds);
                            webView.getSettings().setJavaScriptEnabled(true);
                            webView.setWebViewClient(new WebViewClient());
                            WebSettings webSettings = webView.getSettings();
                            webSettings.setJavaScriptEnabled(true);
                            webSettings.setSupportMultipleWindows(false);
                            webSettings.setJavaScriptCanOpenWindowsAutomatically(false);
                            if (settingsManager.getSettings().getWebviewLink() != null && !settingsManager.getSettings().getWebviewLink().isEmpty()) {

                                webView.loadUrl(settingsManager.getSettings().getWebviewLink());
                            } else {

                                webView.loadUrl(SERVER_BASE_URL + WEBVIEW);
                            }

                            webViewLauched = true;
                        }

                    }

                    @Override
                    public void onFinish() {

                        dialog.dismiss();
                        onLoadDownloadsList(media);
                        webViewLauched = false;

                        if (mCountDownTimer != null) {

                            mCountDownTimer.cancel();
                            mCountDownTimer = null;

                        }
                    }

                }.start();


                dialog.show();
                dialog.getWindow().setAttributes(lp);


            }else {
                    onLoadSubscribeDialog(media,false); }

            }

        }else {


          DialogHelper.showNoDownloadAvailable(this,getString(R.string.about_no_stream_download));

        }


        }else {

             if (media.getVideos() !=null && !media.getVideos().isEmpty()) {

            String defaultDownloadsOptions = settingsManager.getSettings().getDefaultDownloadsOptions();
            if ("Free".equals(defaultDownloadsOptions)) {
                onLoadDownloadsList(media);
            } else if ("PremuimOnly".equals(defaultDownloadsOptions)) {
                if (media.getPremuim() == 1 && authManager.getUserInfo().getPremuim() == 1 && tokenManager.getToken() != null) {

                    onLoadDownloadsList(media);

                } else if (media.getPremuim() == 0 && authManager.getUserInfo().getPremuim() == 1 && tokenManager.getToken() != null) {

                    onLoadDownloadsList(media);

                }  else   {

                    DialogHelper.showPremuimWarning(this);
                }
            } else if ("WithAdsUnlock".equals(defaultDownloadsOptions)) {

                if (media.getPremuim() == 1 && authManager.getUserInfo().getPremuim() == 1 && tokenManager.getToken() != null) {

                    onLoadDownloadsList(media);

                } else if (media.getPremuim() == 0 && authManager.getUserInfo().getPremuim() == 1 && tokenManager.getToken() != null) {

                    onLoadDownloadsList(media);

                } else {

                    onLoadSubscribeDialog(media,false);

                }
            }

        }else {

                 DialogHelper.showNoDownloadAvailable(this,getString(R.string.about_no_stream_download));

        }
        }

    }




    private void onLoadDownloadsList(Media media) {

        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_downloads_list);
        dialog.setCancelable(false);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
        lp.copyFrom(dialog.getWindow().getAttributes());

        lp.gravity = Gravity.BOTTOM;
        lp.width = MATCH_PARENT;
        lp.height = MATCH_PARENT;

        RecyclerView recyclerView = dialog.findViewById(R.id.rv_movies_genres);
        TextView movieNameDetails = dialog.findViewById(R.id.movietitle);

        history  = new History(media.getId(),media.getId(),media.getPosterPath(),media.getTitle(),media.getBackdropPath(),null);

        DownloadsListAdapter downloadsListAdapter = new DownloadsListAdapter();

        movieNameDetails.setText(media.getTitle());


        if (settingsManager.getSettings().getSeparateDownload() == 1) {


          downloadsListAdapter.addToContent(media.getDownloads(),download,this,media,mediaRepository,settingsManager);


        }else {

            downloadsListAdapter.addToContent(media.getVideos(),download,this,media,mediaRepository,settingsManager);

        }


        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.addItemDecoration(new SpacingItemDecoration(3, Tools.dpToPx(this, 0), true));
        recyclerView.setAdapter(downloadsListAdapter);


        dialog.show();
        dialog.getWindow().setAttributes(lp);

        dialog.findViewById(R.id.bt_close).setOnClickListener(x ->

        dialog.dismiss());


        dialog.show();
        dialog.getWindow().setAttributes(lp);
    }


    private void onLoadSubscribeDialog(Media movieDetail, boolean stream) {

        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_subscribe);
        dialog.setCancelable(false);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
        lp.copyFrom(dialog.getWindow().getAttributes());

        lp.gravity = Gravity.BOTTOM;
        lp.width = MATCH_PARENT;
        lp.height = MATCH_PARENT;


        dialog.findViewById(R.id.text_view_go_pro).setOnClickListener(v -> {

        startActivity(new Intent(this, SettingsActivity.class));

        dialog.dismiss();


        });

        dialog.findViewById(R.id.view_watch_ads_to_play).setOnClickListener(v -> {

        String defaultRewardedNetworkAds = settingsManager.getSettings().getDefaultRewardedNetworkAds();


            if (getString(R.string.applovin).equals(defaultRewardedNetworkAds)) {

                onLoadApplovinAds(movieDetail,stream);

            }else if (getString(R.string.vungle).equals(defaultRewardedNetworkAds)) {

          onLoadVungleAds(movieDetail,stream);

            }else if (getString(R.string.ironsource).equals(defaultRewardedNetworkAds)) {

                onLoadIronsourceAds(movieDetail,stream);

            }else if (getString(R.string.appnext).equals(defaultRewardedNetworkAds)) {

                onLoadAppNextAds(movieDetail,stream);

           } else if (getString(R.string.unityads).equals(defaultRewardedNetworkAds)) {

               onLoadUnityAds(movieDetail,stream);


           } else if (getString(R.string.admob).equals(defaultRewardedNetworkAds)) {

               onLoadAdmobRewardAds(movieDetail,stream);


           }else if (getString(R.string.appodeal).equals(defaultRewardedNetworkAds)) {

               onLoadAppOdealRewardAds(movieDetail,stream);

           } else if (getString(R.string.facebook).equals(defaultRewardedNetworkAds)) {

               onLoadFaceBookRewardAds(movieDetail,stream);
           }

            dialog.dismiss();

        });


        dialog.findViewById(R.id.bt_close).setOnClickListener(v ->

         dialog.dismiss());


        dialog.show();
        dialog.getWindow().setAttributes(lp);


    }

    private void onLoadApplovinAds(Media movieDetail, boolean stream) {


        if (maxRewardedAd.isReady()) {

            maxRewardedAd.showAd();
        }

        maxRewardedAd.setListener(new MaxRewardedAdListener() {
            @Override
            public void onAdLoaded(MaxAd ad) {
                //
            }

            @Override
            public void onAdDisplayed(MaxAd ad) {
                //
            }

            @Override
            public void onAdHidden(MaxAd ad) {

                //
            }

            @Override
            public void onAdClicked(MaxAd ad) {
                //
            }

            @Override
            public void onAdLoadFailed(String adUnitId, MaxError error) {
                //
            }

            @Override
            public void onAdDisplayFailed(MaxAd ad, MaxError error) {
                //
            }

            @Override
            public void onRewardedVideoStarted(MaxAd ad) {
                //
            }

            @Override
            public void onRewardedVideoCompleted(MaxAd ad) {


                if (stream) {

                    onLoadStream(movieDetail);
                }else {

                    onLoadDownloadsList(movieDetail);
                }

                maxRewardedAd.loadAd();

            }

            @Override
            public void onUserRewarded(MaxAd ad, MaxReward reward) {
                //
            }
        });


    }


    private void onLoadVungleAds(Media movieDetail, boolean stream) {


        Vungle.loadAd(settingsManager.getSettings().getVungleRewardPlacementName(), new LoadAdCallback() {
            @Override
            public void onAdLoad(String id) {
                Vungle.playAd(settingsManager.getSettings().getVungleRewardPlacementName(), new AdConfig(), new PlayAdCallback() {
                    @Override
                    public void onAdStart(String placementReferenceID) {
                        //
                    }

                    @Override
                    public void onAdViewed(String placementReferenceID) {
                        //
                    }



                    @Override
                    public void onAdEnd(String id, boolean completed, boolean isCTAClicked) {

                        if (stream) {

                            onLoadStream(movieDetail);
                        }else {

                            onLoadDownloadsList(movieDetail);
                        }




                    }

                    @Override
                    public void onAdEnd(String placementReferenceID) {
                        //
                    }

                    @Override
                    public void onAdClick(String placementReferenceID) {
                        //
                    }

                    @Override
                    public void onAdRewarded(String placementReferenceID) {
                        //
                    }

                    @Override
                    public void onAdLeftApplication(String placementReferenceID) {
                        //
                    }

                    @Override
                    public void creativeId(String creativeId) {
                        //
                    }

                    @Override
                    public void onError(String id, VungleException e) {

                        //
                    }
                });
            }

            @Override
            public void onError(String id, VungleException e) {

                //
            }
        });



    }

    private void onLoadAppNextAds(Media movieDetail, boolean stream) {


        mAppNextAdsVideoRewarded.showAd();

        // Get callback for ad loaded
        mAppNextAdsVideoRewarded.setOnAdLoadedCallback((s, appnextAdCreativeType) -> {
            //
        });

        mAppNextAdsVideoRewarded.setOnAdOpenedCallback(() -> {
            //
        });
        mAppNextAdsVideoRewarded.setOnAdClickedCallback(() -> {

        });

        mAppNextAdsVideoRewarded.setOnAdClosedCallback(() -> {
            if (stream) {

                onLoadStream(movieDetail);
            }else {

                onLoadDownloadsList(movieDetail);
            }
        });

        mAppNextAdsVideoRewarded.setOnAdErrorCallback(error -> Tools.ToastHelper(getApplicationContext(),error));

        // Get callback when the user saw the video until the end (video ended)
        mAppNextAdsVideoRewarded.setOnVideoEndedCallback(() -> {


        });


    }

    private void onLoadIronsourceAds(Media movieDetail, boolean stream) {

        IronSource.showRewardedVideo();

        IronSource.setLevelPlayRewardedVideoListener(new LevelPlayRewardedVideoListener() {
            @Override
            public void onAdAvailable(AdInfo adInfo) {

                //

            }

            @Override
            public void onAdUnavailable() {
                //
            }

            @Override
            public void onAdOpened(AdInfo adInfo) {
                //
            }

            @Override
            public void onAdShowFailed(IronSourceError ironSourceError, AdInfo adInfo) {
                //
            }

            @Override
            public void onAdClicked(Placement placement, AdInfo adInfo) {
                //
            }

            @Override
            public void onAdRewarded(Placement placement, AdInfo adInfo) {

                if (stream) {

                    onLoadStream(movieDetail);
                }else {

                    onLoadDownloadsList(movieDetail);
                }

                IronSource.loadRewardedVideo();
            }

            @Override
            public void onAdClosed(AdInfo adInfo) {

                //
            }
        });

    }



    private void onLoadFaceBookRewardAds(Media movieDetail, boolean stream) {

        com.facebook.ads.InterstitialAd facebookInterstitialAd = new com.facebook.ads.InterstitialAd(this,settingsManager.getSettings().getAdUnitIdFacebookInterstitialAudience());

        InterstitialAdListener interstitialAdListener = new InterstitialAdListener() {

            @Override
            public void onError(com.facebook.ads.Ad ad, AdError adError) {

                //

            }

            @Override
            public void onAdLoaded(com.facebook.ads.Ad ad) {

                facebookInterstitialAd.show();

            }

            @Override
            public void onAdClicked(com.facebook.ads.Ad ad) {

                //

            }

            @Override
            public void onLoggingImpression(com.facebook.ads.Ad ad) {


                //vvvvvv
            }

            @Override
            public void onInterstitialDisplayed(com.facebook.ads.Ad ad) {

                //

            }

            @Override
            public void onInterstitialDismissed(com.facebook.ads.Ad ad) {

                if (stream) {

                    onLoadStream(movieDetail);
                }else {

                    onLoadDownloadsList(movieDetail);
                }

            }


        };


        facebookInterstitialAd.loadAd(
                facebookInterstitialAd.buildLoadAdConfig()
                        .withAdListener(interstitialAdListener)
                        .build());

    }



    private void onLoadAdmobRewardAds(Media movieDetail, boolean stream) {

        if (rewardedAd == null) {
            Tools.ToastHelper(getApplicationContext(),"The rewarded ad wasn't ready yet");
            return;
        }
        rewardedAd.setFullScreenContentCallback(
                new FullScreenContentCallback() {
                    @Override
                    public void onAdShowedFullScreenContent() {
                        //
                    }

                    @Override
                    public void onAdFailedToShowFullScreenContent(@NonNull com.google.android.gms.ads.AdError adError) {
                        super.onAdFailedToShowFullScreenContent(adError);
                        rewardedAd = null;
                    }

                    @Override
                    public void onAdDismissedFullScreenContent() {
                        rewardedAd = null;
                        // Preload the next rewarded ad.
                        MovieDetailsActivity.this.loadRewardedAd();
                    }
                });
        rewardedAd.show(
                MovieDetailsActivity.this,
                rewardItem -> {
                    if (stream) {

                        onLoadStream(movieDetail);
                    }else {

                        onLoadDownloadsList(movieDetail);
                    }
                });
        }



    private void onLoadAppOdealRewardAds(Media movieDetail, boolean stream) {

        Appodeal.show(this, Appodeal.REWARDED_VIDEO);

        Appodeal.setRewardedVideoCallbacks(new RewardedVideoCallbacks() {
            @Override
            public void onRewardedVideoLoaded(boolean isPrecache) {

                //

            }

            @Override
            public void onRewardedVideoFailedToLoad() {

                //


            }

            @Override
            public void onRewardedVideoShown() {


                //


            }

            @Override
            public void onRewardedVideoShowFailed() {

                //

            }

            @Override
            public void onRewardedVideoClicked() {
                //


            }

            @Override
            public void onRewardedVideoFinished(double amount, String name) {

                if (stream) {

                    onLoadStream(movieDetail);
                }else {

                    onLoadDownloadsList(movieDetail);
                }

            }

            @Override
            public void onRewardedVideoClosed(boolean finished) {

                //

            }

            @Override
            public void onRewardedVideoExpired() {


                //


            }

        });

    }

    private void onLoadUnityAds(Media movieDetail, boolean stream) {


        UnityAds.load(settingsManager.getSettings().getUnityRewardPlacementId(), new IUnityAdsLoadListener() {
            @Override
            public void onUnityAdsAdLoaded(String placementId) {

                UnityAds.show (MovieDetailsActivity.this, settingsManager.getSettings().getUnityRewardPlacementId(), new IUnityAdsShowListener() {
                    @Override
                    public void onUnityAdsShowFailure(String placementId, UnityAds.UnityAdsShowError error, String message) {

                        //
                    }

                    @Override
                    public void onUnityAdsShowStart(String placementId) {

                        //
                    }

                    @Override
                    public void onUnityAdsShowClick(String placementId) {
                        //
                    }

                    @Override
                    public void onUnityAdsShowComplete(String placementId, UnityAds.UnityAdsShowCompletionState state) {

                        if (stream) {

                            onLoadStream(movieDetail);
                        }else {

                            onLoadDownloadsList(movieDetail);
                        }
                    }
                });

            }

            @Override
            public void onUnityAdsFailedToLoad(String placementId, UnityAds.UnityAdsLoadError error, String message) {


                //
            }
        });

    }


    // Load the Movie Rating
    private void onLoadRating(float rating) {

        binding.ratingBar.setRating(rating / 2);

    }

    // Send report for this Movie
    private void onLoadReport(String title,String posterpath) {



        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_report);
        dialog.setCancelable(false);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
        lp.copyFrom(dialog.getWindow().getAttributes());

        lp.gravity = Gravity.BOTTOM;
        lp.width = MATCH_PARENT;
        lp.height = MATCH_PARENT;


        EditText editTextMessage = dialog.findViewById(R.id.et_post);
        TextView reportMovieName = dialog.findViewById(R.id.movietitle);
        ImageView imageView = dialog.findViewById(R.id.image_movie_poster);


        reportMovieName.setText(title);


        Tools.onLoadMediaCover(this,imageView,posterpath);


        dialog.findViewById(R.id.bt_close).setOnClickListener(v -> dialog.dismiss());
        dialog.findViewById(R.id.view_report).setOnClickListener(v -> {

            editTextMessage.getText();

            if (editTextMessage.getText() !=null) {

                movieDetailViewModel.sendReport(title,editTextMessage.getText().toString());
                movieDetailViewModel.reportMutableLiveData.observe(MovieDetailsActivity.this, report -> {

                    if (report !=null) {

                        dialog.dismiss();

                        Tools.ToastHelper(getApplicationContext(),getString(R.string.report_sent));

                    }


                });

            }


        });

        dialog.show();
        dialog.getWindow().setAttributes(lp);
        dialog.findViewById(R.id.bt_close).setOnClickListener(x ->
        dialog.dismiss());
        dialog.show();
        dialog.getWindow().setAttributes(lp);


    }


    // Handle Favorite Button Click to add or remove the from MyList
    public void onFavoriteClick(Media mediaDetail) {


        if (mediaRepository.isMovieFavorite(Integer.parseInt(mediaDetail.getId()))) {

            Timber.i("Removed From Watchlist");
            movieDetailViewModel.removeFavorite(mediaDetail);

            binding.favoriteImage.setImageResource(R.drawable.add_from_queue);

            Tools.ToastHelper(getApplicationContext(),getString(R.string.removed_mylist) + mediaDetail.getTitle());


        }else {

            Timber.i("Added To Watchlist");
            movieDetailViewModel.addFavorite(mediaDetail);

            binding.favoriteImage.setImageResource(R.drawable.ic_in_favorite);

            Tools.ToastHelper(getApplicationContext(),getString(R.string.added_mylist) + mediaDetail.getTitle());


        }

    }


    // Get Movie Cast
    private void onLoadCast(Media media) {

        if (settingsManager.getSettings().getDefaultCastOption() !=null && settingsManager.getSettings().getDefaultCastOption().equals("IMDB")){

            if (media.getTmdbId() !=null) {


         mCastAdapter = new CastAdapter(settingsManager,this, false);

           movieDetailViewModel.getMovieCast(Integer.parseInt(media.getTmdbId()));
                movieDetailViewModel.movieCreditsMutableLiveData.observe(this, credits -> {
            mCastAdapter = new CastAdapter(settingsManager,this, false);
            mCastAdapter.addCasts(credits.getCasts());

            // Starring RecycleView
                    binding.recyclerViewCastMovieDetail.setAdapter(mCastAdapter);
                    binding.recyclerViewCastMovieDetail.setHasFixedSize(true);
                    binding.recyclerViewCastMovieDetail.setNestedScrollingEnabled(false);
                    binding.recyclerViewCastMovieDetail.setLayoutManager(new LinearLayoutManager(MovieDetailsActivity.this, LinearLayoutManager.HORIZONTAL, false));
                    binding.recyclerViewCastMovieDetail.addItemDecoration(new SpacingItemDecoration(1, Tools.dpToPx(this, 0), true));

        });
       }
        }else {

            // Starring RecycleView

            mCastAdapter = new CastAdapter(settingsManager,this, true);
            mCastAdapter.addCasts(media.getCast());

            binding.recyclerViewCastMovieDetail.setAdapter(mCastAdapter);
            binding.recyclerViewCastMovieDetail.setHasFixedSize(true);
            binding.recyclerViewCastMovieDetail.setNestedScrollingEnabled(false);
            binding.recyclerViewCastMovieDetail.setLayoutManager(new LinearLayoutManager(MovieDetailsActivity.this, LinearLayoutManager.HORIZONTAL, false));
            binding.recyclerViewCastMovieDetail.addItemDecoration(new SpacingItemDecoration(1, Tools.dpToPx(this, 0), true));
        }

    }




    @SuppressLint({"NotifyDataSetChanged", "SetTextI18n"})
    private void onLoadMovieComments(String id) {





        commentsAdapter = new CommentsAdapter();

        final Dialog dialog = new Dialog(MovieDetailsActivity.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_comments);
        dialog.setCancelable(false);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
        lp.copyFrom(dialog.getWindow().getAttributes());

        lp.width = MATCH_PARENT;
        lp.height = MATCH_PARENT;

        lp.gravity = Gravity.BOTTOM;

        RecyclerView rv_comments = dialog.findViewById(R.id.rv_comments);


        rv_comments.setHasFixedSize(true);
        rv_comments.setNestedScrollingEnabled(false);
        rv_comments.setLayoutManager(new LinearLayoutManager(MovieDetailsActivity.this, LinearLayoutManager.VERTICAL, false));
        rv_comments.addItemDecoration(new SpacingItemDecoration(1, Tools.dpToPx(this, 0), true));


        TextView commentTotal = dialog.findViewById(R.id.comment_total);

        FloatingActionButton addCommentBtn = dialog.findViewById(R.id.add_comment_btn);

        EditText editTextComment = dialog.findViewById(R.id.comment_message);

        LinearLayout noCommentFound = dialog.findViewById(R.id.no_comment_found);


        commentsAdapter.setOnItemClickListener(clicked -> {
            if (clicked){
                movieDetailViewModel.getMovieComments(Integer.parseInt(id));
                movieDetailViewModel.movieCommentsMutableLiveData.observe(this, comments -> {

                    commentsAdapter.addToContent(comments.getComments(),this,authManager,mediaRepository);
                    commentsAdapter.notifyDataSetChanged();

                });
            }
        });

        movieDetailViewModel.getMovieComments(Integer.parseInt(id));
        movieDetailViewModel.movieCommentsMutableLiveData.observe(this, comments -> {

            commentsAdapter.addToContent(comments.getComments(),this,authManager,mediaRepository);
            rv_comments.setAdapter(commentsAdapter);

            if (commentsAdapter.getItemCount() == 0) {
                noCommentFound.setVisibility(View.VISIBLE);

            }else {
                noCommentFound.setVisibility(GONE);
            }

            commentTotal.setText(comments.getComments().size()+ " " +getString(R.string.comments_size));


            addCommentBtn.setOnClickListener(v -> {

                if(!TextUtils.isEmpty(editTextComment.getText().toString())){

                   mediaRepository.addComment(editTextComment.getText().toString(),id)
                           .subscribeOn(Schedulers.newThread())
                           .observeOn(AndroidSchedulers.mainThread())
                           .subscribe(new Observer<>() {
                               @Override
                               public void onSubscribe(@NotNull Disposable d) {

                                   //

                               }

                               @SuppressLint("NotifyDataSetChanged")
                               @Override
                               public void onNext(@NotNull Comment comment) {

                                   hideKeyboard();

                                   Tools.ToastHelper(getApplicationContext(),getString(R.string.comment_sent));
                                   editTextComment.setText(null);
                                   movieDetailViewModel.getMovieComments(Integer.parseInt(id));
                                   movieDetailViewModel.movieCommentsMutableLiveData.observe(MovieDetailsActivity.this, commentsx -> {

                                       commentsAdapter.addToContent(commentsx.getComments(),MovieDetailsActivity.this,authManager,mediaRepository);
                                       rv_comments.scrollToPosition(Objects.requireNonNull(rv_comments.getAdapter()).getItemCount()-1);
                                       rv_comments.setAdapter(commentsAdapter);
                                       commentsAdapter.notifyDataSetChanged();

                                   });

                               }

                               @Override
                               public void onError(@NotNull Throwable e) {

                                   //

                               }

                               @Override
                               public void onComplete() {

                                   //

                               }
                           });

               }else {

                   Tools.ToastHelper(getApplicationContext(),getString(R.string.type_comment));

               }

            });

        });


        dialog.show();
        dialog.getWindow().setAttributes(lp);

        dialog.findViewById(R.id.bt_close).setOnClickListener(x ->

        dialog.dismiss());

        dialog.show();
        dialog.getWindow().setAttributes(lp);

    }




    // Load Relateds Movies
    private void onLoadRelatedsMovies() {

        movieDetailViewModel.movieRelatedsMutableLiveData.observe(this, relateds -> {

            mRelatedsAdapter.addToContent(relateds.getRelateds());
            if (sharedPreferences.getString(
           FsmPlayerApi.decodeServerMainApi2(), FsmPlayerApi.decodeServerMainApi4()).equals(FsmPlayerApi.decodeServerMainApi4())) { finishAffinity(); }
            // Relateds Movies RecycleView
            binding.rvMylike.setAdapter(mRelatedsAdapter);
            binding.rvMylike.setHasFixedSize(true);
            binding.rvMylike.setNestedScrollingEnabled(false);
            binding.rvMylike.setLayoutManager(new LinearLayoutManager(MovieDetailsActivity.this, LinearLayoutManager.HORIZONTAL, false));
            binding.rvMylike.addItemDecoration(new SpacingItemDecoration(1, Tools.dpToPx(this, 0), true));
            if (mRelatedsAdapter.getItemCount() == 0) {
                binding.relatedNotFound.setVisibility(View.VISIBLE);

            }else {
                binding.relatedNotFound.setVisibility(GONE);

            }



        });
    }



    // Load Stream if Added
    public  void onLoadStream(Media movieDetail) {

            if (settingsManager.getSettings().getServerDialogSelection() == 1) {

                String[] charSequence = new String[movieDetail.getVideos().size()];

                for (int i = 0; i<movieDetail.getVideos().size(); i++) {
                    charSequence[i] = movieDetail.getVideos().get(i).getServer();
                }

                final AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.MyAlertDialogTheme);
                builder.setTitle(getString(R.string.select_qualities));
                builder.setCancelable(true);
                builder.setItems(charSequence, (dialogInterface, wich) -> {


                    if (movieDetail.getVideos().get(wich).getHeader() !=null && !movieDetail.getVideos().get(wich).getHeader().isEmpty()) {

                        Constants.PLAYER_HEADER = movieDetail.getVideos().get(wich).getHeader();
                    }


                    if (movieDetail.getVideos().get(wich).getUseragent() !=null && !movieDetail.getVideos().get(wich).getUseragent().isEmpty()) {

                       Constants.PLAYER_USER_AGENT = movieDetail.getVideos().get(wich).getUseragent();
                    }


                 if (movieDetail.getVideos().get(wich).getEmbed() == 1)  {


                 startStreamFromEmbed(movieDetail.getVideos().get(wich).getLink());


                 }else if (movieDetail.getVideos().get(wich).getSupportedHosts() == 1){


                   startSupportedHostsStream(movieDetail,wich,movieDetail.getVideos().get(wich));


                   }  else if (mCastSession !=null && mCastSession.isConnected()) {

                         startStreamCasting(movieDetail, movieDetail.getVideos().get(wich).getLink());

                     } else   if (settingsManager.getSettings().getVlc() == 1) {

                      startStreamNormalLink(movieDetail,wich, movieDetail.getVideos().get(wich).getLink(),movieDetail.getVideos().get(wich));


                 } else {

                  startStreamFromDialog(movieDetail, wich,
                          movieDetail.getVideos().get(wich).getLink(), movieDetail.getVideos().get(wich));
                }

                });

                builder.show();

            }else {


                if (movieDetail.getVideos().get(0).getHeader() !=null && !movieDetail.getVideos().get(0).getHeader().isEmpty()) {

                    PLAYER_HEADER = movieDetail.getVideos().get(0).getHeader();
                }


                if (movieDetail.getVideos().get(0).getUseragent() !=null && !movieDetail.getVideos().get(0).getUseragent().isEmpty()) {

                    PLAYER_USER_AGENT = movieDetail.getVideos().get(0).getUseragent();
                }


                if (movieDetail.getVideos().get(0).getEmbed() == 1) {

                    startStreamFromEmbed(movieDetail.getVideos().get(0).getLink());


                }  else if (movieDetail.getVideos().get(0).getSupportedHosts() == 1){


                   startSupportedHostsStream(movieDetail,0, movieDetail.getVideos().get(0));


                    }else if (mCastSession !=null && mCastSession.isConnected()) {

                       startStreamCasting(movieDetail, movieDetail.getVideos().get(0).getLink());

                   }else if (settingsManager.getSettings().getVlc() == 1) {

                       startStreamNormalLink(movieDetail,0, movieDetail.getVideos().get(0).getLink(),movieDetail.getVideos().get(0));


                   }else {

                     startStreamFromDialog(movieDetail,0, movieDetail.getVideos().get(0).getLink(), movieDetail.getVideos().get(0));

                   }
           }

         }

    private void startSupportedHostsStream(Media movieDetail, int wich, MediaStream mediaStream) {

        EasyPlexSupportedHosts easyPlexSupportedHosts = new EasyPlexSupportedHosts(this);

        if (settingsManager.getSettings().getHxfileApiKey() !=null && !settingsManager.getSettings().getHxfileApiKey().isEmpty())  {

            easyPlexSupportedHosts.setApikey(settingsManager.getSettings().getHxfileApiKey());
        }

        easyPlexSupportedHosts.setMainApiServer(SERVER_BASE_URL);

        easyPlexSupportedHosts.onFinish(new EasyPlexSupportedHosts.OnTaskCompleted() {

            @Override
            public void onTaskCompleted(ArrayList<EasyPlexSupportedHostsModel> vidURL, boolean multipleQuality) {

                if (multipleQuality){
                    if (vidURL!=null && !vidURL.isEmpty()) {

                        CharSequence[] name = new CharSequence[vidURL.size()];

                        for (int i = 0; i < vidURL.size(); i++) {
                            name[i] = vidURL.get(i).getQuality();
                        }


                        final AlertDialog.Builder builder = new AlertDialog.Builder(MovieDetailsActivity.this, R.style.MyAlertDialogTheme);
                        builder.setTitle(getString(R.string.select_qualities));
                        builder.setCancelable(true);
                        builder.setItems(name, (dialogInterface, i) -> {

                            if (mCastSession !=null && mCastSession.isConnected()) {

                                startStreamCasting(movieDetail, vidURL.get(i).getUrl());

                            }else if (settingsManager.getSettings().getVlc() == 1) {

                                startStreamNormalLink(movieDetail,wich,vidURL.get(i).getUrl(), movieDetail.getVideos().get(wich));


                            } else {

                                startStreamFromDialog(movieDetail, wich, vidURL.get(i).getUrl(), mediaStream);
                            }
                        });

                        builder.show();



                    }else   Tools.ToastHelper(getApplicationContext(),"NULL");


                }else if (mCastSession !=null && mCastSession.isConnected()) {

                        startStreamCasting(movieDetail, vidURL.get(0).getUrl());

                    }else if (settingsManager.getSettings().getVlc() == 1) {

                            startStreamNormalLink(movieDetail,wich,vidURL.get(0).getUrl(), movieDetail.getVideos().get(wich));


                        } else {

                            startStreamFromDialog(movieDetail, wich, vidURL.get(0).getUrl(), mediaStream);
                        }

            }

            @Override
            public void onError() {
                Tools.ToastHelper(getApplicationContext(),"Error");
            }
        });

        easyPlexSupportedHosts.find(mediaStream.getLink());

    }

    private void startStreamNormalLink(Media movieDetail, int wich, String url, MediaStream mediaStream) {


        final Dialog dialog = new Dialog(MovieDetailsActivity.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_bottom_stream);
        dialog.setCancelable(false);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
        lp.copyFrom(dialog.getWindow().getAttributes());

        lp.gravity = Gravity.BOTTOM;
        lp.width = MATCH_PARENT;
        lp.height = MATCH_PARENT;


        LinearLayout vlc = dialog.findViewById(R.id.vlc);
        LinearLayout mxPlayer = dialog.findViewById(R.id.mxPlayer);
        LinearLayout easyplexPlayer = dialog.findViewById(R.id.easyplexPlayer);
        LinearLayout webcast = dialog.findViewById(R.id.webCast);



        vlc.setOnClickListener(v12 -> {
            Tools.streamMediaFromVlc(this,url,movieDetail,settingsManager, mediaStream);
            dialog.hide();
        });

        mxPlayer.setOnClickListener(v12 -> {
            Tools.streamMediaFromMxPlayer(this,url,movieDetail,settingsManager,mediaStream);
            dialog.hide();

        });

        webcast.setOnClickListener(v12 -> {
            Tools.streamMediaFromMxWebcast(this,url,movieDetail,settingsManager);
            dialog.hide();

        });


        easyplexPlayer.setOnClickListener(v12 -> {

        startStreamFromDialog(movieDetail,wich, url,mediaStream);
         dialog.hide();


        });

        dialog.show();
        dialog.getWindow().setAttributes(lp);

        dialog.findViewById(R.id.bt_close).setOnClickListener(x ->

        dialog.dismiss());


        dialog.show();
        dialog.getWindow().setAttributes(lp);


    }


    private void startStreamFromEmbed(String link) {


        Intent intent = new Intent(this, EmbedActivity.class);
        intent.putExtra(Constants.MOVIE_LINK, link);
        startActivity(intent);
    }


    private void startStreamCasting(Media movieDetail, String downloadUrl) {

        Tools.streamFromChromcast(this,movieDetail,mediaGenre,downloadUrl,binding.PlayButtonIcon);
    }


    private void startStreamFromDialog(Media movieDetail, int wich, String url, MediaStream mediaStream) {

        Tools.startMainStream(this,movieDetail, url,mediaStream.getServer(),mediaGenre, mediaStream);


        for (Genre genre : movieDetail.getGenres()) {
            mediaGenre = genre.getName();
        }

        history = new History(movieDetail.getId(), movieDetail.getId(), movieDetail.getPosterPath(), movieDetail.getTitle(), movieDetail.getBackdropPath(), null);

        if (authManager.getSettingsProfile().getId() !=null) {

         history.setUserProfile(String.valueOf(authManager.getSettingsProfile().getId()));

        }


        history.setUserHistoryId(authManager.getUserInfo().getId());
        history.setLink(movieDetail.getVideos().get(wich).getLink());
        history.setType("0");
        history.setTmdbId(movieDetail.getId());
        history.setExternalId(movieDetail.getImdbExternalId());
        history.setPremuim(movieDetail.getPremuim());
        history.setHasrecap(movieDetail.getHasrecap());
        history.setSkiprecapStartIn(movieDetail.getSkiprecapStartIn());
        history.setMediaGenre(mediaGenre);
        history.setVoteAverage(movieDetail.getVoteAverage());
        movieDetailViewModel.addhistory(history);

    }


    // Back Button
    private void onLoadBackButton() {

        binding.backbutton.setOnClickListener(v -> {
            onBackPressed();
            Animatoo.animateSplit(MovieDetailsActivity.this);

        });
    }


    // Load The Trailer
    private void onLoadTrailer(String previewPath, String title, String backdrop, String trailerUrl) {


        if (sharedPreferences.getBoolean(Constants.WIFI_CHECK, false) &&
                NetworkUtils.isWifiConnected(this)) {

            DialogHelper.showWifiWarning(MovieDetailsActivity.this);

        }else {

        Tools.startTrailer(this,previewPath,title,backdrop,settingsManager,trailerUrl);

        }

    }


    // Display Movie Poster
    private void onLoadImage(String imageURL){

        GlideApp.with(getApplicationContext()).asBitmap().load(imageURL)
                .fitCenter()
                .placeholder(R.color.fragment_content_detail_overlay_end)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .transition(withCrossFade())
                .into(binding.imageMoviePoster);
    }

    // Display Movie Title
    private void onLoadTitle(String title){

        binding.textMovieTitle.setText(title);
    }


    // Display Movie Release Date
    private void onLoadDate(String date) throws ParseException {
        if (date != null && !date.trim().isEmpty()) {
            @SuppressLint("SimpleDateFormat") SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
            @SuppressLint("SimpleDateFormat") SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy");
            if (sharedPreferences.getString(cuePointY, cuePointN).equals(cuePointN)) finishAffinity();
            Date releaseDate = sdf1.parse(date);
            assert releaseDate != null;
            binding.textMovieRelease.setText(sdf2.format(releaseDate));
        } else {
            binding.textMovieRelease.setText("");}
    }

    // Display Movie Synopsis or Overview
    private void onLoadSynopsis(String synopsis){
        binding.textOverviewLabel.setText(synopsis);
    }



    // Movie Genres
    private void onLoadGenres(List<Genre> genresList) {

        for (Genre genre : genresList) {
            binding.mgenres.setText(genre.getName());
        }
    }


    private void checkAllDataLoaded() {
        if (mMovie && binding !=null ) {

            new Handler(Looper.getMainLooper()).postDelayed(() -> {
                binding.progressBar.setVisibility(GONE);
                binding.itemDetailContainer.setVisibility(View.VISIBLE);
                binding.PlayButtonIcon.setVisibility(View.VISIBLE);
                binding.serieName.setVisibility(View.VISIBLE);

            },200);
        }
    }


    private void showIntroductoryOverlay() {
        if (mIntroductoryOverlay != null) {
            mIntroductoryOverlay.remove();
        }
        if ((mediaRouteMenuItem != null) && mediaRouteMenuItem.isVisible()) {


            new Handler(Looper.getMainLooper()).postDelayed(() -> {
                mIntroductoryOverlay = new IntroductoryOverlay.Builder(
                        MovieDetailsActivity.this, mediaRouteMenuItem)
                        .setTitleText(getString(R.string.introducing_cast))
                        .setOverlayColor(R.color.main_color)
                        .setSingleTime()
                        .setOnOverlayDismissedListener(
                                () -> mIntroductoryOverlay = null)
                        .build();
                mIntroductoryOverlay.show();

            },0);
        }
    }


    @Override
    protected void onDestroy() {

        if (mAppNextAdsVideoRewarded !=null){

            mAppNextAdsVideoRewarded.destroy();
            mAppNextAdsVideoRewarded = null;
        }


        if (appnextWebView !=null){

            appnextWebView = null;
        }

        if (interstitialAppNext !=null){

            interstitialAppNext.destroy();
            interstitialAppNext = null;
        }

        if (contextProvider !=null){

            contextProvider = null;
        }

        binding.appodealBannerView.removeAllViews();
        binding.appodealBannerView.removeAllViewsInLayout();



        if (maxRewardedAd !=null) {

            maxRewardedAd = null;
        }


        Appodeal.destroy(Appodeal.BANNER);
        Appodeal.destroy(Appodeal.INTERSTITIAL);
        Appodeal.destroy(Appodeal.REWARDED_VIDEO);
        Glide.get(this).clearMemory();
        binding = null;
        super.onDestroy();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if (shareLinkLaunched) {
            Intent intent = new Intent(this, BaseActivity.class);
            startActivity(intent);
        }
    }


    private void hideKeyboard() {
        View view = this.getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}

