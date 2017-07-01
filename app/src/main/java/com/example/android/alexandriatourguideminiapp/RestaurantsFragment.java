package com.example.android.alexandriatourguideminiapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class RestaurantsFragment extends Fragment {
    /**
     * Fragment that displays "Restaurants".
     */

    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.list, container, false);
        // Create a list of words
        final ArrayList<Guide> guides = new ArrayList<>();
        guides.add(new Guide(getString(R.string.t_res), getString(R.string.t_addres)));
        guides.add(new Guide(getString(R.string.b_res), getString(R.string.b_addres)));
        guides.add(new Guide(getString(R.string.l_res), getString(R.string.l_addres)));
        guides.add(new Guide(getString(R.string.d_res), getString(R.string.d_addres)));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        GuideAdapter adapter = new GuideAdapter(getActivity(), guides, R.color.category_restaurants);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.container);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);


        return rootView;
    }}