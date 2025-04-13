package com.xworkz.ToString.internal;

public class Musician {
  private String name;
  private String instrument;
  private int albumsReleased;

    public Musician(String name, String instrument, int albumsReleased) {
        this.name = name;
        this.instrument = instrument;
        this.albumsReleased = albumsReleased;
    }

    public String toString() {
        return "Musician: " + name + ", Instrument: " + instrument + ", Albums Released: " + albumsReleased;
    }
    @Override
    public int hashCode() {
        return 162;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Musician) {
                System.out.println("Reference of Musician will be compared");
                Musician musician = this;
                Musician musician1 = (Musician) obj;
                if (musician.name.equals(musician1.name) && musician.instrument.equals(musician1.instrument)) {
                    System.out.println("Both musicians are same");
                    return true;
                }
            }
        }
        return false;
    }

}
