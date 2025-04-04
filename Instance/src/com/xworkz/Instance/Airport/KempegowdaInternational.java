package com.xworkz.Instance.Airport;

public class KempegowdaInternational extends Airport {
    public void operate() {

        System.out.println("Kempegowda International Airport serves Bengaluru with modern facilities.");
    }
    @Override
    public void land() {
        System.out.println("An airplane is landing at the airport in Kempegowda International");
    }
    @Override
    public void takeOff() {
        System.out.println("An airplane is taking off from the airport in Kempegowda International");
    }
    @Override
    public void checkIn() {
        System.out.println("Passengers are checking in at the airport in Kempegowda International");
    }
    @Override
    public void securityCheck() {
        System.out.println("Security check is being conducted at the airport in Kempegowda International");
    }
    @Override
    public void board() {
        System.out.println("Passengers are boarding the flight in Kempegowda International");
    }
}
