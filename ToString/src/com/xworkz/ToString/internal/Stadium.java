package com.xworkz.ToString.internal;

public class Stadium {
    private String name;
    private String location;
    private int capacity;

    public Stadium(String name, String location, int capacity) {
        this.name = name;
        this.location = location;
        this.capacity = capacity;
    }

    public String toString() {
        return "Stadium: " + name + ", Location: " + location + ", Capacity: " + capacity;
    }
    @Override
    public int hashCode() {
        return 182;
    }
}
