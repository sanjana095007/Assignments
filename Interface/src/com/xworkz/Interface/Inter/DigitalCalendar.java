package com.xworkz.Interface.Inter;

import com.xworkz.Interface.Internal.AlarmClock;
import com.xworkz.Interface.Internal.MobileApp;

public class DigitalCalendar implements AlarmClock, MobileApp {


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
    public void setAlarm() {
        System.out.println("running the setAlarm method in DigitalCalendar");
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
