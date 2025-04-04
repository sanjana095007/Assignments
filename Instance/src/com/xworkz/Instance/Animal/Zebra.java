package com.xworkz.Instance.Animal;

public class Zebra extends Animal {
    public void graze() {
        System.out.println("Zebra is grazing on grass.");
    }
    @Override
    public void sleep(){
        System.out.println("running sleep method in Animal in Zebra");
    }
    @Override
    public void drink(){
        System.out.println("running drink method in Animal in Zebra");
    }
    @Override
    public void run(){
        System.out.println("running run method in Animal in Zebra");
    }
    @Override
    public void play(){
        System.out.println("running play method in Animal in Zebra");
    }
    @Override
    public void scratch(){
        System.out.println("running scratch method in Animal in Zebra");
    }

}

