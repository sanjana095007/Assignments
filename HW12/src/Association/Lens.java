package Association;

public class Lens {
    private int point;
    private String brand;
    private int price;

     Lens(int point, String brand, int price){
        this.point=point;
        this.brand=brand;
        this.price=price;
        System.out.println("running the cons");
    }
    public void display(){
        System.out.println("running the method in lens");
    }
}
