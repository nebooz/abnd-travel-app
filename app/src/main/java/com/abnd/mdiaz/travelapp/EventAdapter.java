package com.abnd.mdiaz.travelapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EventAdapter extends ArrayAdapter<Event> {

    public EventAdapter(Context context, ArrayList<Event> events) {
        super(context, 0, events);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        Event currentEvent = getItem(position);

        if (listItemView == null) {
            switch (currentEvent.getEventType()) {
                case 0:
                    listItemView = LayoutInflater.from(getContext()).inflate(
                            R.layout.event_header_layout, parent, false);

                    TextView eventHeader = (TextView) listItemView.findViewById(R.id.event_header);
                    eventHeader.setText(currentEvent.getEventMonth());

                    break;
                case 1:
                    listItemView = LayoutInflater.from(getContext()).inflate(
                            R.layout.event_item_layout, parent, false);

                    TextView eventDate = (TextView) listItemView.findViewById(R.id.event_date);
                    eventDate.setText(currentEvent.getEventDate());

                    TextView eventDescription = (TextView) listItemView.findViewById(R.id.event_description);
                    eventDescription.setText(currentEvent.getEventDescription());

                    break;
            }
        }

        return listItemView;
    }
}
