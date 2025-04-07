package com.xworkz.Instance.Laptop;

public class Aorus17X extends Aorus {
    public void initiatePerformanceMode(Aorus aorus){
        aorus.powerOn();
        if(aorus instanceof Aorus17X){
            System.out.println("Is laptop an instance of Aorus17X");
            Aorus17X a17x = (Aorus17X) aorus;
            a17x.Keyboard();
        }
    }

    public void Keyboard(){
        System.out.println("Running the keyboard.");
    }
}
