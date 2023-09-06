package com.easyplex.data.repository;

import com.easyplex.data.model.MovieResponse;
import com.easyplex.data.model.media.StatusFav;
import com.easyplex.data.model.settings.Decrypter;
import com.easyplex.data.model.status.Status;
import com.easyplex.data.model.substitles.ImdbLangs;
import com.easyplex.data.remote.ApiInterface;
import com.easyplex.data.model.ads.Ads;
import com.easyplex.data.model.settings.Settings;
import com.easyplex.ui.manager.SettingsManager;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import io.reactivex.rxjava3.core.Observable;

/**
 * Class that requests authentication and user information from the remote data source and
 * maintains an in-memory cache of login status and user credentials information.
 */
public class SettingsRepository {



    @Inject
    ApiInterface apiInterface;


    @Inject
    SettingsManager settingsManager;


    @Inject
    @Named("status")
    ApiInterface requestStatusApi;

    // Return Imdb Api from Api Interfae ( https://api.themoviedb.org/3/ )
    @Inject
    @Named("imdb")
    ApiInterface requestImdbApi;


    @Inject
    SettingsRepository(ApiInterface apiInterface) {
        this.apiInterface = apiInterface;

    }



    // Return Casts Lists for  Movie
    public Observable<List<ImdbLangs>> getLangsFromImdb() {
        return requestImdbApi.getLangsFromImdb(settingsManager.getSettings().getTmdbApiKey());

    }


    // Return List of Added Ads for the Player
    public Observable<Ads> getAdsSettings() {
        return apiInterface.getAdsSettings();
    }



    // Return App Settings
    public Observable<Settings> getSettings() {
        return apiInterface.getSettings(settingsManager.getSettings().getApiKey());
    }


    public Observable<Settings> getInstalls() {
        return apiInterface.getInstall();
    }



    public Observable<StatusFav> getAppPasswordCheck(String password) {
        return apiInterface.getAppPasswordCheck(password);
    }



    public Observable<Decrypter> getDecrypter() {
        return apiInterface.getDecrypter(settingsManager.getSettings().getApiKey());
    }


    // Return Status
    public Observable<Status> getStatus() {
        return apiInterface.getStatus();
    }


    // Return Status
    public Observable<Status> getApiStatus(String key) {
        return requestStatusApi.getApiStatus(key);
    }



    public Observable<Status> getApp(String key) {
        return requestStatusApi.getApp(key);
    }


    public Observable<MovieResponse> getPlans() {
        return apiInterface.getPlans(settingsManager.getSettings().getApiKey());
    }



}

