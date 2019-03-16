package com.kevin.androideat.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.kevin.androideat.R;
import com.kevin.androideat.interfaces.ItemClickListener;

/**
 * Created by Kevin Kimaru Chege on 9/27/2018.
 */

public class FoodViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView foodNameTV;
    public ImageView foodImageIV;

    private ItemClickListener mItemClickListener;

    public void setItemClickListener(ItemClickListener itemClickListener) {
        mItemClickListener = itemClickListener;
    }

    public FoodViewHolder(View itemView) {
        super(itemView);

        foodNameTV = (TextView)itemView.findViewById(R.id.food_name);
        foodImageIV = (ImageView) itemView.findViewById(R.id.food_image);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        mItemClickListener.onClick(v, getAdapterPosition(), false);
    }
}
