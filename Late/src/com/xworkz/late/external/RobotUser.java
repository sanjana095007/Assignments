package com.xworkz.late.external;

import com.xworkz.late.internal.Robot;

public class RobotUser {
    Robot robot;

    public RobotUser(Robot robot) {
        this.robot = robot;
    }

    public void execute() {
        if (robot != null) {
            System.out.println("checking null");
            robot.performTask();
        }
    }
}
