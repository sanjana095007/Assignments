package com.xworkz.Instance.Animal;

import com.xworkz.Instance.Airport.Banglore;

public class GaintPanda extends Bear{
        public void eating(Bear bear){
            bear.drink();
            if(bear instanceof GaintPanda){
                System.out.println("is gaintpanda a bear ");
                GaintPanda panda=(GaintPanda) bear;
                panda.sleep();
            }

        }
        public  void sleep (){
            System.out.println("running sleep");
        }

}
