package com.xworkz.Instance.Animal;

public class Hippopotamus extends Animal {
    public void submerge() {

        System.out.println("Hippopotamus is submerging in the water.");
    }
    @Override
    public void sleep(){
        System.out.println("running sleep method in Animal in Hippopotamus");
    }
    @Override
    public void drink(){
        System.out.println("running drink method in Animal in Hippopotamus");
    }
    @Override
    public void run(){
        System.out.println("running run method in Animal in Hippopotamus");
    }
    @Override
    public void play(){
        System.out.println("running play method in Animal in Hippopotamus");
    }
    @Override
    public void scratch(){
        System.out.println("running scratch method in Animal in Hippopotamus");
    }
}
