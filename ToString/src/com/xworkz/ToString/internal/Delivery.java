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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Delivery) {
                System.out.println("Reference of Delivery will be compared");
                Delivery delivery = this;
                Delivery delivery1 = (Delivery) obj;
                if (delivery.name.equals(delivery1.name) && delivery.area.equals(delivery1.area) && delivery.deliveries == delivery1.deliveries) {
                    System.out.println("Both deliveries are same");
                    return true;
                }
            }
        }
        return false;
    }

}
