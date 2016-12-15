/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.Earthquake;

import static com.example.android.Earthquake.R.id.date;

/**
 * {@link Earthquake} represents a single Android platform release.
 * Each object has 3 properties: name, version number, and image resource ID.
 */
public class Earthquake {

    // earthquake level
    private double mMagnitude;

    // country that has earthquake record
    private String mLocation;

    // date in milliseconds of earth quake
    private long mTimeInMilliseconds;

    /** Website URL of the earthquake */
    private String mUrl;


    /*
    * Create a new Earthquake object.
    *
    * @param vName is the name of the Android version (e.g. Gingerbread)
    * @param vNumber is the corresponding Android version number (e.g. 2.3-2.7)
    * @param image is drawable reference ID that corresponds to the Android version
    * */
    public Earthquake(double magnitude, String location, long TimeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = TimeInMilliseconds;
        mUrl = url;
    }

    /**
     * Get the EarthQuake level
     */
    public double getMagnitude() {
        return mMagnitude;
    }

    /**
     * Get the country that has Earthquake recorded
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * Get the date of earthquake
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /**
    * Returns the website URL to find more information about the earthquake.
    */
    public String getUrl() {
        return mUrl;
    }

}
