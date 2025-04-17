package com.xworkz.Interface.Internal;

public class Clock implements AlarmClock{
    @Override
    public void setAlarm() {
        System.out.println("running the setAlarm method");
    }

    @Override
    public void stopAlarm() {
        System.out.println("running the ring method");
    }

    @Override
    public void snooze() {
        System.out.println("running the snooze method");
    }

    @Override
    public void brand() {
        System.out.println("running the brand method");
    }
}
