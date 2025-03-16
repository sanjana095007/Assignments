class RegionalPostOffice{
public static void deliver(String customername, String address)
{
System.out.println("running deliver in RegionalPostOffice");
System.out.println("customer name is:" + customername);
System.out.println("address:" + address);
PostHeadMaster.head(customername,address);
}
}