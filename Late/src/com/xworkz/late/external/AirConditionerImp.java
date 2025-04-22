package com.xworkz.late.external;

import com.xworkz.late.internal.AirConditioner;

public class AirConditionerImp implements AirConditioner {
    @Override
    public void coolRoom() {
        System.out.println("running the coolRoom method from AirConditioner");
    }
}
