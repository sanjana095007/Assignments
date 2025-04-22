package com.xworkz.late.external;

import com.xworkz.late.internal.Antivirus;

public class AntivirusUser {
    Antivirus antivirus;

    public AntivirusUser(Antivirus antivirus) {
        this.antivirus = antivirus;
    }

    public void execute() {
        if (antivirus != null) {
            System.out.println("checking null");
            antivirus.scanSystem();
        }
    }
}
