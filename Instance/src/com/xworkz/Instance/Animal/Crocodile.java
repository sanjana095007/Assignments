package com.xworkz.Instance.Animal;

    public class Crocodile extends Animal {
        public void swim() {

            System.out.println("Crocodile is swimming in the river.");
        }
        @Override
        public void sleep(){
            System.out.println("running sleep method in Animal in Crocodile");
        }
        @Override
        public void drink(){
            System.out.println("running drink method in Animal in Crocodile");
        }
        @Override
        public void run(){
            System.out.println("running run method in Animal in Crocodile");
        }
        @Override
        public void play(){
            System.out.println("running play method in Animal in Crocodile");
        }
        @Override
        public void scratch(){
            System.out.println("running scratch method in Animal in Crocodile.");
        }
}
