package com.xworkz.Interface.Inter;

import com.xworkz.Interface.Internal.Fan;
import com.xworkz.Interface.Internal.FanRemote;

public class SmartRemotes implements FanRemote, Fan {
    @Override
    public void turnOn() {
        System.out.println("running the turnOn method in SmartRemote");
    }

    @Override
    public void turnOff() {
        System.out.println("running the turnOff method in SmartRemote");
    }

    @Override
    public void adjustSpeed() {

    }

    @Override
    public void changeSpeed() {
        System.out.println("running the changeSpeed method in SmartRemote");
    }

}
