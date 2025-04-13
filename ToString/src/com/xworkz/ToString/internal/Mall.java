package com.xworkz.ToString.internal;

public class Mall {
   private String name;
   private String location;
   private int numberOfShops;

    public Mall(String name, String location, int numberOfShops) {
        this.name = name;
        this.location = location;
        this.numberOfShops = numberOfShops;
    }

    public String toString() {
        return "Mall: " + name + ", Location: " + location + ", Number of Shops: " + numberOfShops;
    }
    @Override
    public int hashCode() {
        return 155;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Mall) {
                System.out.println("Reference of Mall will be compared");
                Mall mall = this;
                Mall mall1 = (Mall) obj;
                if (mall.name.equals(mall1.name) && mall.location.equals(mall1.location) ) {
                    System.out.println("Both malls are same");
                    return true;
                }
            }
        }
        return false;
    }

}
