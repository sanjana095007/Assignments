import java.util.Arrays;
class Email{
    public static void printallemail(String[] emails) {
        System.out.println("List of emails:");
        for (String email : emails) {
            System.out.println(email);
        }
    }
}
class countries{
	public static void printcountry(String[] countryes){
		System.out.println("list of all countries ends with 'a'and 'A'");
		for(String country:countryes){
		if(country.endsWith("a")||country.endsWith("A")){
			System.out.println(country);
		}	
		}
	}
}
class Alpha{
	public static void printalpha(char[] alphabets){
		System.out.println("list of alphabets");
		Arrays.sort(alphabets);
		for(char letter:alphabets){
			System.out.println(letter+" ");
		}
}
}
class Fooditem{
	public static String printitems(String ingredients){
	System.out.println("list of ingredients:");
	 if (ingredients.equalsIgnoreCase("Pizza")) {
	 return "Flour,Cheese,Tomato Sauce,Olives";
	 }
        if (ingredients.equalsIgnoreCase("Burger")){
            return "Bun,Lettuce,Patty,Cheese,Sauce";
		}
        if (ingredients.equalsIgnoreCase("Pasta")) {
            return "Pasta,Olive Oil,Garlic,Tomato Sauce";
		}

        return "no ingredients";
	}
	}