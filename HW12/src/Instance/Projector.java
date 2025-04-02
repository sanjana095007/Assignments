package Instance;

public class Projector {
    public static void main(String[] args) {
        Board board=new Board();
        board.broad(12,"balck");
        System.out.println("========================================================");
        Button button=new Button();
        button.buttons("white",5 );
        System.out.println("========================================================");
        Lamp lamp=new Lamp();
        lamp.lamp("gold","higer");
        System.out.println("========================================================");
        Lens lens=new Lens();
        lens.lens(5,"dslr",250000);
        System.out.println("========================================================");
        Panel panel=new Panel();
        panel.panel("HP",10000);
        System.out.println("========================================================");
            Remote remote=new Remote();
            remote.remote("balck",6);
        System.out.println("========================================================");
        Screw screw=new Screw();
        screw.screws(50,10);
        System.out.println("========================================================");
        Wire wire=new Wire();
        wire.wire(50,"red");
        System.out.println("========================================================");


    }
}
