package com.xworkz.Anotherpackage;

import com.xworkz.access.Banking;

public class CustomerBanking {
    Banking banking=new Banking();
    void display(){
        banking.ownername="sanjana";
        banking.deposit();
        System.out.println("The name of the emp is :"+banking.ownername);;
    }
}
