package com.xworkz.ToString.internal;

public class Table {
    private String shape;
    private String material;
    private int numberOfLegs;

    public Table(String shape, String material, int numberOfLegs) {
        this.shape = shape;
        this.material = material;
        this.numberOfLegs = numberOfLegs;
    }

    public String toString() {
        return "Table - Shape: " + shape + ", Material: " + material + ", Legs: " + numberOfLegs;
    }
    @Override
    public int hashCode() {
        return 184;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Table) {
                System.out.println("Reference of Table will be compared");
                Table t1 = this;
                Table t2 = (Table) obj;
                if (t1.material.equals(t2.material)) {
                    System.out.println("Both tables are same");
                    return true;
                }
            }
        }
        return false;
    }

}
