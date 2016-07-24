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
public class ImagesFragment extends Fragment {


    public ImagesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.basic_list_view, container, false);

        final ArrayList<Image> images = new ArrayList<>();

        images.add(new Image("Titulo1", "Subtitulo1", R.drawable.lamoneda));
        images.add(new Image("Titulo2", "Subtitulo2", R.drawable.lamoneda));
        images.add(new Image("Titulo3", "Subtitulo3", R.drawable.lamoneda));
        images.add(new Image("Titulo4", "Subtitulo4", R.drawable.lamoneda));
        images.add(new Image("Titulo5", "Subtitulo5", R.drawable.lamoneda));

        ImageAdapter adapter = new ImageAdapter(getActivity(), images);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;

    }

}
