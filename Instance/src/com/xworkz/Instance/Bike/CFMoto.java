package com.xworkz.Instance.Bike;

public class CFMoto extends Bikes {
    public void ride() {
        super.start();
        super.accelerate();
        super.brake();
        super.honk();
        super.stop();
        System.out.println("CFMoto bikes bring innovation.");
    }
}

