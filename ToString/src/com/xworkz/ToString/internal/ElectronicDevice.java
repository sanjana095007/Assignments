package com.xworkz.ToString.internal;

public class ElectronicDevice {
    private String type;
    private String brand;
    private double cost;

    public ElectronicDevice(String type, String brand, double cost) {
        this.type = type;
        this.brand = brand;
        this.cost = cost;
    }

    public String toString() {
        return "type: " + type + ", Brand: " + brand + ", Cost: $" + cost;
    }
    @Override
    public int hashCode() {
        return 128;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof ElectronicDevice) {
                System.out.println("Reference of ElectronicDevice will be compared");
                ElectronicDevice device = this;
                ElectronicDevice device1 = (ElectronicDevice) obj;
                if (device.type.equals(device1.type) && device.brand.equals(device1.brand) && device.cost == device1.cost) {
                    System.out.println("Both electronic devices are same");
                    return true;
                }
            }
        }
        return false;
    }

}
