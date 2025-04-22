package com.xworkz.late.external;

import com.xworkz.late.internal.EmailClient;

public class EmailClientUser {
    EmailClient emailClient;

    public EmailClientUser(EmailClient emailClient) {
        this.emailClient = emailClient;
    }

    public void execute() {
        if (emailClient != null) {
            System.out.println("checking null");
            emailClient.sendEmail();
        }
    }
}
