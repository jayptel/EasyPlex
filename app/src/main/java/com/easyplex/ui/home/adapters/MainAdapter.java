package com.easyplex.ui.home.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.easyplex.R;
import com.easyplex.data.local.entity.Media;
import com.easyplex.databinding.ItemMovieBinding;
import com.easyplex.ui.animes.AnimeDetailsActivity;
import com.easyplex.ui.manager.SettingsManager;
import com.easyplex.ui.moviedetails.MovieDetailsActivity;
import com.easyplex.ui.seriedetails.SerieDetailsActivity;
import com.easyplex.util.AppController;
import com.easyplex.util.Tools;
import java.util.List;
import java.util.Locale;

import static com.easyplex.util.Constants.ARG_MOVIE;

/**
 * Adapter for Movie.
 *
 * @author Yobex.
 */
public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {

    public List<Media> castList;
    private Context context;
     final SettingsManager settingsManager;
     final AppController appController;


    public MainAdapter(SettingsManager settingsManager, AppController appController) {

        this.settingsManager = settingsManager;
        this.appController = appController;
    }


    @SuppressLint("NotifyDataSetChanged")
    public void addMain(List<Media> castList, Context context) {
        this.castList = castList;
        this.context = context;

        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public MainAdapter.MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        ItemMovieBinding binding = ItemMovieBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);

        return new MainAdapter.MainViewHolder(binding);

    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {

        holder.onBind(position);

    }



    @Override
    public int getItemCount() {
        if (castList != null) {
            return castList.size();
        } else {
            return 0;
        }
    }

    class MainViewHolder extends RecyclerView.ViewHolder {

        private final ItemMovieBinding binding;

        MainViewHolder(@NonNull ItemMovieBinding binding)
        {
            super(binding.getRoot());

            this.binding = binding;

            binding.setController(appController);

            appController.isShadowEnabled.set(settingsManager.getSettings().getEnableShadows() == 1);
        }


        void onBind(final int position) {

            final Media media = castList.get(position);


            if (Tools.isRTL(Locale.getDefault())){
                binding.mgenres.setBackgroundResource(R.drawable.bg_label_rtl);
            }

            if (media.getSubtitle() !=null) {

                binding.substitle.setText(media.getSubtitle());

            }else {

                binding.substitle.setVisibility(View.GONE);
            }


            String mediaType = media.getType();
            if ("movie".equals(mediaType)) {
                binding.rootLayout.setOnLongClickListener(v -> {
                    Toast.makeText(context, "" + media.getTitle(), Toast.LENGTH_SHORT).show();
                    return false;
                });

                binding.rootLayout.setOnClickListener(view -> {

                    Intent intent = new Intent(context, MovieDetailsActivity.class);
                    intent.putExtra(ARG_MOVIE, media);
                    context.startActivity(intent);


                });

                binding.movietitle.setText(media.getName());
            } else if ("serie".equals(mediaType)) {
                binding.movietitle.setText(media.getName());


                binding.rootLayout.setOnLongClickListener(v -> {
                    Toast.makeText(context, "" + media.getName(), Toast.LENGTH_SHORT).show();
                    return false;
                });

                binding.rootLayout.setOnClickListener(view -> {


                    Intent intent = new Intent(context, SerieDetailsActivity.class);
                    intent.putExtra(ARG_MOVIE, media);
                    context.startActivity(intent);


                });


                if (media.getNewEpisodes() == 1) {

                    binding.hasNewEpisodes.setVisibility(View.VISIBLE);
                }
            } else if ("anime".equals(mediaType)) {
                binding.movietitle.setText(media.getName());

                binding.rootLayout.setOnLongClickListener(v -> {
                    Toast.makeText(context, "" + media.getName(), Toast.LENGTH_SHORT).show();
                    return false;
                });

                binding.rootLayout.setOnClickListener(view -> {

                    Intent intent = new Intent(context, AnimeDetailsActivity.class);
                    intent.putExtra(ARG_MOVIE, media);
                    context.startActivity(intent);


                });


                if (media.getNewEpisodes() == 1) {

                    binding.hasNewEpisodes.setVisibility(View.VISIBLE);
                }
            }



            if (media.getPremuim() == 1) {

                binding.moviePremuim.setVisibility(View.VISIBLE);


            }else {

                binding.moviePremuim.setVisibility(View.GONE);
            }


            binding.ratingBar.setRating(media.getVoteAverage() / 2);
            binding.viewMovieRating.setText(String.valueOf(media.getVoteAverage()));

            Tools.onLoadMediaCoverAdapters(context,binding.itemMovieImage, media.getPosterPath());


            binding.mgenres.setText(media.getGenreName());

        }


    }



}
