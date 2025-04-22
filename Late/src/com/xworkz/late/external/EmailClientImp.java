package com.xworkz.late.external;

import com.xworkz.late.internal.EmailClient;

public class EmailClientImp implements EmailClient {
    @Override
    public void sendEmail() {
        System.out.println("running the sendEmail method from EmailClient");
    }
}
