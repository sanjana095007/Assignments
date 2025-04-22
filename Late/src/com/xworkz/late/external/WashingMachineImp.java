package com.xworkz.late.external;

import com.xworkz.late.internal.WashingMachine;

public class WashingMachineImp implements WashingMachine {
    @Override
    public void washClothes() {
        System.out.println("running the washClothes method from WashingMachine");
    }
}
