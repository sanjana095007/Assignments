package com.xworkz.Interface.Inter;

import com.xworkz.Interface.Internal.Chair;
import com.xworkz.Interface.Internal.Light;

public class SmartDesk implements Chair, Light {

    @Override
    public void sit() {
        System.out.println("running the sit method in SmartDesk");
    }

    @Override
    public void move() {
        System.out.println("running the move method in SmartDesk");
    }

    @Override
    public void fold() {
        System.out.println("running the fold method in SmartDesk");
    }

    @Override
    public void turnOn() {
        System.out.println("running the turnOn method in SmartDesk");
    }

    @Override
    public void turnOff() {
        System.out.println("running the turnOff method in SmartDesk");
    }

    @Override
    public void dim() {
        System.out.println("running the dim method in SmartDesk");
    }
}
