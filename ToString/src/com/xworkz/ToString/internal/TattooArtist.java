package com.xworkz.ToString.internal;

public class TattooArtist {
    private String name;
    private String studio;
    private int tattoosDone;

    public TattooArtist(String name, String studio, int tattoosDone) {
        this.name = name;
        this.studio = studio;
        this.tattoosDone = tattoosDone;
    }

    public String toString() {
        return "TattooArtist: " + name + ", Studio: " + studio + ", Tattoos Done: " + tattoosDone;
    }
}
