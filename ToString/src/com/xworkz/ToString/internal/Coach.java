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
}