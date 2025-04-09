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
}
