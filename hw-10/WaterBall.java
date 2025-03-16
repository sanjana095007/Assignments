class WaterBall {
    String color;
    String size; 
    boolean isFilled;
    double capacity; 
    String brand;

    public WaterBall() {
        this("Blue", "Medium", false, 200.0, "Generic"); 
    }

    public WaterBall(String color) {
        this(color, "Medium", false, 200.0, "Generic");
    }

    public WaterBall(String color, String size) {
        this(color, size, false, 200.0, "Generic");
    }

    public WaterBall(String color, String size, boolean isFilled) {
        this(color, size, isFilled, 200.0, "Generic");
    }

    public WaterBall(String color, String size, boolean isFilled, double capacity) {
        this(color, size, isFilled, capacity, "Generic");
    }

    public WaterBall(String color, String size, boolean isFilled, double capacity, String brand) {
        this.color = color;
        this.size = size;
        this.isFilled = isFilled;
        this.capacity = capacity;
        this.brand = brand;
    }

    public void display() {
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Is Filled: " + (isFilled ? "Yes" : "No"));
        System.out.println("Capacity: " + capacity + " ml");
        System.out.println("Brand: " + brand);
        System.out.println("-----------------------------");
    }
}