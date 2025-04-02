package Association;

public class Projector {
    private Wires wires;
    Projector (Wires wires){
        this.wires=wires;
        System.out.println("running the const");
    }
    public void display(){
        this.wires.display();
        System.out.println("running the method display in panels");
    }
}
