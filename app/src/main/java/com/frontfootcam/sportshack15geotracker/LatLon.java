package com.frontfootcam.sportshack15geotracker;



public class LatLon {
    private String lat;
    private String lon;

    public LatLon(String lat, String lon) {
        this.lat = lat;
        this.lon = lon;
    }

    public String getLat() {
        return lat;
    }

    public String getLon() {
        return lon;
    }
}
