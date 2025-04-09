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
}

