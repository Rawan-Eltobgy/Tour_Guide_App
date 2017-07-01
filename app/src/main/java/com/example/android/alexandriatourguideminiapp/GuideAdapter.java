package com.example.android.alexandriatourguideminiapp;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 7/1/2017.
 */

    public class  GuideAdapter extends ArrayAdapter<Guide> {

        private int mColorResourceId;


        public GuideAdapter(Context context, ArrayList<Guide> guides, int colorResourceId) {
            super(context, 0, guides);
            mColorResourceId = colorResourceId;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // Check if the existing view is being reused, otherwise inflate the view
            View listItemView = convertView;
            if(listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.list_item, parent, false);
            }

            // Get the {@link AndroidFlavor} object located at this position in the list
            final Guide currentGuide = getItem(position);

            // Find the TextView in the list_item.xml layout with the ID version_name
            TextView siteTextView = (TextView) listItemView.findViewById(R.id.site_text_view);
            // Get the version name from the current AndroidFlavor object and
            // set this text on the name TextView
            siteTextView.setText(currentGuide.getSite());

            // Find the TextView in the list_item.xml layout with the ID version_number
            TextView addTextView = (TextView) listItemView.findViewById(R.id.add_text_view);
            // Get the version number from the current AndroidFlavor object and
            // set this text on the number TextView
            addTextView.setText(currentGuide.getAddress());

            // Find the ImageView in the list_item.xml layout with the ID image.
            ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

            if (currentGuide.hasImage()){
                // Set the ImageView to the image resource specified in the current Word
                imageView.setImageResource(currentGuide.getImageResourceId());
                imageView.setVisibility(View.VISIBLE);
            } else {
                imageView.setVisibility(View.GONE);
            }



            View textContainer = listItemView.findViewById(R.id.text_container);
            int color = ContextCompat.getColor(getContext(), mColorResourceId);
            textContainer.setBackgroundColor(color);



            // Return the whole list item layout (containing 2 TextViews and an ImageView)
            // so that it can be shown in the ListView
            return listItemView;
        }

    }

