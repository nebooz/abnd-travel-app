package com.abnd.mdiaz.travelapp;

public class Image {
    private String mTitleText;
    private String mSubtitleText;
    private int mImageResourceId;

    public Image(String titleText, String subtitleText, int imageResourceId) {
        mTitleText = titleText;
        mSubtitleText = subtitleText;
        mImageResourceId = imageResourceId;
    }

    public String getTitleText() {
        return mTitleText;
    }

    public String getSubtitleText() {
        return mSubtitleText;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }


}
