package com.xworkz.Instance.Animal;

public class Canidae extends  Wolf{
    public void walking(Wolf wolf){
        wolf.huntInPack();
        if(wolf instanceof Canidae){
            System.out.println("is wolf a Canidae");
            Canidae canidae=(Canidae) wolf;
            canidae.hunting();
        }
    }
    public void hunting(){
        System.out.println("running the hunting method");
    }
}
