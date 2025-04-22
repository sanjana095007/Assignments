class Station{
public static void send(String address)
{
System.out.println("running send in station");
System.out.println("address" + address);
DeliveryGuy.accept(address);
}
}