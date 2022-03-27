package com.example.homeworkandroid;

import com.google.firebase.database.Exclude;

import java.io.Serializable;

public class Marker implements Serializable {
private String MarkerName;
private String MarkerInfo;

private String MarkerLocation;
@Exclude
private String MarkerKey;



    public Marker(){

    }

    public String getMarkerName() {
        return MarkerName;
    }

    public void setMarkerName(String markerName) {
        MarkerName = markerName;
    }

    public String getMarkerInfo() {
        return MarkerInfo;
    }

    public void setMarkerInfo(String markerInfo) {
        MarkerInfo = markerInfo;
    }

    public String getMarkerLocation() {
        return MarkerLocation;
    }

    public void setMarkerLocation(String markerLocation) {
        MarkerLocation = markerLocation;
    }

    public String getMarkerKey() {
        return MarkerKey;
    }

    public void setMarkerKey(String markerKey) { MarkerKey = markerKey; }
}
