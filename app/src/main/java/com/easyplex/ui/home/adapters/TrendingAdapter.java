package com.easyplex.ui.home.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.easyplex.data.local.entity.Media;
import com.easyplex.databinding.ItemMovieBinding;
import com.easyplex.ui.animes.AnimeDetailsActivity;
import com.easyplex.ui.moviedetails.MovieDetailsActivity;
import com.easyplex.ui.seriedetails.SerieDetailsActivity;
import com.easyplex.util.Tools;
import java.util.List;
import static com.easyplex.util.Constants.ARG_MOVIE;


/**
 * Adapter for Trending Movies.
 *
 * @author Yobex.
 */
public class TrendingAdapter extends RecyclerView.Adapter<TrendingAdapter.MainViewHolder> {

    private List<Media> castList;
    private Context context;


    public void addTrending(List<Media> castList,Context context) {
        this.castList = castList;
        this.context = context;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public TrendingAdapter.MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        ItemMovieBinding binding = ItemMovieBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);

        return new TrendingAdapter.MainViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull TrendingAdapter.MainViewHolder holder, int position) {
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
        }



        void onBind(final int position) {


            final Media media = castList.get(position);

            if (media.getSubtitle() !=null) {

                binding.substitle.setText(media.getSubtitle());
            }else {

                binding.substitle.setVisibility(View.GONE);
            }



            String mediaType = media.getType();
            switch (mediaType) {
                case "movie":

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

                    break;
                case "serie":

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

                    break;
                case "anime":

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

                    break;
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
