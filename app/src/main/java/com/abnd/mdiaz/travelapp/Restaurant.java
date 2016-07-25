package com.abnd.mdiaz.travelapp;

/**
 * Created by neboo on 24-Jul-16.
 */
public class Restaurant {

    private String mRestoName;
    private String mRestoRanking;
    private String mRestoStyle;
    private String mRestoComment;
    private int mImageResourceId;


    public Restaurant(String restoName, String restoRanking, String restoStyle, String restoComment, int imageResourceId) {
        mRestoName = restoName;
        mRestoRanking = restoRanking;
        mRestoStyle = restoStyle;
        mRestoComment = restoComment;
        mImageResourceId = imageResourceId;
    }


    public String getRestoName() {
        return mRestoName;
    }

    public String getRestoRanking() {
        return mRestoRanking;
    }

    public String getRestoStyle() {
        return mRestoStyle;
    }

    public String getRestoComment() {
        return mRestoComment;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}