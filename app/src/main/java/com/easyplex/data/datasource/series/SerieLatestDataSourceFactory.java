package com.easyplex.data.datasource.series;

import androidx.lifecycle.MutableLiveData;
import androidx.paging.DataSource;
import androidx.paging.PageKeyedDataSource;

import com.easyplex.data.local.entity.Media;
import com.easyplex.data.remote.ApiInterface;
import com.easyplex.ui.manager.SettingsManager;

import javax.inject.Inject;

public class SerieLatestDataSourceFactory extends DataSource.Factory {

    private final MutableLiveData<PageKeyedDataSource<Integer, Media>> serieLiveDataSource = new MutableLiveData<>();

    private final ApiInterface requestInterface;
    private final SettingsManager settingsManager;


    @Inject
    public SerieLatestDataSourceFactory(ApiInterface requestInterface, SettingsManager settingsManager) {
        this.requestInterface = requestInterface;
        this.settingsManager = settingsManager;
    }

    @Override
    public DataSource create() {

        SerieLatestDataSource serieDataSource = new SerieLatestDataSource(requestInterface,settingsManager);
        serieLiveDataSource.postValue(serieDataSource);

        return serieDataSource;

    }

    public MutableLiveData<PageKeyedDataSource<Integer, Media>> getItemLiveDataSource() {
        return serieLiveDataSource;
    }

}
