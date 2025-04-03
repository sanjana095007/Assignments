package com.xworkz.Instance.Bike;

public class MVAgusta extends Bikes{
    public void ride() {
        super.start();
        super.accelerate();
        super.brake();
        super.honk();
        super.stop();
        System.out.println("MV Agusta is pure Italian performance.");
    }
}

