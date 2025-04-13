package com.xworkz.ToString.internal;

public class Bakery {
    private String name;
    private String bakery;
    private int itemsBaked;

    public Bakery(String name, String bakery, int itemsBaked) {
        this.name = name;
        this.bakery = bakery;
        this.itemsBaked = itemsBaked;
    }

    public String toString() {
        return "Baker: " + name + ", Bakery: " + bakery + ", Items Baked: " + itemsBaked;
    }
    @Override
    public int hashCode() {
        return 105;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Bakery) {
                System.out.println("Reference of Bakery will be compared");
                Bakery bakery = this;
                Bakery bakery1 = (Bakery) obj;
                if (bakery.name.equals(bakery1.name) && bakery.bakery.equals(bakery1.bakery) && bakery.itemsBaked== bakery1.itemsBaked) {
                    System.out.println("Both bakeries are same");
                    return true;
                }
            }
        }
        return false;
    }


}

