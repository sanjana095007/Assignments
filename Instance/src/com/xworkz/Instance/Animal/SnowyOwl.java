package com.xworkz.Instance.Animal;

public class SnowyOwl extends Owl {
    public void hunt(Owl owl){
        owl.hoot();
        if(owl instanceof SnowyOwl){
            System.out.println("is owl a SnowyOwl");
            SnowyOwl snowy = (SnowyOwl) owl;
            snowy.glide();
        }
    }

    public void glide(){
        System.out.println("running the glide method");
    }
}

