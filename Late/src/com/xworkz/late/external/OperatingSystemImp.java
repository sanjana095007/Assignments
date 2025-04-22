package com.xworkz.late.external;

import com.xworkz.late.internal.OperatingSystem;

public class OperatingSystemImp implements OperatingSystem {
    @Override
    public void bootSystem() {
        System.out.println("running the bootSystem method from OperatingSystem");
    }
}
