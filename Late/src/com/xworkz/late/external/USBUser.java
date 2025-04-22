package com.xworkz.late.external;

import com.xworkz.late.internal.USB;

public class USBUser {
    USB usb;

    public USBUser(USB usb) {
        this.usb = usb;
    }

    public void execute() {
        if (usb != null) {
            System.out.println("checking null");
            usb.transferData();
        }
    }
}
