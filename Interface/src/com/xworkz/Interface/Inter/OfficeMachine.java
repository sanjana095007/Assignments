package com.xworkz.Interface.Inter;

import com.xworkz.Interface.Internal.CoffeeMachine;
import com.xworkz.Interface.Internal.Drone;

public class OfficeMachine  implements CoffeeMachine, Drone {
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
}
