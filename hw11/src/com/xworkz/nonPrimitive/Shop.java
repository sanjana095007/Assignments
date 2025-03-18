package com.xworkz.nonPrimitive;

import org.omg.Messaging.SyncScopeHelper;

public class Shop {

    public void open(RCB rcb){

        if(rcb !=null){
            rcb.cup();
            System.out.println("Shop is open");
        }
        else{
            System.out.println("stop it wont work");
        }
    }
    public void close(Space space){
        if(space !=null){
            space.galaxy();
            System.out.println("shop is closed");
        }
        else{
            System.out.println("stop it wont work");
        }
    }
}
