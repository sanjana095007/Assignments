package com.xworkz.Instance.Animal;

public class Deer extends Animal{

    public void lookAround() {
        System.out.println("Deer is looking around cautiously.");
    }
    @Override
    public void sleep(){
        System.out.println("running sleep method in Animal in Deer");
    }
    @Override
    public void drink(){
        System.out.println("running drink method in Animal in Deer");
    }
    @Override
    public void run(){
        System.out.println("running run method in Animal in Deer");
    }
    @Override
    public void play(){
        System.out.println("running play method in Animal in Deer");
    }
    @Override
    public void scratch(){
        System.out.println("running scratch method in Animal in Deer");
    }
}

