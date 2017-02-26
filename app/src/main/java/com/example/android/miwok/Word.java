package com.example.android.miwok;

/**
 * Created by Srivignesh on 22-02-2017.
 */

public class Word {

    private String miwokTranslation;
    private String defaultTranslation;
    private int imageId;

    public Word(String defaultTranslation, String miwokTranslation) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
    }

    public Word(int imageId, String defaultTranslation, String miwokTranslation) {
        this.imageId = imageId;
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
    }

    /*Get the miwok image*/
    public int getImageId() {
        return imageId;
    }

    /*Set the miwok image*/
    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    /*Get the miwok translation word*/
    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    /*Set the miwok translation word*/
    public void setMiwokTranslation(String miwokTranslation) {
        this.miwokTranslation = miwokTranslation;
    }

    /*Get the default translation word*/
    public String getDefaultTranslation() {
        return defaultTranslation;
    }


    /*Set the default translation word*/
    public void setDefaultTranslation(String defaultTranslation) {
        this.defaultTranslation = defaultTranslation;
    }


}
