package com.xworkz.Interface.Another;

import com.xworkz.Interface.Internal.CoffeeMachine;
import com.xworkz.Interface.Internal.Microwave;
import com.xworkz.Interface.Internal.Oven;

public class Ovens implements Oven, Microwave, CoffeeMachine {

    @Override
    public void bake() {
        System.out.println("running the bake method in SmartOven");
    }

    @Override
    public void grill() {
        System.out.println("running the grill method in SmartOven");
    }

    @Override
    public void preheat() {
        System.out.println("running the preheat method in SmartOven");
    }

    @Override
    public void heat() {
        System.out.println("running the heat method in SmartOven");
    }

    @Override
    public void defrost() {
        System.out.println("running the defrost method in SmartOven");
    }

    @Override
    public void cook() {
        System.out.println("running the cook method in SmartOven");
    }

    @Override
    public void brew() {
        System.out.println("running the brew method in SmartOven");
    }

    @Override
    public void addMilk() {
        System.out.println("running the addMilk method in SmartOven");
    }

    @Override
    public void clean() {
        System.out.println("running the clean method in SmartOven");
    }
}
