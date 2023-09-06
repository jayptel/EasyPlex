package com.easyplex.ui.viewmodels;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import androidx.paging.LivePagedListBuilder;
import androidx.paging.PagedList;
import com.easyplex.data.datasource.networks.NetworksListDataSourceFactory;
import com.easyplex.data.datasource.stream.StreamDataSource;
import com.easyplex.data.local.entity.Media;
import com.easyplex.data.model.genres.GenresByID;
import com.easyplex.data.repository.MediaRepository;

import javax.inject.Inject;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import timber.log.Timber;

/**
 * ViewModel to cache, retrieve data for Networks
 *
 * @author Yobex.
 */
public class NetworksViewModel extends ViewModel {

    private final MediaRepository mediaRepository;
    private final CompositeDisposable compositeDisposable = new CompositeDisposable();
    public final MutableLiveData<GenresByID> networkMutableLiveData = new MutableLiveData<>();
    public final MutableLiveData<GenresByID> networkLibMutableLiveData = new MutableLiveData<>();

    public final MutableLiveData<String> searchQuery = new MutableLiveData<>();


    @Inject
    NetworksViewModel(MediaRepository mediaRepository) {
        this.mediaRepository = mediaRepository;

    }


    // Fetch Networks List
    public void getNetworks() {

        compositeDisposable.add(mediaRepository.getNetworks()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .cache()
                .subscribe(networkMutableLiveData::postValue, this::handleError)
        );
    }


    // Fetch Networks List
    public void getNetworksLib() {

        compositeDisposable.add(mediaRepository.getNetworksLib()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .cache()
                .subscribe(networkLibMutableLiveData::postValue, this::handleError)
        );
    }


    // Handle Errors
    private void handleError(Throwable e) {
        Timber.i(
                "In onError()%s", e.getMessage());
    }


    final PagedList.Config config =
            (new PagedList.Config.Builder())
                    .setEnablePlaceholders(false)
                    .setPageSize(StreamDataSource.PAGE_SIZE)
                    .setPrefetchDistance(StreamDataSource.PAGE_SIZE)
                    .setInitialLoadSizeHint(StreamDataSource.PAGE_SIZE)
                    .build();

    public LiveData<PagedList<Media>> getGenresitemPagedList() {
        return Transformations.switchMap(searchQuery, query -> {
            NetworksListDataSourceFactory factory = mediaRepository.networksListDataSourceFactory(query);
            return new LivePagedListBuilder<>(factory, config).build();
        });
    }



    @Override
    protected void onCleared() {
        super.onCleared();
        compositeDisposable.clear();
    }
}
