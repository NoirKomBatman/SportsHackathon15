package com.frontfootcam.sportshack15geotracker;


import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;

import com.firebase.client.Firebase;

public class FirebaseClient extends Service {

    private Firebase playerRef;
    private String defaultUploadWebsite = "https://scorching-torch-5118.firebaseio.com/";
    private boolean inRequest;

    @Override
    public void onCreate() {
        super.onCreate();
        playerRef = new Firebase(defaultUploadWebsite);
        inRequest = false;
    }

    public void publishRequest(Object req) {
        if (inRequest) {
            for (int i = 0; i < 5; i++);
            inRequest = false;
        }
        playerRef.push().setValue(req);
        inRequest = false;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return 0;
    }

    public FirebaseClient getFirebaseRef() {
        return this;
    }
}
