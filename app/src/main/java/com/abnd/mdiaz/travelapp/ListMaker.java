package com.abnd.mdiaz.travelapp;

import java.util.ArrayList;

public class ListMaker {

    public ListMaker() {

    }

    public static ArrayList<Image> getImageList() {

        ArrayList<Image> images = new ArrayList<>();

        images.add(new Image(TravelApp.getAppContext().getString(R.string.image_01_name), TravelApp.getAppContext().getString(R.string.image_01_copy), R.drawable.sanhattan_01));
        images.add(new Image(TravelApp.getAppContext().getString(R.string.image_02_name), TravelApp.getAppContext().getString(R.string.image_02_copy), R.drawable.metro_cisterna));
        images.add(new Image(TravelApp.getAppContext().getString(R.string.image_03_name), TravelApp.getAppContext().getString(R.string.image_03_copy), R.drawable.coco_zurita));
        images.add(new Image(TravelApp.getAppContext().getString(R.string.image_04_name), TravelApp.getAppContext().getString(R.string.image_04_copy), R.drawable.yungay));
        images.add(new Image(TravelApp.getAppContext().getString(R.string.image_05_name), TravelApp.getAppContext().getString(R.string.image_05_copy), R.drawable.lastarria));
        images.add(new Image(TravelApp.getAppContext().getString(R.string.image_06_name), TravelApp.getAppContext().getString(R.string.image_06_copy), R.drawable.japanese_garden));
        images.add(new Image(TravelApp.getAppContext().getString(R.string.image_07_name), TravelApp.getAppContext().getString(R.string.image_07_copy), R.drawable.la_vega));
        images.add(new Image(TravelApp.getAppContext().getString(R.string.image_08_name), TravelApp.getAppContext().getString(R.string.image_08_copy), R.drawable.plaza_armas));
        images.add(new Image(TravelApp.getAppContext().getString(R.string.image_09_name), TravelApp.getAppContext().getString(R.string.image_09_copy), R.drawable.view_costanera));
        images.add(new Image(TravelApp.getAppContext().getString(R.string.image_10_name), TravelApp.getAppContext().getString(R.string.image_10_copy), R.drawable.w_hotel));

        return images;
    }

    public static ArrayList<Location> getPlacesList() {

        ArrayList<Location> places = new ArrayList<>();

        places.add(new Location(TravelApp.getAppContext().getString(R.string.place_01_name), TravelApp.getAppContext().getString(R.string.trip_rank_01), TravelApp.getAppContext().getString(R.string.place_type_01), R.drawable.sky_costanera));
        places.add(new Location(TravelApp.getAppContext().getString(R.string.place_02_name), TravelApp.getAppContext().getString(R.string.trip_rank_02), TravelApp.getAppContext().getString(R.string.place_type_02), R.drawable.museo_memoria));
        places.add(new Location(TravelApp.getAppContext().getString(R.string.place_03_name), TravelApp.getAppContext().getString(R.string.trip_rank_03), TravelApp.getAppContext().getString(R.string.place_type_02), R.drawable.la_chascona));
        places.add(new Location(TravelApp.getAppContext().getString(R.string.place_04_name), TravelApp.getAppContext().getString(R.string.trip_rank_04), TravelApp.getAppContext().getString(R.string.place_type_03), R.drawable.parque_araucano));
        places.add(new Location(TravelApp.getAppContext().getString(R.string.place_05_name), TravelApp.getAppContext().getString(R.string.trip_rank_05), TravelApp.getAppContext().getString(R.string.place_type_04), R.drawable.patio_bellavista));
        places.add(new Location(TravelApp.getAppContext().getString(R.string.place_06_name), TravelApp.getAppContext().getString(R.string.trip_rank_06), TravelApp.getAppContext().getString(R.string.place_type_05), R.drawable.museo_pre));
        places.add(new Location(TravelApp.getAppContext().getString(R.string.place_07_name), TravelApp.getAppContext().getString(R.string.trip_rank_07), TravelApp.getAppContext().getString(R.string.place_type_06), R.drawable.barrio_lastarria));
        places.add(new Location(TravelApp.getAppContext().getString(R.string.place_08_name), TravelApp.getAppContext().getString(R.string.trip_rank_08), TravelApp.getAppContext().getString(R.string.place_type_04), R.drawable.cerro_santa_lucia));
        places.add(new Location(TravelApp.getAppContext().getString(R.string.place_09_name), TravelApp.getAppContext().getString(R.string.trip_rank_09), TravelApp.getAppContext().getString(R.string.place_type_07), R.drawable.metro_cathedral));
        places.add(new Location(TravelApp.getAppContext().getString(R.string.place_10_name), TravelApp.getAppContext().getString(R.string.trip_rank_10), TravelApp.getAppContext().getString(R.string.place_type_02), R.drawable.museo_mirador));

        return places;
    }

