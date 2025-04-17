package com.xworkz.Interface.Another;

import com.xworkz.Interface.Internal.Mobile;
import com.xworkz.Interface.Internal.MobileApp;
import com.xworkz.Interface.Internal.Television;

public class ScreenTouch implements Television, Mobile, MobileApp {

    @Override
    public void call() {
        System.out.println("running the call method in ScreenTouch");
    }

    @Override
    public void text() {
        System.out.println("running the text method in ScreenTouch");
    }

    @Override
    public void browseInternet() {
        System.out.println("running the browseInternet method in ScreenTouch");
    }

    @Override
    public void switchChannel() {
        System.out.println("running the switchChannel method in ScreenTouch");
    }

    @Override
    public void adjustVolume() {
        System.out.println("running the adjustVolume method in ScreenTouch");
    }

    @Override
    public void powerOff() {
        System.out.println("running the powerOff method in ScreenTouch");
    }

    @Override
    public void openApp() {
        System.out.println("running the powerOff method in ScreenTouch");

    }

    @Override
    public void performAction() {
        System.out.println("running the powerOff method in ScreenTouch");

    }

    @Override
    public void closeApp() {
        System.out.println("running the powerOff method in ScreenTouch");

    }
}
