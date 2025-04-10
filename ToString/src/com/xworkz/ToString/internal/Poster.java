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
}
