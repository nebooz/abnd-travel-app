package com.abnd.mdiaz.travelapp;

import java.util.ArrayList;

public class ListMaker {

    public ListMaker() {

    }

    public static ArrayList<Image> getImageList() {

        ArrayList<Image> images = new ArrayList<>();

        images.add(new Image("Sanhattan ", "© Luis Peña", R.drawable.sanhattan_01));
        images.add(new Image("Estacion Metro La Cisterna", "© Hugh Honeyman", R.drawable.metro_cisterna));
        images.add(new Image("Coco Zurita", "© Red Bull Photography", R.drawable.coco_zurita));
        images.add(new Image("Yungay", "© Two Monkeys Travel Group", R.drawable.yungay));
        images.add(new Image("Lastarria ", "© Two Monkeys Travel Group", R.drawable.lastarria));
        images.add(new Image("Japanese Garden ", "© Nellu Mazilu", R.drawable.japanese_garden));
        images.add(new Image("La Vega Central ", "© Wanderlust Chloe", R.drawable.la_vega));
        images.add(new Image("Plaza de Armas ", "© Wanderlust Chloe", R.drawable.plaza_armas));
        images.add(new Image("View from Costanera Center ", "© Backpacker Macca", R.drawable.view_costanera));
        images.add(new Image("Rooftop Pool at W Hotel ", "© Wanderlust Chloe", R.drawable.w_hotel));

        return images;
    }

    public static ArrayList<Location> getPlacesList() {

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

    public static ArrayList<Location> getRestaurantsList() {

        ArrayList<Location> restaurants = new ArrayList<>();

        restaurants.add(new Location("Peumayen Ancestral Food", "TripAdvisor Rank #1", "Chilean", R.drawable.peumayen));
        restaurants.add(new Location("Naoki", "TripAdvisor Rank #2", "Japanese", R.drawable.naoki));
        restaurants.add(new Location("Bocanariz", "TripAdvisor Rank #3", "Wine Bar", R.drawable.bocanariz));
        restaurants.add(new Location("Osaka", "TripAdvisor Rank #4", "Japanese", R.drawable.osaka));
        restaurants.add(new Location("Panko", "TripAdvisor Rank #5", "Japanese", R.drawable.panko));
        restaurants.add(new Location("La Fabbrica", "TripAdvisor Rank #6", "Italian", R.drawable.la_fabbrica));
        restaurants.add(new Location("Uncle Fletch", "TripAdvisor Rank #7", "American", R.drawable.uncle_fletch));
        restaurants.add(new Location("Le Bistrot", "TripAdvisor Rank #8", "French", R.drawable.le_bistrot));
        restaurants.add(new Location("Jewel of India", "TripAdvisor Rank #9", "Indian", R.drawable.jewel_india));
        restaurants.add(new Location("Laminga", "TripAdvisor Rank #10", "Chilean", R.drawable.laminga));

        return restaurants;
    }

    public static ArrayList<Event> getEventsList() {

        ArrayList<Event> events = new ArrayList<>();

        events.add(new Event("January", 0));
        events.add(new Event("1/3", "Santiago a Mil", 1));
        events.add(new Event("1/14", "Festival Internacional de Jazz", 1));
        events.add(new Event("1/28", "Festival del Folklore de San Bernardo", 1));
        events.add(new Event("March", 0));
        events.add(new Event("3/19", "Lollapalooza Chile", 1));
        events.add(new Event("August", 0));
        events.add(new Event("8/23", "Festival Internacional de Cine de Santiago", 1));
        events.add(new Event("October", 0));
        events.add(new Event("10/20", "Feria Internacional del Libro de Santiago", 1));

        return events;
    }
}
