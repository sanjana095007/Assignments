package com.xworkz.ToString.internal;

public class City {
    private String name;
    private String country;
    private int population;

    public City(String name, String country, int population) {
        this.name = name;
        this.country = country;
        this.population = population;
    }

    @Override
    public String toString() {
        return "name :"+name+" "+ "country :"+country+" "+"population :"+population;
    }
    @Override
    public int hashCode() {
        return 117;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof City) {
                System.out.println("Reference of City will be compared");
                City city = this;
                City city1 = (City) obj;
                if (city.name.equals(city1.name) && city.country.equals(city1.country) && city.population == city1.population) {
                    System.out.println("Both cities are same");
                    return true;
                }
            }
        }
        return false;
    }

}
