public class NailPolish {
    String color;
    String brand;
    boolean isMatte;
    double volume;
    double price; 

    public NailPolish() {
        this("Red", "Generic", false, 10.0, 50.0); 
    }

    public NailPolish(String color) {
        this(color, "Generic", false, 10.0, 50.0);
    }

    public NailPolish(String color, String brand) {
        this(color, brand, false, 10.0, 50.0);
    }

    public NailPolish(String color, String brand, boolean isMatte) {
        this(color, brand, isMatte, 10.0, 50.0);
    }

    public NailPolish(String color, String brand, boolean isMatte, double volume) {
        this(color, brand, isMatte, volume, 50.0);
    }

    public NailPolish(String color, String brand, boolean isMatte, double volume, double price) {
        this.color = color;
        this.brand = brand;
        this.isMatte = isMatte;
        this.volume = volume;
        this.price = price;
    }

    public void display() {
        System.out.println("Color: " + color);
        System.out.println("Brand: " + brand);
        System.out.println("Is Matte: " + (isMatte ? "Yes" : "No"));
        System.out.println("Volume: " + volume + " ml");
        System.out.println("Price: ₹" + price);
        System.out.println("-----------------------------");
    }
}