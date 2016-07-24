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
public class ImageAdapter extends ArrayAdapter<Image> {

    public ImageAdapter(Context context, ArrayList<Image> images) {
        super(context, 0, images);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.image_base_layout, parent, false);
        }

        Image currentImage = getItem(position);

        TextView titleText = (TextView) listItemView.findViewById(R.id.image_title);
        titleText.setText(currentImage.getTitleText());

        TextView subtitleText = (TextView) listItemView.findViewById(R.id.image_description);
        subtitleText.setText(currentImage.getSubtitleText());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_holder);
        imageView.setImageResource(currentImage.getImageResourceId());

        return listItemView;
    }
}
