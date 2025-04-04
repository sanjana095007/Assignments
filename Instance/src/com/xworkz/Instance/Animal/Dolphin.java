package com.xworkz.Instance.Animal;

public class Dolphin extends Animal {
    public void jump() {

        System.out.println("Dolphin is jumping out of the water.");
    }
    @Override
    public void sleep(){
        System.out.println("running sleep method in Animal in Dolphin");
    }
    @Override
    public void drink(){
        System.out.println("running drink method in Animal in Dolphin");
    }
    @Override
    public void run(){
        System.out.println("running run method in Animal in Dolphin");
    }
    @Override
    public void play(){
        System.out.println("running play method in Animal in Dolphin");
    }
    @Override
    public void scratch(){
        System.out.println("running scratch method in Animal in Dolphin");
    }
}
