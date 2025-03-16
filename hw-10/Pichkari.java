public class Pichkari {
    String color;
    double capacity; 
	String material;
    boolean isAutomatic;
    String waterPressure; 
    String brand;

    public Pichkari() {
        this("Red", 1.5, "Plastic", false, "Medium", "Generic"); 
    }

    public Pichkari(String color) {
        this(color, 1.5, "Plastic", false, "Medium", "Generic");
    }

    public Pichkari(String color, double capacity) {
        this(color, capacity, "Plastic", false, "Medium", "Generic");
    }

    public Pichkari(String color, double capacity, String material) {
        this(color, capacity, material, false, "Medium", "Generic");
    }

    public Pichkari(String color, double capacity, String material, boolean isAutomatic) {
        this(color, capacity, material, isAutomatic, "Medium", "Generic");
    }

    public Pichkari(String color, double capacity, String material, boolean isAutomatic, String waterPressure) {
        this(color, capacity, material, isAutomatic, waterPressure, "Generic");
    }

    public Pichkari(String color, double capacity, String material, boolean isAutomatic, String waterPressure, String brand) {
        this.color = color;
        this.capacity = capacity;
        this.material = material;
        this.isAutomatic = isAutomatic;
        this.waterPressure = waterPressure;
        this.brand = brand;
    }

    public void display() {
        System.out.println("Color: " + color);
        System.out.println("Capacity: " + capacity + " liters");
        System.out.println("Material: " + material);
        System.out.println("Is Automatic: " + (isAutomatic ? "Yes" : "No"));
        System.out.println("Water Pressure: " + waterPressure);
        System.out.println("Brand: " + brand);
		 System.out.println("-----------------------------");
    }
}