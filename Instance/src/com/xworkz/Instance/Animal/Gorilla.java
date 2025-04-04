package com.xworkz.Instance.Animal;

public class Gorilla extends Animal {
    public void poundChest() {

        System.out.println("Gorilla is pounding its chest loudly.");
    }
    @Override
    public void sleep(){
        System.out.println("running sleep method in Animal in Gorilla");
    }
    @Override
    public void drink(){
        System.out.println("running drink method in Animal in Gorilla");
    }
    @Override
    public void run(){
        System.out.println("running run method in Animal in Gorilla");
    }
    @Override
    public void play(){
        System.out.println("running play method in Animal in Gorilla");
    }
    @Override
    public void scratch(){
        System.out.println("running scratch method in Animal in Gorilla");
    }
}
