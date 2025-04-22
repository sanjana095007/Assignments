package com.xworkz.late.external;

import com.xworkz.late.internal.Mouse;

public class MouseImp implements Mouse {
    @Override
    public void movePointer() {
        System.out.println("running the movePointer method from Mouse");
    }
}
