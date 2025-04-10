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
}

