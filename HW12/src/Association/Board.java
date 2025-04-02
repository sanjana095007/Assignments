package Association;

public class Board {
    private int size;
    private String color;

     Board(int size, String color){
        this.size=size;
        this.color=color;
        System.out.println("running broad ");
    }
    public void size(){
        System.out.println("running the size method in board");
    }
}
