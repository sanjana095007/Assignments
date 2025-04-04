package com.xworkz.Instance.Airport;

public class Chennai extends Airport {
    public void operate() {
        System.out.println("Chennai International Airport is a major gateway to South India.");
    }
    @Override
    public void land() {
        System.out.println("An airplane is landing at the airport in chennai.");
    }
    @Override
    public void takeOff() {
        System.out.println("An airplane is taking off from the airport in chennai");
    }
    @Override
    public void checkIn() {
        System.out.println("Passengers are checking in at the airport in chennai");
    }
    @Override
    public void securityCheck() {
        System.out.println("Security check is being conducted at the airport in chennai");
    }
    @Override
    public void board() {
        System.out.println("Passengers are boarding the flight in chennai");
    }
}

