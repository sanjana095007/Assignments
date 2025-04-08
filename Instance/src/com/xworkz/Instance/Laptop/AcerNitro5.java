package com.xworkz.Instance.Laptop;

public class AcerNitro5 extends Acer {
    public void startGamingSession(Acer acer){
        acer.charge();
        if(acer instanceof AcerNitro5){
            System.out.println("Is acer an instance of AcerNitro5");
            AcerNitro5 nitro = (AcerNitro5) acer;
            nitro.Gaming();
        }
    }

    public void Gaming(){
        System.out.println("running gaming method");
    }
}
