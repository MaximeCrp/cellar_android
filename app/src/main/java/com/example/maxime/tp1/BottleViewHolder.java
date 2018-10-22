package com.example.maxime.tp1;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class BottleViewHolder extends RecyclerView.ViewHolder {

    public TextView txvName;
    public TextView txvPrice;

    public BottleViewHolder(View rootView) {
        super(rootView);
        this.txvName = rootView.findViewById(R.id.name);
        this.txvPrice = rootView.findViewById(R.id.price);
    }
}