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
}