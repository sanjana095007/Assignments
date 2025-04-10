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
}
