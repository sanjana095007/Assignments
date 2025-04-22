package com.xworkz.late.external;

import com.xworkz.late.internal.Radio;

public class Radioimp implements Radio {
    @Override
    public void play() {
        System.out.println("running the play songs method");
    }
}
