package Association;

public class Ports {
    private Board board;
        Ports (Board board){
        this.board=board;
        System.out.println("running the const");
    }
    public void display(){
        this.board.size();
        System.out.println("running the method display in ports");
    }
}
