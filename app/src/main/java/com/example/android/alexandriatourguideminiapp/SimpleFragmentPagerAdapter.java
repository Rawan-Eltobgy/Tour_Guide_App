package com.example.android.alexandriatourguideminiapp;

/**
 * Created by user on 6/30/2017.
 */

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 4;
    private String tabTitles[] = new String[] { "Beach", "Museum", "Restaurant" ,"Other" };
    private Context context;

    public SimpleFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override

    public Fragment getItem(int position) {
        if (position == 0) {
            return new BeachesFragment();
        } else if (position == 1){
            return new MuseumsFragment();
        } else {
            if (position == 2) {
                return new RestaurantsFragment();
            } else {
                return new OtherFragment();
            }
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
}
