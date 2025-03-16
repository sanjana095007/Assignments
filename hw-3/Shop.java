class Shop{
public static void sell(String vegetable,int quantity)
{
System.out.println("running sell in Shop");
System.out.println("vegetable:" + vegetable);
System.out.println("quantity:" + quantity);
Agent.purchase(vegetable,quantity);
}
}