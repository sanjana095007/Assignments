package com.xworkz.nonPrimitive;

public class ShopRunner {
    public static void main(String [] args){
        RCB rcb=new RCB();
        Shop shop=new Shop();
        shop.open(rcb);
        System.out.println("=======================================================================================");
        Space space=new Space();
        Theater theater=new Theater();
        theater.movie(space);
        System.out.println("=======================================================================================");
        Pillow pillow=new Pillow();
        Barber barber=new Barber();
        barber.haircut(pillow);
        System.out.println("=======================================================================================");
       Dolo650 dolo650=new Dolo650();
       Camera camera=new Camera();
       camera.lens(dolo650);
        System.out.println("=======================================================================================");
        Dolo650 dolo6501=new Dolo650();
         Display display=new Display();
       display.show(dolo6501);
        System.out.println("=======================================================================================");
        Rocket rocket=new Rocket();
        Mango mango=new Mango();
        mango.fruit(rocket);
        System.out.println("=======================================================================================");
        Pillow pillow1=new Pillow();
        Display display1=new Display();
        display.thing(pillow1);
        System.out.println("=======================================================================================");


    }
}
