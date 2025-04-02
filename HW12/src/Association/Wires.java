package Association;

public class Wires {
    private int length;
    private String color;

     Wires(int length,String color){
        this.length=length;
        this.color=color;
        System.out.println("running const");
    }
    public void display(){
        System.out.println("running the method in wires");
    }
}
