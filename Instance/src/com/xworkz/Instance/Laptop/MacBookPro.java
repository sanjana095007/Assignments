package com.xworkz.Instance.Laptop;

public class MacBookPro extends Apple {
    public void launchCreativeSuite(Apple apple){
        apple.powerOff();
        if(apple instanceof MacBookPro){
            System.out.println("Is apple an instance of MacBookPro");
            MacBookPro mac = (MacBookPro) apple;
            mac.ProMotion();
        }
    }

    public void ProMotion(){
        System.out.println("running the promotion");
    }
}
