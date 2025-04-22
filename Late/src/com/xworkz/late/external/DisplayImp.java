package com.xworkz.late.external;

import com.xworkz.late.internal.Display;

public class DisplayImp implements Display {
    @Override
    public void showOutput() {
        System.out.println("running the showOutput method from Display");
    }
}
