package com.xworkz.Instance.Animal;

public class Dog extends Animal {
        public void wagTail() {

            System.out.println("Dog is wagging its tail");
        }
    @Override
    public void sleep(){
        System.out.println("running sleep method in Animal in Dog");
    }
    @Override
    public void drink(){
        System.out.println("running drink method in Animal in Dog");
    }
    @Override
    public void run(){
        System.out.println("running run method in Animal in Dog");
    }
    @Override
    public void play(){
        System.out.println("running play method in Animal in Dog.");
    }
    @Override
    public void scratch(){
        System.out.println("running scratch method in Animal in Dog");
    }
}
