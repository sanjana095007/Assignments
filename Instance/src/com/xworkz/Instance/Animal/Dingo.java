package com.xworkz.Instance.Animal;

public class Dingo extends Fox {
    public void sniffTrail(Fox fox){
        fox.play();
        if(fox instanceof Dingo){
            System.out.println("is fox a Dingo");
            Dingo dingo = (Dingo) fox;
            dingo.makessounds();
        }
    }

    public void makessounds(){
        System.out.println("running the makes sounds method");
    }
}

