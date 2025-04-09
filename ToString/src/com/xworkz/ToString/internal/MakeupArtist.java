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
}
