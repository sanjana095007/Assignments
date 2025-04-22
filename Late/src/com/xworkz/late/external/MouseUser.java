package com.xworkz.late.external;

import com.xworkz.late.internal.Mouse;

public class MouseUser {
    Mouse mouse;

    public MouseUser(Mouse mouse) {
        this.mouse = mouse;
    }

    public void execute() {
        if (mouse != null) {
            System.out.println("checking null");
            mouse.movePointer();
        }
    }
}
