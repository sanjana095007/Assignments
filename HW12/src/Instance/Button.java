package Instance;

public class Button {
    private String color;
    private int numberofbuttons;

    public void buttons(String color,int numberofbuttons){
        this.color=color;
        this.numberofbuttons=numberofbuttons;

        System.out.println("the color of the button is "+ color);
        System.out.println("the number of buttons :" + numberofbuttons);
    }
}
