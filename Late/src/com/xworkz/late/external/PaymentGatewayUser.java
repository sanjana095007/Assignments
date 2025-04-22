package com.xworkz.late.external;

import com.xworkz.late.internal.PaymentGateway;

public class PaymentGatewayUser {
    PaymentGateway paymentGateway;

    public PaymentGatewayUser(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void execute() {
        if (paymentGateway != null) {
            System.out.println("checking null");
            paymentGateway.processPayment();
        }
    }
}
