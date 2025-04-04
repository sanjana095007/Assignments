package com.xworkz.Instance.Animal;

public class Lion extends Animal{

    public void roar() {
        System.out.println("Lion is roaring");
    }
    @Override
    public void sleep(){
        System.out.println("running sleep method in Animal in Lion");
    }
    @Override
    public void drink(){
        System.out.println("running drink method in Animal in Lion");
    }
    @Override
    public void run(){
        System.out.println("running run method in Animal in Lion");
    }
    @Override
    public void play(){
        System.out.println("running play method in Animal in Lion");
    }
    @Override
    public void scratch(){
        System.out.println("running scratch method in Animal in Lion");
    }

}

