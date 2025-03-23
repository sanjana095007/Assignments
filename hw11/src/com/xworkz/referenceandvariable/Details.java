package com.xworkz.referenceandvariable;

public class Details {
    String title;
    String type;
    int id;
    State state = new State("Karnataka", 70000000, "Bengaluru");
    Details(String title,String type,int id){
        this.title=title;
        this.type=type;
        this.id=id;
    }
    void display(){
        System.out.println("the title of the details  is :"+this.title);
        System.out.println("the type of details  :"+this.type);
        System.out.println("the id is  :"+this.id);
        state.display();
    }
}
