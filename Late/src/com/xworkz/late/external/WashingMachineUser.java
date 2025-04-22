package com.xworkz.late.external;

import com.xworkz.late.internal.WashingMachine;

public class WashingMachineUser {
    WashingMachine washingMachine;

    public WashingMachineUser(WashingMachine washingMachine) {
        this.washingMachine = washingMachine;
    }

    public void execute() {
        if (washingMachine != null) {
            System.out.println("checking null");
            washingMachine.washClothes();
        }
    }
}
