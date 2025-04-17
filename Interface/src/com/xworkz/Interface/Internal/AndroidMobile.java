package com.xworkz.Interface.Internal;

public class AndroidMobile implements Mobile {
    @Override
    public void call() {
        System.out.println("running the call method");
    }

    @Override
    public void text() {
        System.out.println("running the message method");
    }

    @Override
    public void browseInternet() {
        System.out.println("running the browse method");
    }

    @Override
    public void Charge() {
        System.out.println("running the Charge method");
    }
}
