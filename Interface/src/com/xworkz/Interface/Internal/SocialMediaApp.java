package com.xworkz.Interface.Internal;

public class SocialMediaApp implements MobileApp{
    @Override
    public void openApp() {
        System.out.println("running the open App method");
    }

    @Override
    public void performAction() {
        System.out.println("running the perform Action method");
    }

    @Override
    public void closeApp() {
        System.out.println("running the close App method");
    }

    @Override
    public void Hang() {
        System.out.println("running the Hang method");
    }
}
