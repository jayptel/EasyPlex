package com.easyplex.ui.mylist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import com.easyplex.R;
import com.easyplex.data.repository.AuthRepository;
import com.easyplex.data.repository.MediaRepository;
import com.easyplex.databinding.FragmentFavouriteMoviesBinding;
import com.easyplex.di.Injectable;
import com.easyplex.ui.manager.SettingsManager;
import com.easyplex.ui.manager.TokenManager;
import com.easyplex.ui.viewmodels.LoginViewModel;
import com.easyplex.ui.viewmodels.MoviesListViewModel;
import com.easyplex.util.SpacingItemDecoration;
import com.easyplex.util.Tools;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;


public class MoviesListFragment extends Fragment implements Injectable , DeleteFavoriteDetectListner {


    @Inject
    ViewModelProvider.Factory viewModelFactory;


    FragmentFavouriteMoviesBinding binding;


    @Inject
    AuthRepository authRepository;

    @Inject
    MediaRepository mediaRepository;


    @Inject
    SettingsManager settingsManager;

    @Inject
    TokenManager tokenManager;

    private LoginViewModel loginViewModel;

    @Inject
    MoviesListViewModel moviesListViewModel;

    private  MoviesMyListAdapter moviesMyListAdapter;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }


    @Nullable
    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_favourite_movies, container, false);

        // ViewModel to cache, retrieve data for MyListFragment
        moviesListViewModel = new ViewModelProvider(requireActivity(), viewModelFactory).get(MoviesListViewModel.class);

        loginViewModel = new ViewModelProvider(this, viewModelFactory).get(LoginViewModel.class);

        moviesMyListAdapter = new MoviesMyListAdapter(mediaRepository,settingsManager,authRepository,tokenManager);

        onLoadListData();

        binding.rvMylist.setLayoutManager(new GridLayoutManager(getActivity(), 4));
        binding.rvMylist.addItemDecoration(new SpacingItemDecoration(1, Tools.dpToPx(requireActivity(), 0), true));
        binding.rvMylist.setHasFixedSize(true);

        return  binding.getRoot();

    }

    private void onLoadListData() {

        if (settingsManager.getSettings().getFavoriteonline() == 1 && tokenManager.getToken().getAccessToken() !=null ) {

            onLoadMoviesListOnline();

        } else {

            onLoadMoviesListOffline();
        }
    }

    private void onLoadMoviesListOnline() {

        loginViewModel.getAuthDetails();
        loginViewModel.authDetailMutableLiveData.observe(getViewLifecycleOwner(), auth -> {

            moviesMyListAdapter.addToContent(auth.getFavoritesMovies(),requireActivity(),this);
            binding.rvMylist.setAdapter(moviesMyListAdapter);
            binding.rvMylist.setEmptyView(binding.noResults);

        });


    }


    private void onLoadMoviesListOffline() {

        moviesListViewModel.getMoviesFavorites().observe(getViewLifecycleOwner(), favoriteMovies -> {

            moviesMyListAdapter.addToContent(favoriteMovies,requireActivity(),this);
            binding.rvMylist.setAdapter(moviesMyListAdapter);
            binding.rvMylist.setEmptyView(binding.noResults);

        });
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding.rvMylist.setAdapter(null);
        binding =null;
    }

    @Override
    public void onResume() {
        super.onResume();
        onLoadListData();
    }

    @Override
    public void onMediaDeletedSuccess(boolean clicked) {

        if (clicked) {
            onLoadListData();

        }
    }
}
