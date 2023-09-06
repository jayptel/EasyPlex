package com.easyplex.data.datasource.medialibrary;

import androidx.annotation.NonNull;
import androidx.paging.DataSource;

import com.easyplex.data.datasource.genreslist.MoviesGenreListDataSource;
import com.easyplex.data.local.entity.Media;
import com.easyplex.ui.manager.SettingsManager;

public class MediaLibraryDataSourceFactory extends DataSource.Factory {

    private final String query;

    private final SettingsManager settingsManager;

    public MediaLibraryDataSourceFactory(String query,SettingsManager settingsManager) {
        this.settingsManager = settingsManager;
        this.query = query;

    }

    @NonNull
    @Override
    public DataSource<Integer, Media> create() {
        return new MoviesGenreListDataSource(query, settingsManager);
    }

}
