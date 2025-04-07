package com.xworkz.Instance.Animal;

public class GentooPenguin extends Penguin {
    public void Jump(Penguin penguin){
        penguin.waddle();
        if(penguin instanceof GentooPenguin){
            System.out.println("is penguin a GentooPenguin");
            GentooPenguin gentoo = (GentooPenguin) penguin;
            gentoo.slide();
        }
    }

    public void slide(){
        System.out.println("running the slide method");
    }
}

