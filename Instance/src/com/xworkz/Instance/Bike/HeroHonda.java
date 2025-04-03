package com.xworkz.Instance.Bike;

public class HeroHonda extends Bikes {

    public void ride() {
        super.start();
        super.accelerate();
        super.brake();
        super.stop();
        super.honk();
        System.out.println("Hero Honda is riding smoothly");
    }
}
