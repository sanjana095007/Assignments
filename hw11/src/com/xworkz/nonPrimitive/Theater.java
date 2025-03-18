package com.xworkz.nonPrimitive;

public class Theater {
    public void movie(Space space){

        if(space !=null){
            space.galaxy();
            System.out.println("showing movies in the theater");
        }
        else{
            System.out.println("stop it wont work");
        }
    }
}
