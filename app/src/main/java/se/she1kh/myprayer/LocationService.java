//package se.she1kh.myprayer;
//
//import android.annotation.TargetApi;
//import android.content.Context;
//import android.content.pm.PackageManager;
//import android.location.Location;
//import android.location.LocationListener;
//import android.location.LocationManager;
//import android.os.Build;
//import android.os.Bundle;
//import android.support.v4.content.ContextCompat;
//import android.util.Log;
//
///**
// * Created by Ussi on 11/12/2016.
// */
//
//public class LocationService implements LocationListener {
//
//    //The minimum distance to change updates in meters
//    private static final long MIN_DISTANCE_CHANGE_FOR_UPDATES = 0; // 10 meters
//
//    //The minimum time beetwen updates in milliseconds
//    private static final long MIN_TIME_BW_UPDATES = 0;//1000 * 60 * 1; // 1 minute
//
//    private final static boolean forceNetwork = false;
//
//    private static LocationService instance = null;
//
//    private LocationManager locationManager;
//    public Location location;
//    public double longitude;
//    public double latitude;
//    private boolean isGPSEnabled;
//    private boolean isNetworkEnabled;
//    private boolean locationServiceAvailable;
//
//
//    /**
//     * Singleton implementation
//     * @return
//     */
//    public static LocationService getLocationManager(Context context)     {
//        if (instance == null) {
//            instance = new LocationService(context);
//        }
//        return instance;
//    }
//
//    /**
//     * Local constructor
//     */
//    private LocationService( Context context )     {
//
//        initLocationService(context);
//        Log.i("HOSSI ","LocationService created");
//    }
//
//
//
//    /**
//     * Sets up location service after permissions is granted
//     */
//    @TargetApi(23)
//    private void initLocationService(Context context) {
//
//
//        if ( Build.VERSION.SDK_INT >= 23 &&
//                ContextCompat.checkSelfPermission( context, android.Manifest.permission.ACCESS_FINE_LOCATION ) != PackageManager.PERMISSION_GRANTED &&
//                ContextCompat.checkSelfPermission( context, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
//            return  ;
//        }
//
//        try   {
//            this.longitude = 0.0;
//            this.latitude = 0.0;
//            this.locationManager = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);
//
//            // Get GPS and network status
//            this.isGPSEnabled = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
//            this.isNetworkEnabled = locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER);
//
//            if (forceNetwork) isGPSEnabled = false;
//
//            if (!isNetworkEnabled && !isGPSEnabled)    {
//                // cannot get location
//                this.locationServiceAvailable = false;
//            }
//            else
//            {
//                this.locationServiceAvailable = true;
//
//                if (isNetworkEnabled) {
//                    locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER,
//                            MIN_TIME_BW_UPDATES,
//                            MIN_DISTANCE_CHANGE_FOR_UPDATES, this);
//                    if (locationManager != null)   {
//                        location = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
//                        updateCoordinates(location);
//                    }
//                }//end if
//
//                if (isGPSEnabled)  {
//                    locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,
//                            MIN_TIME_BW_UPDATES,
//                            MIN_DISTANCE_CHANGE_FOR_UPDATES, this);
//
//                    if (locationManager != null)  {
//                        location = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
//                        updateCoordinates(location);
//                    }
//                }
//            }
//        } catch (Exception ex)  {
//            Log.i("Hossi ", "Error creating location service: " + ex.getMessage() );
//
//        }
//    }
//
//
//    @Override
//    public void onLocationChanged(Location location)     {
//        // do stuff here with location object
//
//        Log.i("Hossi"," onLocationChanged!");
//    }
//
//    @Override
//    public void onStatusChanged(String s, int i, Bundle bundle) {
//
//    }
//
//    @Override
//    public void onProviderEnabled(String s) {
//
//    }
//
//    @Override
//    public void onProviderDisabled(String s) {
//
//    }
//
//
//
//    public void updateCoordinates(Location location){
//        Log.i("Hossi", location.getLatitude() + "");
//    }
//}