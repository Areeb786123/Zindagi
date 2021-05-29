package com.areeb.zindagi.Adapter;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.areeb.zindagi.R;
import com.areeb.zindagi.model.hero;
import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class hero_adapter extends RecyclerView.Adapter<hero_adapter.heroViewHolder> {


    private Context context;
    private List<hero> items;

    public hero_adapter(Context context, List<hero> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public heroViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_view,parent,false);
        return new heroViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull heroViewHolder holder, int position) {
        hero item = items.get(position);
        holder.herorealname.setText(item.getRealname());
        holder.heroname.setText(item.getName());
        //Picasso.get().load(items.get(item).getImageurl()).into(heroViewHolder.heroimage);

        Glide.with(context).load(items.get(position).getImageurl()).into(heroViewHolder.heroimage);

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class heroViewHolder extends RecyclerView.ViewHolder {
        static ImageView heroimage;
        TextView heroname;
        TextView herorealname;
        public heroViewHolder(View itemView) {
            super(itemView);

            heroimage= itemView.findViewById(R.id.heri_image);
            heroname = itemView.findViewById(R.id.heroname);
            herorealname = itemView.findViewById(R.id.realname);

        }
    }
}
