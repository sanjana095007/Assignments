package com.xworkz.Instance.Airport;

public class ShivajiMaharaj extends Airport {
    public void operate() {
        super.checkIn();
        super.securityCheck();
        super.board();
        super.takeOff();
        super.land();
        System.out.println("Chhatrapati Shivaji Maharaj International Airport is one of the busiest airports in India.");
    }
}
