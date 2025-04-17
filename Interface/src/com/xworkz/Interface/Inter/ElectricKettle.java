package com.xworkz.Interface.Inter;

import com.xworkz.Interface.Internal.CoffeeMachine;
import com.xworkz.Interface.Internal.Oven;

public class ElectricKettle implements Oven, CoffeeMachine {
    @Override
    public void brew() {
        System.out.println("running the brew method in ElectricKettle ");
    }

    @Override
    public void addMilk() {
        System.out.println("running the addMilk method in ElectricKettle ");
    }

    @Override
    public void clean() {
        System.out.println("running the clean method in ElectricKettle ");
    }

    @Override
    public void bake() {
        System.out.println("running the bake method in ElectricKettle ");
    }

    @Override
    public void grill() {
        System.out.println("running the grill method in ElectricKettle ");
    }

    @Override
    public void preheat() {
        System.out.println("running the preheat method in ElectricKettle ");
    }
}
