package com.xworkz.Instance.Airport;

public class KempegowdaInternational extends Airport {
    public void operate() {
        super.checkIn();
        super.securityCheck();
        super.board();
        super.takeOff();
        super.land();
        System.out.println("Kempegowda International Airport serves Bengaluru with modern facilities.");
    }
}
