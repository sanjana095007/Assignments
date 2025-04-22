package com.xworkz.late.external;

import com.xworkz.late.internal.Router;

public class RouterImp implements Router {
    @Override
    public void transmitSignal() {
        System.out.println("running the transmitSignal method from Router");
    }
}
