package com.xworkz.late.external;

import com.xworkz.late.internal.VacuumCleaner;

public class VacuumCleanerImp implements VacuumCleaner {
    @Override
    public void cleanSurface() {
        System.out.println("running the cleanSurface method from VacuumCleaner");
    }
}
