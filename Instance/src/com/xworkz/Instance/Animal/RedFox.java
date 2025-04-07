package com.xworkz.Instance.Animal;

public class RedFox extends Fox {
    public void exploreWoods(Fox fox){
        fox.scratch();
        if(fox instanceof RedFox){
            System.out.println("is fox a RedFox");
            RedFox redFox = (RedFox) fox;
            redFox.hide();
        }
    }

    public void hide(){
        System.out.println("running the hideInBushes method");
    }
}
