package com.frontfootcam.sportshack15geotracker;


import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;

// make sure we use a WakefulBroadcastReceiver so that we acquire a partial wakelock
public class GeoTrackerAlarmReceiver extends WakefulBroadcastReceiver {
    private static final String TAG = "GeoTrackerAlarmReceiver";
    @Override
    public void onReceive(Context context, Intent intent) {
        context.startService(new Intent(context, LocationService.class));
    }
}