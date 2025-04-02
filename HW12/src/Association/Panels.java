package Association;

public class Panels {
    private Lens lens;
    Panels (Lens lens){
        this.lens=lens;
        System.out.println("running the const");
    }
    public void display(){
        this.lens.display();
        System.out.println("running the method display in panels");
    }
}
