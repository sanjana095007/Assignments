public class Holi {
    String color;
    int numberOfParticipants;
	String festival;
    int year;
    boolean isPublicHoliday;
    double budget;

    public Holi() {
        this("Red",500,"Hoil",2025,false,50.25); 
    }

    public Holi(String color) {
        this(color,500,"Hoil",2025,false,50.25);
    }

    public Holi(String color,int numberOfParticipants) {
        this(color,numberOfParticipants,"Hoil",2025,false,50.25);
    }

    public Holi(String color,int numberOfParticipants,String festival) {
        this(color,numberOfParticipants,festival,2025,false,50.25);
    }

    public Holi(String color,int numberOfParticipants,String festival,int year) {
        this(color,numberOfParticipants,festival,year,false,50.25);
    }
 
    public Holi(String color,int numberOfParticipants,String festival,int year, boolean isPublicHoliday) {
        this(color,numberOfParticipants,festival,year,isPublicHoliday,50.25);
    }

    public Holi(String color,int numberOfParticipants,String festival,int year, boolean isPublicHoliday,double budget) {
        this.color = color;
        this.numberOfParticipants = numberOfParticipants;
        this.festival = festival;
        this.year = year;
        this.isPublicHoliday = isPublicHoliday;
        this.budget = budget;
    }

    public void display() {
        System.out.println("Color: " + color);
		System.out.println("Number of Participants: " + numberOfParticipants);
        System.out.println("Festival Name: " + festival);
        System.out.println("isPublicHoliday: " + (isPublicHoliday ? "Yes" : "No"));
        System.out.println("year: " + year + " hours");
        System.out.println("budget: " + budget);
        System.out.println("-----------------------------");
    }
}