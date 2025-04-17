package com.xworkz.Interface.Another;

import com.xworkz.Interface.Internal.Chair;
import com.xworkz.Interface.Internal.Light;
import com.xworkz.Interface.Internal.Mobile;

public class Desk implements Chair, Light, Mobile {

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

    @Override
    public void call() {
        System.out.println("running the call method in SmartDesk");

    }

    @Override
    public void text() {
        System.out.println("running the text method in SmartDesk");

    }

    @Override
    public void browseInternet() {
        System.out.println("running the browseInternet method in SmartDesk");

    }
}
