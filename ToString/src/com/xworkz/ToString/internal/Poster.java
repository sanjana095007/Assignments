package com.xworkz.ToString.internal;

public class Poster {
    private String name;
    private int size;
    private  String color;

    public Poster(String name,int size,String color){
        this.name=name;
        this.size=size;
        this.color=color;
    }
    public String tostring(){
        return "name :"+name+" "+"size :"+size+" "+"color :"+color;
    }
    @Override
    public int hashCode() {
        return 175;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Poster) {
                System.out.println("Reference of Poster will be compared");
                Poster poster = this;
                Poster poster1 = (Poster) obj;
                if (poster.name.equals(poster1.name)) {
                    System.out.println("Both posters are same");
                    return true;
                }
            }
        }
        return false;
    }

}
