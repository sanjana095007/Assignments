package com.xworkz.ToString.internal;

public class Animal {
    private String name;
    private int height;
    private double weight;

    public Animal(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal: name = " + name + ", height : " + height + ", Weight = " + weight + " kg";
    }
    @Override
    public int hashCode() {
        return 102;
    }
    @Override
    public boolean equals(Object obj)
    {
        if(obj!=null){
            System.out.println("null reference");
            if(obj instanceof  Animal){
                System.out.println("reference of Animal ,will be compared");
                Animal animal=this;
                Animal animal1=(Animal)obj;
                if(animal.name.equals(animal1.name) && animal.height==animal1.height  && animal.weight==animal1.weight){
                    System.out.println("both are same");
                    return true;
                }

            }
        }

        return false;
    }
}

