package com.xworkz.late.external;

import com.xworkz.late.internal.Modem;

public class ModemImp implements Modem {
    @Override
    public void establishConnection() {
        System.out.println("running the establishConnection method from Modem");
    }
}
