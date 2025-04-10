package com.xworkz.ToString.internal;

public class Delivery {
    private String name;
    private String area;
    private int deliveries;

    public Delivery(String name, String area, int deliveries) {
        this.name = name;
        this.area = area;
        this.deliveries = deliveries;
    }

    public String toString() {
        return "DeliveryPerson: " + name + ", Area: " + area + ", Deliveries: " + deliveries;
    }
    @Override
    public int hashCode() {
        return 124;
    }
}
