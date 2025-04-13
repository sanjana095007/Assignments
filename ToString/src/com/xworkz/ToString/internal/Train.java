package com.xworkz.ToString.internal;

public class Train {
    private String name;
    private int coaches;
    private String route;

    public Train(String name, int coaches, String route) {
        this.name = name;
        this.coaches = coaches;
        this.route = route;
    }

    @Override
    public String toString() {
        return "name: " + name + ", Coaches: " + coaches + ", Route: " + route;
    }
    @Override
    public int hashCode() {
        return 191;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Train) {
                System.out.println("Reference of Train will be compared");
                Train train = this;
                Train train1 = (Train) obj;
                if (train.name.equals(train1.name)) {
                    System.out.println("Both trains are same");
                    return true;
                }
            }
        }
        return false;
    }

}

