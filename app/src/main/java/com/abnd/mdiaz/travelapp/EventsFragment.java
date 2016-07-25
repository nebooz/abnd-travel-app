package com.abnd.mdiaz.travelapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class EventsFragment extends Fragment {


    public EventsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.basic_list_view, container, false);

        final ArrayList<Event> events = new ArrayList<>();

        events.add(new Event("January", 0));
        events.add(new Event("1/6", "Algo que pasa el 6 de Enero", 1));
        events.add(new Event("1/30", "Cumple de Denisse", 1));
        events.add(new Event("Junio", 0));
        events.add(new Event("6/26", "Cumple de Alguien Mas", 1));
        events.add(new Event("6/30", "Cumple de Maximiliano", 1));

        EventAdapter adapter = new EventAdapter(getActivity(), events);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;

    }

}