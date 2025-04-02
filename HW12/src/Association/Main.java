package Association;

public class Main {
    public static void main(String[] args) {
        Buttons buttons = new Buttons("white",5);
        Lamps lamp=new Lamps(buttons);
        lamp.display();
        System.out.println(".........................................");
        Lens lens = new Lens(5,"HP",5200);
        Panels panels=new Panels(lens);
        panels.display();
        System.out.println(".........................................");
        Board board = new Board(10,"black");
        Ports ports=new Ports(board);
        ports.display();
        System.out.println(".........................................");
        Remotes remotes = new Remotes("red",5);
        Screw screw=new Screw(remotes);
        screw.display();
        System.out.println(".........................................");
        Wires wires = new Wires(15,"green");
        Projector projector=new Projector(wires);
        projector.display();
        System.out.println(".........................................");
    }
}
