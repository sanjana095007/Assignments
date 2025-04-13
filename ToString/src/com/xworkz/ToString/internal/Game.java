package com.xworkz.ToString.internal;

public class Game {
    private String title;
    private String genre;
    private double rating;

    public Game(String title, String genre, double rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "title: " + title + ", genre: " + genre + ", rating: " + rating;
    }
    @Override
    public int hashCode() {
        return 140;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Game) {
                System.out.println("Reference of Game will be compared");
                Game game = this;
                Game game1 = (Game) obj;
                if (game.title.equals(game1.title) && game.genre.equals(game1.genre)) {
                    System.out.println("Both games are same");
                    return true;
                }
            }
        }
        return false;
    }

}
