package com.xworkz.late.external;

import com.xworkz.late.internal.Connector;

public class Connectorimp  implements Connector {
    @Override
    public void run() {
        System.out.println("running the method");
    }
}
