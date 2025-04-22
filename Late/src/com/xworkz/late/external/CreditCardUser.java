package com.xworkz.late.external;

import com.xworkz.late.internal.CreditCard;

public class CreditCardUser {
    CreditCard creditCard;

    public CreditCardUser(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public void execute() {
        if (creditCard != null) {
            System.out.println("checking null");
            creditCard.makePayment();
        }
    }
}
