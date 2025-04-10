package com.xworkz.ToString.internal;

public class Pharmacy {
    private String name;
    private String address;
    private int medicines;

    public Pharmacy(String name, String address, int medicines) {
        this.name = name;
        this.address = address;
        this.medicines = medicines;
    }

    public String toString() {
        return "Pharmacy name: " + name + ", Address: " + address + ", Medicines: " + medicines;
    }
    @Override
    public int hashCode() {
        return 167;
    }
}
