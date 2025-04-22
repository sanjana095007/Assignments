package com.xworkz.late.external;

import com.xworkz.late.internal.USB;

public class USBImp implements USB {
    @Override
    public void transferData() {
        System.out.println("running the transferData method from USB");
    }
}
