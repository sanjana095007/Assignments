package com.xworkz.Encap2;

import com.xworkz.encapsulation.Shoe;
import com.xworkz.encapsulation.Shoetype;

public class Main {
    public static void main(String[] args) {
        Shoe shoes=new Shoe();
        Shoetype shoestype = new Shoetype();
        shoestype.Type(shoes);
        Encapsulation2 encap=new Encapsulation2();
        encap.display(shoes);
    }
}
