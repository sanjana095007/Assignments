package com.xworkz.ToString.internal;

public class Scientist {
    private String name;
    private String field;
    private int discoveries;

    public Scientist(String name, String field, int discoveries) {
        this.name = name;
        this.field = field;
        this.discoveries = discoveries;
    }

    public String toString() {
        return "Scientist: " + name + ", Field: " + field + ", Discoveries: " + discoveries;
    }
}

