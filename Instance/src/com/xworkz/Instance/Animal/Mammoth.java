package com.xworkz.Instance.Animal;

public class Mammoth extends Elephant {
    public void roamIceAge(Elephant elephant){
        elephant.trumpet();
        if(elephant instanceof Mammoth){
            System.out.println("is elephant a Mammoth");
            Mammoth mammoth = (Mammoth) elephant;
            mammoth.trumpetSound();
        }
    }

    public void trumpetSound(){
        System.out.println("running the trumpetSound method");
    }
}

