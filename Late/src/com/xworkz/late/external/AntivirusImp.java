package com.xworkz.late.external;

import com.xworkz.late.internal.Antivirus;

public class AntivirusImp implements Antivirus {
    @Override
    public void scanSystem() {
        System.out.println("running the scanSystem method from Antivirus");
    }
}
