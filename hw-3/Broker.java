class Broker{
public static void brokerage(String vegetable,int quantity)
{
System.out.println("running brokerage in Broker");
System.out.println("vegetable:" + vegetable);
System.out.println("quantity:" + quantity);
Farmer.farm(vegetable,quantity);
}
}