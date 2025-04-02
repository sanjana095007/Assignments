package Instance;

public class Wire {
    private int length;
    private String color;

    public void wire(int length,String color){
        this.length=length;
        this.color=color;

        System.out.println("the length of the wire is :" + length);
        System.out.println("the color of wire is "+color);

    }
}
