package com.xworkz.Interface.Inter;

import com.xworkz.Interface.Internal.CreditCard;
import com.xworkz.Interface.Internal.DebitCard;

public class AtmMachine implements CreditCard, DebitCard {
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
}
