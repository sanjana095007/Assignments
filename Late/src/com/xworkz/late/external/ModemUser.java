package com.xworkz.late.external;

import com.xworkz.late.internal.Modem;

public class ModemUser {
    Modem modem;

    public ModemUser(Modem modem) {
        this.modem = modem;
    }

    public void execute() {
        if (modem != null) {
            System.out.println("checking null");
            modem.establishConnection();
        }
    }
}
