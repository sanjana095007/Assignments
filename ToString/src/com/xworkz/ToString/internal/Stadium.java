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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Stadium) {
                System.out.println("Reference of Stadium will be compared");
                Stadium stadium = this;
                Stadium stadium1 = (Stadium) obj;
                if (stadium.name.equals(stadium1.name)) {
                    System.out.println("Both stadiums are same");
                    return true;
                }
            }
        }
        return false;
    }

}
