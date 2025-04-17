package com.xworkz.Interface.Inter;

import com.xworkz.Interface.Internal.Robot;
import com.xworkz.Interface.Internal.VacuumCleaner;

public class RobotVacuum implements Robot, VacuumCleaner {
    @Override
    public void walk() {
        System.out.println("running the walk method in RobotVacuum ");
    }

    @Override
    public void talk() {
        System.out.println("running the talk method in RobotVacuum ");
    }

    @Override
    public void performTask() {
        System.out.println("running the performTask method in RobotVacuum ");
    }

    @Override
    public void startCleaning() {
        System.out.println("running the startCleaning method in RobotVacuum ");
    }

    @Override
    public void stopCleaning() {
        System.out.println("running the stopCleaning method in RobotVacuum ");
    }

    @Override
    public void emptyBin() {
        System.out.println("running the emptyBin method in RobotVacuum ");
    }
}
