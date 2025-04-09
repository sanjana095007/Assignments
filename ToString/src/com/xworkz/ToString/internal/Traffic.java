package com.xworkz.ToString.internal;

public class Traffic {
    private String city;
    private String congestionLevel; // scale 1 to 10
    private int averageSpeed; // in km/h

    public Traffic(String city, String congestionLevel, int averageSpeed) {
        this.city = city;
        this.congestionLevel = congestionLevel;
        this.averageSpeed = averageSpeed;
    }

    public String toString() {
        return "Traffic in " + city + ": Congestion Level " + congestionLevel + ", Avg Speed " + averageSpeed + " km/h";
    }
}
