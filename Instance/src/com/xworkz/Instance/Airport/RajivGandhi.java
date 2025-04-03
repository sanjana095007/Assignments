package com.xworkz.Instance.Airport;

public class RajivGandhi extends Airport {
    public void operate() {
        super.checkIn();
        super.securityCheck();
        super.board();
        super.takeOff();
        super.land();
        System.out.println("Rajiv Gandhi International Airport is a major airport in Hyderabad.");
    }
}
