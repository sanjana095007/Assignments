package com.xworkz.late.external;

import com.xworkz.late.internal.Elevator;

public class ElevatorUser {
    Elevator elevator;

    public ElevatorUser(Elevator elevator) {
        this.elevator = elevator;
    }

    public void execute() {
        if (elevator != null) {
            System.out.println("checking null");
            elevator.move();
        }
    }
}
