package com.xworkz.late.external;

import com.xworkz.late.internal.VacuumCleaner;

public class VacuumCleanerUser {
    VacuumCleaner vacuumCleaner;

    public VacuumCleanerUser(VacuumCleaner vacuumCleaner) {
        this.vacuumCleaner = vacuumCleaner;
    }

    public void execute() {
        if (vacuumCleaner != null) {
            System.out.println("checking null");
            vacuumCleaner.cleanSurface();
        }
    }
}
