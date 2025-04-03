package com.xworkz.Instance.Bike;

public class Triumph extends Bikes {
    public void ride() {
        super.start();
        super.accelerate();
        super.brake();
        super.honk();
        super.stop();
        System.out.println("Triumph is an adventure machine.");
    }
}
