package com.xworkz.late.external;

import com.xworkz.late.internal.Elevator;

public class ElevatorImp implements Elevator {

    @Override
    public void move() {
        System.out.println("running the move method");
    }
}
