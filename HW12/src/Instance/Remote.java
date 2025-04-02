package Instance;

public class Remote {
    private String color;
    private int buttons;

    public void remote(String color,int buttons){
        this.color=color;
        this.buttons=buttons;

        System.out.println("the color of the remote is :" + color);
        System.out.println("the buttons in remote is "+buttons);

    }
}
