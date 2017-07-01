package com.example.android.alexandriatourguideminiapp;

/**
 * Created by user on 7/1/2017.
 */
public class Guide {
        private String mSite;
        private String mAddress;
        private int mImageResourceId = NO_IMAGE_PROVIDED;
        private static final int NO_IMAGE_PROVIDED = -1;

        public Guide(String site, String add ) {
            mSite = site;
            mAddress = add;

        }
    public Guide(String site, String add , int image ) {
        mSite = site;
        mAddress = add;
        mImageResourceId = image;

    }




    public String getSite() {
            return mSite;

        }


        public String getAddress() {
            return mAddress;

        }

        public int getImageResourceId() {
            return mImageResourceId;

        }

        public boolean hasImage() {
            return mImageResourceId != NO_IMAGE_PROVIDED;
        }
    }

