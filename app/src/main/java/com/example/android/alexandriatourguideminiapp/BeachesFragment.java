package com.example.android.alexandriatourguideminiapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class BeachesFragment extends Fragment {


    /**
     * Fragment that displays "Beaches".
     */

    public BeachesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.list, container, false);
        // Create a list of words
        final ArrayList<Guide> guides = new ArrayList<>();
        guides.add(new Guide(getString(R.string.g_beach), getString(R.string.g_addBeach)));
        guides.add(new Guide(getString(R.string.m_beach), getString(R.string.m_addBeach)));
        guides.add(new Guide(getString(R.string.ss_beach), getString(R.string.ss_addBeach)));
        guides.add(new Guide(getString(R.string.s_beach), getString(R.string.s_addBeach)));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
       GuideAdapter adapter = new GuideAdapter(getActivity(), guides, R.color.category_beaches);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.container);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);


        return rootView;
    }}





