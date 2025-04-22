package com.xworkz.late.external;

import com.xworkz.late.internal.Internet;

public class InternetUser {
    Internet internet;

    public InternetUser(Internet internet) {
        this.internet = internet;
    }

    public void execute() {
        if (internet != null) {
            System.out.println("checking null");
            internet.connect();
        }
    }
}
