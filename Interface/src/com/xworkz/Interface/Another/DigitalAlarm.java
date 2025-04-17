package com.xworkz.Interface.Another;

import com.xworkz.Interface.Internal.AlarmClock;
import com.xworkz.Interface.Internal.MobileApp;
import com.xworkz.Interface.Internal.Watch;

public class DigitalAlarm implements AlarmClock, MobileApp, Watch {

    @Override
    public void openApp() {
        System.out.println("running the openApp method in DigitalCalendar");
    }

    @Override
    public void performAction() {
        System.out.println("running the performAction method in DigitalCalendar");
    }

    @Override
    public void closeApp() {
        System.out.println("running the closeApp method in DigitalCalendar");
    }

    @Override
    public void showTime() {
        System.out.println("running the showTime method in DigitalCalendar");

    }

    @Override
    public void setAlarm() {
        System.out.println("running the setAlarm method in DigitalCalendar");
    }

    @Override
    public void changeBattery() {
        System.out.println("running the changeBattery method in DigitalCalendar");

    }

    @Override
    public void stopAlarm() {
        System.out.println("running the stopAlarm method in DigitalCalendar");
    }

    @Override
    public void snooze() {
        System.out.println("running the snooze method in DigitalCalendar");
    }

}
