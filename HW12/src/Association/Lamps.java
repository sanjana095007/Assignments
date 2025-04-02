package Association;

public class Lamps {
    private Buttons buttons;
    Lamps (Buttons buttons){
        this.buttons=buttons;
        System.out.println("running the const");
    }
    public void display(){
        this.buttons.display();
        System.out.println("running the method display in lamps");
    }
}
