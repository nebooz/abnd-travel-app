package com.abnd.mdiaz.travelapp;

import java.util.ArrayList;

/**
 * Created by neboo on 25-Jul-16.
 */
public class ListMaker {

    public ListMaker(){

    }

    public static ArrayList<Image> getImageList(){

        ArrayList<Image> images = new ArrayList<>();

        images.add(new Image("Titulo1", "Subtitulo1", R.drawable.lamoneda));
        images.add(new Image("Titulo2", "Subtitulo2", R.drawable.lamoneda));
        images.add(new Image("Titulo3", "Subtitulo3", R.drawable.lamoneda));
        images.add(new Image("Titulo4", "Subtitulo4", R.drawable.lamoneda));
        images.add(new Image("Titulo5", "Subtitulo5", R.drawable.lamoneda));

        return images;
    }

    public static ArrayList<Location> getPlacesList(){

        ArrayList<Location> places = new ArrayList<>();

        places.add(new Location("Sky Costanera", "TripAdvisor Rank #1", "Observation Decks & Towers", R.drawable.sky_costanera));
        places.add(new Location("Museo de la Memoria", "TripAdvisor Rank #2", "Specialty Museums", R.drawable.museo_memoria));
        places.add(new Location("La Chascona", "TripAdvisor Rank #3", "Specialty Museums", R.drawable.la_chascona));
        places.add(new Location("Parque Araucano", "TripAdvisor Rank #4", "Parks", R.drawable.parque_araucano));
        places.add(new Location("Patio Bellavista", "TripAdvisor Rank #5", "Points of Interest & Landmarks", R.drawable.patio_bellavista));
        places.add(new Location("Museo de Arte Precolombino", "TripAdvisor Rank #6", "Art Museums", R.drawable.museo_pre));
        places.add(new Location("Barrio Lastarria", "TripAdvisor Rank #7", "Neighborhoods", R.drawable.barrio_lastarria));
        places.add(new Location("Cerro Santa Lucia", "TripAdvisor Rank #8", "Points of Interest & Landmarks", R.drawable.cerro_santa_lucia));
        places.add(new Location("Catedral Metropolitana", "TripAdvisor Rank #9", "Architectural Buildings", R.drawable.metro_cathedral));
        places.add(new Location("Museo Interactivo Mirador", "TripAdvisor Rank #10", "Specialty Museums", R.drawable.museo_mirador));

        return places;
    }

    public static ArrayList<Location> getRestaurantsList(){

        ArrayList<Location> restaurants = new ArrayList<>();

        restaurants.add(new Location("Sky Costanera", "TripAdvisor Rank #1", "Observation Decks & Towers", R.drawable.sky_costanera));
        restaurants.add(new Location("Museo de la Memoria", "TripAdvisor Rank #2", "Specialty Museums", R.drawable.museo_memoria));
        restaurants.add(new Location("La Chascona", "TripAdvisor Rank #3", "Specialty Museums", R.drawable.la_chascona));
        restaurants.add(new Location("Parque Araucano", "TripAdvisor Rank #4", "Parks", R.drawable.parque_araucano));
        restaurants.add(new Location("Patio Bellavista", "TripAdvisor Rank #5", "Points of Interest & Landmarks", R.drawable.patio_bellavista));
        restaurants.add(new Location("Museo de Arte Precolombino", "TripAdvisor Rank #6", "Art Museums", R.drawable.museo_pre));
        restaurants.add(new Location("Barrio Lastarria", "TripAdvisor Rank #7", "Neighborhoods", R.drawable.barrio_lastarria));
        restaurants.add(new Location("Cerro Santa Lucia", "TripAdvisor Rank #8", "Points of Interest & Landmarks", R.drawable.cerro_santa_lucia));
        restaurants.add(new Location("Catedral Metropolitana", "TripAdvisor Rank #9", "Architectural Buildings", R.drawable.metro_cathedral));
        restaurants.add(new Location("Museo Interactivo Mirador", "TripAdvisor Rank #10", "Specialty Museums", R.drawable.museo_mirador));

        return restaurants;
    }

    public static ArrayList<Event> getEventsList(){

        ArrayList<Event> events = new ArrayList<>();

        events.add(new Event("January", 0));
        events.add(new Event("1/6", "Algo que pasa el 6 de Enero", 1));
        events.add(new Event("1/30", "Cumple de Denisse", 1));
        events.add(new Event("Junio", 0));
        events.add(new Event("6/26", "Cumple de Alguien Mas", 1));
        events.add(new Event("6/30", "Cumple de Maximiliano", 1));

        return events;
    }
}
