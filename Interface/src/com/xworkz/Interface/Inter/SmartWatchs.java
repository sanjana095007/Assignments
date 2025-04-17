package com.xworkz.Interface.Inter;

import com.xworkz.Interface.Internal.AlarmClock;
import com.xworkz.Interface.Internal.MobileApp;

public class SmartWatchs implements AlarmClock, MobileApp {
    @Override
    public void openApp() {
        System.out.println("running openapp in smartwatchs");
    }

    @Override
    public void performAction() {
        System.out.println("running performAction in smartwatchs");
    }

    @Override
    public void closeApp() {
        System.out.println("running closeApp in smartwatchs");
    }

    @Override
    public void setAlarm() {
        System.out.println("running setAlarm in smartwatchs");
    }

    @Override
    public void stopAlarm() {
        System.out.println("running stopAlarm in smartwatchs");
    }

    @Override
    public void snooze() {
        System.out.println("running snooze in smartwatchs");
    }
}
