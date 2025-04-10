package com.xworkz.ToString.internal;

public class Tree {
    private String species;
    private int heightInFeet;
    private boolean isEvergreen;

    public Tree(String species, int heightInFeet, boolean isEvergreen) {
        this.species = species;
        this.heightInFeet = heightInFeet;
        this.isEvergreen = isEvergreen;
    }

    public String toString() {
        return "Tree: " + species + ", Height: " + heightInFeet + " Evergreen: " + isEvergreen;
    }
    @Override
    public int hashCode() {
        return 192;
    }
}
