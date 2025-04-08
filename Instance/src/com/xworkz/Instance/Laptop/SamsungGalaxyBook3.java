package com.xworkz.Instance.Laptop;

public class SamsungGalaxyBook3 extends Samsung {
    public void startSmartSync(Samsung samsung){
        samsung.restart();
        if(samsung instanceof SamsungGalaxyBook3){
            System.out.println("Is samsung an instance of SamsungGalaxyBook3");
            SamsungGalaxyBook3 galaxyBook = (SamsungGalaxyBook3) samsung;
            galaxyBook.speed();
        }
    }

    public void speed(){
        System.out.println("running the speed method");
    }
}
