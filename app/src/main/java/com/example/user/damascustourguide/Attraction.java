package com.example.user.damascustourguide;

/**
 * Created by User on 29-Jun-18.
 */

public class Attraction {

    private int mDescription;

    private int mTitle;

    private int mImage = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;


    public Attraction(int description, int title) {
        mDescription = description;
        mTitle = title;
    }



    public Attraction(int description, int title, int image) {
        mDescription = description;
        mTitle = title;
        mImage = image;
    }


    public int getDescription() {
        return mDescription;
    }

    public int getTitle() {
        return mTitle;
    }

    public int getImage() {
        return mImage;
    }

    public boolean hasImage() {
        return mImage != NO_IMAGE_PROVIDED;
    }

}