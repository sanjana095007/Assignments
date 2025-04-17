package com.xworkz.Interface.Internal;

public class SmartTV  implements Television{
    @Override
    public void switchChannel() {
        System.out.println("running the switchOn method");
    }

    @Override
    public void adjustVolume() {
        System.out.println("running the adjustVolume method");
    }

    @Override
    public void powerOff() {
        System.out.println("running the powerOff method");
    }
}
