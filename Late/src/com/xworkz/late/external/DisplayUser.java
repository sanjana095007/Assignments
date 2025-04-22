package com.xworkz.late.external;

import com.xworkz.late.internal.Display;

public class DisplayUser {
    Display display;

    public DisplayUser(Display display) {
        this.display = display;
    }

    public void execute() {
        if (display != null) {
            System.out.println("checking null");
            display.showOutput();
        }
    }
}
