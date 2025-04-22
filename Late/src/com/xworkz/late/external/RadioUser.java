package com.xworkz.late.external;

import com.xworkz.late.internal.Radio;

public class RadioUser {
    Radio radio;

    public RadioUser(Radio radio) {
        this.radio = radio;
    }

    public void execute() {
        if (radio != null) {
            System.out.println("checking null");
            radio.play();
        }
    }
}
