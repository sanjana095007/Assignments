package com.xworkz.ToString.internal;

public class Athlete {
   private String name;
   private String sport;
   private int medalsWon;

    public Athlete(String name, String sport, int medalsWon) {
        this.name = name;
        this.sport = sport;
        this.medalsWon = medalsWon;
    }

    public String toString() {
        return "Athlete: " + name + ", Sport: " + sport + ", Medals Won: " + medalsWon;
    }
}

