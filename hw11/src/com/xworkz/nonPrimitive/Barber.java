package com.xworkz.nonPrimitive;

public class Barber {
    void haircut( Pillow pillow){
        if(pillow !=null){
            pillow.comfort();
            System.out.println("doing hair cut in the  shop");
        }
        else{
            System.out.println("stop it wont work");
        }
    }
}
