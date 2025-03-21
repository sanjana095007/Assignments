package com.xworkz.InstanceVariable;

public class Pushpa {
    void useClip(Clip[] clips){
        if(clips != null){
            for(Clip clip:clips){
                System.out.println("running use clip method in pushpa : "+clip.color);
            }
        }

    }
}
