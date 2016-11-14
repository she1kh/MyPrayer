//package se.she1kh.myprayer;
//
//import android.app.Service;
//import android.content.Context;
//import android.content.Intent;
//import android.content.pm.PackageManager;
//import android.location.Location;
//import android.location.LocationManager;
//import android.os.Bundle;
//import android.os.IBinder;
//import android.support.v4.app.ActivityCompat;
//import android.util.Log;
//
///**
// * Created by Ussi on 11/12/2016.
// *
// */
//
//public class MyLocationService extends Service {
//    private static final String TAG = "HOSSI";
//    private LocationManager mLocationManager = null;
//    private static final int LOCATION_INTERVAL = 1000;
//    private static final float LOCATION_DISTANCE = 10f;
//
//    private class LocationListener implements android.location.LocationListener {
//        Location mLastLocation;
//
//        public LocationListener(String provider) {
//            Log.e(TAG, "LocationListener " + provider);
//            mLastLocation = new Location(provider);
//
//        }
//
//        @Override
//        public void onLocationChanged(Location location) {
//            Log.e(TAG, "onLocationChanged: " + location);
//            mLastLocation.set(location);
//        }
//
//        @Override
//        public void onProviderDisabled(String provider) {
//            Log.e(TAG, "onProviderDisabled: " + provider);
//        }
//
//        @Override
//        public void onProviderEnabled(String provider) {
//            Log.e(TAG, "onProviderEnabled: " + provider);
//        }
//
//        @Override
//        public void onStatusChanged(String provider, int status, Bundle extras) {
//            Log.e(TAG, "onStatusChanged: " + provider);
//        }
//    }
//
//    /*
//    LocationListener[] mLocationListeners = new LocationListener[]{
//            new LocationListener(LocationManager.GPS_PROVIDER),
//            new LocationListener(LocationManager.NETWORK_PROVIDER)
//    };
//    */
//
//}
