package com.xworkz.Instance.Bike;


public class RoyalEnfield extends Bikes {
    public void ride() {
        super.start();
        super.accelerate();
        super.brake();
        super.honk();
        super.stop();
        System.out.println("Royal Enfield is built like a gun.");
    }
}
