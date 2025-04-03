package com.xworkz.Instance.Bike;


public class Bajaj extends Bikes {
    public void ride() {
        super.start();
        super.accelerate();
        super.brake();
        super.stop();
        super.honk();
        System.out.println("Bajaj is efficient and powerful.");
    }
}
