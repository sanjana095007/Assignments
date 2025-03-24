package com.xworkz.access;

public class PVR {
    Movie movie=new Movie();
    public void display(){
        movie.title="Dragon";
        movie.duration=3;;

        System.out.println("the name of the movie is :"+movie.title);
        System.out.println("duration is : " + movie.duration +"hrs");
        movie.showDuration();
    }
}
