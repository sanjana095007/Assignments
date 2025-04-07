package com.xworkz.Instance.Animal;

public class Whale extends Dolphin {
    public void diveDeep(Dolphin dolphin){
        dolphin.jump();
        if(dolphin instanceof Whale){
            System.out.println("is dolphin a Whale");
            Whale whale = (Whale) dolphin;
            whale.sounds();
        }
    }

    public void sounds(){
        System.out.println("running the singSong method");
    }
}

