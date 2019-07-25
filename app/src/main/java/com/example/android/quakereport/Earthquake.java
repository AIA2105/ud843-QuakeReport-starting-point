package com.example.android.quakereport;

public class Earthquake  {

    private String magnitude;
    private String location;
    private String address;
    private String date;
    private String url;

    public Earthquake(String magnitude, String location, String address, String date , String url) {
        this.magnitude = magnitude;
        this.location = location;
        this.address = address;
        this.date = date;
        this.url = url ;
    }


    public String getMagnitude() {
        return magnitude;
    }

    public String getLocation() {
        return location;
    }

    public String getAddress() {
        return address;
    }

    public String getDate() { return date; }

    public String getUrl() { return url; }


}
