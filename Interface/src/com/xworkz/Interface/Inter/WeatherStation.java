package com.xworkz.Interface.Inter;

import com.xworkz.Interface.Internal.AirPurifier;
import com.xworkz.Interface.Internal.Thermometer;

public class WeatherStation implements Thermometer, AirPurifier {

    @Override
    public void measureTemperature() {
        System.out.println("running the measureTemperature method in WeatherStation");
    }

    @Override
    public void showReading() {
        System.out.println("running the showReading method in WeatherStation");
    }

    @Override
    public void reset() {
        System.out.println("running the reset method in WeatherStation");
    }

    @Override
    public void purifyAir() {
        System.out.println("running the purifyAir method in WeatherStation");
    }

    @Override
    public void replaceFilter() {
        System.out.println("running the replaceFilter method in WeatherStation");
    }

    @Override
    public void displayAirQuality() {
        System.out.println("running the display Air Quality method in WeatherStation");
    }
}
