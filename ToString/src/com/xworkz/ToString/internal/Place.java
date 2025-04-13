package com.xworkz.ToString.internal;

public class Place {
   private String name;
   private String country;
   private int population;

    public Place(String name, String country, int population) {
        this.name = name;
        this.country = country;
        this.population = population;
    }

    public String toString() {
        return "Place: " + name + ", Country: " + country + ", Population: " + population;
    }
    @Override
    public int hashCode() {
        return 170;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Place) {
                System.out.println("Reference of Place will be compared");
                Place place = this;
                Place place1 = (Place) obj;
                if (place.name.equals(place1.name)) {
                    System.out.println("Both places are same");
                    return true;
                }
            }
        }
        return false;
    }

}

