class SubRegionalPostOffice{
public static void delivers(String customername, String address)
{
System.out.println("running delivers in SubRegionalPostOffice");
System.out.println("customer name is:" + customername);
System.out.println("address:" + address);
RegionalPostOffice.deliver(customername,address);
}
}