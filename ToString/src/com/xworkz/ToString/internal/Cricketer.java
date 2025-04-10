package com.xworkz.ToString.internal;

public class Cricketer {
   private String name;
   private String role;
   private int matchesPlayed;

    public Cricketer(String name, String role, int matchesPlayed) {
        this.name = name;
        this.role = role;
        this.matchesPlayed = matchesPlayed;
    }

    public String toString() {
        return "Cricketer: " + name + ", Role: " + role + ", Matches Played: " + matchesPlayed;
    }
    @Override
    public int hashCode() {
        return 121;
    }
}

