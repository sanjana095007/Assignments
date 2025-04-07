package com.xworkz.Instance.Animal;

public class TreeKangaroo extends Kangaroo {
    public void hopAround(Kangaroo kangaroo){
        kangaroo.carryJoey();
        if(kangaroo instanceof TreeKangaroo){
            System.out.println("is kangaroo a TreeKangaroo");
            TreeKangaroo treeK = (TreeKangaroo) kangaroo;
            treeK.restOnTree();
        }
    }

    public void restOnTree(){
        System.out.println("running the restOnTree method");
    }
}

