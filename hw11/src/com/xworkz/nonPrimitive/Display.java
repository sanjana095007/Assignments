package com.xworkz.nonPrimitive;

public class Display {
    void show(Dolo650 dolo650){
        if(dolo650 !=null){
            dolo650.tablets();
            System.out.println("showing things from shop");
        }
        else{
            System.out.println("stop it wont work");
        }
    }

    void thing(Pillow pillow){
        if(pillow !=null){
            pillow.comfort();
            System.out.println("arranging things from shop");
        }
        else{
            System.out.println("stop it wont work");
        }
    }
}

