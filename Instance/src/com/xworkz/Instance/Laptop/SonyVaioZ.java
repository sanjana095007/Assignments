package com.xworkz.Instance.Laptop;

public class SonyVaioZ extends Sony {
    public void launchPerformanceSuite(Sony sony){
        sony.powerOff();
        if(sony instanceof SonyVaioZ){
            System.out.println("Is sony an instance of SonyVaioZ");
            SonyVaioZ vaio = (SonyVaioZ) sony;
            vaio.version();
        }
    }

    public void version(){
        System.out.println("running the version ");
    }
}
