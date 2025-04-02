package Instance;

public class Panel {
    private String brand;
    private int price;

    public void panel(String brand,int price){
        this.brand=brand;
        this.price=price;


        System.out.println("the brand of the panel :" + brand);
        System.out.println("the price of the panel is "+price);

    }
}
