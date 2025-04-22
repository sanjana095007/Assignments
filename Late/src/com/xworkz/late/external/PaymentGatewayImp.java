package com.xworkz.late.external;

import com.xworkz.late.internal.PaymentGateway;

public class PaymentGatewayImp implements PaymentGateway {
    @Override
    public void processPayment() {
        System.out.println("running the processPayment method from PaymentGateway");
    }
}
