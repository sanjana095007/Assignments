package Association;

public class Remotes {
    private String color;
    private int buttons;

   Remotes(String color,int buttons) {
       this.color = color;
       this.buttons = buttons;
       System.out.println("running the const");
   }
       public void display(){
           System.out.println("running the  method display in remotes");
       }

}
