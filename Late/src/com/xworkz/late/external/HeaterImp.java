package com.xworkz.late.external;

import com.xworkz.late.internal.Heater;

public class HeaterImp implements Heater {

    @Override
    public void warmRoom() {
        System.out.println("running the warmRoom method");
    }
}
