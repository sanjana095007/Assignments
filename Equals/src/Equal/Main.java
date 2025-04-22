package Equal;

public class Main {
    public static void main(String[] args) {
        Tshirt tshirt1=new Tshirt(5,"black","newme");
        Tshirt tshirt2=new Tshirt(5,"black","newme");
        boolean same=tshirt1.equals(tshirt2);
        System.out.println("the product of tshirt is "+same);
        System.out.println("=======================================");
        Bear bear1=new Bear();
        bear1.setPrice(54);
        bear1.setBrand("pk");
        Bear bear2=new Bear();
        bear2.setBrand("pk");
        bear2.setPrice(54);
        boolean same1=bear1.equals(bear2);
        System.out.println("the bear is "+ same1);
    }
}
