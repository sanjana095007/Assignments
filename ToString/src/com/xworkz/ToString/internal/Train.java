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
}

