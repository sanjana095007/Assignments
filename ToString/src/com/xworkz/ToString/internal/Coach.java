package com.xworkz.ToString.internal;

public class Coach {
    private String name;
    private String sport;
    private int championships;

    public Coach(String name, String sport, int championships) {
        this.name = name;
        this.sport = sport;
        this.championships = championships;
    }

    public String toString() {
        return "Coach: " + name + ", Sport: " + sport + ", Championships: " + championships;
    }
    @Override
    public int hashCode() {
        return 118;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Coach) {
                System.out.println("Reference of Coach will be compared");
                Coach coach = this;
                Coach coach1 = (Coach) obj;
                if (coach.name.equals(coach1.name) && coach.sport.equals(coach1.sport) && coach.championships == coach1.championships) {
                    System.out.println("Both coaches are same");
                    return true;
                }
            }
        }
        return false;
    }

}