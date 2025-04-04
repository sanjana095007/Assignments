package com.xworkz.Instance.Airport;

public class ShivajiMaharaj extends Airport {
    public void operate() {
        System.out.println("Chhatrapati Shivaji Maharaj International Airport is one of the busiest airports in India.");
    }
    @Override
    public void land() {
        System.out.println("An airplane is landing at the airport in Chhatrapati Shivaji Maharaj International Airport");
    }
    @Override
    public void takeOff() {
        System.out.println("An airplane is taking off from the airport in Chhatrapati Shivaji Maharaj International Airport");
    }
    @Override
    public void checkIn() {
        System.out.println("Passengers are checking in at the airport in Chhatrapati Shivaji Maharaj International Airport");
    }
    @Override
    public void securityCheck() {
        System.out.println("Security check is being conducted at the airport in Chhatrapati Shivaji Maharaj International Airport");
    }
    @Override
    public void board() {
        System.out.println("Passengers are boarding the flight in Chhatrapati Shivaji Maharaj International Airport.");
    }
}
