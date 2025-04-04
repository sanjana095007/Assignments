package com.xworkz.Instance.Animal;

public class Wolf extends Animal {
    public void huntInPack() {

        System.out.println("Wolf is hunting with its pack.");
    }
    @Override
    public void sleep(){
        System.out.println("running sleep method in Animal in Wolf");
    }
    @Override
    public void drink(){
        System.out.println("running drink method in Animal in Wolf");
    }
    @Override
    public void run(){
        System.out.println("running run method in Animal in Wolf");
    }
    @Override
    public void play(){
        System.out.println("running play method in Animal in Wolf.");
    }
    @Override
    public void scratch(){
        System.out.println("running scratch method in Animal in Wolf");
    }

}

