public class Water {
    String source; 
    double volume; 
    boolean isCold;
    double pHLevel; 
    String brand;

    public Water() {
        this("Tap", 1.0, false, 7.0, "Generic"); 
    }

    public Water(String source) {
        this(source, 1.0, false, 7.0, "Generic");
    }

    public Water(String source, double volume) {
        this(source, volume, false, 7.0, "Generic");
    }

    public Water(String source, double volume, boolean isCold) {
        this(source, volume, isCold, 7.0, "Generic");
    }

    public Water(String source, double volume, boolean isCold, double pHLevel) {
        this(source, volume, isCold, pHLevel, "Generic");
    }

    public Water(String source, double volume, boolean isCold, double pHLevel, String brand) {
        this.source = source;
        this.volume = volume;
        this.isCold = isCold;
        this.pHLevel = pHLevel;
        this.brand = brand;
    }

    public void display() {
        System.out.println("Source: " + source);
        System.out.println("Volume: " + volume + " liters");
        System.out.println("Is Cold: " + (isCold ? "Yes" : "No"));
        System.out.println("pH Level: " + pHLevel);
        System.out.println("Brand: " + brand);
        System.out.println("-----------------------------");
    }
}