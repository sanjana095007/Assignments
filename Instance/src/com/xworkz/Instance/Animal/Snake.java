package com.xworkz.Instance.Animal;

public class Snake extends Animal {
    public void slither() {

        System.out.println("Snake is slithering through the grass.");
    }
    @Override
    public void sleep(){
        System.out.println("running sleep method in Animal in Snake");
    }
    @Override
    public void drink(){
        System.out.println("running drink method in Animal in Snake");
    }
    @Override
    public void run(){
        System.out.println("running run method in Animal in Snake");
    }
    @Override
    public void play(){
        System.out.println("running play method in Animal in Snake");
    }
    @Override
    public void scratch(){
        System.out.println("running scratch method in Animal in Snake");
    }
}