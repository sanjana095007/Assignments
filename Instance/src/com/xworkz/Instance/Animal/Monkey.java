package com.xworkz.Instance.Animal;

public class Monkey extends Animal{
    public void climb() {
        System.out.println("Monkey is climbing trees.");
    }
    @Override
    public void sleep(){
        System.out.println("running sleep method in Animal in Monkey");
    }
    @Override
    public void drink(){
        System.out.println("running drink method in Animal in Monkey");
    }
    @Override
    public void run(){
        System.out.println("running run method in Animal in Monkey.");
    }
    @Override
    public void play(){
        System.out.println("running play method in Animal in Monkey");
    }
    @Override
    public void scratch(){
        System.out.println("running scratch method in Animal in Monkey");
    }

}

