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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Cricketer) {
                System.out.println("Reference of Cricketer will be compared");
                Cricketer cricketer = this;
                Cricketer cricketer1 = (Cricketer) obj;
                if (cricketer.name.equals(cricketer1.name) && cricketer.role.equals(cricketer1.role) && cricketer.matchesPlayed == cricketer1.matchesPlayed) {
                    System.out.println("Both cricketers are same");
                    return true;
                }
            }
        }
        return false;
    }

}

