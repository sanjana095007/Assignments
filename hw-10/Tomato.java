public class Tomato {
    String color;
    String size; 
    boolean isRotten;
    double weight; 
    String brand;

    public Tomato() {
        this("Red", "Medium", false, 100.0, "Generic"); 
    }

    public Tomato(String color) {
        this(color, "Medium", false, 100.0, "Generic");
    }

    public Tomato(String color, String size) {
        this(color, size, false, 100.0, "Generic");
    }

    public Tomato(String color, String size, boolean isRotten) {
        this(color, size, isRotten, 100.0, "Generic");
    }

    public Tomato(String color, String size, boolean isRotten, double weight) {
        this(color, size, isRotten, weight, "Generic");
    }

    public Tomato(String color, String size, boolean isRotten, double weight, String brand) {
        this.color = color;
        this.size = size;
        this.isRotten = isRotten;
        this.weight = weight;
        this.brand = brand;
    }

    public void display() {
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Is Rotten: " + (isRotten ? "Yes" : "No"));
        System.out.println("Weight: " + weight + " grams");
        System.out.println("Brand: " + brand);
        System.out.println("-----------------------------");
    }
}