package com.xworkz.Interface.Inter;

import com.xworkz.Interface.Internal.ATM;
import com.xworkz.Interface.Internal.Door;

public class ATMBooth implements ATM, Door {

    @Override
    public void insertCard() {
        System.out.println("running the insertCard method in ATMBooth");
    }

    @Override
    public void enterPin() {
        System.out.println("running the enterPin method in ATMBooth");
    }

    @Override
    public void withdrawCash() {
        System.out.println("running the withdrawCash method in ATMBooth");
    }

    @Override
    public void open() {
        System.out.println("running the open method in ATMBooth");
    }

    @Override
    public void close() {
        System.out.println("running the close method in ATMBooth");
    }

    @Override
    public void lock() {
        System.out.println("running the lock method in ATMBooth");
    }
}
