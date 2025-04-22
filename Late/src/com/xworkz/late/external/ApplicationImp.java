package com.xworkz.late.external;

import com.xworkz.late.internal.Application;

public class ApplicationImp implements Application {

    @Override
    public void launch() {
        System.out.println("running the launch method");
    }
}
