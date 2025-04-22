package Equal;

public class Bear {
    private int price;
    private String brand;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }


    public boolean equals(Object obj)
    {
        if(obj!=null){
            System.out.println("null ref");
            if(obj instanceof  Bear){
                System.out.println("ref of bear,will be compared");
                Bear bear1=this;
                Bear bear2=(Bear) obj;
                if(bear1.brand.equals(bear2.brand) && bear1.price==bear2.price ){
                    System.out.println("both are same");
                    return true;
                }

            }
        }

        return false;
    }
}
