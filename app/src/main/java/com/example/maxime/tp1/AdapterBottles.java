package com.example.maxime.tp1;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class AdapterBottles extends RecyclerView.Adapter<BottleViewHolder> {

    private ArrayList<Bottle> icons;

    public AdapterBottles(ArrayList<Bottle> icons) { this.icons = icons; }

    public BottleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View row = LayoutInflater.from(parent.getContext()).inflate(R.layout.bottle_list_item, parent, false);
        return new BottleViewHolder(row);
    }

    public void onBindViewHolder(BottleViewHolder viewholder, int position) {
        Bottle bottleToDisplay = this.icons.get(position);

        viewholder.txvName.setText(bottleToDisplay.getName());
        viewholder.txvPrice.setText(Float.toString(bottleToDisplay.getPrice()));
    }

    public int getItemCount() {
        return this.icons.size();
    }

    public void updateList(ArrayList<Bottle> list) {
        this.icons = list;
    }

}