package com.xworkz.Instance.Animal;

public class Tiger extends Animal{
    public void hunt() {
        System.out.println("Tiger is hunting in the jungle.");
    }
    @Override
    public void sleep(){
        System.out.println("running sleep method in Animal in Tiger");
    }
    @Override
    public void drink(){
        System.out.println("running drink method in Animal in Tiger");
    }
    @Override
    public void run(){
        System.out.println("running run method in Animal in Tiger");
    }
    @Override
    public void play(){
        System.out.println("running play method in Animal in Tiger.");
    }
    @Override
    public void scratch(){
        System.out.println("running scratch method in Animal in Tiger");
    }

}

