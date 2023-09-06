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
import com.easyplex.ui.seriedetails.SerieDetailsActivity;
import com.easyplex.util.Tools;
import java.util.List;
import java.util.Locale;

import static com.easyplex.util.Constants.ARG_MOVIE;

/**
 * Adapter for Latest Series.
 *
 * @author Yobex.
 */
public class LatestseriesAdapter extends RecyclerView.Adapter<LatestseriesAdapter.MainViewHolder> {

    private List<Media> castList;
    private Context context;

    public void addLatest(List<Media> castList,Context context) {
        this.castList = castList;
        this.context = context;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public LatestseriesAdapter.MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        ItemMovieBinding binding = ItemMovieBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);

        return new LatestseriesAdapter.MainViewHolder(binding);

    }

    @Override
    public void onBindViewHolder(@NonNull LatestseriesAdapter.MainViewHolder holder, int position) {
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

        @SuppressLint("SetTextI18n")
        void onBind(final int position) {

            if (Tools.isRTL(Locale.getDefault())){
                binding.mgenres.setBackgroundResource(R.drawable.bg_label_rtl);
            }

            final Media serie = castList.get(position);


            if (serie.getSubtitle() !=null) {

                binding.substitle.setText(serie.getSubtitle());
            }else {

                binding.substitle.setVisibility(View.GONE);
            }

            if (serie.getNewEpisodes() == 1) {

                binding.hasNewEpisodes.setVisibility(View.VISIBLE);
            }


            if (serie.getPremuim() == 1) {

                binding.moviePremuim.setVisibility(View.VISIBLE);


            }else {

                binding.moviePremuim.setVisibility(View.GONE);
            }

            binding.movietitle.setText(serie.getName());



            binding.rootLayout.setOnLongClickListener(v -> {
                Toast.makeText(context, ""+serie.getName(), Toast.LENGTH_SHORT).show();
                return false;
            });



            binding.rootLayout.setOnClickListener(view -> {

                Intent intent = new Intent(context, SerieDetailsActivity.class);
                intent.putExtra(ARG_MOVIE, serie);
                context.startActivity(intent);


            });


            if (serie.getPremuim() == 1) {

                binding.moviePremuim.setVisibility(View.VISIBLE);


            }else {

                binding.moviePremuim.setVisibility(View.GONE);
            }

            binding.ratingBar.setRating(serie.getVoteAverage() / 2);
            binding.viewMovieRating.setText(String.valueOf(serie.getVoteAverage()));
            Tools.onLoadMediaCover(context,binding.itemMovieImage,serie.getPosterPath());

            binding.mgenres.setText(serie.getGenreName());

        }


    }
}
