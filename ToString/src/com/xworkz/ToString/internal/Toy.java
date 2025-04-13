package com.xworkz.ToString.internal;

public class Toy {
    private String name;
    private String category;
    private double price;

    public Toy(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String toString() {
        return "Toy name: " + name + ", Category: " + category + ", Price: " + price;
    }
    @Override
    public int hashCode() {
        return 189;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Toy) {
                System.out.println("Reference of Toy will be compared");
                Toy toy = this;
                Toy toy1 = (Toy) obj;
                if (toy.name.equals(toy1.name)) {
                    System.out.println("Both toys are same");
                    return true;
                }
            }
        }
        return false;
    }

}
