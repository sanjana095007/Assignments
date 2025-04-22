package Equal;

public class Tshirt {
    private int size;
    private String color;
    private String brand;

    public Tshirt(int size,String color,String brand){
        this.size=size;
        this.color=color;
        this.brand=brand;
    }
    @Override
    public boolean equals(Object obj)
    {
        if(obj!=null){
            System.out.println("null ref");
            if(obj instanceof  Tshirt){
                System.out.println("ref of tshirt,will be compared");
                Tshirt tshirt1=this;
                Tshirt tshirt2=(Tshirt)obj;
                if(tshirt1.brand.equals(tshirt2.brand) && tshirt1.size==tshirt2.size && tshirt1.color.equals(tshirt2.color)){
                    System.out.println("both are same");
                    return true;
                }

            }
        }

        return false;
    }

}
