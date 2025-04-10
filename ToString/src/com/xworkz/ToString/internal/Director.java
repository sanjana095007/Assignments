package com.xworkz.ToString.internal;

public class Director {
   private String name;
   private String genre;
   private int filmsDirected;

    public Director(String name, String genre, int filmsDirected) {
        this.name = name;
        this.genre = genre;
        this.filmsDirected = filmsDirected;
    }

    public String toString() {
        return "Director: " + name + ", Genre: " + genre + ", Films Directed: " + filmsDirected;
    }
    @Override
    public int hashCode() {
        return 125;
    }
}

