package com.xworkz.Instance.Animal;

public class Penguin extends Animal {
    public void waddle() {
        System.out.println("Penguin is waddling on the ice.");
    }
    @Override
    public void sleep(){
        System.out.println("running sleep method in Animal in Penguin");
    }
    @Override
    public void drink(){
        System.out.println("running drink method in Animal in Penguin");
    }
    @Override
    public void run(){
        System.out.println("running run method in Animal in Penguin");
    }
    @Override
    public void play(){
        System.out.println("running play method in Animal in Penguin");
    }
    @Override
    public void scratch(){
        System.out.println("running scratch method in Animal in Penguin");
    }
}
