package Instance;

public class Screw {
    private int price;
    private int screw;

    public void screws(int price,int screw){
        this.price=price;
        this.screw=screw;

        System.out.println("the price of the screw is :" + price);
        System.out.println("the number of screw is "+screw);

    }
}
