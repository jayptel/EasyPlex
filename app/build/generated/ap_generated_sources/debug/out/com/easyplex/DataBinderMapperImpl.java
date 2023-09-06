package com.easyplex;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.easyplex.databinding.ActivityBrowserBookmarksBindingImpl;
import com.easyplex.databinding.ActivityBrowserBottomAppBarBindingImpl;
import com.easyplex.databinding.ActivityBrowserTopAppBarBindingImpl;
import com.easyplex.databinding.ActivityDevicesManagementBindingImpl;
import com.easyplex.databinding.ActivityEasyplexPlayerBindingImpl;
import com.easyplex.databinding.ActivityEditProfileBindingImpl;
import com.easyplex.databinding.ActivityEmbedBindingImpl;
import com.easyplex.databinding.ActivityFilemanagerDialogBindingImpl;
import com.easyplex.databinding.ActivityLoginBindingImpl;
import com.easyplex.databinding.ActivityMainBindingImpl;
import com.easyplex.databinding.ActivityMainDrawerBindingImpl;
import com.easyplex.databinding.ActivityPaymentDetailsBindingImpl;
import com.easyplex.databinding.ActivityPhoneVerificationBindingImpl;
import com.easyplex.databinding.ActivityProfilesSelectionBindingImpl;
import com.easyplex.databinding.ActivitySettingBindingImpl;
import com.easyplex.databinding.ActivitySignupBindingImpl;
import com.easyplex.databinding.ActivitySplashBindingImpl;
import com.easyplex.databinding.BottomActionsPlayerBindingImpl;
import com.easyplex.databinding.BrowseFragmentBindingImpl;
import com.easyplex.databinding.BrowserAddressBarBindingImpl;
import com.easyplex.databinding.BrowserContextMenuDialogBindingImpl;
import com.easyplex.databinding.BrowserProgressBarBindingImpl;
import com.easyplex.databinding.DialogAboutNoDownloadBindingImpl;
import com.easyplex.databinding.DialogAboutNoDownloadEpisodeBindingImpl;
import com.easyplex.databinding.DialogAboutNoStreamBindingImpl;
import com.easyplex.databinding.DialogAboutNoStreamEpisodeBindingImpl;
import com.easyplex.databinding.DialogAddDownloadBindingImpl;
import com.easyplex.databinding.DialogCommentsBindingImpl;
import com.easyplex.databinding.DialogDownloadDetailsBindingImpl;
import com.easyplex.databinding.DialogEditBookmarkBindingImpl;
import com.easyplex.databinding.DialogErrorBindingImpl;
import com.easyplex.databinding.DownloadActivityBindingImpl;
import com.easyplex.databinding.FragmentDownloadListBindingImpl;
import com.easyplex.databinding.FragmentFavouriteMoviesBindingImpl;
import com.easyplex.databinding.FragmentHomeBindingImpl;
import com.easyplex.databinding.FragmentSearchBindingImpl;
import com.easyplex.databinding.FragmentStreamingBindingImpl;
import com.easyplex.databinding.FragmentUpcomingBindingImpl;
import com.easyplex.databinding.IncludeDrawerHeaderBindingImpl;
import com.easyplex.databinding.ItemAnimeBindingImpl;
import com.easyplex.databinding.ItemAnimeDetailBindingImpl;
import com.easyplex.databinding.ItemBrowserBookmarksListBindingImpl;
import com.easyplex.databinding.ItemCastDetailBindingImpl;
import com.easyplex.databinding.ItemCommentBindingImpl;
import com.easyplex.databinding.ItemDeviceBindingImpl;
import com.easyplex.databinding.ItemDownloadBindingImpl;
import com.easyplex.databinding.ItemDownloadHomeBindingImpl;
import com.easyplex.databinding.ItemEpisodesGenresBindingImpl;
import com.easyplex.databinding.ItemFavBindingImpl;
import com.easyplex.databinding.ItemFilmographieBindingImpl;
import com.easyplex.databinding.ItemGenreBindingImpl;
import com.easyplex.databinding.ItemHistoryBindingImpl;
import com.easyplex.databinding.ItemLastestEpisodesBindingImpl;
import com.easyplex.databinding.ItemMovieBindingImpl;
import com.easyplex.databinding.ItemMovieDetailBindingImpl;
import com.easyplex.databinding.ItemNetworkBindingImpl;
import com.easyplex.databinding.ItemPinnedBindingImpl;
import com.easyplex.databinding.ItemPlansBindingImpl;
import com.easyplex.databinding.ItemPopularCastersBindingImpl;
import com.easyplex.databinding.ItemProfileBindingImpl;
import com.easyplex.databinding.ItemProfilesBindingImpl;
import com.easyplex.databinding.ItemRelatedsBindingImpl;
import com.easyplex.databinding.ItemShowStreamingBindingImpl;
import com.easyplex.databinding.ItemShowStreamingHomeBindingImpl;
import com.easyplex.databinding.ItemStreamDetailBindingImpl;
import com.easyplex.databinding.ItemStreamingTwolinesBindingImpl;
import com.easyplex.databinding.ItemSuggest2BindingImpl;
import com.easyplex.databinding.ItemTopttenBindingImpl;
import com.easyplex.databinding.ItemUpcomingBindingImpl;
import com.easyplex.databinding.ItemUserDetailBindingImpl;
import com.easyplex.databinding.LayoutDownloadFragmentBindingImpl;
import com.easyplex.databinding.LayoutEpisodeNotifcationBindingImpl;
import com.easyplex.databinding.LayoutEpisodesFragmentBindingImpl;
import com.easyplex.databinding.LayoutGenresBindingImpl;
import com.easyplex.databinding.LayoutNetworksBindingImpl;
import com.easyplex.databinding.ListItemCastBindingImpl;
import com.easyplex.databinding.ListItemDownloadBindingImpl;
import com.easyplex.databinding.MainToolbarBindingImpl;
import com.easyplex.databinding.MainToolbarOthersBindingImpl;
import com.easyplex.databinding.PaymentActivityBindingImpl;
import com.easyplex.databinding.PaymentPaypalBindingImpl;
import com.easyplex.databinding.PaymentStripeBindingImpl;
import com.easyplex.databinding.PaymentSuccessBindingImpl;
import com.easyplex.databinding.QueueRowBindingImpl;
import com.easyplex.databinding.RegistrationSucessBindingImpl;
import com.easyplex.databinding.RightPlayerEpisodesBindingImpl;
import com.easyplex.databinding.RowDiscoverStyleBindingImpl;
import com.easyplex.databinding.RowItemCategoryBindingImpl;
import com.easyplex.databinding.RowItemChoosedBindingImpl;
import com.easyplex.databinding.RowItemFeaturedBindingImpl;
import com.easyplex.databinding.RowItemFeaturedStreamingBindingImpl;
import com.easyplex.databinding.RowItemLatestMoviesSeriesBindingImpl;
import com.easyplex.databinding.RowItemLatestSeriesBindingImpl;
import com.easyplex.databinding.RowPlayerEpisodesBindingImpl;
import com.easyplex.databinding.RowPlayerLivetvBindingImpl;
import com.easyplex.databinding.RowPlayerMoviesEndedBindingImpl;
import com.easyplex.databinding.RowPlayerMoviesListBindingImpl;
import com.easyplex.databinding.RowSeason3BindingImpl;
import com.easyplex.databinding.RowSeasons2BindingImpl;
import com.easyplex.databinding.RowSeasonsBindingImpl;
import com.easyplex.databinding.RowSubstitleBindingImpl;
import com.easyplex.databinding.SerieDetailsBindingImpl;
import com.easyplex.databinding.SlideEpisodesAnimesBindingImpl;
import com.easyplex.databinding.UiControllerViewBindingImpl;
import com.easyplex.databinding.UpcomingTitlesOverviewBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Generated;

