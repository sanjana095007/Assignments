package com.xworkz.Abstract.external;

import com.xworkz.Abstract.internal.*;

public class Runner {
    public static void main(String[] args) {
        CasualShoes casualShoes=new CasualShoes();
        casualShoes.shop();
        casualShoes.display();
        System.out.println("=============================================");
        Nike nike=new Nike();
        nike.brand();
        System.out.println("==============================================");
        Place place=new Place();
        place.cost();
        place.color();
        System.out.println("=====================================");
        Formalshoes formalshoes=new Formalshoes(5623,"nike",5);
        formalshoes.display();
        System.out.println("=====================================");
        Model model=new Model("puma");
        Model model1=new Model("puma",54123);
        Model model2=new Model("puma",5415,"black","sports");
        model.displayshoes();
        model1.displayshoes();
        model2.displayshoes();
        System.out.println("=====================================");
    }
}
