package com.xworkz.access;

public class Car {
        public String brand;
        int speed;
        private String van;

        public void namebrand() {
            System.out.println("the name of the car is :"+brand);
            this.van="Crusor";
            System.out.println("the van name is :"+this.van);
        }

        void showSpeed() {
            System.out.println("Speed: " + speed);
        }

        private void setVan() {
            System.out.println("the van name is :"+van);
        }
    }

