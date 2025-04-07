package com.xworkz.Instance.Animal;

public class HarpyEagle extends Eagle {
    public void hunt(Eagle eagle){
        eagle.soar();
        if(eagle instanceof HarpyEagle){
            System.out.println("is eagle a HarpyEagle");
            HarpyEagle harpy = (HarpyEagle) eagle;
            harpy.swoopDown();
        }
    }

    public void swoopDown(){
        System.out.println("running the swoopDown method");
    }
}

