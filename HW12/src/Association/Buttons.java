package Association;

public class Buttons {
    private String color;
    private int numberofbuttons;

     Buttons(String color,int numberofbuttons){
        this.color=color;
        this.numberofbuttons=numberofbuttons;

        System.out.println("running buttons conts");

    }
    public void display(){
        System.out.println("running the method in buttons");
    }
}
