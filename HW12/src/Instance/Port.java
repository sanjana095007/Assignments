package Instance;

public class Port {
    private String length;
    private int price;

    public void port(String length,int price){
        this.length=length;
        this.price=price;

        System.out.println("the length of the port is :" + length);
        System.out.println("the price of the port is "+price);

    }
}
