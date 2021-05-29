package com.areeb.zindagi.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.areeb.zindagi.R;
import com.areeb.zindagi.model.TrendingResponse;
import com.areeb.zindagi.model.results;
import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class trending_Adapter extends  RecyclerView.Adapter<trending_Adapter.trendingViewHolder> {
    private final Context context;

    public trending_Adapter(Context context, List<results> items) {
        this.context = context;
        this.items = items;
    }

    private final List<results> items;





    @Override
    public trendingViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.trending_item,parent,false);
        return  new trendingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull trendingViewHolder holder, int position) {
        results item = items.get(position);
        //holder.rating.setText(item.getVote_average());
        holder.rating.setText(Float.toString(item.getVote_average()));
        //Glide.with(context).load(items.get(position).getPoster_path()).into(trendingViewHolder.trending_Image);
        //Picasso.get().load(item.getPoster_path()).into(holder.trending_Image);
        Picasso.get().load("https://image.tmdb.org/t/p/original/"+item.getPoster_path()).into(holder.trending_Image);

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public  static class trendingViewHolder extends RecyclerView.ViewHolder{
        ImageView trending_Image ;
        TextView rating;

        public trendingViewHolder( View itemView) {
            super(itemView);

            trending_Image = itemView.findViewById(R.id.trending_image);
            rating= itemView.findViewById(R.id.rating);


        }
    }
}
