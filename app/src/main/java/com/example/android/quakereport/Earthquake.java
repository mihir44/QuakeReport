package com.example.android.quakereport;

public class Earthquake {

    private String mUrl;

    // Name of the Android version
    private String mPlaceName;

    // Android version number (e.g. 2.3-2.7, 3.0-3.2.6, 4.0-4.0.4)
    private double mMagnitude;

    // Drawable resource ID
    private long mdate;

    public Earthquake(double magnitude, String place, long date, String url ){
        mdate = date;

        mPlaceName = place;

        mMagnitude = magnitude;

        mUrl = url;

    }
    /**
     * Get PlaceName
     */
    public String getPlaceName() {
        return mPlaceName;
    }

    /**
     * Get the date
     */
    public long getDate() {
        return mdate;
    }

    /**
     * Get the Magnitude
     */
    public double getMagnitude() {
        return mMagnitude;
    }

    public String getUrl() {
        return mUrl;
    }

}
