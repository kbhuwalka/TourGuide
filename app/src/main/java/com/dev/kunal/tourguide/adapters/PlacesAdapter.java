package com.dev.kunal.tourguide.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.dev.kunal.tourguide.Paris;
import com.dev.kunal.tourguide.R;

public class PlacesAdapter extends RecyclerView.Adapter<PlacesAdapter.ViewHolder> {

    private final Paris.Place[] mPlaces = Paris.places;
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.image_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        Paris.Place place = mPlaces[position];
        Context context = holder.mView.getContext();
        holder.titleView.setText(context.getString(place.name));
        holder.subtitleView.setText(context.getString(place.description));
        holder.imageView.setImageResource(place.imageId);
    }

    @Override
    public int getItemCount() {
        return mPlaces.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView titleView;
        public final TextView subtitleView;
        public final ImageView imageView;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            titleView = (TextView) view.findViewById(R.id.title);
            subtitleView = (TextView) view.findViewById(R.id.subtitle);
            imageView = view.findViewById(R.id.image);
        }
    }
}
