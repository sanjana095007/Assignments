package com.xworkz.Instance.Animal;

public class Cheetah extends Animal {
    public void sprint() {

        System.out.println("Cheetah is sprinting at high speed.");
    }
    @Override
    public void sleep(){
        System.out.println("running sleep method in Animal in Cheetah");
    }
    @Override
    public void drink(){
        System.out.println("running drink method in Animal in Cheetah");
    }
    @Override
    public void run(){
        System.out.println("running run method in Animal in Cheetah");
    }
    @Override
    public void play(){
        System.out.println("running play method in Animal in Cheetah");
    }
    @Override
    public void scratch(){
        System.out.println("running scratch method in Animal in Cheetah.");
    }
}
