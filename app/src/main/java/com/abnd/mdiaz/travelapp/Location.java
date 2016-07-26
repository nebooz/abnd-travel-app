package com.abnd.mdiaz.travelapp;

/**
 * Created by neboo on 24-Jul-16.
 */
public class Location {

    private String mLocationName;
    private String mLocationRanking;
    private String mLocationStyle;
    private int mImageResourceId;


    public Location(String restoName, String restoRanking, String restoStyle, int imageResourceId) {
        mLocationName = restoName;
        mLocationRanking = restoRanking;
        mLocationStyle = restoStyle;
        mImageResourceId = imageResourceId;
    }


    public String getLocationName() {
        return mLocationName;
    }

    public String getLocationRanking() {
        return mLocationRanking;
    }

    public String getLocationStyle() {
        return mLocationStyle;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}