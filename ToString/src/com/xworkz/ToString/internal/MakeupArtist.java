package com.xworkz.ToString.internal;
public class MakeupArtist {
  private String name;
  private String brand;
  private int clientsServed;

    public MakeupArtist(String name, String brand, int clientsServed) {
        this.name = name;
        this.brand = brand;
        this.clientsServed = clientsServed;
    }

    public String toString() {
        return "Makeup Artist: " + name + ", Brand: " + brand + ", Clients Served: " + clientsServed;
    }
    @Override
    public int hashCode() {
        return 154;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof MakeupArtist) {
                System.out.println("Reference of MakeupArtist will be compared");
                MakeupArtist artist = this;
                MakeupArtist artist1 = (MakeupArtist) obj;
                if (artist.name.equals(artist1.name) && artist.brand.equals(artist1.brand) ) {
                    System.out.println("Both makeup artists are same");
                    return true;
                }
            }
        }
        return false;
    }

}
