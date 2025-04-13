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
    @Override
    public int hashCode() {
        return 186;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof TattooArtist) {
                System.out.println("Reference of TattooArtist will be compared");
                TattooArtist artist = this;
                TattooArtist artist1 = (TattooArtist) obj;
                if (artist.name.equals(artist1.name)) {
                    System.out.println("Both tattoo artists are same");
                    return true;
                }
            }
        }
        return false;
    }

}
