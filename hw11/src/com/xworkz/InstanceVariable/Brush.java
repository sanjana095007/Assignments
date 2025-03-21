package com.xworkz.InstanceVariable;

import java.sql.SQLOutput;
public class Brush{
    Color color;
    Brush(Color color){
        this.color=color;
    }
    void clean(){
        System.out.println("clean the brush after use");
    }
    void scrub(){
        System.out.println("scrub to remove the color");
    }
}
