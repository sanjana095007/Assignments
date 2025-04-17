package com.xworkz.Interface.Internal;

public class MedicalThermometer implements Thermometer{
    @Override
    public void measureTemperature() {
        System.out.println("running the measure Temperature method");
    }

    @Override
    public void showReading() {
        System.out.println("running the show Reading method");
    }

    @Override
    public void reset() {
        System.out.println("running the reset method");
    }

    @Override
    public void cleaning() {
        System.out.println("running the cleaning method");
    }
}
