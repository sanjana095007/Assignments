class Courier{
public static void pick(String pickup)
{
System.out.println("running pick in Courier");
System.out.println("pickuping address is " + pickup);
 Station.send(pickup);
}
}