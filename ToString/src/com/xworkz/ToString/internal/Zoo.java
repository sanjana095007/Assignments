package com.xworkz.ToString.internal;

public class Zoo {
    private String name;
    private String city;
    private int animals;

    public Zoo(String name, String city, int animals) {
        this.name = name;
        this.city = city;
        this.animals = animals;
    }

    public String toString() {
        return "Zoo name: " + name + ", City: " + city + ", Animals: " + animals;
    }
    @Override
    public int hashCode() {
        return 198;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Zoo) {
                System.out.println("Reference of Zoo will be compared");
                Zoo zoo1 = this;
                Zoo zoo2 = (Zoo) obj;
                if (zoo1.name.equals(zoo2.name)) {
                    System.out.println("Both zoos are same");
                    return true;
                }
            }
        }
        return false;
    }

}

