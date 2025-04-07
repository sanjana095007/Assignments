package com.xworkz.Instance.Laptop;

public class SonyVaioZ extends Sony {
    public void launchPerformanceSuite(Sony sony){
        sony.powerOff();
        if(sony instanceof SonyVaioZ){
            System.out.println("Is laptop an instance of SonyVaioZ?");
            SonyVaioZ vaio = (SonyVaioZ) sony;
            vaio.enableCarbonFiberMode();
        }
    }

    public void enableCarbonFiberMode(){
        System.out.println("Carbon fiber performance mode enabled on Sony Vaio Z.");
    }
}
