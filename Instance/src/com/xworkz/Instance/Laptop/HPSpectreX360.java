package com.xworkz.Instance.Laptop;

public class HPSpectreX360 extends HP {
    public void startCreativeWorkflow(HP hp){
        hp.restart();
        if(hp instanceof HPSpectreX360){
            System.out.println("Is laptop an instance of HPSpectreX360?");
            HPSpectreX360 spectre = (HPSpectreX360) hp;
            spectre.Touch();
        }
    }

    public void Touch(){
        System.out.println("running touch");
    }
}
