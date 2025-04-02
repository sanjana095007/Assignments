package Association;

public class Screw {
        private Remotes remotes;
    Screw (Remotes remotes){
        this.remotes=remotes;
        System.out.println("running the const");
    }
    public void display(){
        this.remotes.display();
        System.out.println("running the method display in screw");
    }
}

