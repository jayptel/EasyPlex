package com.easyplex.data.datasource.genreslist;

import androidx.annotation.NonNull;
import androidx.paging.PageKeyedDataSource;

import com.easyplex.data.local.entity.Media;
import com.easyplex.data.model.genres.GenresData;
import com.easyplex.data.remote.ApiInterface;
import com.easyplex.data.remote.ServiceGenerator;
import com.easyplex.ui.manager.SettingsManager;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MoviesGenreListDataSource extends PageKeyedDataSource<Integer, Media> {

    private final String genreId;

    private final SettingsManager settingsManager;

    public MoviesGenreListDataSource(String genreId,SettingsManager settingsManager){

        this.settingsManager = settingsManager;
        this.genreId = genreId;


    }

    public static final int PAGE_SIZE = 12;
    private static final int FIRST_PAGE = 1;



    @Override
    public void loadInitial(@NonNull LoadInitialParams<Integer> params, @NonNull LoadInitialCallback<Integer, Media> callback) {

        ApiInterface apiInterface = ServiceGenerator.createService(ApiInterface.class);


        if (genreId.equals("allgenres") || genreId.equals("latestadded") || genreId.equals("byrating") || genreId.equals("byyear") || genreId.equals("byviews")){

            Call<GenresData> call = apiInterface.getMediaByGenreSeletedType(genreId,settingsManager.getSettings().getApiKey(),FIRST_PAGE);
            call.enqueue(new Callback<>() {

                @Override
                public void onResponse(@NotNull Call<GenresData> call, @NotNull Response<GenresData> response) {


                    if (response.isSuccessful()) {

                        callback.onResult(response.body().getGlobaldata(), null, FIRST_PAGE + 1);


                    }
                }

                @Override
                public void onFailure(@NotNull Call<GenresData> call, @NotNull Throwable t) {

                    //

                }
            });



        }else {



            Call<GenresData> call = apiInterface.getMediaByGenreId(genreId,settingsManager.getSettings().getApiKey(),FIRST_PAGE);
            call.enqueue(new Callback<>() {

                @Override
                public void onResponse(@NotNull Call<GenresData> call, @NotNull Response<GenresData> response) {


                    if (response.isSuccessful()) {

                        callback.onResult(response.body().getGlobaldata(), null, FIRST_PAGE + 1);


                    }
                }

                @Override
                public void onFailure(@NotNull Call<GenresData> call, @NotNull Throwable t) {

                    //

                }
            });


        }



    }

    public void loadBefore(@NonNull LoadParams<Integer> params, @NonNull LoadCallback<Integer, Media> callback) {


        ApiInterface apiInterface = ServiceGenerator.createService(ApiInterface.class);



        if (genreId.equals("allgenres") || genreId.equals("latestadded") || genreId.equals("byrating") || genreId.equals("byyear") || genreId.equals("byviews")){



            Call<GenresData> call = apiInterface.getMediaByGenreSeletedType(genreId,settingsManager.getSettings().getApiKey(),params.key);
            call.enqueue(new Callback<>() {

                @Override
                public void onResponse(@NotNull Call<GenresData> call, @NotNull Response<GenresData> response) {


                    if (response.isSuccessful()) {

                        Integer key = (params.key > 1) ? params.key - 1 : null;
                        callback.onResult(response.body().getGlobaldata(), key);


                    }
                }

                @Override
                public void onFailure(@NotNull Call<GenresData> call, @NotNull Throwable t) {

                    //
                }
            });


        }else {



            Call<GenresData> call = apiInterface.getMediaByGenreId(genreId,settingsManager.getSettings().getApiKey(),params.key);
            call.enqueue(new Callback<>() {

                @Override
                public void onResponse(@NotNull Call<GenresData> call, @NotNull Response<GenresData> response) {


                    if (response.isSuccessful()) {

                        Integer key = (params.key > 1) ? params.key - 1 : null;
                        callback.onResult(response.body().getGlobaldata(), key);


                    }
                }

                @Override
                public void onFailure(@NotNull Call<GenresData> call, @NotNull Throwable t) {

                    //
                }
            });

        }





    }

    @Override
    public void loadAfter(@NonNull LoadParams<Integer> params, @NonNull LoadCallback<Integer, Media> callback) {

        ApiInterface apiInterface = ServiceGenerator.createService(ApiInterface.class);


        if (genreId.equals("allgenres") || genreId.equals("latestadded") || genreId.equals("byrating") || genreId.equals("byyear") || genreId.equals("byviews")){

            Call<GenresData> call = apiInterface.getMediaByGenreSeletedType(genreId,settingsManager.getSettings().getApiKey(),params.key);
            call.enqueue(new Callback<>() {

                @Override
                public void onResponse(@NotNull Call<GenresData> call, @NotNull Response<GenresData> response) {


                    if (response.isSuccessful()) {

                        callback.onResult(response.body().getGlobaldata(), params.key + 1);


                    }
                }

                @Override
                public void onFailure(@NotNull Call<GenresData> call, @NotNull Throwable t) {
                    //
                }
            });


        }else {


            Call<GenresData> call = apiInterface.getMediaByGenreId(genreId,settingsManager.getSettings().getApiKey(),params.key);
            call.enqueue(new Callback<>() {

                @Override
                public void onResponse(@NotNull Call<GenresData> call, @NotNull Response<GenresData> response) {


                    if (response.isSuccessful()) {

                        callback.onResult(response.body().getGlobaldata(), params.key + 1);


                    }
                }

                @Override
                public void onFailure(@NotNull Call<GenresData> call, @NotNull Throwable t) {
                    //
                }
            });

        }





    }

}