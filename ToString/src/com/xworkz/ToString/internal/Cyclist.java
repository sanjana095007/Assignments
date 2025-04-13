package com.xworkz.ToString.internal;

public class Cyclist {
   private String name;
   private String team;
   private int racesWon;

    public Cyclist(String name, String team, int racesWon) {
        this.name = name;
        this.team = team;
        this.racesWon = racesWon;
    }

    public String toString() {
        return "Cyclist: " + name + ", Team: " + team + ", Races Won: " + racesWon;
    }
    @Override
    public int hashCode() {
        return 122;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Cyclist) {
                System.out.println("Reference of Cyclist will be compared");
                Cyclist cyclist = this;
                Cyclist cyclist1 = (Cyclist) obj;
                if (cyclist.name.equals(cyclist1.name) && cyclist.team.equals(cyclist1.team) && cyclist.racesWon == cyclist1.racesWon) {
                    System.out.println("Both cyclists are same");
                    return true;
                }
            }
        }
        return false;
    }

}

