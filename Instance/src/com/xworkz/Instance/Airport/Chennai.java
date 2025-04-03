package com.xworkz.Instance.Airport;

public class Chennai extends Airport {
    public void operate() {
        super.checkIn();
        super.securityCheck();
        super.board();
        super.takeOff();
        super.land();
        System.out.println("Chennai International Airport is a major gateway to South India.");
    }
}
