package com.xworkz.Instance.Animal;

public class Bear extends Animal {

    public void eat() {

        System.out.println("Bear is eating honey.");
    }
    @Override
    public void sleep(){
        System.out.println("running sleep method in Animal in Bear.");
    }
    @Override
    public void drink(){
        System.out.println("running drink method in Animal in Bear");
    }
    @Override
    public void run(){
        System.out.println("running run method in Animal in Bear");
    }
    @Override
    public void play(){
        System.out.println("running play method in Animal in Bear");
    }
    @Override
    public void scratch(){
        System.out.println("running scratch method in Animal in Bear");
    }


}

