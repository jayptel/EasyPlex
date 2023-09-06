package com.easyplex.data.datasource.genreslist;

import androidx.annotation.NonNull;
import androidx.paging.PageKeyedDataSource;

import com.easyplex.data.model.episode.EpisodesByGenre;
import com.easyplex.data.model.episode.LatestEpisodes;
import com.easyplex.data.remote.ApiInterface;
import com.easyplex.data.remote.ServiceGenerator;
import com.easyplex.ui.manager.SettingsManager;

import org.jetbrains.annotations.NotNull;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class ByEpisodeDataSource extends PageKeyedDataSource<Integer, LatestEpisodes> {

    private final String genreId;
    private final SettingsManager settingsManager;


    public ByEpisodeDataSource(String genreId,SettingsManager settingsManager){

        this.settingsManager = settingsManager;
        this.genreId = genreId;

    }

    public static final int PAGE_SIZE = 12;
    private static final int FIRST_PAGE = 1;



    @Override
    public void loadInitial(@NonNull LoadInitialParams<Integer> params, @NonNull LoadInitialCallback<Integer, LatestEpisodes> callback) {

        ApiInterface apiInterface = ServiceGenerator.createService(ApiInterface.class);
        Call<EpisodesByGenre> call = apiInterface.getLastestEpisodes(genreId,settingsManager.getSettings().getApiKey(),FIRST_PAGE);
        call.enqueue(new Callback<EpisodesByGenre>() {

            @Override
            public void onResponse(@NotNull Call<EpisodesByGenre> call, @NotNull Response<EpisodesByGenre> response) {


                if (response.isSuccessful()) {

                    callback.onResult(response.body().getGlobaldata(), null, FIRST_PAGE+1);


                }
            }

            @Override
            public void onFailure(@NotNull Call<EpisodesByGenre> call, @NotNull Throwable t) {

                //
            }
        });

    }

    public void loadBefore(@NonNull LoadParams<Integer> params, @NonNull LoadCallback<Integer, LatestEpisodes> callback) {


        ApiInterface apiInterface = ServiceGenerator.createService(ApiInterface.class);
        Call<EpisodesByGenre> call = apiInterface.getLastestEpisodes(genreId,settingsManager.getSettings().getApiKey(),params.key);
        call.enqueue(new Callback<EpisodesByGenre>() {

            @Override
            public void onResponse(@NotNull Call<EpisodesByGenre> call, @NotNull Response<EpisodesByGenre> response) {


                if (response.isSuccessful()) {

                    Integer key = (params.key > 1) ? params.key - 1 : null;
                    callback.onResult(response.body().getGlobaldata(), key);


                }
            }

            @Override
            public void onFailure(@NotNull Call<EpisodesByGenre> call, @NotNull Throwable t) {
                //
            }
        });


    }

    @Override
    public void loadAfter(@NonNull LoadParams<Integer> params, @NonNull LoadCallback<Integer, LatestEpisodes> callback) {

        ApiInterface apiInterface = ServiceGenerator.createService(ApiInterface.class);

        Call<EpisodesByGenre> call = apiInterface.getLastestEpisodes(genreId,settingsManager.getSettings().getApiKey(),params.key);
        call.enqueue(new Callback<EpisodesByGenre>() {

            @Override
            public void onResponse(@NotNull Call<EpisodesByGenre> call, @NotNull Response<EpisodesByGenre> response) {


                if (response.isSuccessful()) {

                    callback.onResult(response.body().getGlobaldata(), params.key + 1);


                }
            }

            @Override
            public void onFailure(@NotNull Call<EpisodesByGenre> call, @NotNull Throwable t) {
                //
            }
        });


    }

}