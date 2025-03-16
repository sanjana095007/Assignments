public class Gun {
    String color;
    String type; 
    boolean isAutomatic;
    int capacity; 
    String brand;

    public Gun() {
        this("Black", "Pistol", false, 10, "Generic"); 
    }

    public Gun(String color) {
        this(color, "Pistol", false, 10, "Generic");
    }

    public Gun(String color, String type) {
        this(color, type, false, 10, "Generic");
    }

    public Gun(String color, String type, boolean isAutomatic) {
        this(color, type, isAutomatic, 10, "Generic");
    }

  
    public Gun(String color, String type, boolean isAutomatic, int capacity) {
        this(color, type, isAutomatic, capacity, "Generic");
    }

    public Gun(String color, String type, boolean isAutomatic, int capacity, String brand) {
        this.color = color;
        this.type = type;
        this.isAutomatic = isAutomatic;
        this.capacity = capacity;
        this.brand = brand;
    }

    public void display() {
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("Is Automatic: " + (isAutomatic ? "Yes" : "No"));
        System.out.println("Capacity: " + capacity + " shots");
        System.out.println("Brand: " + brand);
        System.out.println("-----------------------------");
    }
}