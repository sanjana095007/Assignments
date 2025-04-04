package com.xworkz.Instance.Animal;

public class Fox extends Animal {
    public void sneak() {

        System.out.println("Fox is sneaking around silently.");
    }
    @Override
    public void sleep(){
        System.out.println("running sleep method in Animal in Fox");
    }
    @Override
    public void drink(){
        System.out.println("running drink method in Animal in Fox");
    }
    @Override
    public void run(){
        System.out.println("running run method in Animal in Fox");
    }
    @Override
    public void play(){
        System.out.println("running play method in Animal in Fox");
    }
    @Override
    public void scratch(){
        System.out.println("running scratch method in Animal in Fox");
    }
}
