package com.xworkz.ToString.internal;

public class Waiter {
    private String name;
    private String restaurant;
    private int tablesServed;

    public Waiter(String name, String restaurant, int tablesServed) {
        this.name = name;
        this.restaurant = restaurant;
        this.tablesServed = tablesServed;
    }

    public String toString() {
        return "Waiter: " + name + ", Restaurant: " + restaurant + ", Tables Served: " + tablesServed;
    }
    @Override
    public int hashCode() {
        return 194;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Waiter) {
                System.out.println("Reference of Waiter will be compared");
                Waiter Waiter = this;
                Waiter Waiter1 = (Waiter) obj;
                if (Waiter.name.equals(Waiter1.name)) {
                    System.out.println("Both waiters are same");
                    return true;
                }
            }
        }
        return false;
    }

}