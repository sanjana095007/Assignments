package com.xworkz.Instance.Bike;

public class Ducati extends Bikes {
    public void ride() {
        super.start();
        super.accelerate();
        super.brake();
        super.stop();
        super.honk();
        System.out.println("Ducati is delivering a premium ride experience.");
    }
}
