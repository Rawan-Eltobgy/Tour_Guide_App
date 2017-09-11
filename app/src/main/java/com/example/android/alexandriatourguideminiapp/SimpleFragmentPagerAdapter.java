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
    Context context;
    private String[] tabTitles;

    public SimpleFragmentPagerAdapter(FragmentManager fragmentManager, Context context) {
        super(fragmentManager);
        this.context = context;
        tabTitles = new String[]
                {this.context.getResources().getString(R.string.beach),
                        this.context.getResources().getString(R.string.museum),
                        this.context.getResources().getString(R.string.restaurant),
                        this.context.getResources().getString(R.string.other)};
    }
    @Override

    public Fragment getItem(int position) {
        if (position == 0) {
            return new BeachesFragment();
        } else if (position == 1) {
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
