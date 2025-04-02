package Instance;

public class Lamp {
    private String color;
    private String brand;

    public void lamp(String color,String brand){
        this.color=color;
        this.brand=brand;

        System.out.println("the color of the button is "+ color);
        System.out.println("the brand of the lamp :" + brand);
    }
}
