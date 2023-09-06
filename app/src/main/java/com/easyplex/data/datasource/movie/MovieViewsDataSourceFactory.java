package com.easyplex.data.datasource.movie;

import androidx.lifecycle.MutableLiveData;
import androidx.paging.DataSource;
import androidx.paging.PageKeyedDataSource;

import com.easyplex.data.local.entity.Media;
import com.easyplex.data.remote.ApiInterface;
import com.easyplex.ui.manager.SettingsManager;

import javax.inject.Inject;

public class MovieViewsDataSourceFactory extends DataSource.Factory {

    private final MutableLiveData<PageKeyedDataSource<Integer, Media>> itemLiveDataSource = new MutableLiveData<>();

    private final ApiInterface requestInterface;
    private final SettingsManager settingsManager;


    @Inject
    public MovieViewsDataSourceFactory(ApiInterface requestInterface,SettingsManager settingsManager) {
        this.requestInterface = requestInterface;
        this.settingsManager = settingsManager;
    }

    @Override
    public DataSource create() {

        MovieViewDataSource movieViewDataSource = new MovieViewDataSource(requestInterface,settingsManager);
        itemLiveDataSource.postValue(movieViewDataSource);


        return movieViewDataSource;

    }

    public MutableLiveData<PageKeyedDataSource<Integer, Media>> getItemLiveDataSource() {
        return itemLiveDataSource;
    }
}
