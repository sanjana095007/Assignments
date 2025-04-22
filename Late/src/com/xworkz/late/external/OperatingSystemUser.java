package com.xworkz.late.external;

import com.xworkz.late.internal.OperatingSystem;

public class OperatingSystemUser {
    OperatingSystem os;

    public OperatingSystemUser(OperatingSystem os) {
        this.os = os;
    }

    public void execute() {
        if (os != null) {
            System.out.println("checking null");
            os.bootSystem();
        }
    }
}
