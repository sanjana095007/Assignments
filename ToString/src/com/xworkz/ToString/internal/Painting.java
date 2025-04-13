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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Painting) {
                System.out.println("Reference of Painting will be compared");
                Painting painting = this;
                Painting painting1 = (Painting) obj;
                if (painting.title.equals(painting1.title)  && painting.year == painting1.year) {
                    System.out.println("Both paintings are same");
                    return true;
                }
            }
        }
        return false;
    }

}

