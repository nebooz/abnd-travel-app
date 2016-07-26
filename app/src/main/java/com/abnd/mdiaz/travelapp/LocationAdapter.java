package com.abnd.mdiaz.travelapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by neboo on 24-Jul-16.
 */
public class LocationAdapter extends ArrayAdapter<Location> {

    public LocationAdapter(Context context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.location_base_layout, parent, false);
        }

        Location currentImage = getItem(position);

        TextView nameText = (TextView) listItemView.findViewById(R.id.location_name);
        nameText.setText(currentImage.getLocationName());

        TextView rankingText = (TextView) listItemView.findViewById(R.id.location_ranking);
        rankingText.setText(currentImage.getLocationRanking());

        TextView styleText = (TextView) listItemView.findViewById(R.id.location_extra);
        styleText.setText(currentImage.getLocationStyle());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.location_image);
        imageView.setImageResource(currentImage.getImageResourceId());

        return listItemView;
    }
}
