package com.xworkz.Instance.Laptop;

public class SamsungGalaxyBook3 extends Samsung {
    public void startSmartSync(Samsung samsung){
        samsung.restart();
        if(samsung instanceof SamsungGalaxyBook3){
            System.out.println("Is laptop an instance of SamsungGalaxyBook3?");
            SamsungGalaxyBook3 galaxyBook = (SamsungGalaxyBook3) samsung;
            galaxyBook.connectWithGalaxyEcosystem();
        }
    }

    public void connectWithGalaxyEcosystem(){
        System.out.println("Connected to Galaxy Ecosystem with Samsung Galaxy Book 3.");
    }
}
