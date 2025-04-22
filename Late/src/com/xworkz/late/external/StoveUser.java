package com.xworkz.late.external;

import com.xworkz.late.internal.Stove;

public class StoveUser {
    Stove stove;

    public StoveUser(Stove stove) {
        this.stove = stove;
    }

    public void execute() {
        if (stove != null) {
            System.out.println("checking null");
            stove.heatFood();
        }
    }
}
