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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Pharmacy) {
                System.out.println("Reference of Pharmacy will be compared");
                Pharmacy pharmacy = this;
                Pharmacy pharmacy1 = (Pharmacy) obj;
                if (pharmacy.name.equals(pharmacy1.name) && pharmacy.address.equals(pharmacy1.address)) {
                    System.out.println("Both pharmacies are same");
                    return true;
                }
            }
        }
        return false;
    }


}
