package com.xworkz.Interface.Internal;

public interface AlarmClock {
    public abstract void setAlarm();
    public abstract void stopAlarm();
    public abstract void snooze();
    default void brand() {
        System.out.println("Default AlarmClock brand is Titan");
    }
}
