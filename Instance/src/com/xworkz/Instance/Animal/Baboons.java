package com.xworkz.Instance.Animal;

public class Baboons extends Monkey {
    public void chatter(Monkey monkey){
        monkey.drink();
        if(monkey instanceof Baboons){
            System.out.println("is monkey a Baboons");
            Baboons baboon = (Baboons) monkey;
            baboon.climb();
        }
    }

    public void climb(){
        System.out.println("running the climb method");
    }
}
