package com.xworkz.late.external;

import com.xworkz.late.internal.CreditCard;

public class CreditCardImp implements CreditCard {
    @Override
    public void makePayment() {
        System.out.println("running the makePayment method");
    }
}
