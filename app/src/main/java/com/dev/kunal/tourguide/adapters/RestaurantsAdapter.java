package com.dev.kunal.tourguide.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dev.kunal.tourguide.Paris;
import com.dev.kunal.tourguide.R;

/**
 * Created by Kunal on 10/11/2017.
 */

public class RestaurantsAdapter extends RecyclerView.Adapter<RestaurantsAdapter.ViewHolder> {

    private final Paris.Restaurant[] mRestaurants = Paris.restaurants;
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.restaurants_list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        Paris.Restaurant place = mRestaurants[position];
        Context context = holder.view.getContext();
        holder.titleView.setText(context.getString(place.name));
        holder.subtitleView.setText(context.getString(place.description));
    }

    @Override
    public int getItemCount() {
        return mRestaurants.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View view;
        public final TextView titleView;
        public final TextView subtitleView;

        public ViewHolder(View view) {
            super(view);
            this.view = view;
            titleView = (TextView) view.findViewById(R.id.title);
            subtitleView = (TextView) view.findViewById(R.id.subtitle);
        }
    }
}
