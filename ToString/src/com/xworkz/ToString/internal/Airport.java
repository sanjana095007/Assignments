package com.xworkz.ToString.internal;

public class Airport {
    private String name;
    private String city;
    private int terminals;

    public Airport(String name, String city, int terminals) {
        this.name = name;
        this.city = city;
        this.terminals = terminals;
    }

    @Override
    public String toString() {
        return "Airport name : " + name + ", City: " + city + ", Terminals: " + terminals;
    }
    @Override
    public int hashCode() {
        return 101;
    }
    @Override
    public boolean equals(Object obj)
    {
        if(obj!=null){
            System.out.println("null reference");
            if(obj instanceof  Airport){
                System.out.println("reference of Airport ,will be compared");
                Airport airport=this;
                Airport airport1=(Airport)obj;
                if(airport.name.equals(airport1.name) && airport.city.equals(airport1.city)  && airport.terminals==airport1.terminals){
                    System.out.println("both are same");
                    return true;
                }

            }
        }

        return false;
    }
}

