package com.example.birds;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BirdAdapter extends RecyclerView.Adapter<BirdHolder> {
      private ArrayList<BirdModel> birdlist;
      private ClickListener clickListener;


    public BirdAdapter(ArrayList<BirdModel> birdlist, ClickListener clickListener) {
        this.birdlist = birdlist;
        this.clickListener=clickListener;
    }

    @NonNull
    @Override
    public BirdHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new BirdHolder(view, clickListener);

    }

    @Override
    public void onBindViewHolder(@NonNull BirdHolder holder, int position) {
        BirdModel birds=birdlist.get(position);
        holder.setData(birds);

    }

    @Override
    public int getItemCount() {
        return birdlist.size();
    }
}
