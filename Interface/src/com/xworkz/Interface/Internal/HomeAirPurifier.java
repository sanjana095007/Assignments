package com.xworkz.Interface.Internal;

public class HomeAirPurifier implements AirPurifier{
    @Override
    public void purifyAir() {
        System.out.println("running the purifyAir method");
    }

    @Override
    public void replaceFilter() {
        System.out.println("running the replace Filter method");
    }

    @Override
    public void displayAirQuality() {
        System.out.println("running the display Air Quality method");
    }

    @Override
    public void brand() {
        System.out.println("running the brand method");
    }
}
