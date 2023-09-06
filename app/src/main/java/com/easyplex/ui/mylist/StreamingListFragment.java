package com.easyplex.ui.mylist;

import android.annotation.SuppressLint;
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
import com.easyplex.ui.viewmodels.StreamingDetailViewModel;
import com.easyplex.util.SpacingItemDecoration;
import com.easyplex.util.Tools;
import org.jetbrains.annotations.NotNull;
import javax.inject.Inject;


public class StreamingListFragment extends Fragment implements Injectable , DeleteFavoriteDetectListner {


    @Inject
    ViewModelProvider.Factory viewModelFactory;

    private StreamMyListdapter streamMyListdapter;

    private StreamOnlineMyListdapter streamOnlineMyListdapter;

    private StreamingDetailViewModel streamingDetailViewModel;

    private LoginViewModel loginViewModel;

    FragmentFavouriteMoviesBinding binding;

    @Inject
    MediaRepository mediaRepository;

    @Inject
    SettingsManager settingsManager;



    @Inject
    AuthRepository authRepository;

    @Inject
    TokenManager tokenManager;


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
        streamingDetailViewModel = new ViewModelProvider(this, viewModelFactory).get(StreamingDetailViewModel.class);

        loginViewModel = new ViewModelProvider(this, viewModelFactory).get(LoginViewModel.class);

        streamMyListdapter = new StreamMyListdapter(mediaRepository,settingsManager);

        streamOnlineMyListdapter = new StreamOnlineMyListdapter(mediaRepository,settingsManager,this,authRepository);

        onLoadListData();

        binding.rvMylist.setLayoutManager(new GridLayoutManager(getContext(), 2));
        binding.rvMylist.addItemDecoration(new SpacingItemDecoration(1, Tools.dpToPx(requireActivity(), 1), true));
        binding.rvMylist.setHasFixedSize(true);

        return  binding.getRoot();

    }


    private void onLoadListData() {

        if (settingsManager.getSettings().getFavoriteonline() == 1 && tokenManager.getToken().getAccessToken() !=null) {

            onLoadSeriesListOnline();

        } else {

            onLoadSeriesListOffline();
        }
    }

    private void onLoadSeriesListOffline() {

        streamingDetailViewModel.getStreamFavorites().observe(getViewLifecycleOwner(), favoriteMovies -> {

            binding.rvMylist.setAdapter(streamMyListdapter);
            streamMyListdapter.addToContent(favoriteMovies,requireActivity());
            binding.rvMylist.setEmptyView(binding.noResults);

        });
    }

    private void onLoadSeriesListOnline() {

        loginViewModel.getAuthDetails();
        loginViewModel.authDetailMutableLiveData.observe(getViewLifecycleOwner(), auth -> {

            binding.rvMylist.setAdapter(streamOnlineMyListdapter);
            streamOnlineMyListdapter.addToContent(auth.getFavoritesStreaming(),requireActivity());
            binding.rvMylist.setEmptyView(binding.noResults);

        });
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding.rvMylist.setAdapter(null);
        binding =null;

    }


    @SuppressLint("NotifyDataSetChanged")
    @Override
    public void onResume() {
        super.onResume();
        onLoadListData();
        streamOnlineMyListdapter.notifyDataSetChanged();
    }

    @SuppressLint("NotifyDataSetChanged")
    @Override
    public void onMediaDeletedSuccess(boolean clicked) {
        if (clicked) {
            onLoadListData();
            streamOnlineMyListdapter.notifyDataSetChanged();
        }
    }

}
