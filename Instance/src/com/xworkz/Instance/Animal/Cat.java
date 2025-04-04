package com.xworkz.Instance.Animal;

public class Cat extends Animal {
    public void Play(){

        System.out.println("running the play method in Cat");
    }
    @Override
    public void sleep(){
        System.out.println("running sleep method in Animal in Cat");
    }
    @Override
    public void drink(){
        System.out.println("running drink method in Animal in Cat");
    }
    @Override
    public void run(){
        System.out.println("running run method in Animal in Cat");
    }
    @Override
    public void play(){
        System.out.println("running play method in Animal in Cat");
    }
    @Override
    public void scratch(){
        System.out.println("running scratch method in Animal in Cat");
    }

}
