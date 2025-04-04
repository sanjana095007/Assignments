package com.xworkz.referenceandvariable;

public class Transport {
    String mode;
    int capacity;
    double speed;
    Security security = new Security("High", 50);
    Transport(String mode, int capacity, double speed) {
        this.mode = mode;
        this.capacity = capacity;
        this.speed = speed;
    }

    void display() {
        System.out.println("Transport Mode: " + mode);
        System.out.println("Capacity: " + capacity);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("the security level  is :"+security.securityLevel);
        System.out.println("the number of guards :"+security.numberOfGuards);
        security.display();
    }
}
