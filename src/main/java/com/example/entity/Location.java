package com.example.entity;

public class Location {

    private Integer location_id;
    private Integer longitude;
    private Integer latitude;

    public Location() {
    }

    public Location(Integer location_id, Integer longitude, Integer latitude) {
        this.location_id = location_id;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Integer getLocation_id() {
        return location_id;
    }

    public void setLocation_id(Integer location_id) {
        this.location_id = location_id;
    }

    public Integer getLongitude() {
        return longitude;
    }

    public void setLongitude(Integer longitude) {
        this.longitude = longitude;
    }

    public Integer getLatitude() {
        return latitude;
    }

    public void setLatitude(Integer latitude) {
        this.latitude = latitude;
    }
}
