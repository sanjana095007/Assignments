package com.xworkz.late.external;

import com.xworkz.late.internal.Keyboard;

public class KeyboardImp implements Keyboard {
    @Override
    public void typeKey() {
        System.out.println("running the typeKey method from Keyboard");
    }
}
