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
    @Override
    public int hashCode() {
        return 160;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Movie) {
                System.out.println("Reference of Movie will be compared");
                Movie movie = this;
                Movie movie1 = (Movie) obj;
                if (movie.title.equals(movie1.title) && movie.director.equals(movie1.director) ) {
                    System.out.println("Both movies are same");
                    return true;
                }
            }
        }
        return false;
    }

}

