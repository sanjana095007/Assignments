package com.xworkz.ToString.internal;

public class Movie {
    private String title;
    private String director;
    private int durationMins;

    public Movie(String title, String director, int durationMins) {
        this.title = title;
        this.director = director;
        this.durationMins = durationMins;
    }

    @Override
    public String toString() {
        return "title :"+title+" "+ "director :"+director+" "+"durationMins :"+durationMins;
    }
}

