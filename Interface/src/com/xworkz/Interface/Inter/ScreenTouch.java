package com.xworkz.Interface.Inter;

import com.xworkz.Interface.Internal.Mobile;
import com.xworkz.Interface.Internal.Television;

public class ScreenTouch implements Television, Mobile {
    @Override
    public void call() {
        System.out.println("running the call method in ScreenTouch ");
    }

    @Override
    public void text() {
        System.out.println("running the text method in ScreenTouch ");
    }

    @Override
    public void browseInternet() {
        System.out.println("running the cabrowseInternetll method in ScreenTouch ");
    }

    @Override
    public void switchChannel() {
        System.out.println("running the switchChannel method in ScreenTouch ");
    }

    @Override
    public void adjustVolume() {
        System.out.println("running the adjustVolume method in ScreenTouch ");
    }

    @Override
    public void powerOff() {
        System.out.println("running the powerOff method in ScreenTouch ");
    }
}
