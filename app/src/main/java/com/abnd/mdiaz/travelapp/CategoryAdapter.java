package com.abnd.mdiaz.travelapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.places_fragment_title);
            case 1:
                return mContext.getString(R.string.food_fragment_title);
            case 2:
                return mContext.getString(R.string.images_fragment_title);
            case 3:
                return mContext.getString(R.string.events_fragment_title);
            default:
                return mContext.getString(R.string.places_fragment_title);
        }
    }

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new PlacesFragment();
            case 1:
                return new FoodFragment();
            case 2:
                return new ImagesFragment();
            case 3:
                return new EventsFragment();
            default:
                return new PlacesFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
