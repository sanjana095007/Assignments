package com.xworkz.Interface.Another;

import com.xworkz.Interface.Internal.CreditCard;
import com.xworkz.Interface.Internal.DebitCard;
import com.xworkz.Interface.Internal.Printer;


public class Machine implements CreditCard, DebitCard, Printer {

    @Override
    public void swipe() {
        System.out.println("running the swipe method in POSMachine");
    }

    @Override
    public void tap() {
        System.out.println("running the tap method in POSMachine");
    }

    @Override
    public void enterPin() {
        System.out.println("running the enterPin method in POSMachine");
    }

    @Override
    public void withdraw() {
        System.out.println("running the withdraw method in POSMachine");
    }

    @Override
    public void deposit() {
        System.out.println("running the deposit method in POSMachine");
    }

    @Override
    public void checkBalance() {
        System.out.println("running the checkBalance method in POSMachine");
    }

    @Override
    public void print() {
        System.out.println("running the print method in POSMachine");

    }

    @Override
    public void scan() {
        System.out.println("running the scan method in POSMachine");

    }

    @Override
    public void copy() {
        System.out.println("running the copy method in POSMachine");

    }
}
