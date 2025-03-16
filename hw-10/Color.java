public class Color {
    String name;
    String type; 
    boolean isEcoFriendly;
    double price; 
    int quantity; 
    String brand;

    public Color() {
        this("Red", "Dry", true, 50.0, 100, "Generic"); 
    }

    public Color(String name) {
        this(name, "Dry", true, 50.0, 100, "Generic");
    }

    public Color(String name, String type) {
        this(name, type, true, 50.0, 100, "Generic");
    }

    public Color(String name, String type, boolean isEcoFriendly) {
        this(name, type, isEcoFriendly, 50.0, 100, "Generic");
    }

    public Color(String name, String type, boolean isEcoFriendly, double price) {
        this(name, type, isEcoFriendly, price, 100, "Generic");
    }

    public Color(String name, String type, boolean isEcoFriendly, double price, int quantity) {
        this(name, type, isEcoFriendly, price, quantity, "Generic");
    }

    public Color(String name, String type, boolean isEcoFriendly, double price, int quantity, String brand) {
        this.name = name;
        this.type = type;
        this.isEcoFriendly = isEcoFriendly;
        this.price = price;
        this.quantity = quantity;
        this.brand = brand;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Is Eco-Friendly: " + (isEcoFriendly ? "Yes" : "No"));
        System.out.println("Price: ₹" + price);
        System.out.println("Quantity: " + quantity + " grams");
        System.out.println("Brand: " + brand);
		 System.out.println("-----------------------------");
    }
}