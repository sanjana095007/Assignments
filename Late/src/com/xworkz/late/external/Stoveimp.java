package com.xworkz.late.external;

import com.xworkz.late.internal.Stove;

public class Stoveimp implements Stove {
    @Override
    public void heatFood() {
        System.out.println("running the heatFood method");
    }
}
