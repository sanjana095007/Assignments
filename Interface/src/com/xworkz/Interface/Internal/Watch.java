package com.xworkz.Interface.Internal;

public interface Watch {
    public abstract void showTime();
    public abstract void setAlarm();
    public abstract void changeBattery();
    default void wear() {
        System.out.println(" wear the watch correctly.");
    }
}
