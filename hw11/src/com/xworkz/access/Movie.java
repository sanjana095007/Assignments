package com.xworkz.access;

public class Movie {
    public String title;
    int duration;
    private double rating;

    public void settitle() {
        System.out.println("the name of the movie is :"+title);
    }

    void showDuration() {
        System.out.println("Duration: " + duration + " hrs");
        this.rating=4.5;
        System.out.println("the rating of the movie out of 5 star :"+this.rating);

    }

    private void Rating() {
        System.out.println("the rating of the movie out of 5 star :"+rating);
    }
}
