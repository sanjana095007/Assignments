package com.xworkz.ToString.internal;

public class Bag {
   private String brand;
   private int capacity;
   private boolean isWaterproof;

    public Bag(String brand, int capacity, boolean isWaterproof) {
        this.brand = brand;
        this.capacity = capacity;
        this.isWaterproof = isWaterproof;
    }

    public String toString() {
        return "Bag - Brand: " + brand + ", Capacity: " + capacity + "L, Waterproof: " + isWaterproof;
    }
    @Override
    public int hashCode() {
        return 104;
    }
    @Override
    public boolean equals(Object obj)
    {
        if(obj!=null){
            System.out.println("null reference");
            if(obj instanceof  Athlete){
                System.out.println("reference of Bag ,will be compared");
                Bag bag=this;
                Bag bag1=(Bag)obj;
                if(bag.brand.equals(bag1.brand) && bag.capacity==bag1.capacity && bag.isWaterproof==bag1.isWaterproof){
                    System.out.println("both are same");
                    return true;
                }

            }
        }

        return false;
    }
}
