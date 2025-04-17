package com.xworkz.Interface.Another;

import com.xworkz.Interface.Internal.CoffeeMachine;
import com.xworkz.Interface.Internal.Drone;
import com.xworkz.Interface.Internal.Printer;

public class OfficeMachines implements CoffeeMachine, Drone, Printer {

    @Override
    public void brew() {
        System.out.println("running the brew method in OfficeMachine");
    }

    @Override
    public void addMilk() {
        System.out.println("running the addMilk method in OfficeMachine");
    }

    @Override
    public void clean() {
        System.out.println("running the clean method in OfficeMachine");
    }

    @Override
    public void hover() {
        System.out.println("running the hover method in OfficeMachine");
    }

    @Override
    public void takePicture() {
        System.out.println("running the takePicture method in OfficeMachine");
    }

    @Override
    public void returnToHome() {
        System.out.println("running the returnToHome method in OfficeMachine");
    }

    @Override
    public void print() {
        System.out.println("running the print method in OfficeMachine");
    }

    @Override
    public void scan() {
        System.out.println("running the scan method in OfficeMachine");
    }

    @Override
    public void copy() {
        System.out.println("running the copy method in OfficeMachine");
    }

}
