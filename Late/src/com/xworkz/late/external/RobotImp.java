package com.xworkz.late.external;

import com.xworkz.late.internal.Robot;

public class RobotImp implements Robot {
    @Override
    public void performTask() {
        System.out.println("running the performTask method from Robot");
    }
}