    public static ArrayList<Location> getRestaurantsList() {

        ArrayList<Location> restaurants = new ArrayList<>();

        restaurants.add(new Location(TravelApp.getAppContext().getString(R.string.restaurant_01_name), TravelApp.getAppContext().getString(R.string.trip_rank_01), TravelApp.getAppContext().getString(R.string.restaurant_type_01), R.drawable.peumayen));
        restaurants.add(new Location(TravelApp.getAppContext().getString(R.string.restaurant_02_name), TravelApp.getAppContext().getString(R.string.trip_rank_02), TravelApp.getAppContext().getString(R.string.restaurant_type_02), R.drawable.naoki));
        restaurants.add(new Location(TravelApp.getAppContext().getString(R.string.restaurant_03_name), TravelApp.getAppContext().getString(R.string.trip_rank_03), TravelApp.getAppContext().getString(R.string.restaurant_type_03), R.drawable.bocanariz));
        restaurants.add(new Location(TravelApp.getAppContext().getString(R.string.restaurant_04_name), TravelApp.getAppContext().getString(R.string.trip_rank_04), TravelApp.getAppContext().getString(R.string.restaurant_type_02), R.drawable.osaka));
        restaurants.add(new Location(TravelApp.getAppContext().getString(R.string.restaurant_05_name), TravelApp.getAppContext().getString(R.string.trip_rank_05), TravelApp.getAppContext().getString(R.string.restaurant_type_02), R.drawable.panko));
        restaurants.add(new Location(TravelApp.getAppContext().getString(R.string.restaurant_06_name), TravelApp.getAppContext().getString(R.string.trip_rank_06), TravelApp.getAppContext().getString(R.string.restaurant_type_04), R.drawable.la_fabbrica));
        restaurants.add(new Location(TravelApp.getAppContext().getString(R.string.restaurant_07_name), TravelApp.getAppContext().getString(R.string.trip_rank_07), TravelApp.getAppContext().getString(R.string.restaurant_type_05), R.drawable.uncle_fletch));
        restaurants.add(new Location(TravelApp.getAppContext().getString(R.string.restaurant_08_name), TravelApp.getAppContext().getString(R.string.trip_rank_08), TravelApp.getAppContext().getString(R.string.restaurant_type_06), R.drawable.le_bistrot));
        restaurants.add(new Location(TravelApp.getAppContext().getString(R.string.restaurant_09_name), TravelApp.getAppContext().getString(R.string.trip_rank_09), TravelApp.getAppContext().getString(R.string.restaurant_type_07), R.drawable.jewel_india));
        restaurants.add(new Location(TravelApp.getAppContext().getString(R.string.restaurant_10_name), TravelApp.getAppContext().getString(R.string.trip_rank_10), TravelApp.getAppContext().getString(R.string.restaurant_type_01), R.drawable.laminga));

        return restaurants;
    }

    public static ArrayList<Event> getEventsList() {

        ArrayList<Event> events = new ArrayList<>();

        events.add(new Event(TravelApp.getAppContext().getString(R.string.event_month_01), 0));
        events.add(new Event(TravelApp.getAppContext().getString(R.string.event_date_01_03), TravelApp.getAppContext().getString(R.string.event_name_01), 1));
        events.add(new Event(TravelApp.getAppContext().getString(R.string.event_date_01_14), TravelApp.getAppContext().getString(R.string.event_name_02), 1));
        events.add(new Event(TravelApp.getAppContext().getString(R.string.event_date_01_28), TravelApp.getAppContext().getString(R.string.event_name_03), 1));
        events.add(new Event(TravelApp.getAppContext().getString(R.string.event_month_03), 0));
        events.add(new Event(TravelApp.getAppContext().getString(R.string.event_date_03_19), TravelApp.getAppContext().getString(R.string.event_name_04), 1));
        events.add(new Event(TravelApp.getAppContext().getString(R.string.event_month_08), 0));
        events.add(new Event(TravelApp.getAppContext().getString(R.string.event_date_08_23), TravelApp.getAppContext().getString(R.string.event_name_05), 1));
        events.add(new Event(TravelApp.getAppContext().getString(R.string.event_month_10), 0));
        events.add(new Event(TravelApp.getAppContext().getString(R.string.event_date_10_20), TravelApp.getAppContext().getString(R.string.event_name_06), 1));

        return events;
    }
}
