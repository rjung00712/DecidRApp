package com.example.richard.decidr;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.LocationListener;
import android.location.Location;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.util.Log;

/**
 * Created by Richard on 7/7/16.
 */
public class MyLocListener implements LocationListener {

    @Override
    public void onLocationChanged(Location location) {
        if (location != null) {
            Log.e("Latitude : ", "" + location.getLatitude());
            Log.e("Longitude : ", "" + location.getLongitude());
        }

    }

    @Override
    public void onProviderEnabled(String provider) {}

    @Override
    public void onProviderDisabled(String provider) {}

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {}
}
