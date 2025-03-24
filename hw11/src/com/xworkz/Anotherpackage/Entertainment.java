package com.xworkz.Anotherpackage;

import com.xworkz.access.Banking;
import com.xworkz.access.Movie;

public class Entertainment {
    Movie movie=new Movie();
    void display(){
        movie.title="Dragon";
        movie.settitle();
        System.out.println("the name of the emp is :"+movie.title);;
    }
}
