package com.xworkz.Interface.Another;

import com.xworkz.Interface.Internal.AlarmClock;
import com.xworkz.Interface.Internal.MobileApp;
import com.xworkz.Interface.Internal.Thermometer;

public class Fitness implements AlarmClock, Thermometer, MobileApp {

    @Override
    public void measureTemperature() {
        System.out.println("running the measureTemperature method in FitnessBand");
    }

    @Override
    public void showReading() {
        System.out.println("running the showReading method in FitnessBand");
    }

    @Override
    public void reset() {
        System.out.println("running the reset method in FitnessBand");
    }

    @Override
    public void setAlarm() {
        System.out.println("running the setAlarm method in FitnessBand");
    }

    @Override
    public void stopAlarm() {
        System.out.println("running the stopAlarm method in FitnessBand");
    }

    @Override
    public void snooze() {
        System.out.println("running the snooze method in FitnessBand");
    }

    @Override
    public void openApp() {
        System.out.println("running the openApp method in FitnessBand");
    }

    @Override
    public void performAction() {
        System.out.println("running the performAction method in FitnessBand");
    }

    @Override
    public void closeApp() {
        System.out.println("running the closeApp method in FitnessBand");
    }
}