@Generated("Android Data Binding")
public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYBROWSERBOOKMARKS = 1;

  private static final int LAYOUT_ACTIVITYBROWSERBOTTOMAPPBAR = 2;

  private static final int LAYOUT_ACTIVITYBROWSERTOPAPPBAR = 3;

  private static final int LAYOUT_ACTIVITYDEVICESMANAGEMENT = 4;

  private static final int LAYOUT_ACTIVITYEASYPLEXPLAYER = 5;

  private static final int LAYOUT_ACTIVITYEDITPROFILE = 6;

  private static final int LAYOUT_ACTIVITYEMBED = 7;

  private static final int LAYOUT_ACTIVITYFILEMANAGERDIALOG = 8;

  private static final int LAYOUT_ACTIVITYLOGIN = 9;

  private static final int LAYOUT_ACTIVITYMAIN = 10;

  private static final int LAYOUT_ACTIVITYMAINDRAWER = 11;

  private static final int LAYOUT_ACTIVITYPAYMENTDETAILS = 12;

  private static final int LAYOUT_ACTIVITYPHONEVERIFICATION = 13;

  private static final int LAYOUT_ACTIVITYPROFILESSELECTION = 14;

  private static final int LAYOUT_ACTIVITYSETTING = 15;

  private static final int LAYOUT_ACTIVITYSIGNUP = 16;

  private static final int LAYOUT_ACTIVITYSPLASH = 17;

  private static final int LAYOUT_BOTTOMACTIONSPLAYER = 18;

  private static final int LAYOUT_BROWSEFRAGMENT = 19;

  private static final int LAYOUT_BROWSERADDRESSBAR = 20;

  private static final int LAYOUT_BROWSERCONTEXTMENUDIALOG = 21;

  private static final int LAYOUT_BROWSERPROGRESSBAR = 22;

  private static final int LAYOUT_DIALOGABOUTNODOWNLOAD = 23;

  private static final int LAYOUT_DIALOGABOUTNODOWNLOADEPISODE = 24;

  private static final int LAYOUT_DIALOGABOUTNOSTREAM = 25;

  private static final int LAYOUT_DIALOGABOUTNOSTREAMEPISODE = 26;

  private static final int LAYOUT_DIALOGADDDOWNLOAD = 27;

  private static final int LAYOUT_DIALOGCOMMENTS = 28;

  private static final int LAYOUT_DIALOGDOWNLOADDETAILS = 29;

  private static final int LAYOUT_DIALOGEDITBOOKMARK = 30;

  private static final int LAYOUT_DIALOGERROR = 31;

  private static final int LAYOUT_DOWNLOADACTIVITY = 32;

  private static final int LAYOUT_FRAGMENTDOWNLOADLIST = 33;

  private static final int LAYOUT_FRAGMENTFAVOURITEMOVIES = 34;

  private static final int LAYOUT_FRAGMENTHOME = 35;

  private static final int LAYOUT_FRAGMENTSEARCH = 36;

  private static final int LAYOUT_FRAGMENTSTREAMING = 37;

  private static final int LAYOUT_FRAGMENTUPCOMING = 38;

  private static final int LAYOUT_INCLUDEDRAWERHEADER = 39;

  private static final int LAYOUT_ITEMANIME = 40;

  private static final int LAYOUT_ITEMANIMEDETAIL = 41;

  private static final int LAYOUT_ITEMBROWSERBOOKMARKSLIST = 42;

  private static final int LAYOUT_ITEMCASTDETAIL = 43;

  private static final int LAYOUT_ITEMCOMMENT = 44;

  private static final int LAYOUT_ITEMDEVICE = 45;

  private static final int LAYOUT_ITEMDOWNLOAD = 46;

  private static final int LAYOUT_ITEMDOWNLOADHOME = 47;

  private static final int LAYOUT_ITEMEPISODESGENRES = 48;

  private static final int LAYOUT_ITEMFAV = 49;

  private static final int LAYOUT_ITEMFILMOGRAPHIE = 50;

  private static final int LAYOUT_ITEMGENRE = 51;

  private static final int LAYOUT_ITEMHISTORY = 52;

  private static final int LAYOUT_ITEMLASTESTEPISODES = 53;

  private static final int LAYOUT_ITEMMOVIE = 54;

  private static final int LAYOUT_ITEMMOVIEDETAIL = 55;

  private static final int LAYOUT_ITEMNETWORK = 56;

  private static final int LAYOUT_ITEMPINNED = 57;

  private static final int LAYOUT_ITEMPLANS = 58;

  private static final int LAYOUT_ITEMPOPULARCASTERS = 59;

  private static final int LAYOUT_ITEMPROFILE = 60;

  private static final int LAYOUT_ITEMPROFILES = 61;

  private static final int LAYOUT_ITEMRELATEDS = 62;

  private static final int LAYOUT_ITEMSHOWSTREAMING = 63;

  private static final int LAYOUT_ITEMSHOWSTREAMINGHOME = 64;

  private static final int LAYOUT_ITEMSTREAMDETAIL = 65;

  private static final int LAYOUT_ITEMSTREAMINGTWOLINES = 66;

  private static final int LAYOUT_ITEMSUGGEST2 = 67;

  private static final int LAYOUT_ITEMTOPTTEN = 68;

  private static final int LAYOUT_ITEMUPCOMING = 69;

  private static final int LAYOUT_ITEMUSERDETAIL = 70;

  private static final int LAYOUT_LAYOUTDOWNLOADFRAGMENT = 71;

  private static final int LAYOUT_LAYOUTEPISODENOTIFCATION = 72;

  private static final int LAYOUT_LAYOUTEPISODESFRAGMENT = 73;

  private static final int LAYOUT_LAYOUTGENRES = 74;

  private static final int LAYOUT_LAYOUTNETWORKS = 75;

  private static final int LAYOUT_LISTITEMCAST = 76;

  private static final int LAYOUT_LISTITEMDOWNLOAD = 77;

  private static final int LAYOUT_MAINTOOLBAR = 78;

  private static final int LAYOUT_MAINTOOLBAROTHERS = 79;

  private static final int LAYOUT_PAYMENTACTIVITY = 80;

  private static final int LAYOUT_PAYMENTPAYPAL = 81;

  private static final int LAYOUT_PAYMENTSTRIPE = 82;

  private static final int LAYOUT_PAYMENTSUCCESS = 83;

  private static final int LAYOUT_QUEUEROW = 84;

  private static final int LAYOUT_REGISTRATIONSUCESS = 85;

  private static final int LAYOUT_RIGHTPLAYEREPISODES = 86;

  private static final int LAYOUT_ROWDISCOVERSTYLE = 87;

  private static final int LAYOUT_ROWITEMCATEGORY = 88;

  private static final int LAYOUT_ROWITEMCHOOSED = 89;

  private static final int LAYOUT_ROWITEMFEATURED = 90;

  private static final int LAYOUT_ROWITEMFEATUREDSTREAMING = 91;

  private static final int LAYOUT_ROWITEMLATESTMOVIESSERIES = 92;

  private static final int LAYOUT_ROWITEMLATESTSERIES = 93;

  private static final int LAYOUT_ROWPLAYEREPISODES = 94;

  private static final int LAYOUT_ROWPLAYERLIVETV = 95;

  private static final int LAYOUT_ROWPLAYERMOVIESENDED = 96;

  private static final int LAYOUT_ROWPLAYERMOVIESLIST = 97;

  private static final int LAYOUT_ROWSEASON3 = 98;

  private static final int LAYOUT_ROWSEASONS = 99;

  private static final int LAYOUT_ROWSEASONS2 = 100;

  private static final int LAYOUT_ROWSUBSTITLE = 101;

  private static final int LAYOUT_SERIEDETAILS = 102;

  private static final int LAYOUT_SLIDEEPISODESANIMES = 103;

  private static final int LAYOUT_UICONTROLLERVIEW = 104;

  private static final int LAYOUT_UPCOMINGTITLESOVERVIEW = 105;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(105);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.activity_browser_bookmarks, LAYOUT_ACTIVITYBROWSERBOOKMARKS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.activity_browser_bottom_app_bar, LAYOUT_ACTIVITYBROWSERBOTTOMAPPBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.activity_browser_top_app_bar, LAYOUT_ACTIVITYBROWSERTOPAPPBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.activity_devices_management, LAYOUT_ACTIVITYDEVICESMANAGEMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.activity_easyplex_player, LAYOUT_ACTIVITYEASYPLEXPLAYER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.activity_edit_profile, LAYOUT_ACTIVITYEDITPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.activity_embed, LAYOUT_ACTIVITYEMBED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.activity_filemanager_dialog, LAYOUT_ACTIVITYFILEMANAGERDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.activity_login, LAYOUT_ACTIVITYLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.activity_main_drawer, LAYOUT_ACTIVITYMAINDRAWER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.activity_payment_details, LAYOUT_ACTIVITYPAYMENTDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.activity_phone_verification, LAYOUT_ACTIVITYPHONEVERIFICATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.activity_profiles_selection, LAYOUT_ACTIVITYPROFILESSELECTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.activity_setting, LAYOUT_ACTIVITYSETTING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.activity_signup, LAYOUT_ACTIVITYSIGNUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.activity_splash, LAYOUT_ACTIVITYSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.bottom_actions_player, LAYOUT_BOTTOMACTIONSPLAYER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.browse_fragment, LAYOUT_BROWSEFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.browser_address_bar, LAYOUT_BROWSERADDRESSBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.browser_context_menu_dialog, LAYOUT_BROWSERCONTEXTMENUDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.browser_progress_bar, LAYOUT_BROWSERPROGRESSBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.dialog_about_no_download, LAYOUT_DIALOGABOUTNODOWNLOAD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.dialog_about_no_download_episode, LAYOUT_DIALOGABOUTNODOWNLOADEPISODE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.dialog_about_no_stream, LAYOUT_DIALOGABOUTNOSTREAM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.dialog_about_no_stream_episode, LAYOUT_DIALOGABOUTNOSTREAMEPISODE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.dialog_add_download, LAYOUT_DIALOGADDDOWNLOAD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.dialog_comments, LAYOUT_DIALOGCOMMENTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.dialog_download_details, LAYOUT_DIALOGDOWNLOADDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.dialog_edit_bookmark, LAYOUT_DIALOGEDITBOOKMARK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.dialog_error, LAYOUT_DIALOGERROR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.download_activity, LAYOUT_DOWNLOADACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.fragment_download_list, LAYOUT_FRAGMENTDOWNLOADLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.fragment_favourite_movies, LAYOUT_FRAGMENTFAVOURITEMOVIES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.fragment_search, LAYOUT_FRAGMENTSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.fragment_streaming, LAYOUT_FRAGMENTSTREAMING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.fragment_upcoming, LAYOUT_FRAGMENTUPCOMING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.include_drawer_header, LAYOUT_INCLUDEDRAWERHEADER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.item_anime, LAYOUT_ITEMANIME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.item_anime_detail, LAYOUT_ITEMANIMEDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.item_browser_bookmarks_list, LAYOUT_ITEMBROWSERBOOKMARKSLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.item_cast_detail, LAYOUT_ITEMCASTDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.item_comment, LAYOUT_ITEMCOMMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.item_device, LAYOUT_ITEMDEVICE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.item_download, LAYOUT_ITEMDOWNLOAD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.item_download_home, LAYOUT_ITEMDOWNLOADHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.item_episodes_genres, LAYOUT_ITEMEPISODESGENRES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.item_fav, LAYOUT_ITEMFAV);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.item_filmographie, LAYOUT_ITEMFILMOGRAPHIE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.item_genre, LAYOUT_ITEMGENRE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.item_history, LAYOUT_ITEMHISTORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.item_lastest_episodes, LAYOUT_ITEMLASTESTEPISODES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.item_movie, LAYOUT_ITEMMOVIE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.item_movie_detail, LAYOUT_ITEMMOVIEDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.item_network, LAYOUT_ITEMNETWORK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.item_pinned, LAYOUT_ITEMPINNED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.item_plans, LAYOUT_ITEMPLANS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.item_popular_casters, LAYOUT_ITEMPOPULARCASTERS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.item_profile, LAYOUT_ITEMPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.item_profiles, LAYOUT_ITEMPROFILES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.item_relateds, LAYOUT_ITEMRELATEDS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.item_show_streaming, LAYOUT_ITEMSHOWSTREAMING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.item_show_streaming_home, LAYOUT_ITEMSHOWSTREAMINGHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.item_stream_detail, LAYOUT_ITEMSTREAMDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.item_streaming_twolines, LAYOUT_ITEMSTREAMINGTWOLINES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.item_suggest2, LAYOUT_ITEMSUGGEST2);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.item_toptten, LAYOUT_ITEMTOPTTEN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.item_upcoming, LAYOUT_ITEMUPCOMING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.item_user_detail, LAYOUT_ITEMUSERDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.layout_download_fragment, LAYOUT_LAYOUTDOWNLOADFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.layout_episode_notifcation, LAYOUT_LAYOUTEPISODENOTIFCATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.layout_episodes_fragment, LAYOUT_LAYOUTEPISODESFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.layout_genres, LAYOUT_LAYOUTGENRES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.layout_networks, LAYOUT_LAYOUTNETWORKS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.list_item_cast, LAYOUT_LISTITEMCAST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.list_item_download, LAYOUT_LISTITEMDOWNLOAD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.main_toolbar, LAYOUT_MAINTOOLBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.main_toolbar_others, LAYOUT_MAINTOOLBAROTHERS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.payment_activity, LAYOUT_PAYMENTACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.payment_paypal, LAYOUT_PAYMENTPAYPAL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.payment_stripe, LAYOUT_PAYMENTSTRIPE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.payment_success, LAYOUT_PAYMENTSUCCESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.queue_row, LAYOUT_QUEUEROW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.registration_sucess, LAYOUT_REGISTRATIONSUCESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.right_player_episodes, LAYOUT_RIGHTPLAYEREPISODES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.row_discover_style, LAYOUT_ROWDISCOVERSTYLE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.row_item_category, LAYOUT_ROWITEMCATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.row_item_choosed, LAYOUT_ROWITEMCHOOSED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.row_item_featured, LAYOUT_ROWITEMFEATURED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.row_item_featured_streaming, LAYOUT_ROWITEMFEATUREDSTREAMING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.row_item_latest_movies_series, LAYOUT_ROWITEMLATESTMOVIESSERIES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.row_item_latest_series, LAYOUT_ROWITEMLATESTSERIES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.row_player_episodes, LAYOUT_ROWPLAYEREPISODES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.row_player_livetv, LAYOUT_ROWPLAYERLIVETV);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.row_player_movies_ended, LAYOUT_ROWPLAYERMOVIESENDED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.row_player_movies_list, LAYOUT_ROWPLAYERMOVIESLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.row_season3, LAYOUT_ROWSEASON3);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.row_seasons, LAYOUT_ROWSEASONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.row_seasons2, LAYOUT_ROWSEASONS2);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.row_substitle, LAYOUT_ROWSUBSTITLE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.serie_details, LAYOUT_SERIEDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.slide_episodes_animes, LAYOUT_SLIDEEPISODESANIMES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.ui_controller_view, LAYOUT_UICONTROLLERVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.easyplex.R.layout.upcoming_titles_overview, LAYOUT_UPCOMINGTITLESOVERVIEW);
  }

  private final ViewDataBinding internalGetViewDataBinding0(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_ACTIVITYBROWSERBOOKMARKS: {
        if ("layout/activity_browser_bookmarks_0".equals(tag)) {
          return new ActivityBrowserBookmarksBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_browser_bookmarks is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYBROWSERBOTTOMAPPBAR: {
        if ("layout/activity_browser_bottom_app_bar_0".equals(tag)) {
          return new ActivityBrowserBottomAppBarBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_browser_bottom_app_bar is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYBROWSERTOPAPPBAR: {
        if ("layout/activity_browser_top_app_bar_0".equals(tag)) {
          return new ActivityBrowserTopAppBarBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_browser_top_app_bar is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYDEVICESMANAGEMENT: {
        if ("layout/activity_devices_management_0".equals(tag)) {
          return new ActivityDevicesManagementBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_devices_management is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYEASYPLEXPLAYER: {
        if ("layout/activity_easyplex_player_0".equals(tag)) {
          return new ActivityEasyplexPlayerBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_easyplex_player is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYEDITPROFILE: {
        if ("layout/activity_edit_profile_0".equals(tag)) {
          return new ActivityEditProfileBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_edit_profile is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYEMBED: {
        if ("layout/activity_embed_0".equals(tag)) {
          return new ActivityEmbedBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_embed is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYFILEMANAGERDIALOG: {
        if ("layout/activity_filemanager_dialog_0".equals(tag)) {
          return new ActivityFilemanagerDialogBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_filemanager_dialog is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYLOGIN: {
        if ("layout/activity_login_0".equals(tag)) {
          return new ActivityLoginBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYMAIN: {
        if ("layout/activity_main_0".equals(tag)) {
          return new ActivityMainBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYMAINDRAWER: {
        if ("layout/activity_main_drawer_0".equals(tag)) {
          return new ActivityMainDrawerBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_main_drawer is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYPAYMENTDETAILS: {
        if ("layout/activity_payment_details_0".equals(tag)) {
          return new ActivityPaymentDetailsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_payment_details is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYPHONEVERIFICATION: {
        if ("layout/activity_phone_verification_0".equals(tag)) {
          return new ActivityPhoneVerificationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_phone_verification is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYPROFILESSELECTION: {
        if ("layout/activity_profiles_selection_0".equals(tag)) {
          return new ActivityProfilesSelectionBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_profiles_selection is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYSETTING: {
        if ("layout/activity_setting_0".equals(tag)) {
          return new ActivitySettingBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_setting is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYSIGNUP: {
        if ("layout/activity_signup_0".equals(tag)) {
          return new ActivitySignupBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_signup is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYSPLASH: {
        if ("layout/activity_splash_0".equals(tag)) {
          return new ActivitySplashBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_splash is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMACTIONSPLAYER: {
        if ("layout/bottom_actions_player_0".equals(tag)) {
          return new BottomActionsPlayerBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottom_actions_player is invalid. Received: " + tag);
      }
      case  LAYOUT_BROWSEFRAGMENT: {
        if ("layout/browse_fragment_0".equals(tag)) {
          return new BrowseFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for browse_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_BROWSERADDRESSBAR: {
        if ("layout/browser_address_bar_0".equals(tag)) {
          return new BrowserAddressBarBindingImpl(component, new View[]{view});
        }
        throw new IllegalArgumentException("The tag for browser_address_bar is invalid. Received: " + tag);
      }
      case  LAYOUT_BROWSERCONTEXTMENUDIALOG: {
        if ("layout/browser_context_menu_dialog_0".equals(tag)) {
          return new BrowserContextMenuDialogBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for browser_context_menu_dialog is invalid. Received: " + tag);
      }
      case  LAYOUT_BROWSERPROGRESSBAR: {
        if ("layout/browser_progress_bar_0".equals(tag)) {
          return new BrowserProgressBarBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for browser_progress_bar is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGABOUTNODOWNLOAD: {
        if ("layout/dialog_about_no_download_0".equals(tag)) {
          return new DialogAboutNoDownloadBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_about_no_download is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGABOUTNODOWNLOADEPISODE: {
        if ("layout/dialog_about_no_download_episode_0".equals(tag)) {
          return new DialogAboutNoDownloadEpisodeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_about_no_download_episode is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGABOUTNOSTREAM: {
        if ("layout/dialog_about_no_stream_0".equals(tag)) {
          return new DialogAboutNoStreamBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_about_no_stream is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGABOUTNOSTREAMEPISODE: {
        if ("layout/dialog_about_no_stream_episode_0".equals(tag)) {
          return new DialogAboutNoStreamEpisodeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_about_no_stream_episode is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGADDDOWNLOAD: {
        if ("layout/dialog_add_download_0".equals(tag)) {
          return new DialogAddDownloadBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_add_download is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGCOMMENTS: {
        if ("layout/dialog_comments_0".equals(tag)) {
          return new DialogCommentsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_comments is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGDOWNLOADDETAILS: {
        if ("layout/dialog_download_details_0".equals(tag)) {
          return new DialogDownloadDetailsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_download_details is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGEDITBOOKMARK: {
        if ("layout/dialog_edit_bookmark_0".equals(tag)) {
          return new DialogEditBookmarkBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_edit_bookmark is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGERROR: {
        if ("layout/dialog_error_0".equals(tag)) {
          return new DialogErrorBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_error is invalid. Received: " + tag);
      }
      case  LAYOUT_DOWNLOADACTIVITY: {
        if ("layout/download_activity_0".equals(tag)) {
          return new DownloadActivityBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for download_activity is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTDOWNLOADLIST: {
        if ("layout/fragment_download_list_0".equals(tag)) {
          return new FragmentDownloadListBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_download_list is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTFAVOURITEMOVIES: {
        if ("layout/fragment_favourite_movies_0".equals(tag)) {
          return new FragmentFavouriteMoviesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_favourite_movies is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTHOME: {
        if ("layout/fragment_home_0".equals(tag)) {
          return new FragmentHomeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTSEARCH: {
        if ("layout/fragment_search_0".equals(tag)) {
          return new FragmentSearchBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_search is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTSTREAMING: {
        if ("layout/fragment_streaming_0".equals(tag)) {
          return new FragmentStreamingBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_streaming is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTUPCOMING: {
        if ("layout/fragment_upcoming_0".equals(tag)) {
          return new FragmentUpcomingBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_upcoming is invalid. Received: " + tag);
      }
      case  LAYOUT_INCLUDEDRAWERHEADER: {
        if ("layout/include_drawer_header_0".equals(tag)) {
          return new IncludeDrawerHeaderBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for include_drawer_header is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMANIME: {
        if ("layout/item_anime_0".equals(tag)) {
          return new ItemAnimeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_anime is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMANIMEDETAIL: {
        if ("layout/item_anime_detail_0".equals(tag)) {
          return new ItemAnimeDetailBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_anime_detail is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMBROWSERBOOKMARKSLIST: {
        if ("layout/item_browser_bookmarks_list_0".equals(tag)) {
          return new ItemBrowserBookmarksListBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_browser_bookmarks_list is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMCASTDETAIL: {
        if ("layout/item_cast_detail_0".equals(tag)) {
          return new ItemCastDetailBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_cast_detail is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMCOMMENT: {
        if ("layout/item_comment_0".equals(tag)) {
          return new ItemCommentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_comment is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMDEVICE: {
        if ("layout/item_device_0".equals(tag)) {
          return new ItemDeviceBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_device is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMDOWNLOAD: {
        if ("layout/item_download_0".equals(tag)) {
          return new ItemDownloadBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_download is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMDOWNLOADHOME: {
        if ("layout/item_download_home_0".equals(tag)) {
          return new ItemDownloadHomeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_download_home is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMEPISODESGENRES: {
        if ("layout/item_episodes_genres_0".equals(tag)) {
          return new ItemEpisodesGenresBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_episodes_genres is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMFAV: {
        if ("layout/item_fav_0".equals(tag)) {
          return new ItemFavBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_fav is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMFILMOGRAPHIE: {
        if ("layout/item_filmographie_0".equals(tag)) {
          return new ItemFilmographieBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_filmographie is invalid. Received: " + tag);
      }
    }
    return null;
  }

  private final ViewDataBinding internalGetViewDataBinding1(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_ITEMGENRE: {
        if ("layout/item_genre_0".equals(tag)) {
          return new ItemGenreBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_genre is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMHISTORY: {
        if ("layout/item_history_0".equals(tag)) {
          return new ItemHistoryBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_history is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMLASTESTEPISODES: {
        if ("layout/item_lastest_episodes_0".equals(tag)) {
          return new ItemLastestEpisodesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_lastest_episodes is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMMOVIE: {
        if ("layout/item_movie_0".equals(tag)) {
          return new ItemMovieBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_movie is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMMOVIEDETAIL: {
        if ("layout/item_movie_detail_0".equals(tag)) {
          return new ItemMovieDetailBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_movie_detail is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMNETWORK: {
        if ("layout/item_network_0".equals(tag)) {
          return new ItemNetworkBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_network is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMPINNED: {
        if ("layout/item_pinned_0".equals(tag)) {
          return new ItemPinnedBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_pinned is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMPLANS: {
        if ("layout/item_plans_0".equals(tag)) {
          return new ItemPlansBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_plans is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMPOPULARCASTERS: {
        if ("layout/item_popular_casters_0".equals(tag)) {
          return new ItemPopularCastersBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_popular_casters is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMPROFILE: {
        if ("layout/item_profile_0".equals(tag)) {
          return new ItemProfileBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_profile is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMPROFILES: {
        if ("layout/item_profiles_0".equals(tag)) {
          return new ItemProfilesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_profiles is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMRELATEDS: {
        if ("layout/item_relateds_0".equals(tag)) {
          return new ItemRelatedsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_relateds is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMSHOWSTREAMING: {
        if ("layout/item_show_streaming_0".equals(tag)) {
          return new ItemShowStreamingBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_show_streaming is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMSHOWSTREAMINGHOME: {
        if ("layout/item_show_streaming_home_0".equals(tag)) {
          return new ItemShowStreamingHomeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_show_streaming_home is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMSTREAMDETAIL: {
        if ("layout/item_stream_detail_0".equals(tag)) {
          return new ItemStreamDetailBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_stream_detail is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMSTREAMINGTWOLINES: {
        if ("layout/item_streaming_twolines_0".equals(tag)) {
          return new ItemStreamingTwolinesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_streaming_twolines is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMSUGGEST2: {
        if ("layout/item_suggest2_0".equals(tag)) {
          return new ItemSuggest2BindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_suggest2 is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMTOPTTEN: {
        if ("layout/item_toptten_0".equals(tag)) {
          return new ItemTopttenBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_toptten is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMUPCOMING: {
        if ("layout/item_upcoming_0".equals(tag)) {
          return new ItemUpcomingBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_upcoming is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMUSERDETAIL: {
        if ("layout/item_user_detail_0".equals(tag)) {
          return new ItemUserDetailBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_user_detail is invalid. Received: " + tag);
      }
      case  LAYOUT_LAYOUTDOWNLOADFRAGMENT: {
        if ("layout/layout_download_fragment_0".equals(tag)) {
          return new LayoutDownloadFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for layout_download_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_LAYOUTEPISODENOTIFCATION: {
        if ("layout/layout_episode_notifcation_0".equals(tag)) {
          return new LayoutEpisodeNotifcationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for layout_episode_notifcation is invalid. Received: " + tag);
      }
      case  LAYOUT_LAYOUTEPISODESFRAGMENT: {
        if ("layout/layout_episodes_fragment_0".equals(tag)) {
          return new LayoutEpisodesFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for layout_episodes_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_LAYOUTGENRES: {
        if ("layout/layout_genres_0".equals(tag)) {
          return new LayoutGenresBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for layout_genres is invalid. Received: " + tag);
      }
      case  LAYOUT_LAYOUTNETWORKS: {
        if ("layout/layout_networks_0".equals(tag)) {
          return new LayoutNetworksBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for layout_networks is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTITEMCAST: {
        if ("layout/list_item_cast_0".equals(tag)) {
          return new ListItemCastBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_item_cast is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTITEMDOWNLOAD: {
        if ("layout/list_item_download_0".equals(tag)) {
          return new ListItemDownloadBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_item_download is invalid. Received: " + tag);
      }
      case  LAYOUT_MAINTOOLBAR: {
        if ("layout/main_toolbar_0".equals(tag)) {
          return new MainToolbarBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for main_toolbar is invalid. Received: " + tag);
      }
      case  LAYOUT_MAINTOOLBAROTHERS: {
        if ("layout/main_toolbar_others_0".equals(tag)) {
          return new MainToolbarOthersBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for main_toolbar_others is invalid. Received: " + tag);
      }
      case  LAYOUT_PAYMENTACTIVITY: {
        if ("layout/payment_activity_0".equals(tag)) {
          return new PaymentActivityBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for payment_activity is invalid. Received: " + tag);
      }
      case  LAYOUT_PAYMENTPAYPAL: {
        if ("layout/payment_paypal_0".equals(tag)) {
          return new PaymentPaypalBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for payment_paypal is invalid. Received: " + tag);
      }
      case  LAYOUT_PAYMENTSTRIPE: {
        if ("layout/payment_stripe_0".equals(tag)) {
          return new PaymentStripeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for payment_stripe is invalid. Received: " + tag);
      }
      case  LAYOUT_PAYMENTSUCCESS: {
        if ("layout/payment_success_0".equals(tag)) {
          return new PaymentSuccessBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for payment_success is invalid. Received: " + tag);
      }
      case  LAYOUT_QUEUEROW: {
        if ("layout/queue_row_0".equals(tag)) {
          return new QueueRowBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for queue_row is invalid. Received: " + tag);
      }
      case  LAYOUT_REGISTRATIONSUCESS: {
        if ("layout/registration_sucess_0".equals(tag)) {
          return new RegistrationSucessBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for registration_sucess is invalid. Received: " + tag);
      }
      case  LAYOUT_RIGHTPLAYEREPISODES: {
        if ("layout/right_player_episodes_0".equals(tag)) {
          return new RightPlayerEpisodesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for right_player_episodes is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWDISCOVERSTYLE: {
        if ("layout/row_discover_style_0".equals(tag)) {
          return new RowDiscoverStyleBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_discover_style is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWITEMCATEGORY: {
        if ("layout/row_item_category_0".equals(tag)) {
          return new RowItemCategoryBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_item_category is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWITEMCHOOSED: {
        if ("layout/row_item_choosed_0".equals(tag)) {
          return new RowItemChoosedBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_item_choosed is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWITEMFEATURED: {
        if ("layout/row_item_featured_0".equals(tag)) {
          return new RowItemFeaturedBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_item_featured is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWITEMFEATUREDSTREAMING: {
        if ("layout/row_item_featured_streaming_0".equals(tag)) {
          return new RowItemFeaturedStreamingBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_item_featured_streaming is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWITEMLATESTMOVIESSERIES: {
        if ("layout/row_item_latest_movies_series_0".equals(tag)) {
          return new RowItemLatestMoviesSeriesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_item_latest_movies_series is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWITEMLATESTSERIES: {
        if ("layout/row_item_latest_series_0".equals(tag)) {
          return new RowItemLatestSeriesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_item_latest_series is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWPLAYEREPISODES: {
        if ("layout/row_player_episodes_0".equals(tag)) {
          return new RowPlayerEpisodesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_player_episodes is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWPLAYERLIVETV: {
        if ("layout/row_player_livetv_0".equals(tag)) {
          return new RowPlayerLivetvBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_player_livetv is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWPLAYERMOVIESENDED: {
        if ("layout/row_player_movies_ended_0".equals(tag)) {
          return new RowPlayerMoviesEndedBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_player_movies_ended is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWPLAYERMOVIESLIST: {
        if ("layout/row_player_movies_list_0".equals(tag)) {
          return new RowPlayerMoviesListBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_player_movies_list is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWSEASON3: {
        if ("layout/row_season3_0".equals(tag)) {
          return new RowSeason3BindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_season3 is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWSEASONS: {
        if ("layout/row_seasons_0".equals(tag)) {
          return new RowSeasonsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_seasons is invalid. Received: " + tag);
      }
      case  LAYOUT_ROWSEASONS2: {
        if ("layout/row_seasons2_0".equals(tag)) {
          return new RowSeasons2BindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_seasons2 is invalid. Received: " + tag);
      }
    }
    return null;
  }

  private final ViewDataBinding internalGetViewDataBinding2(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_ROWSUBSTITLE: {
        if ("layout/row_substitle_0".equals(tag)) {
          return new RowSubstitleBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for row_substitle is invalid. Received: " + tag);
      }
      case  LAYOUT_SERIEDETAILS: {
        if ("layout/serie_details_0".equals(tag)) {
          return new SerieDetailsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for serie_details is invalid. Received: " + tag);
      }
      case  LAYOUT_SLIDEEPISODESANIMES: {
        if ("layout/slide_episodes_animes_0".equals(tag)) {
          return new SlideEpisodesAnimesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for slide_episodes_animes is invalid. Received: " + tag);
      }
      case  LAYOUT_UICONTROLLERVIEW: {
        if ("layout/ui_controller_view_0".equals(tag)) {
          return new UiControllerViewBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for ui_controller_view is invalid. Received: " + tag);
      }
      case  LAYOUT_UPCOMINGTITLESOVERVIEW: {
        if ("layout/upcoming_titles_overview_0".equals(tag)) {
          return new UpcomingTitlesOverviewBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for upcoming_titles_overview is invalid. Received: " + tag);
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      // find which method will have it. -1 is necessary becausefirst id starts with 1;
      int methodIndex = (localizedLayoutId - 1) / 50;
      switch(methodIndex) {
        case 0: {
          return internalGetViewDataBinding0(component, view, localizedLayoutId, tag);
        }
        case 1: {
          return internalGetViewDataBinding1(component, view, localizedLayoutId, tag);
        }
        case 2: {
          return internalGetViewDataBinding2(component, view, localizedLayoutId, tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case LAYOUT_BROWSERADDRESSBAR: {
          if("layout/browser_address_bar_0".equals(tag)) {
            return new BrowserAddressBarBindingImpl(component, views);
          }
          throw new IllegalArgumentException("The tag for browser_address_bar is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(3);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new com.tubitv.ui.DataBinderMapperImpl());
    result.add(new com.tubitv.ui.vaud_text_view.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(28);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "checksum");
      sKeys.put(2, "controller");
      sKeys.put(3, "description");
      sKeys.put(4, "detailError");
      sKeys.put(5, "dirName");
      sKeys.put(6, "dirPath");
      sKeys.put(7, "downloadInfo");
      sKeys.put(8, "downloadedBytes");
      sKeys.put(9, "enableSystemManagerButton");
      sKeys.put(10, "fileName");
      sKeys.put(11, "md5Hash");
      sKeys.put(12, "md5State");
      sKeys.put(13, "mediaId");
      sKeys.put(14, "mediaName");
      sKeys.put(15, "mediabackdrop");
      sKeys.put(16, "numPieces");
      sKeys.put(17, "referer");
      sKeys.put(18, "replaceFile");
      sKeys.put(19, "retry");
      sKeys.put(20, "sha256Hash");
      sKeys.put(21, "sha256State");
      sKeys.put(22, "storageFreeSpace");
      sKeys.put(23, "totalBytes");
      sKeys.put(24, "type");
      sKeys.put(25, "unmeteredConnectionsOnly");
      sKeys.put(26, "url");
      sKeys.put(27, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(105);

    static {
      sKeys.put("layout/activity_browser_bookmarks_0", com.easyplex.R.layout.activity_browser_bookmarks);
      sKeys.put("layout/activity_browser_bottom_app_bar_0", com.easyplex.R.layout.activity_browser_bottom_app_bar);
      sKeys.put("layout/activity_browser_top_app_bar_0", com.easyplex.R.layout.activity_browser_top_app_bar);
      sKeys.put("layout/activity_devices_management_0", com.easyplex.R.layout.activity_devices_management);
      sKeys.put("layout/activity_easyplex_player_0", com.easyplex.R.layout.activity_easyplex_player);
      sKeys.put("layout/activity_edit_profile_0", com.easyplex.R.layout.activity_edit_profile);
      sKeys.put("layout/activity_embed_0", com.easyplex.R.layout.activity_embed);
      sKeys.put("layout/activity_filemanager_dialog_0", com.easyplex.R.layout.activity_filemanager_dialog);
      sKeys.put("layout/activity_login_0", com.easyplex.R.layout.activity_login);
      sKeys.put("layout/activity_main_0", com.easyplex.R.layout.activity_main);
      sKeys.put("layout/activity_main_drawer_0", com.easyplex.R.layout.activity_main_drawer);
      sKeys.put("layout/activity_payment_details_0", com.easyplex.R.layout.activity_payment_details);
      sKeys.put("layout/activity_phone_verification_0", com.easyplex.R.layout.activity_phone_verification);
      sKeys.put("layout/activity_profiles_selection_0", com.easyplex.R.layout.activity_profiles_selection);
      sKeys.put("layout/activity_setting_0", com.easyplex.R.layout.activity_setting);
      sKeys.put("layout/activity_signup_0", com.easyplex.R.layout.activity_signup);
      sKeys.put("layout/activity_splash_0", com.easyplex.R.layout.activity_splash);
      sKeys.put("layout/bottom_actions_player_0", com.easyplex.R.layout.bottom_actions_player);
      sKeys.put("layout/browse_fragment_0", com.easyplex.R.layout.browse_fragment);
      sKeys.put("layout/browser_address_bar_0", com.easyplex.R.layout.browser_address_bar);
      sKeys.put("layout/browser_context_menu_dialog_0", com.easyplex.R.layout.browser_context_menu_dialog);
      sKeys.put("layout/browser_progress_bar_0", com.easyplex.R.layout.browser_progress_bar);
      sKeys.put("layout/dialog_about_no_download_0", com.easyplex.R.layout.dialog_about_no_download);
      sKeys.put("layout/dialog_about_no_download_episode_0", com.easyplex.R.layout.dialog_about_no_download_episode);
      sKeys.put("layout/dialog_about_no_stream_0", com.easyplex.R.layout.dialog_about_no_stream);
      sKeys.put("layout/dialog_about_no_stream_episode_0", com.easyplex.R.layout.dialog_about_no_stream_episode);
      sKeys.put("layout/dialog_add_download_0", com.easyplex.R.layout.dialog_add_download);
      sKeys.put("layout/dialog_comments_0", com.easyplex.R.layout.dialog_comments);
      sKeys.put("layout/dialog_download_details_0", com.easyplex.R.layout.dialog_download_details);
      sKeys.put("layout/dialog_edit_bookmark_0", com.easyplex.R.layout.dialog_edit_bookmark);
      sKeys.put("layout/dialog_error_0", com.easyplex.R.layout.dialog_error);
      sKeys.put("layout/download_activity_0", com.easyplex.R.layout.download_activity);
      sKeys.put("layout/fragment_download_list_0", com.easyplex.R.layout.fragment_download_list);
      sKeys.put("layout/fragment_favourite_movies_0", com.easyplex.R.layout.fragment_favourite_movies);
      sKeys.put("layout/fragment_home_0", com.easyplex.R.layout.fragment_home);
      sKeys.put("layout/fragment_search_0", com.easyplex.R.layout.fragment_search);
      sKeys.put("layout/fragment_streaming_0", com.easyplex.R.layout.fragment_streaming);
      sKeys.put("layout/fragment_upcoming_0", com.easyplex.R.layout.fragment_upcoming);
      sKeys.put("layout/include_drawer_header_0", com.easyplex.R.layout.include_drawer_header);
      sKeys.put("layout/item_anime_0", com.easyplex.R.layout.item_anime);
      sKeys.put("layout/item_anime_detail_0", com.easyplex.R.layout.item_anime_detail);
      sKeys.put("layout/item_browser_bookmarks_list_0", com.easyplex.R.layout.item_browser_bookmarks_list);
      sKeys.put("layout/item_cast_detail_0", com.easyplex.R.layout.item_cast_detail);
      sKeys.put("layout/item_comment_0", com.easyplex.R.layout.item_comment);
      sKeys.put("layout/item_device_0", com.easyplex.R.layout.item_device);
      sKeys.put("layout/item_download_0", com.easyplex.R.layout.item_download);
      sKeys.put("layout/item_download_home_0", com.easyplex.R.layout.item_download_home);
      sKeys.put("layout/item_episodes_genres_0", com.easyplex.R.layout.item_episodes_genres);
      sKeys.put("layout/item_fav_0", com.easyplex.R.layout.item_fav);
      sKeys.put("layout/item_filmographie_0", com.easyplex.R.layout.item_filmographie);
      sKeys.put("layout/item_genre_0", com.easyplex.R.layout.item_genre);
      sKeys.put("layout/item_history_0", com.easyplex.R.layout.item_history);
      sKeys.put("layout/item_lastest_episodes_0", com.easyplex.R.layout.item_lastest_episodes);
      sKeys.put("layout/item_movie_0", com.easyplex.R.layout.item_movie);
      sKeys.put("layout/item_movie_detail_0", com.easyplex.R.layout.item_movie_detail);
      sKeys.put("layout/item_network_0", com.easyplex.R.layout.item_network);
      sKeys.put("layout/item_pinned_0", com.easyplex.R.layout.item_pinned);
      sKeys.put("layout/item_plans_0", com.easyplex.R.layout.item_plans);
      sKeys.put("layout/item_popular_casters_0", com.easyplex.R.layout.item_popular_casters);
      sKeys.put("layout/item_profile_0", com.easyplex.R.layout.item_profile);
      sKeys.put("layout/item_profiles_0", com.easyplex.R.layout.item_profiles);
      sKeys.put("layout/item_relateds_0", com.easyplex.R.layout.item_relateds);
      sKeys.put("layout/item_show_streaming_0", com.easyplex.R.layout.item_show_streaming);
      sKeys.put("layout/item_show_streaming_home_0", com.easyplex.R.layout.item_show_streaming_home);
      sKeys.put("layout/item_stream_detail_0", com.easyplex.R.layout.item_stream_detail);
      sKeys.put("layout/item_streaming_twolines_0", com.easyplex.R.layout.item_streaming_twolines);
      sKeys.put("layout/item_suggest2_0", com.easyplex.R.layout.item_suggest2);
      sKeys.put("layout/item_toptten_0", com.easyplex.R.layout.item_toptten);
      sKeys.put("layout/item_upcoming_0", com.easyplex.R.layout.item_upcoming);
      sKeys.put("layout/item_user_detail_0", com.easyplex.R.layout.item_user_detail);
      sKeys.put("layout/layout_download_fragment_0", com.easyplex.R.layout.layout_download_fragment);
      sKeys.put("layout/layout_episode_notifcation_0", com.easyplex.R.layout.layout_episode_notifcation);
      sKeys.put("layout/layout_episodes_fragment_0", com.easyplex.R.layout.layout_episodes_fragment);
      sKeys.put("layout/layout_genres_0", com.easyplex.R.layout.layout_genres);
      sKeys.put("layout/layout_networks_0", com.easyplex.R.layout.layout_networks);
      sKeys.put("layout/list_item_cast_0", com.easyplex.R.layout.list_item_cast);
      sKeys.put("layout/list_item_download_0", com.easyplex.R.layout.list_item_download);
      sKeys.put("layout/main_toolbar_0", com.easyplex.R.layout.main_toolbar);
      sKeys.put("layout/main_toolbar_others_0", com.easyplex.R.layout.main_toolbar_others);
      sKeys.put("layout/payment_activity_0", com.easyplex.R.layout.payment_activity);
      sKeys.put("layout/payment_paypal_0", com.easyplex.R.layout.payment_paypal);
      sKeys.put("layout/payment_stripe_0", com.easyplex.R.layout.payment_stripe);
      sKeys.put("layout/payment_success_0", com.easyplex.R.layout.payment_success);
      sKeys.put("layout/queue_row_0", com.easyplex.R.layout.queue_row);
      sKeys.put("layout/registration_sucess_0", com.easyplex.R.layout.registration_sucess);
      sKeys.put("layout/right_player_episodes_0", com.easyplex.R.layout.right_player_episodes);
      sKeys.put("layout/row_discover_style_0", com.easyplex.R.layout.row_discover_style);
      sKeys.put("layout/row_item_category_0", com.easyplex.R.layout.row_item_category);
      sKeys.put("layout/row_item_choosed_0", com.easyplex.R.layout.row_item_choosed);
      sKeys.put("layout/row_item_featured_0", com.easyplex.R.layout.row_item_featured);
      sKeys.put("layout/row_item_featured_streaming_0", com.easyplex.R.layout.row_item_featured_streaming);
      sKeys.put("layout/row_item_latest_movies_series_0", com.easyplex.R.layout.row_item_latest_movies_series);
      sKeys.put("layout/row_item_latest_series_0", com.easyplex.R.layout.row_item_latest_series);
      sKeys.put("layout/row_player_episodes_0", com.easyplex.R.layout.row_player_episodes);
      sKeys.put("layout/row_player_livetv_0", com.easyplex.R.layout.row_player_livetv);
      sKeys.put("layout/row_player_movies_ended_0", com.easyplex.R.layout.row_player_movies_ended);
      sKeys.put("layout/row_player_movies_list_0", com.easyplex.R.layout.row_player_movies_list);
      sKeys.put("layout/row_season3_0", com.easyplex.R.layout.row_season3);
      sKeys.put("layout/row_seasons_0", com.easyplex.R.layout.row_seasons);
      sKeys.put("layout/row_seasons2_0", com.easyplex.R.layout.row_seasons2);
      sKeys.put("layout/row_substitle_0", com.easyplex.R.layout.row_substitle);
      sKeys.put("layout/serie_details_0", com.easyplex.R.layout.serie_details);
      sKeys.put("layout/slide_episodes_animes_0", com.easyplex.R.layout.slide_episodes_animes);
      sKeys.put("layout/ui_controller_view_0", com.easyplex.R.layout.ui_controller_view);
      sKeys.put("layout/upcoming_titles_overview_0", com.easyplex.R.layout.upcoming_titles_overview);
    }
  }
}
