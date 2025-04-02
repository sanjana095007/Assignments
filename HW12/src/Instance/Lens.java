package Instance;

public class Lens {
    private int point;
    private String brand;
    private int price;

    public void lens(int point,String brand,int price){
        this.point=point;
        this.brand=brand;
        this.price=price;


        System.out.println("the point of the lens is "+ point);
        System.out.println("the brand of the lens :" + brand);
        System.out.println("the price of the lens is "+price);

    }
}
