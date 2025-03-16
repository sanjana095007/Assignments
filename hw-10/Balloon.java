public class Balloon {
	String color;
    String material;
    int size;
    String shape;
    int price;
	int capacity;

    public Balloon() {
        this("Red","Plastic",9,"Round",10,3); 
    }

 
    public Balloon(String color) {
        this(color,"Plastic",9,"Round",10,3);
    }

    public Balloon(String color, String material) {
        this(color, material,9,"Round",10,3);
    }

    public Balloon(String color, String material,int size) {
        this(color, material,size,"Round",10,3);
    }

    public Balloon(String color, String material,int size,String shape) {
        this(color, material,size,shape,10,3);
    }

    public Balloon(String color, String material,int size,String shape,int price) {
        this(color, material,size,shape,price,3);
    }
    public Balloon(String color, String material,int size,String shape,int price, int capacity) {
        this.color = color;
        this.material = material;
        this.size = size;
        this.shape = shape;
        this.price = price;
        this.capacity = capacity;
    }

    public void display() {
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("size: " + size);
        System.out.println("Shape: " + shape);
		System.out.println("price: " + price);
        System.out.println("Capacity: " + capacity + " liters");
		System.out.println("-----------------------------");

    }
}