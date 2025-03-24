package com.xworkz.access;

public class Finance {
    Banking banking=new Banking();
    public void display(){
        banking.ownername="sanjana";
        banking.balance=56.23;;

        System.out.println("The name of the owner is :"+banking.ownername);
        System.out.println("Balance: " + banking.balance);
        banking.deposit();
    }
}
