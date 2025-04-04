package com.xworkz.Instance.Airport;

public class RajivGandhi extends Airport {
    public void operate() {

        System.out.println("Rajiv Gandhi International Airport is a major airport in Hyderabad.");
    }
    @Override
    public void land() {
        System.out.println("An airplane is landing at the airport in Rajiv Gandhi International Airport");
    }
    @Override
    public void takeOff() {
        System.out.println("An airplane is taking off from the airport in Rajiv Gandhi International Airport");
    }
    @Override
    public void checkIn() {
        System.out.println("Passengers are checking in at the airport in Rajiv Gandhi International Airport");
    }
    @Override
    public void securityCheck() {
        System.out.println("Security check is being conducted at the airport in Rajiv Gandhi International Airport");
    }
    @Override
    public void board() {
        System.out.println("Passengers are boarding the flight in Rajiv Gandhi International Airport");
    }
}
