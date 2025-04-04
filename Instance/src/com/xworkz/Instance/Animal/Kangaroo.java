package com.xworkz.Instance.Animal;

public class Kangaroo extends Animal{

    public void carryJoey() {
        System.out.println("Kangaroo is carrying its joey in the pouch.");
    }
    @Override
    public void sleep(){
        System.out.println("running sleep method in Animal in Kangaroo");
    }
    @Override
    public void drink(){
        System.out.println("running drink method in Animal in Kangaroo");
    }
    @Override
    public void run(){
        System.out.println("running run method in Animal in Kangaroo");
    }
    @Override
    public void play(){
        System.out.println("running play method in Animal in Kangaroo");
    }
    @Override
    public void scratch(){
        System.out.println("running scratch method in Animal in Kangaroo");
    }

}

