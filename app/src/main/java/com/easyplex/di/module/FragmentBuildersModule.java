package com.easyplex.di.module;

import com.easyplex.ui.animes.EpisodesFragment;
import com.easyplex.ui.downloadmanager.ui.main.DownloadsFragment;
import com.easyplex.ui.downloadmanager.ui.main.FinishedDownloadsFragment;
import com.easyplex.ui.downloadmanager.ui.main.QueuedDownloadsFragment;
import com.easyplex.ui.home.HomeFragment;
import com.easyplex.ui.library.AnimesFragment;
import com.easyplex.ui.library.LibraryFragment;
import com.easyplex.ui.library.LibraryStyleFragment;
import com.easyplex.ui.library.MoviesFragment;
import com.easyplex.ui.library.NetworksFragment;
import com.easyplex.ui.library.NetworksFragment2;
import com.easyplex.ui.library.SeriesFragment;
import com.easyplex.ui.mylist.AnimesListFragment;
import com.easyplex.ui.mylist.ListFragment;
import com.easyplex.ui.mylist.MoviesListFragment;
import com.easyplex.ui.mylist.SeriesListFragment;
import com.easyplex.ui.mylist.StreamingListFragment;
import com.easyplex.ui.search.DiscoverFragment;
import com.easyplex.ui.settings.SettingsActivity;
import com.easyplex.ui.streaming.StreamingFragment;
import com.easyplex.ui.upcoming.UpComingFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/*
 * @author Yobex.
 * */
@Module
public abstract class FragmentBuildersModule {


    @ContributesAndroidInjector
    abstract EpisodesFragment contributeEpisodesFragment();

    @ContributesAndroidInjector
    abstract FinishedDownloadsFragment contributeFinishedDownloadsFragment();


    @ContributesAndroidInjector
    abstract QueuedDownloadsFragment contributeQueuedDownloadsFragment();

    @ContributesAndroidInjector
    abstract DownloadsFragment contributeDownloadsFragment();

    @ContributesAndroidInjector
    abstract HomeFragment contributeHomeFragment();

    @ContributesAndroidInjector
    abstract UpComingFragment contributeUpcomingFragment();

    @ContributesAndroidInjector
    abstract DiscoverFragment contributeDiscoverFragment();

    @ContributesAndroidInjector
    abstract MoviesFragment contributeMoviesFragment();


    @ContributesAndroidInjector
    abstract LibraryStyleFragment contributeLibraryStyleFragment();

    @ContributesAndroidInjector
    abstract SeriesFragment contributeSeriesFragment();

    @ContributesAndroidInjector
    abstract LibraryFragment contributeLibraryFragment();

    @ContributesAndroidInjector
    abstract MoviesListFragment contributeMyListMoviesFragment();

    @ContributesAndroidInjector
    abstract AnimesFragment contributeAnimesFragment();

    @ContributesAndroidInjector
    abstract StreamingFragment contributeLiveFragment();

    @ContributesAndroidInjector
    abstract SettingsActivity contributeSettingsFragment();

    @ContributesAndroidInjector
    abstract ListFragment contributeListFragment();

    @ContributesAndroidInjector
    abstract SeriesListFragment contributeSeriesListFragment();

    @ContributesAndroidInjector
    abstract AnimesListFragment contributeAnimesListFragment();


    @ContributesAndroidInjector
    abstract NetworksFragment contributeNetworksFragment();

    @ContributesAndroidInjector
    abstract NetworksFragment2 contributeNetworksFragment2();

    @ContributesAndroidInjector
    abstract StreamingListFragment contributeStreamingListFragment();

}
