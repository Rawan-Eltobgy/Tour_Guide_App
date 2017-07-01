package com.example.android.alexandriatourguideminiapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;



public class OtherFragment extends Fragment {
    /**
     * Fragment that displays "Beaches".
     */

    public OtherFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.list, container, false);
        // Create a list of words
        final ArrayList<Guide> guides = new ArrayList<>();
        guides.add(new Guide(getString(R.string.c_oth), getString(R.string.c_addoth), R.drawable.c));
        guides.add(new Guide(getString(R.string.cc_oth), getString(R.string.cc_addoth),R.drawable.cc));
        guides.add(new Guide(getString(R.string.p_oth), getString(R.string.p_addoth),R.drawable.p));
        guides.add(new Guide(getString(R.string.r_oth), getString(R.string.r_addoth),R.drawable.r));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        GuideAdapter adapter = new GuideAdapter(getActivity(), guides, R.color.category_other);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.container);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);


        return rootView;
    }}