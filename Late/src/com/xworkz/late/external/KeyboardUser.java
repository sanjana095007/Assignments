package com.xworkz.late.external;

import com.xworkz.late.internal.Keyboard;

public class KeyboardUser {
    Keyboard keyboard;

    public KeyboardUser(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void execute() {
        if (keyboard != null) {
            System.out.println("checking null");
            keyboard.typeKey();        }
    }
}
