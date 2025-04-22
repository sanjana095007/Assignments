package com.xworkz.late.external;

import com.xworkz.late.internal.Application;

public class ApplicationUser {
    Application application;

    public ApplicationUser(Application application) {
        this.application = application;
    }

    public void execute() {
        if (application != null) {
            System.out.println("checking null");
            application.launch();
        }
    }
}
