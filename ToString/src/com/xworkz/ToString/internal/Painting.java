package com.xworkz.ToString.internal;

public class Painting {
    private String color;
    private String title;
    private int year;

    public Painting(String color, String title, int year) {
        this.color = color;
        this.title = title;
        this.year = year;
    }

    @Override
    public String toString() {
        return "color :"+color+" "+ "title :"+title+" "+"year :"+year;
    }
    @Override
    public int hashCode() {
        return 165;
    }
}

