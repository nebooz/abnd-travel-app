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
public class RestoAdapter extends ArrayAdapter<Restaurant> {

    public RestoAdapter(Context context, ArrayList<Restaurant> restaurants) {
        super(context, 0, restaurants);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.food_base_layout, parent, false);
        }

        Restaurant currentImage = getItem(position);

        TextView nameText = (TextView) listItemView.findViewById(R.id.resto_name);
        nameText.setText(currentImage.getRestoName());

        TextView rankingText = (TextView) listItemView.findViewById(R.id.resto_ranking);
        rankingText.setText(currentImage.getRestoRanking());

        TextView styleText = (TextView) listItemView.findViewById(R.id.resto_style);
        styleText.setText(currentImage.getRestoStyle());

        TextView commentText = (TextView) listItemView.findViewById(R.id.resto_comment);
        commentText.setText(currentImage.getRestoComment());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.resto_image);
        imageView.setImageResource(currentImage.getImageResourceId());

        return listItemView;
    }
}
