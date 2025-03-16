class AreaPostOffice{
public static void delivery(String customername, String address)
{
System.out.println("running delivery in AreaPostOffice");
System.out.println("customer name is:" + customername);
System.out.println("address:" + address);
SubRegionalPostOffice.delivers(customername,address);
}
}