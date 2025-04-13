package com.xworkz.ToString.internal;

public class Traffic {
    private String city;
    private String congestionLevel;
    private int averageSpeed;

    public Traffic(String city, String congestionLevel, int averageSpeed) {
        this.city = city;
        this.congestionLevel = congestionLevel;
        this.averageSpeed = averageSpeed;
    }

    public String toString() {
        return "Traffic in " + city + ": Congestion Level " + congestionLevel + ", Avg Speed " + averageSpeed ;
    }
    @Override
    public int hashCode() {
        return 190;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Traffic) {
                System.out.println("Reference of Traffic will be compared");
                Traffic traffic = this;
                Traffic traffic1 = (Traffic) obj;
                if (traffic.city.equals(traffic1.city)) {
                    System.out.println("Both traffic instances are same");
                    return true;
                }
            }
        }
        return false;
    }

}
