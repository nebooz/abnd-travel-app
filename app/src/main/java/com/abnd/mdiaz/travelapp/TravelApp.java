package com.abnd.mdiaz.travelapp;

import android.app.Application;
import android.content.Context;

public class TravelApp extends Application {

    private static Context context;

    public void onCreate() {
        super.onCreate();
        TravelApp.context = getApplicationContext();
    }

    public static Context getAppContext() {
        return TravelApp.context;
    }
}