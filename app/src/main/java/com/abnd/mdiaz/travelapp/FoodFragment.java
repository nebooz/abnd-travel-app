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
public class FoodFragment extends Fragment {


    public FoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.basic_list_view, container, false);

        final ArrayList<Restaurant> restaurants = new ArrayList<>();

        restaurants.add(new Restaurant("Name1", "Ranking1", "Style1", "Comment1", R.drawable.lamoneda));
        restaurants.add(new Restaurant("Name2", "Ranking2", "Style2", "Comment2", R.drawable.lamoneda));
        restaurants.add(new Restaurant("Name3", "Ranking3", "Style3", "Comment3", R.drawable.lamoneda));
        restaurants.add(new Restaurant("Name4", "Ranking4", "Style4", "Comment4", R.drawable.lamoneda));
        restaurants.add(new Restaurant("Name5", "Ranking5", "Style5", "Comment5", R.drawable.lamoneda));

        RestoAdapter adapter = new RestoAdapter(getActivity(), restaurants);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;

    }

}