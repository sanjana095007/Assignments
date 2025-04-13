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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Director) {
                System.out.println("Reference of Director will be compared");
                Director director = this;
                Director director1 = (Director) obj;
                if (director.name.equals(director1.name) && director.genre.equals(director1.genre) && director.filmsDirected == director1.filmsDirected) {
                    System.out.println("Both directors are same");
                    return true;
                }
            }
        }
        return false;
    }

}

